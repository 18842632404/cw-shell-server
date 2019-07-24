package com.cw.shell.cwshellserver.model.po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "cw_shell_product")
public class Product {

    @Id
    private Long id;

    private String name;

    private Integer type;

    private BigDecimal price;
}
