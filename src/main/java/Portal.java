import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;

public class  Portal {
    public static void main(String[] args) {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = null;
//        try {
//            inputStream = Resources.getResourceAsStream(resource);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees?serverTimezone=UTC", "root", "fuckchina");
            String sql = "select emp_no,last_name from employees where gender = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setObject(1, "M");
            ResultSet rs = ps.executeQuery();
            rs.last();
            System.out.println(rs.getRow());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
