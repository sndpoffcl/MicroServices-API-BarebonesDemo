package com.documentService.DocumentService.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DocumentServiceImpl implements DocumentService {

    @Override
    public boolean uploadDocumentCheck(int id, String docType) throws Exception {
        if(validateUser(id)){
            if(docType.equals("pdf")){
                return true;
            }else {
                return false;
            }
        }else{
            throw new Exception("User does not exist");
        }
    }

    private boolean validateUser(int id){
        String uri = "http://localhost:8085/validate/" + id;
        RestTemplate restTemplate = new RestTemplate();
        Boolean result = restTemplate.getForObject(uri, Boolean.class);
        System.out.println(result);
        return result;
    }
}
