package models;

import io.ebean.Model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class MedicalID extends Model {
   @Id
   public String HN_code;
}
