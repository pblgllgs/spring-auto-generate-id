package com.pblgllgs.mongo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("db_sequence")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DbSequence {

    private String id;
    private int seq;
}
