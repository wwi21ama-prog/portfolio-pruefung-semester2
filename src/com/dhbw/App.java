package com.dhbw;

import com.dhbw.www.Resolver;
import com.dhbw.www.Response;

public class App {
    public static void main(String[] args) {
        Resolver resolver = new Resolver();
        Response response = resolver.getUrl("https://www.mannheim.dhbw.de/dual-studieren/erstsemester/herzlich-willkommen");
        System.out.println(response);
    }
}
