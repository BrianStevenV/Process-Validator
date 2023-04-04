package com.makaia.validador.validador.Services;

import com.makaia.validador.validador.Modules.FileCSV;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class ValidateCSV {
    private final static LocalDate MIN_FECHA_NACIMIENTO = LocalDate.of(1980, 1, 1);
    public boolean validateEmail(FileCSV line){
    Pattern pattern = Pattern
            .compile("[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    Matcher matcher = pattern.matcher(line.getEmail());
    return matcher.find();
    }

    public boolean validateJob(FileCSV line){
        String job = line.getJobTitle();
        if(job.equals("Haematologist")||job.equals("Phytotherapist")|| job.equals("Building surveyor") ||
                job.equals("Insurance account manager") ||job.equals("Educational psychologist")){
            return true;
        }
        return false;
    }


    public boolean validateBirthDate(FileCSV line) {
        LocalDate fechaNac = LocalDate.parse(line.getDateOfBirth());
        return fechaNac.isAfter(MIN_FECHA_NACIMIENTO);
    }

}
