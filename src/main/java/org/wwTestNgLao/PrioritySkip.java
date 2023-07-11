package org.wwTestNgLao;

import org.testng.annotations.Test;

public class PrioritySkip {



    @Test(priority = 0)
    public void getamount(){
        System.out.println("amount is taken");
    }
    @Test (priority = 1)
    public void getlist(){
        System.out.println("get shopping list");
    }
    @Test (priority = 2)
    public void gettoplace(){
        System.out.println("Reach the market");
    }
    @Test (priority = 3)
    public void getthings(){
        System.out.println("Add all items to cart");
    }
    @Test (priority = 5,enabled = false)
    public void paying(){
        System.out.println("Pay for all");
    }
    @Test (priority = 4)
    public void getback(){
        System.out.println("Reached home");
    }

}
