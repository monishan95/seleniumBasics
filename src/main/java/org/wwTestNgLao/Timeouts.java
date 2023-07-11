package org.wwTestNgLao;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

import java.util.concurrent.TimeUnit;

public class Timeouts {

    @Test(timeOut = 2000,expectedExceptions = ThreadTimeoutException.class)
    public void getdata() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("print the text");
    }

}
