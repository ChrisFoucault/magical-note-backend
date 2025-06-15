package com.magical.business.dao;

import com.magical.business.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer> {

    /**
     * 获取笔记预览列表
     * @return
     */
    List<Note> findByUserId(Integer userId);
}
