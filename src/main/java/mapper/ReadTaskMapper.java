package com.example.watermeter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.watermeter.entity.ReadTask;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReadTaskMapper extends BaseMapper<ReadTask> {
}