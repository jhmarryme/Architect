package com.jhmaryme.es.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@ToString
@Document(indexName = "foodie-items-ik", createIndex = false)
public class Items {

    @Id
    @Field(store = true, type = FieldType.Text, index = false)
    private String itemId;

    @Field(store = true, type = FieldType.Text, index = true)
    private String itemName;

    @Field(store = true, type = FieldType.Text, index = false)
    private String imgUrl;

    @Field(store = true, type = FieldType.Integer)
    private Integer price;

    @Field(store = true, type = FieldType.Integer)
    private Integer sellCounts;

}
