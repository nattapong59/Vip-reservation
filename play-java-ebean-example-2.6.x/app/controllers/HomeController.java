package controllers;

import models.Computer;
import play.data.Form;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;
import repository.CompanyRepository;
import repository.ComputerRepository;

import java.util.List;
import models.Medical_Records;
import models.Employee;
import models.Booking;
import models.Room;

import javax.inject.Inject;
import javax.persistence.PersistenceException;
import java.util.Map;
import java.util.concurrent.CompletionStage;

/**
 * Manage a database of computers
 */
public class HomeController extends Controller {
    List<Medical_Records> Medical =Medical_Records.find.all();
    List<Employee> Employees =Employee.find.all();
    List<Booking> Bookings =Booking.find.all();
    List<Room> Rooms =Room.find.all();



    public Result main() {
        return ok(views.html.main.render());
    }
    public Result booking(){
        return ok(views.html.booking.render());
    }
    public Result check(){
        return ok(views.html.check.render());
    }
    public Result rules(){
        return ok(views.html.rules.render());
    }
    public Result medical_data(){
        return ok(views.html.medical_data.render());
    }
    public Result management_employee(){
        return ok(views.html.management_employee.render());
    }
    public Result management_room() {
        return ok(views.html.management_room.render());
   }
   public Result payment(){
       return ok(views.html.payment.render());
   }
   public Result test(){
    return ok(views.html.test.render());
    }

}
            
