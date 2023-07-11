package org.wwTestNgLao;

import org.testng.annotations.Test;

public class Dependency {

    @Test(priority = 0)
    public void open(){
        System.out.println("open the purse");
    }
    @Test(priority =1,dependsOnMethods = "open",enabled = false)
    public void take(){
        System.out.println("Take the money out");
    }

    @Test(priority = 2,dependsOnMethods = "open",alwaysRun = true)
    public void close(){
        System.out.println("Close the purse");
    }
}
