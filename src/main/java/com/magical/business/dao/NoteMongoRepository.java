package com.magical.business.dao;

import com.magical.business.entity.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteMongoRepository extends MongoRepository<Note, String> {

    List<NoteMongo> findByUserId(Integer userId);
}
