package org.example;

import java.util.*;

public class PhoneBook {

    private Map <String, String> contacts = new HashMap<>();
    public int add (String name, String TelNumber){
        if(!contacts.containsKey(name)){
            contacts.put(name, TelNumber);
        }
        return contacts.size();
    }

    public String findByNumber(String TelNumber){
        for (Map.Entry<String , String> entry : contacts.entrySet()){
            if(entry.getValue().equals(TelNumber)){
                return entry.getKey();
            }
        }
        return null;
    }

    public String findByName(String name){
        return contacts.get(name);
    }

    public List<String> printAllNames (){
        List<String> nameList = new ArrayList<>(contacts.keySet());
        Collections.sort(nameList);
        return nameList;
    }

}
