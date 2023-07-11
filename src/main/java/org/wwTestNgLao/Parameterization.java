package org.wwTestNgLao;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
// number2xml
    @Test
    @Parameters ("character")
    public void getparameter( String b){
        System.out.println("Kiru is  " + b );
    }

    @Test
    @Parameters({"valueone","valuetwo"})
    public void getname(String first,String last){
        System.out.println("First name  "+ first+"  Last name   "+ last);
    }

}
