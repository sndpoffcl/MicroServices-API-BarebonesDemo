package com.documentService.DocumentService.controller;

import com.documentService.DocumentService.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.Document;

@RestController
public class DocumentController {
    @Autowired
    DocumentService documentService;

    @GetMapping("/validatedoc/{id}/{type}")
    public boolean validateDocType(@PathVariable("id") int id, @PathVariable("type") String type) throws Exception {
        boolean validation = documentService.uploadDocumentCheck(id,type);
        return validation;
    }
}
