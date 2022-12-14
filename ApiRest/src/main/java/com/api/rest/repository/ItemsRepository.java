package com.api.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.rest.model.Items;

@Repository
public interface ItemsRepository extends JpaRepository<Items, String>{

}
