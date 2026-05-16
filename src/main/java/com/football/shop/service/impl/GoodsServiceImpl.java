package com.football.shop.service.impl;

import com.football.shop.entity.Goods;
import com.football.shop.mapper.GoodsMapper;
import com.football.shop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

  @Autowired
  private GoodsMapper goodsMapper;

  @Override
  public List<Goods> getAllGoods() {
    return goodsMapper.findAll();
  }
}
