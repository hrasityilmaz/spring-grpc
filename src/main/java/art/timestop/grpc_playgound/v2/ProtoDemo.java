package art.timestop.grpc_playgound.v2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import art.timestop.models.v2.Person;



public class ProtoDemo {
    private static final Logger log = LoggerFactory.getLogger(ProtoDemo.class);

    public static void main(String[] args){
        var person1 = createPerson();

        var person2 = createPerson();

        log.info("equals {}", person1.equals(person2));
        log.info("== {}", person1 == person2);
    }

    private static Person createPerson() {
        return Person.newBuilder()
                                        .setName("sam")
                                        .setAge(34)
                                        .build();
    }
}
