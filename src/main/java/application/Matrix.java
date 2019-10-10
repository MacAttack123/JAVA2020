package application;

import elements.Element;
import pages.ContactUs;

public class Matrix {

    public static ContactUs contactUs; // for each page

    static
    {

        runApp();

    }

    public static void runApp(){

        contactUs = new ContactUs();
    }



}
