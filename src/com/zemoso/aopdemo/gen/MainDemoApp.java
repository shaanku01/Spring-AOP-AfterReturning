package com.zemoso.aopdemo.gen;

import com.zemoso.aopdemo.dao.AccountDAO;
import com.zemoso.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

    public static void main(String arg[]){
        //read the spring config class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from spring
        AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);

        MembershipDAO membershipDAO = context.getBean("membershipDAO",MembershipDAO.class);

        //call the getters and setter methods::
        accountDAO.setServiceCode("gold");
        accountDAO.setName("foobar");

        accountDAO.getName();
        accountDAO.getServiceCode();



        //call the buisness method
        accountDAO.addAccount(new Account(),true);
        membershipDAO.addAccount();

        //close the context
        context.close();
    }

}
