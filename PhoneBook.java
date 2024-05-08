package review;

import java.util.*;
//name : phoneNumber1, phoneNumber1
//name: phoneNumber

// String , ArrayList of Strings, Map of some king
//Map to hold name and phoneNumbers
//Key is String and values is arrayList of String

public class PhoneBook {
    private Map<String, List<String>> phoneRecord;

    public PhoneBook(){
        this(new HashMap<>());
    }

    public PhoneBook(Map<String, List<String>> phoneRecord) {
        this.phoneRecord = phoneRecord;
    }

    //Create a method to add a number to the phonebook

    public void add(String name, String phoneNumber){
        List<String> numbers = new ArrayList<>();
        numbers.add(phoneNumber);
        phoneRecord.put(name, numbers);  //put the record in the map
    }

    //Create a method to addAll Numbers to a phoneRecord
    public void addAll(String name, String... phoneNumbers){
        List<String> numbers = new ArrayList<>();
        for(String s : phoneNumbers){
            numbers.add(s);
        }
        phoneRecord.put(name, numbers);
        //put the record in the map by key and values
    }

    //Method to remove a person
    public void remove(String name){
        phoneRecord.remove(name);
        //remove from the map
    }

    //HasEntry - to check if entry exist
    public Boolean hasEntry(String name){
        //check if name exist in record and return true
        return phoneRecord.containsKey(name);
    }

    //lookUp (name) - return phone number(s)
    public List<String> lookup(String name){
        //return a list of phone numbers that belong to the name
        return phoneRecord.get(name);
    }

    //reverse lookUp (phoneNumber) - return phone name
    public String reverseLookUp(String phoneNumber){

        //Takes a phone number and returns the name attached to the number
        List<String> list = new ArrayList<>();
        list.add(phoneNumber);
        for(Map.Entry<String, List<String>> entry: phoneRecord.entrySet()){
            if(entry.getValue().equals(list)){
                return entry.getKey();
            }
        }

        return "Number not in record.";
    }

    //Get allContactNames in the phoneBook

    public List<String> getAllContactNames(){
        List<String> names = new ArrayList<>();
//        for(Map.Entry<String, List<String>> entry : phoneRecord.entrySet()){
//            names.add(entry.getKey());
//        }
        Iterator<Map.Entry<String, List<String>>> iterator = phoneRecord.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, List<String>> entry = iterator.next();
            names.add(entry.getKey());
        }
        //need a list or container to store the names
        //need to iterate through the map
        //add each name to the list r container
        //return the container
        return names;
    }


    //A way to represent the String Object


    @Override
    public String toString() {
        String records = "";
        for(Map.Entry<String, List<String>> entry : phoneRecord.entrySet()){
            records += entry.getKey() + ":" + entry.getValue() +"\t";
        }
        return records;
    }


}