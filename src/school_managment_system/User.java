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
class User {
    String first_name,last_name,username,password,birth_date,address;
    User(String first_name,String last_name,String username,String password,String birth_date,String address){
        this.first_name=first_name;
        this.last_name=last_name;
        this.username=username;
        this.password=password;
        this.birth_date=birth_date;
        this.address=address;
    }
    public String getfirst_name(){
        return this.first_name;
    }
    public String getlast_name(){
        return this.last_name;
    }
    public String getusername(){
        return this.username;
    }
    public String getpassword(){
        return this.password;
    }
    public String getbirth_date(){
        return this.birth_date;
    }
    public String getaddress(){
        return this.address;
    }
}


















