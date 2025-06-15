package com.magical.business.entity;

import lombok.Data;

@Data
public class Note {
    // id
    private Integer id;

    private String noteDetailId;

    private String title;

    private String creationTime;

    private Integer userId;

}
