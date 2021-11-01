package com.company;

public class IndividualHolder extends AccountHolder{
    private String name;
    private String SSN;
    public IndividualHolder(int ID, String address, String name, String SSN) {
        super(ID, address);
        this.name = name;
        this.SSN = SSN;
    }

    public String getName() {
        return name;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSSN() {
        return SSN;
    }
}
