package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dto.NameDto;

public class Main {
    public static void main(String[] args) {
        NameDto myname = new NameDto("Oleksii","Yevdokymov");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(myname);
        System.out.println(json);
    }
}