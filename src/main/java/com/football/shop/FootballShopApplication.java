package com.football.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.football.shop.mapper") // 扫描 Mapper 接口包
public class FootballShopApplication {
  public static void main(String[] args) {
    SpringApplication.run(FootballShopApplication.class, args);
  }
}
