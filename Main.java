package review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> records = new HashMap<>();
        List<String> number = new ArrayList<>();
        records.put("Magnolia Sheperd", number);
        PhoneBook phoneBook = new PhoneBook(records);
        phoneBook.add("Dennis Pike","302-555-6602");
        phoneBook.addAll("Anthony Grime", "302-555-3201","267-555-2976");
        phoneBook.add("Samantha Burgess", "973-555-4250");
        System.out.println(phoneBook.getAllContactNames());
        phoneBook.remove("Magnolia Sheperd");
        System.out.println(phoneBook.getAllContactNames());
        System.out.println(phoneBook.lookup("Anthony Grime"));
        System.out.println(phoneBook.reverseLookUp("973-555-4250"));
        System.out.println(phoneBook.hasEntry("Nate Robinson"));
        System.out.println(phoneBook);
    }
}
