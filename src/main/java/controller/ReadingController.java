package com.example.watermeter.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.watermeter.common.Result;
import com.example.watermeter.entity.MeterReading;
import com.example.watermeter.mapper.MeterReadingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reading")
public class ReadingController {

    @Autowired
    private MeterReadingMapper meterReadingMapper;

    @GetMapping("/list")
    public Result<Page<MeterReading>> list(
            @RequestParam(defaultValue = "1") Integer pageNum,
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(required = false) String meterNo) {

        Page<MeterReading> page = new Page<>(pageNum, pageSize);
        QueryWrapper<MeterReading> wrapper = new QueryWrapper<>();
        if (meterNo != null && !meterNo.isEmpty()) {
            wrapper.eq("meter_no", meterNo);
        }
        wrapper.orderByDesc("read_time");

        return Result.success(meterReadingMapper.selectPage(page, wrapper));
    }
}
