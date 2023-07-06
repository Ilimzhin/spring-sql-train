package org.example.ilimz.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "salesman")
public class Salesman {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "salesman_id")
    private Long salesmanId;

    @Column(name = "salesman_name")
    private String name;

    @Column(name = "salesman_city")
    private String city;

    @Column(name = "salesman_commission")
    private double commission;

}
