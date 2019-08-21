/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author EGYPT-LAPTOP
 */
public class Student {
    int id;
    String fname, lname, tel1;

    public Student(int id, String fname, String lname, String tel1) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.tel1 = tel1;
        
    }

  

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getTel1() {
        return tel1;
    }

   
}
