package models;

import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;


import io.ebean.Finder;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Company entity managed by Ebean
 */
@Entity 
public class Employee extends EmployeeID {

    private static final long serialVersionUID = 1L;

  
    public String First_name;

    public String Last_name;

    public String Position;

    public char sex;

    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date Birthday;

    public int Phone_number;

    public int Saraly;

    public String department;

    public String Address;

    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date Working_day;

    public static final Finder<Long, Employee> find = new Finder<>(Employee.class);

}

