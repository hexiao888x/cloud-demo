package com.feir;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feir.bean.Item;
import com.feir.dao.ItemMapperDao;
@Service
public class ItemService {
	@Autowired
	ItemMapperDao itemMapperDao;
//	private static final Map<Long, Item> MAP = new HashMap<Long, Item>();
//
//	static {
//		MAP.put(1L, new Item(1L, "上铺1", "11", "111", 1000L));
//		MAP.put(2L, new Item(2L, "上铺2", "22", "222", 2000L));
//		MAP.put(3L, new Item(3L, "上铺3", "33", "333", 3000L));
//	}
//	public Item queryItemById(Long id){
//		return MAP.get(id);
//	}
	public Item queryItemById(Long id){
		return itemMapperDao.findItemById(id);
	}
}
