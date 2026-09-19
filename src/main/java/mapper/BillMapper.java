package com.example.watermeter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.watermeter.entity.Bill;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BillMapper extends BaseMapper<Bill> {
}