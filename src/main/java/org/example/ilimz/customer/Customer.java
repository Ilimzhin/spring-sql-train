package org.example.ilimz.customer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "customer_id")
    private Long customer_id;

    @Column(name = "customer_name")
    private String customer_name;

    @Column(name = "customer_city")
    private String customer_city;

    @Column(name = "customer_grade")
    private Long customer_grade;

}
