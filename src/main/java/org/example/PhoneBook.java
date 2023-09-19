package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map <String, Integer> contacts = new HashMap<>();
    public int add (String name, int TelNumber){
        if(!contacts.containsKey(name)){
            contacts.put(name, TelNumber);
        }
        return contacts.size();
    }




}
