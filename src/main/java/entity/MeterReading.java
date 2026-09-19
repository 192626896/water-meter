package com.example.watermeter.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@TableName("meter_reading")
public class MeterReading {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String meterNo;
    private LocalDateTime readTime;
    private Double instantFlow;
    private Double totalFlow;
    private Double waterTemp;
    private String valveStatus;
    private String alarmCode;
    private Long taskId;
    private LocalDateTime createTime;
}