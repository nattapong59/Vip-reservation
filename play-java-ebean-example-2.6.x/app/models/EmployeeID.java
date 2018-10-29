package models;

import io.ebean.Model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class EmployeeID extends Model {
   @Id
   public int Employee_ID;
}
