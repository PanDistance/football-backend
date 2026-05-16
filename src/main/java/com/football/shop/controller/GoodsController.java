package com.football.shop.controller; // 必须和启动类在同一个包或子包下

import com.football.shop.entity.Goods;
import com.football.shop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods") // 这行是关键，定义了接口的根路径
public class GoodsController {

  @Autowired
  private GoodsService goodsService;

  // 最终访问路径：/goods/list
  @GetMapping("/list")
  public List<Goods> getGoodsList() {
    return goodsService.getAllGoods();
  }
}
