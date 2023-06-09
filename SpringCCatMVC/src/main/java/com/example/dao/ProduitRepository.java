package com.example.dao;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.entities.Produit;


public interface ProduitRepository extends JpaRepository<Produit,String> {
	
	@Query("select p from Produit p where p.designation like :x")
	public Page<Produit> chercherProduit(@Param("x") String mc,Pageable pageable);
	public Page<Produit> findByDesignationContains(String mc,PageRequest pageRequest);

}
