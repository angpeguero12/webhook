package com.paymentchain.billing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicApplicationTests {
 //Prueba de webhook 30 Oct 2023, prueba 4
 @Test
 public void contextLoads() {
 	    String meessage= "default message cambio test devops";
 	    Assert.assertNotNull(meessage);
 }
 
}
