package com.makaia.validador.validador.Controllers;

import com.makaia.validador.validador.Modules.FileCSV;
import com.makaia.validador.validador.Modules.FileXLSX;
import com.makaia.validador.validador.Services.ServiceValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validator")
public class ControllerValidator {
    private ServiceValidator serviceValidator;
    @Autowired
    public ControllerValidator(ServiceValidator serviceValidator) {
        this.serviceValidator = serviceValidator;
    }

    @PostMapping("/csv")
    public boolean processCSV(@RequestBody FileCSV fileCSV){
        return serviceValidator.pathCSV(fileCSV);
    }

    @PostMapping("/xlsx")
    public boolean processXLSX(@RequestBody FileXLSX fileXLSX){
        return serviceValidator.pathXLSX(fileXLSX);
    }
}
