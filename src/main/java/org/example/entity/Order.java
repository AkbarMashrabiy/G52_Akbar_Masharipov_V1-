package org.example.entity;

import java.util.UUID;

public class Order {
    private UUID id;
    private Long userChatId;
    private UUID bookId;
    private String name;
    private Integer price;
    private Integer quantity;
    private String bookPhotoFileId;
    private String bookDocumentFileId;
    private Boolean isSold = false;

}
