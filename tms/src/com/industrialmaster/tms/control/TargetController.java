/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.industrialmaster.tms.control;

import com.industrialmaster.tms.db.DB;
import com.industrialmaster.tms.model.TargetModel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author malit
 */
public class TargetController {
    public static boolean save(TargetModel target){
         //2. Create Sql query from field Values (INSERT)
        String sql="INSERT INTO target (name,amount,date) VALUES (?,?,?)";
   
        try{
    
            Connection con=DB.getCon();
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, target.getName());
            ps.setDouble(2, target.getAmount());
            ps.setDate(3, target.getDate());
        //4.Execute statement in the Databse
             ps.executeUpdate();
             return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    public static  List<TargetModel> getAll(){
     List<TargetModel>list=new ArrayList<>();
          //2. Create Sql query from field Values (INSERT)
        String sql="SELECT * FROM target";
        try {
        Connection con=DB.getCon();
        PreparedStatement ps=con.prepareStatement(sql);
        
        //4.Execute statement in the Databse
             ResultSet rs= ps.executeQuery();
             while (rs.next()) {                
                TargetModel target= new TargetModel();
                target.setId(rs.getInt("id"));
                target.setName(rs.getString("name"));
                target.setAmount(rs.getDouble("amount"));
                target.setDate(rs.getDate("date"));
                target.setCompleted(rs.getBoolean("complete"));
                list.add(target);
                
            }
             
        } catch (Exception e) {
            e.printStackTrace();
        }
     return list;
    }
    
    public static TargetModel getOne(int id){
            TargetModel target=new TargetModel();
        String sql="SELECT * FROM target WHERE id=?";
        try {
            Connection con=DB.getCon();
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                target.setId(rs.getInt("id"));
                target.setName(rs.getString("name"));
                target.setAmount(rs.getDouble("amount"));
                target.setDate(rs.getDate("date"));
                target.setCompleted(rs.getBoolean("complete"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return target;
    }
    public static boolean update (TargetModel target){
       String sql="UPDATE target SET name=?,amount=?,date=? WHERE id=?";
  
        try{
            Connection con=DB.getCon();
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, target.getName());
            ps.setDouble(2, target.getAmount());
            ps.setDate(3, target.getDate());
            ps.setInt(4, target.getId());
        //4.Execute statement in the Databse
             ps.executeUpdate();
             return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public static boolean delete (int id){
       String sql="DELETE FROM target WHERE id=?";
  
        try{
            Connection con=DB.getCon();
            PreparedStatement ps=con.prepareStatement(sql);
         
            ps.setInt(1, id);
        //4.Execute statement in the Databse
             ps.executeUpdate();
             return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
