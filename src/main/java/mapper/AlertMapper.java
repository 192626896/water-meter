package com.example.watermeter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.watermeter.entity.Alert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AlertMapper extends BaseMapper<Alert> {
}