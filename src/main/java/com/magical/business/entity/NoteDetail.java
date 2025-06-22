package com.magical.business.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Data
@Document(collection  = "note_detail")
public class NoteDetail {

    private String id;

    private int userId;

    private String title;

    private List<Map<String, String>> blocks;
}
