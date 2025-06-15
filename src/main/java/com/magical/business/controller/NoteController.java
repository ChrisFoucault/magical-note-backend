package com.magical.business.controller;

import com.magical.business.service.NoteService;
import com.magical.business.service.UserNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String listPreviewNote() {

        return "123";
    }

}
