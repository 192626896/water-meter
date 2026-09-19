package com.example.watermeter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.watermeter.entity.MeterReading;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MeterReadingMapper extends BaseMapper<MeterReading> {
}