package models;

import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;


import io.ebean.Finder;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity 
public class Booking extends BookingID {

    private static final long serialVersionUID = 1L;

  
    public String First_name;

    public String Last_name;

    public String Status;

    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date BookingDate;

    public String Benefits;

    public static final Finder<Long, Booking> find = new Finder<>(Booking.class);

}

