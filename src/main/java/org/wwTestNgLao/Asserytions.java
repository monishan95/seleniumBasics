package org.wwTestNgLao;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserytions {


    @Test
    public void getname(){

        String name = "Kiru",
        subject = null;
        Boolean cs = false;

        if (name.equals("Kiru")){
            System.out.println("name is same");
        }else {
            System.out.println("mistake is there");
        }
        Assert.assertEquals(name,"Kiru");
        Assert.assertEquals(cs,false);
        Assert.assertTrue(cs,"the value should be true");
        Assert.assertFalse(cs,"has to be false");
        Assert.assertNull(subject);
        Assert.assertNotNull(subject);
    }




}
