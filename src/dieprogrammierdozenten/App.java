package dieprogrammierdozenten;

import dieprogrammierdozenten.www.Resolver;
import dieprogrammierdozenten.www.Response;

public class App {
    public static void main(String[] args) {
        Resolver resolver = new Resolver();
        Response response = resolver.getUrl("https://www.mannheim.dhbw.de/dual-studieren/erstsemester/herzlich-willkommen");
        System.out.println(response);
    }
}
