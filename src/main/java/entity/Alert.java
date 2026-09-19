package com.example.watermeter.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@TableName("alert")
public class Alert {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String meterNo;
    private LocalDateTime alertTime;
    private String alertLevel;
    private String alertType;
    private String alertDesc;
    private String status;
    private String handler;
    private LocalDateTime handleTime;
    private String handleResult;
}