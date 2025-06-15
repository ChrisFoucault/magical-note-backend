package com.magical.business.entity;

import lombok.Data;

@Data
public class UserNote {

    private int id;

    private int userId;

    private int noteId;

    private String createTime;

}
