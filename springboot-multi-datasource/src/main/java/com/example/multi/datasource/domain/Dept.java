package com.example.multi.datasource.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dept implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

}
