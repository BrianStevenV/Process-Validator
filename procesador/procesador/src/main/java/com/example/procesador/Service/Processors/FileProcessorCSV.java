package com.example.procesador.Service.Processors;

import com.example.procesador.Module.FileCSV;
import com.example.procesador.Template.RestTemplateClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class FileProcessorCSV {
    private RestTemplateClient restTemplate;
    @Autowired
    public FileProcessorCSV(RestTemplateClient restTemplate){
        this.restTemplate = restTemplate;
    }

    public boolean sendLine(FileCSV fileCSV){
        //Utiliza spring 5.23 SNAPSHOT: HttpHeaders
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<FileCSV> request = new HttpEntity<>(fileCSV, headers);
        boolean response = (Boolean.TRUE.equals(this.restTemplate.postForObject("http://localhost:8090/validator/csv", request, Boolean.class)));
        return response;
    }
}
