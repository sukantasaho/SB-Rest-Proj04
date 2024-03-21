package com.main.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class Customer 
{
    private Integer cno;
    private String cname;
    private Float billAmt;
    private String[] favColors;
    private Set<Long> phoneNumbers;
    private List<String> studies;
    private Map<String,Object> idDetails;
    //Has a property
    private Company company;
    private List<Address> addresses;
    
    
}
