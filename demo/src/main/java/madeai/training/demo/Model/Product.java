package madeai.training.demo.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int qty;
    private String name;
    private double price;

}

