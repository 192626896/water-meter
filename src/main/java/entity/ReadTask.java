package com.example.watermeter.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@TableName("read_task")
public class ReadTask {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String taskName;
    private LocalDate taskDate;
    private String status;
    private Integer totalCount;
    private Integer successCount;
    private LocalDateTime createTime;
}