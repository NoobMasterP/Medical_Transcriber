package com.example.transcriber_generator;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class TranscriberService {

    @Autowired
    private final TranscriberRepository transcriberRepository;

    @Autowired
    public TranscriberService(TranscriberRepository transcriberRepository) {
        this.transcriberRepository = transcriberRepository;
    }

    public String getReport() {
        return "This is a report";
    }

    public List<Transcriber> getAllTranscribers() {
        return transcriberRepository.findAll();
    }

    public Transcriber getTranscriberById(Integer reportId) {
        return transcriberRepository.getReferenceById(reportId);
    }

    public void addNewTranscript(Transcriber transcriber) {

        transcriberRepository.save(transcriber);
    }

    public void deleteTranscript(Integer reportId) {
        if (!transcriberRepository.existsById(reportId)) {
            throw new IllegalStateException("Transcript with ID " + reportId + " does not exist");
        }

        transcriberRepository.deleteById(reportId);
    }

    @Transactional
    public void updateTranscript(Integer reportId, String description) {
        Transcriber transcriber = transcriberRepository.findById(reportId).orElseThrow(() -> new IllegalStateException("Transcript " +
                "with report ID " + reportId + " doesn't exist!"));

        if (description != null && !Objects.equals(transcriber.getDescription(), description)) {
            transcriber.setDescription(description);
        }

        transcriber.setDescription(description);
    }
}
