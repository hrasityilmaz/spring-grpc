package art.timestop.grpc_playgound.v3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import art.timestop.models.v3.Address;
import art.timestop.models.v3.School;
import art.timestop.models.v3.Student;

public class Composition {
     private static final Logger log = LoggerFactory.getLogger(Composition.class);

    public static void main(String[] args){

        // Create a student

        var adderss = Address.newBuilder()
                                .setStreet("123 Main Str")
                                .setCity("atlanata")
                                .setState("GA")
                                .build();

        var student = Student.newBuilder()
                                .setName("Sam")
                                .setAddress(adderss)
                                .build();
        
        var school = School.newBuilder()
                                .setId(1)
                                .setName("high school")
                                .setAddress(adderss.toBuilder().setStreet("234 Main Street"))
                                .build();

       log.info("school {}", school);
       log.info("student {}", student);

    }
}
