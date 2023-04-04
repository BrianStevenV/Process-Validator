package com.makaia.validador.validador.Services;

import com.makaia.validador.validador.Modules.FileCSV;
import com.makaia.validador.validador.Modules.FileXLSX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceValidator {
    private ValidateCSV validateCSV;
    private ValidateXLSX validateXLSX;
    @Autowired
    public ServiceValidator(ValidateCSV validateCSV, ValidateXLSX validateXLSX) {
        this.validateCSV = validateCSV;
        this.validateXLSX = validateXLSX;
    }
    public boolean pathCSV(FileCSV person){
        if(validateCSV.validateEmail(person)
                &&validateCSV.validateBirthDate(person)
                && validateCSV.validateJob(person)){

            return true;
        }
        return false;
    }

    public boolean pathXLSX(FileXLSX line){
        if(validateXLSX.validation(line)){
            return true;
        }
        return false;
    }
}
