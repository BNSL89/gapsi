package com.api.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.model.Items;
import com.api.rest.repository.ItemsRepository;

@Service
public class ItemService {

	@Autowired
	private ItemsRepository repository;
	
	public List<Items> GetItems(){
		return repository.findAll();
	}
	
	public Items GetItemById(String idItem) {
		return repository.findById(idItem).get();
	}
	
	public void PostItem(Items item) {
		repository.save(item);
	}
	
	public void PutItem(Items item) {
		repository.save(item);
	}
	
	public void DeleteItemById(String idItem) {
		repository.deleteById(idItem);
	}
}
