package com.football.shop.mapper;

import com.football.shop.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface GoodsMapper {
  List<Goods> findAll();
}
