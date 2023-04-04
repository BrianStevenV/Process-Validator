package com.makaia.validador.validador.Modules;

public class FileXLSX {
    private String date;
    private String injuryLocation;
    private String gender;
    private String ageGroup;
    private String incidentType;
    private String daysLost;
    private String plant;
    private String reportType;
    private String shift;
    private String department;
    private String incidentCost;
    private String wkDay;
    private String month;
    private String year;
    public FileXLSX(String date, String injuryLocation, String gender, String ageGroup,
                      String incidentType, String daysLost, String plant, String reportType,
                      String shift, String department, String incidentCost, String wkDay, String month, String year) {
        this.date = date;
        this.injuryLocation = injuryLocation;
        this.ageGroup = ageGroup;
        this.incidentType = incidentType;
        this.daysLost = daysLost;
        this.plant = plant;
        this.reportType = reportType;
        this.shift = shift;
        this.department = department;
        this.incidentCost = incidentCost;
        this.wkDay = wkDay;
        this.month = month;
        this.year = year;
    }

    public String getDate() {
        return date;
    }

    public String getInjuryLocation() {
        return injuryLocation;
    }

    public String getGender() {
        return gender;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public String getDaysLost() {
        return daysLost;
    }

    public String getPlant() {
        return plant;
    }

    public String getReportType() {
        return reportType;
    }

    public String getShift() {
        return shift;
    }

    public String getDepartment() {
        return department;
    }

    public String getIncidentCost() {
        return incidentCost;
    }

    public String getWkDay() {
        return wkDay;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }
}
