package hfad.com.beerabviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List<String> getBrands(String color){
        List<String> brands=new ArrayList<String>();
        if (color.equals("0")){
            brands.add("Barley wine");
            brands.add("Krushowitse light");
            brands.add("Obolon");
            brands.add("Persha privatna brovarnya");
            brands.add("TETERIIIIIV");
        }
        if (color.equals("1")){
            brands.add("Guinnes");
            brands.add("Zlata Praha");
        }
        if (color.equals("2")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }
        if (color.equals("3")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }

        return brands;

    }

}
