package com.magical.business.service;

import com.magical.business.dao.NoteMongoRepository;
import com.magical.business.dao.NoteRepository;
import com.magical.business.entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;

    @Autowired
    private NoteMongoRepository noteMongoRepository;

    /**
     * 获取笔记预览列表
     * @return
     */
    @Override
    public List<Note> listPreviewNoteByUserId(Integer userId) {
        List<Note> noteList = noteRepository.findByUserId(userId);
        noteList.stream().forEach(note -> {
            noteMongoRepository.findById(note.getNoteDetailId()).ifPresent(noteDetail -> {
                note.setNoteDetail(noteDetail);
            });
        });
        return noteList;
    }
}
