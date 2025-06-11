package com.magical.business.controller;

import com.magical.business.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/note")
@RestController
public class NoteController {

    @Autowired
    private NoteService noteService;


    @PostMapping()
    public String saveNote(){
        return "";
    }
}
