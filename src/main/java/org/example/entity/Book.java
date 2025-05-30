package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    private UUID id;
    private String name;
    private Integer price;
    private Integer quantity;
    private String bookPhoto;
    private String bookDocumet;


}
