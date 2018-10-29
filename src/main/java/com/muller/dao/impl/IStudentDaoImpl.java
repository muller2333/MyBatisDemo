package com.muller.dao.impl;

import com.muller.dao.IStudentDao;
import com.muller.beans.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class IStudentDaoImpl implements IStudentDao {
    public void insertStu(Student student) {
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            SqlSession session = factory.openSession();
            session.insert("insertStudent", student);
//            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
