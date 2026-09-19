package com.example.watermeter.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@TableName("bill")
public class Bill {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long userId;
    private String meterNo;
    private String billMonth;
    private Double startReading;
    private Double endReading;
    private Double totalUsage;
    private Double waterFee;
    private Double totalAmount;
    private Double paidAmount;
    private String status;
    private LocalDate dueDate;
    private LocalDateTime paidTime;
    private LocalDateTime createTime;
}