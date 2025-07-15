package art.timestop.grpc.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import art.timestop.models.v1.Person;





public class SimpleProtoDemo {

    private static final Logger log = LoggerFactory.getLogger(SimpleProtoDemo.class);

    public static void main(String[] args){
       
         var person =  Person.newBuilder()
                                        .setName("sam")
                                        .setAge(34)
                                        .build();

        log.info("{}", person);

    }

}
