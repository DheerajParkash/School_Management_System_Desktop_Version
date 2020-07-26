/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_managment_system;

/**
 *
 * @author DHEERAJ K'S PC
 */
public class class_data {
    int id;
    String name,gender,dob;
    public class_data(int id,String name,String gender, String dob){
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.dob=dob;
    }
    public int id(){
     return this.id;
    }
    public String name(){
        return this.name;
    }
    public String gender(){
        return this.gender;
    }
    public String dob(){
        return this.dob;
    }
}









