package com.api.rest.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.model.Items;
import com.api.rest.service.ItemService;

@RestController
public class ItemsController {
	
	@Autowired
	private ItemService service;
	
	@GetMapping("/GetItems")
	public List<Items> GetItems(){
		return service.GetItems();
	}
	
	@GetMapping("/GetItem/{id}")
	public Items GetItemsById(@PathVariable("id") String idItem){
		return service.GetItemById(idItem);
	}
	
	@GetMapping("/PostItem")
	public Items PostItem(@RequestBody Items Item){
		service.PostItem(Item);
		return Item;
	}
	
	@GetMapping("/PutItem")
	public Items PutItem(@RequestBody Items Item){
		service.PutItem(Item);
		return Item;
	}
	
	@GetMapping("/DeleteItem")
	public void DeleteItem(@PathVariable("id") String idItem){
		service.DeleteItemById(idItem);
	}

}
