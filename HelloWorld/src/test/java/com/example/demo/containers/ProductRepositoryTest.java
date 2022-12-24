package com.example.demo.containers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.HelloWorldApplication;
import com.example.demo.config.ContainerEnvironment;
import com.example.entities.Product;
import com.example.repositories.ProductRepositories;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = HelloWorldApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProductRepositoryTest extends ContainerEnvironment {
	
	@Autowired
	private ProductRepositories productRepositories;
	
	@Test
	public void When_GetProducts_Expect_EmptyList() {
		List<Product> list = productRepositories.findAll();
		assertEquals(0, list.size());
	}
}
