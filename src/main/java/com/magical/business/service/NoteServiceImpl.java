package com.magical.business.service;

import com.magical.business.dao.NoteRepository;
import com.magical.business.entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;

    /**
     * 获取笔记预览列表
     * @return
     */
    @Override
    public List<Note> listPreviewNote() {
        Integer userId = 1;
        List<Note> noteList = noteRepository.findByUserId(userId);


        return noteList;
    }
}
