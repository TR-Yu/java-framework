package tech.tryu.springaop.service;

import org.springframework.stereotype.Service;

@Service
public class PrintServerImpl implements PrintServerInterface{
    private String printName;
    @Override
    public void print(String name) {
        this.printName = name;
        System.out.println("PrintServerImpl print: " + this.printName);
    }

    @Override
    public String print2(String name) {
        System.out.println("PrintServerImpl print2: set " + name);
        return name;
    }

    @Override
    public void  getPrintName() {
        if (this.printName == null) {
            throw new RuntimeException("getPrintName");
        }
    }
}
