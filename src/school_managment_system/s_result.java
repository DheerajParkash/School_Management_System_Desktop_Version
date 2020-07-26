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
public class s_result {
    String f_name,l_name;
    int id;
    public s_result(int id,String f_name,String l_name){
        this.id=id;
        this.f_name=f_name;
        this.l_name=l_name;
    }
    public int id(){
        return this.id;
    }
    public String f_name(){
        return this.f_name;
    }
    public String l_name(){
        return this.l_name;
    }
}
