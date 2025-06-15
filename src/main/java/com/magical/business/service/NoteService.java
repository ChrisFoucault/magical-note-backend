package com.magical.business.service;

import com.magical.business.entity.Note;

import java.util.List;

public interface NoteService {

    /**
     * 获取笔记预览列表
     * @return
     */
    List<Note> listPreviewNote ();
}
