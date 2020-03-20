package com.douzone.aoptest.service;

import org.springframework.stereotype.Service;

import com.douzone.aoptest.vo.ProductVo;

@Service
public class ProductService {
	public ProductVo find(String name) {
		System.out.println("[ProductService] finding...");
//		int a=1; if(a-1==0) {
//			throw new RuntimeException("Find w?w?w");
//		}
		return new ProductVo(name);
	}
}