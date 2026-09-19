package com.example.watermeter.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@TableName("water_meter")
public class WaterMeter {
    @TableId
    private String meterNo;
    private Long userId;
    private String meterType;
    private String installAddress;
    private String status;
    private Double lastReading;
    private LocalDateTime createTime;
}