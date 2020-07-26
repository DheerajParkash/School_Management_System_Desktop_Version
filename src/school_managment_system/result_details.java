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
public class result_details {
    int total_marks,obtained_marks;
    String subject,grade;
    public result_details(String subject,int total_marks,int obtained_marks,String grade){
        this.subject=subject;
        this.total_marks=total_marks;
        this.obtained_marks=obtained_marks;
        this.grade=grade;
    }
    public String subject(){
     return this.subject;   
    }
    public String grade(){
     return this.grade;   
    }
    public int t_marks(){
     return this.total_marks;   
    }
    public int o_marks(){
     return this.obtained_marks;   
    }
}













