/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_managment_system;

import javax.swing.JOptionPane;

/**
 *
 * @author DHEERAJ K'S PC
 */
public class subjects_per_year {
    String subject,teacher,class_id,year;
    int t_marks;
    public subjects_per_year(String subject,String teacher,String class_id,String year,int t_marks){
        //JOptionPane.showMessageDialog(null," dat received"+subject+" "+teacher+" "+class_id+" "+year+" "+t_marks);
        this.subject=subject;
        this.teacher=teacher;
        this.class_id=class_id;
        this.year=year;
        this.t_marks=t_marks;
    }
    public String subject(){
        return this.subject;
    }
    public String teacher(){
        return this.teacher;
    }
    public String class_id(){
        return this.class_id;
    }
    public String year(){
        return this.year;
    }
    public int marks(){
        return this.t_marks;
    }
    
}
