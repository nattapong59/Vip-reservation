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
public class Medical_Records extends MedicalID {

    private static final long serialVersionUID = 1L;

  
    public String First_name;

    public String Last_name;

    public int ID_card;
    
    public String Address;

    public String Treatment_history;

    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date Birthday;

    public int Phone_number;

    public char sex;
    
    public char Blood_type;

    public String status;

    public String career;

    public String race;

    public String Religion;

    public static final Finder<Long, Medical_Records> find = new Finder<>(Medical_Records.class);

}

