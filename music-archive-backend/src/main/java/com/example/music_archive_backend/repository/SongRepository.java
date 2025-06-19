package com.example.music_archive_backend.repository;

import com.example.music_archive_backend.model.song;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SongRepository extends MongoRepository<song,String> {

}
