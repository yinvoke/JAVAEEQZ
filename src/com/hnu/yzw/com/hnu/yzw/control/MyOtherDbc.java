package com.hnu.yzw.com.hnu.yzw.control;

import com.hnu.yzw.controlimpl.OtherDbc;
import com.hnu.yzw.model.OM;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



/**
 * jdbc，用户拓展功能的数据库连接系统
 */
public class MyOtherDbc implements OtherDbc {
    //定义基础数据
    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String USERNAME = "root";
    static final String USERPASSWORD = "root";
    static final String URL = "jdbc:mysql://127.0.0.1:3306/home";

    //补全信息
    @Override
    public int fixAllMessage(OM o){
        //声明变量
        int index=-1;
        int uid = o.getUid();
        String uname = o.getUname();
        String usex = o.getUsex();
        int uage = o.getUage();
        String uqq = o.getUqq();
        String uwname = o.getUwname();
        double uwsalary = o.getUwsalary();
        String uhlocation = o.getUhlocation();
        double uhsize = o.getUhsize();
        String ucname = o.getUcname();
        double ucprice = o.getUcprice();
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            //加载驱动
            Class.forName(DRIVER);
            //获取连接
            conn= DriverManager.getConnection(URL,USERNAME, USERPASSWORD);
            //创建SQL命令
            String sql1 = "update users set u_sex=?, u_age=?, u_qq=?, w_name=? where u_id = ?";
            String sql2 = "insert into houses values(?,?,?)";
            String sql3 = "insert into cars values(?,?,?)";
            String sql4 = "insert into works values(?,?)";
            //users表
            ps=conn.prepareStatement(sql1);
            ps.setString(1,usex);
            ps.setInt(2,uage);
            ps.setString(3,uqq);
            ps.setString(4,uwname);
            ps.setInt(5,uid);
            index+=ps.executeUpdate();
            //houses表
            ps=conn.prepareStatement(sql2);
            ps.setString(1,uhlocation);
            ps.setInt(2,uid);
            ps.setDouble(3,uhsize);
            index+=ps.executeUpdate();
            //cars表
            ps=conn.prepareStatement(sql3);
            ps.setString(1,ucname);
            ps.setInt(2,uid);
            ps.setDouble(3,ucprice);
            index+=ps.executeUpdate();
            //works表
            ps=conn.prepareStatement(sql4);
            ps.setString(1,uwname);
            ps.setDouble(2,uwsalary);
            index+=ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{//关闭资源
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return index;
    }


    //获取所有的用户信息
    @Override
    public List<OM> getAllUsers() {
        //声明jdbc对象
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        //声明变量
        List<OM> lo = null;
        try {
            //加载驱动
            Class.forName(DRIVER);
            //获取连接
            conn= DriverManager.getConnection(URL,USERNAME, USERPASSWORD);
            //创建sql命令
            String sql="select `u`.`u_name` AS `uname`,`u`.`u_sex` AS `usex`,`u`.`u_age` AS `uage`,`u`.`u_qq` AS `uqq`,`w`.`w_name` AS `uwname`,`w`.`w_salary` AS `uwsalary`,`h`.`h_location` AS `uhlocation`,`h`.`h_size` AS `uhsize`,`c`.`c_name` AS `ucname`,`c`.`c_price` AS `ucprice` from (((`users` `u` left join `works` `w` on((`u`.`w_name` = `w`.`w_name`))) left join `houses` `h` on((`u`.`u_id` = `h`.`u_id`))) left join `cars` `c` on((`u`.`u_id` = `c`.`u_id`)))";
            //创建sql命令对象
            ps=conn.prepareStatement(sql);
            //执行sql
            rs=ps.executeQuery();
            //给集合赋值
            lo=new ArrayList<OM>();
            //遍历结果
            while(rs.next()){
                //给变量赋值
                OM o = new OM();
                o.setUname(rs.getString("uname"));
                o.setUsex(rs.getString("usex"));
                o.setUage(rs.getInt("uage"));
                o.setUqq(rs.getString("uqq"));
                o.setUwname(rs.getString("uwname"));
                o.setUwsalary(rs.getDouble("uwsalary"));
                o.setUhlocation(rs.getString("uhlocation"));
                o.setUhsize(rs.getDouble("uhsize"));
                o.setUcname(rs.getString("ucname"));
                o.setUcprice(rs.getDouble("ucprice"));
                //将对象存储到集合中
                lo.add(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //关闭资源
            try {
                rs.close();
                ps.close();
                conn.close();
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        //返回结果
        return lo;
    }

}
