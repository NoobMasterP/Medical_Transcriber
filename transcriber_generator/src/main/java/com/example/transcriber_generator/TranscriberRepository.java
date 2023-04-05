package com.example.transcriber_generator;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TranscriberRepository extends JpaRepository<Transcriber, Integer> {

//    Optional<Transcriber> getTranscribeById(Integer report_id);
}
