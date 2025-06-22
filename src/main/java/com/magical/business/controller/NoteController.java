package com.magical.business.controller;

import com.magical.business.entity.Note;
import com.magical.business.service.NoteService;
import com.magical.business.service.UserNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/note")
@RestController
public class NoteController {

    @Autowired
    private NoteService noteService;

    /**
     * 获取笔记预览列表
     * @return
     */
    @GetMapping("/listPreviewNote")
    public List<Note> listPreviewNote(@RequestParam Integer userId) {
        List<Note> noteList = noteService.listPreviewNoteByUserId(userId);
        return noteList;
    }
}
