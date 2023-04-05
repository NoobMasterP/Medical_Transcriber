package com.example.transcriber_generator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/transcriber")
public class TranscriberController {

    private final TranscriberService transcriberService;

    @Autowired
    public TranscriberController(TranscriberService transcriberService) {
        this.transcriberService = transcriberService;
    }

    @GetMapping(path = "/get")
    public List<Transcriber> getTranscribers() {
        return transcriberService.getAllTranscribers();
    }

    @GetMapping(path = "/getById")
    public Transcriber getTranscriberById(Integer report_id) {
        return transcriberService.getTranscriberById(report_id);
    }

    @PostMapping(path = "/AddNewTranscript")
    public void addNewTranscript(@RequestBody Transcriber transcriber) {
        transcriberService.addNewTranscript(transcriber);
    }

    @DeleteMapping(path = "/DeleteTranscribe/{report_id}")
    public void deleteTranscript(@PathVariable("report_id") Integer report_id) {
        transcriberService.deleteTranscript(report_id);
    }

    @PutMapping(path = "/updateTranscribe/{report_id}")
    public void updateTranscript(
            @PathVariable("report_id") Integer report_id,
            @RequestParam String description) {
        transcriberService.updateTranscript(report_id, description);
    }
}
