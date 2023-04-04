package com.example.procesador.Service;

import com.example.procesador.FileResponse;
import com.example.procesador.Module.File;
import com.example.procesador.Module.FileCSV;
import com.example.procesador.Module.FileXLSX;
import com.example.procesador.Service.Processors.FileProcessorCSV;
import com.example.procesador.Service.Processors.FileProcessorXLSX;
import com.example.procesador.Service.Readers.FileReaderCSV;
import com.example.procesador.Service.Readers.FileReaderXLSX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProcess {
    private FileReaderCSV fileReaderCSV;
    private FileReaderXLSX fileReaderXLSX;
    private FileProcessorCSV fileProcessorCSV;
    private FileProcessorXLSX fileProcessorXLSX;
    private int lineValid = 0;
    private int lineInvalid = 0;
    @Autowired
    public ServiceProcess(FileReaderCSV fileReaderCSV, FileReaderXLSX fileReaderXLSX, FileProcessorCSV fileProcessorCSV, FileProcessorXLSX fileProcessorXLSX) {
        this.fileReaderCSV = fileReaderCSV;
        this.fileReaderXLSX = fileReaderXLSX;
        this.fileProcessorCSV = fileProcessorCSV;
        this.fileProcessorXLSX = fileProcessorXLSX;
    }

    public FileResponse serviceProcessor(File file){
        if(file.getType().equalsIgnoreCase("csv")){
            List<FileCSV> fileCSVList = this.fileReaderCSV.process(file);
            for(FileCSV person : fileCSVList){
                boolean validation = fileProcessorCSV.sendLine(person);
                if(validation){
                    lineValid++;
                }   else{
                    lineInvalid++;
                }
            }
        } else if (file.getType().equalsIgnoreCase("xlsx")) {
            List<FileXLSX> fileXLSXList = this.fileReaderXLSX.process(file);
            for(FileXLSX person : fileXLSXList){
                boolean validation = fileProcessorXLSX.sendLine(person);
                if(validation){
                    lineValid++;
                }   else{
                    lineInvalid++;
                }
            }
        }
        return new FileResponse(lineValid, lineInvalid);
    }
}
