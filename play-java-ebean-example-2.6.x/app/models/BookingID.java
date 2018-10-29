package models;

import io.ebean.Model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BookingID extends Model {
   @Id
   public String Code_Number;
}
