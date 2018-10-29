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
public class Room extends RoomID {

    private static final long serialVersionUID = 1L;

  
    public String Room_Status;

    public String Type_Room;

    public String Room_equipment;

    public int price;

    public static final Finder<Long, Room> find = new Finder<>(Room.class);

}

