package com.example.watermeter.controller;

import com.example.watermeter.common.Result;
import com.example.watermeter.entity.Alert;
import com.example.watermeter.entity.MeterReading;
import com.example.watermeter.mapper.AlertMapper;
import com.example.watermeter.mapper.MeterReadingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/collect")
public class CollectController {

    @Autowired
    private MeterReadingMapper meterReadingMapper;
    @Autowired
    private AlertMapper alertMapper;

    @PostMapping("/reading")
    public Result<String> receiveReading(@RequestBody MeterReading reading) {
        reading.setCreateTime(LocalDateTime.now());
        meterReadingMapper.insert(reading);
        System.out.println("收到上报: " + reading.getMeterNo()
                + " 累计流量: " + reading.getTotalFlow()
                + " 瞬时流量: " + reading.getInstantFlow());

        checkRules(reading);

        return Result.success("ok");
    }

    private void checkRules(MeterReading reading) {
        if (reading.getInstantFlow() != null && reading.getInstantFlow() > 10) {
            createAlert(reading.getMeterNo(), "emergency", "overuse",
                    "瞬时流量超限: " + reading.getInstantFlow() + " m³/h");
        }
        if (reading.getAlarmCode() != null && !"0".equals(reading.getAlarmCode())) {
            createAlert(reading.getMeterNo(), "emergency", "fault",
                    "设备报警码: " + reading.getAlarmCode());
        }
    }

    private void createAlert(String meterNo, String level, String type, String desc) {
        Alert alert = new Alert();
        alert.setMeterNo(meterNo);
        alert.setAlertTime(LocalDateTime.now());
        alert.setAlertLevel(level);
        alert.setAlertType(type);
        alert.setAlertDesc(desc);
        alert.setStatus("pending");
        alertMapper.insert(alert);
        System.out.println("生成告警: " + desc);
    }
}