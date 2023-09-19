package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map <String, String> contacts = new HashMap<>();
    public int add (String name, String TelNumber){
        if(!contacts.containsKey(name)){
            contacts.put(name, TelNumber);
        }
        return contacts.size();
    }

    public String findByNumber(String TelNumber){
        return null;
    }


}
