package com.smm.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smm.entity.GoodsEntity;
import com.smm.service.GoodsService;

@Controller
public class GoodsController {
	
	@Autowired
	GoodsService goodsService;
	
	@RequestMapping("GetAllGoods")
	@ResponseBody
	public String getAllGoods(){
		List<GoodsEntity> list = goodsService.getAllGoods();
		
		return list.toString();
	}
	
	@RequestMapping("AddGoods")
	@ResponseBody
	public String addGoods(){
		GoodsEntity goods = new GoodsEntity();
		Integer i = goodsService.addGoods(goods);
		System.out.println(i);
		return i.toString();
	}
	
}
