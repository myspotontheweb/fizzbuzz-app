package hotmeatballsoup.fizzbuzz.app;

import hotmeatballsoup.fizzbuzz.model.Fizzbuzz;

/**
 * A simple app that depends on the fizzbuzz-model project.
 */
public class Application {
    public static void main(String[] args) {
        Fizzbuzz fizzbuzz = new Fizzbuzz(3);
        
        System.out.println(fizzbuzz.boo);
    }
}
