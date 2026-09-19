package com.example.watermeter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.watermeter.entity.WaterMeter;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WaterMeterMapper extends BaseMapper<WaterMeter> {
}