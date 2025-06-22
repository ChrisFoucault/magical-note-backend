package com.magical.business.dao;

import com.magical.business.entity.NoteDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteMongoRepository extends MongoRepository<NoteDetail, String> {

    List<NoteDetail> findByUserId(Integer userId);

}
