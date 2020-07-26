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
public class S_Details {
    int s_id;
    String first_name,last_name,p_id,gender,birth_date,c_class,last_school,name,cnic,contact,email,address;
    public S_Details(int s_id,String first_name,String last_name,String p_id,String gender,String birth_date,String c_class,String last_school,String name,String cnic,String contact,String email,String address){
        this.s_id=s_id;
        this.first_name=first_name;
        this.last_name=last_name;
        this.p_id=p_id;
        this.gender=gender;
        this.birth_date=birth_date;
        this.c_class=c_class;
        this.last_school=last_school;
        this.name=name;
        this.cnic=cnic;
        this.contact=contact;
        this.email=email;
        this.address=address;
    }
    public int s_id(){
        return this.s_id;
    }
    public String first_name(){
        return this.first_name;
    }
    public String last_name(){
        return this.last_name;
    }
    public String p_id(){
        return this.p_id;
    }
    public String gender(){
        return this.gender;
    }
    public String birth_date(){
        return this.birth_date;
    }
    public String c_class(){
        return this.c_class;
    }
    public String last_school(){
        return this.last_school;
    }
    public String name(){
        return this.name;
    }
    public String cnic(){
        return this.cnic;
    }
    public String contact(){
        return this.contact;
    }
    public String email(){
        return this.email;
    }
    public String address(){
        return this.address;
    }
}












