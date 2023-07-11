package org.wwTestNgLao;

import org.testng.annotations.Test;

public class Grouping {

    @Test(groups = {"JUICES" , "SATHIS"})
    public void juice1(){
        System.out.println("Apple juice");
    }

    @Test (groups = {"JUICES","MONI"})
    public void juice2(){
        System.out.println("Orange juice");
    }

    @Test (groups = {"RICE","SATHIS"})
    public void rice1(){
        System.out.println("Lemon rice");
    }

    @Test (groups = {"RICE","MONI"})
    public void rice2(){
        System.out.println("Curd rice");
    }

    @Test (groups = {"STARTER","SATHIS"})
    public void starter1(){
        System.out.println("Chicken 65");
    }

    @Test (groups = {"STARTER","MONI"})
    public void starter2(){
        System.out.println("Mushroom 65");
    }
    @Test (groups = {"DRINK","SATHIS"})
    public void drink1(){
        System.out.println("JD");
     }
     @Test (groups = {"DRINK","MONI"})
     public void drink2(){
         System.out.println("Mojito");
     }






}
