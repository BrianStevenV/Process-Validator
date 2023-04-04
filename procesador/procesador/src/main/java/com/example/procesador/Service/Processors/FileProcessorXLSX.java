package com.example.procesador.Service.Processors;

import com.example.procesador.Module.FileCSV;
import com.example.procesador.Module.FileXLSX;
import com.example.procesador.Template.RestTemplateClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class FileProcessorXLSX {
    private RestTemplateClient restTemplate;

    @Autowired
    public FileProcessorXLSX(RestTemplateClient restTemplate){
        this.restTemplate = restTemplate;
    }

    public boolean sendLine(FileXLSX fileXLSX){
        //Utiliza spring 5.23 SNAPSHOT: HttpHeaders
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<FileXLSX> request = new HttpEntity<>(fileXLSX, headers);
        boolean response = (Boolean.TRUE.equals(this.restTemplate.postForObject("http://localhost:8090/validator/xlsx", request, Boolean.class)));
        return response;
    }
}
