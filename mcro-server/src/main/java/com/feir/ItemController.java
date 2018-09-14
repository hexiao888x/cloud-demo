package com.feir;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.feir.bean.Item;

@Controller
public class ItemController {

	@Resource
	private ItemService itemService;
	
	@RequestMapping(value="/item/{id}")
	@ResponseBody
	public Item queryItemById(@PathVariable(name="id") Long id){
		return itemService.queryItemById(id);
	}
}
