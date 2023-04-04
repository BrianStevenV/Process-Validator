package com.example.procesador.Controller;

import com.example.procesador.FileResponse;
import com.example.procesador.Module.File;
import com.example.procesador.Service.ServiceProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ControllerProcessor {
    private ServiceProcess serviceProcess;
    @Autowired
    public ControllerProcessor(ServiceProcess serviceProcess) {
        this.serviceProcess = serviceProcess;
    }

    @PostMapping("/file")
    public ResponseEntity<FileResponse> sendFile(@RequestBody File file){
        FileResponse fileResponse = serviceProcess.serviceProcessor(file);
        return ResponseEntity.ok().body(fileResponse);
    }
}
