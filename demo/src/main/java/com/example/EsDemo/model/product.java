package com.example.EsDemo.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "products")
@Data
public class product {

    @Id
    private String id;
    private String name;
    private double price;
    private String category;

}
