package com.zemoso.aopdemo.gen;

import com.zemoso.aopdemo.dao.AccountDAO;
import com.zemoso.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AfterReturningDemoApp {

    public static void main(String arg[]){
        //read the spring config class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from spring
        AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);

        // call the method created for after return:
        List<Account> accounts = accountDAO.findAccounts();

        System.out.println("Main Program: After returning");
        System.out.println(accounts);


        //close the context
        context.close();
    }

}
