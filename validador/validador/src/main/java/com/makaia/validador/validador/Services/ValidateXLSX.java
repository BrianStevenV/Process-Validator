package com.makaia.validador.validador.Services;

import com.makaia.validador.validador.Modules.FileXLSX;
import org.springframework.stereotype.Component;

@Component
public class ValidateXLSX {

    public boolean validation(FileXLSX fileXLSX) {
        if (!fileXLSX.getInjuryLocation().equals("N/A") ||
                (fileXLSX.getReportType().equals("Near Miss") ||
                        fileXLSX.getReportType().equals("Lost Time") ||
                        fileXLSX.getReportType().equals("First Aid"))) {
            return true;
        } else {
            return false;
        }
    }
}
