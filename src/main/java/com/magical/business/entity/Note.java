package com.magical.business.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "note")
public class Note {
    // id
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自增主键
    private Integer id;

    @Column(name = "note_detail_id")
    private String noteDetailId;

    @Column(name = "title")
    private String title;

    @Column(name = "create_time")
    private String creationTime;

    @Column(name = "user_id")
    private Integer userId;

    @Transient
    private NoteDetail noteDetail;

}
