package org.uk.itv;

import org.uk.bbc.Arithmetic;

public class Mathematics extends Arithmetic {

    CNN cnn = new CNN();

    public void adding()
    {
        Age();
        Age(4,5);
        Age(5,7,9);
        cnn.news();

        if(Age() > 16)
        {
            System.out.println("Driving licence granted");
        } else if(Age() <16)
        {
            System.out.println("Driving licence not granted");
        }


    }

    public void conditionalStatement(String browser)
    {
        switch (browser)
        {
            case "Chrome":
                System.out.println("It is Chrome");
                break;
            case "Firefox":
                System.out.println("It is firefox");
                break;
        }
    }

    public void tryLoop()
    {
        for (int i = 2; i< 10; i++)
        {
            System.out.println("Nine times table" + 9*i);

        }
    }


}
