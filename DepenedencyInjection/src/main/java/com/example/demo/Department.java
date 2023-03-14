package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Department {
    int did;
    String dname;

    public Department() {
       System.out.println("Inside Department");
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }


}
