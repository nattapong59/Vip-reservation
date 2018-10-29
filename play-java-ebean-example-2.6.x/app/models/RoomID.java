package models;

import io.ebean.Model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class RoomID extends Model {
   @Id
   public String Room_Number;
}
