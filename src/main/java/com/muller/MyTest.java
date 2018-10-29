package com.muller;

import com.muller.beans.Student;
import com.muller.dao.IStudentDao;
import com.muller.dao.impl.IStudentDaoImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MyTest {
    private static IStudentDao dao;

    @BeforeAll
    public static void before() {
        dao = new IStudentDaoImpl();
    }

    @BeforeEach
    public void before2() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void testInsert() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        Student student = new Student("李白", 27, 94.5);
        dao.insertStu(student);

    }

    @Test
    public void test() {
//        System.out.println("########################");
    }
}
