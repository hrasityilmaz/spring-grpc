package art.timestop.grpc.common;

import art.timestop.grpc.v6.BankService;

public class Demo {

    public static void main(String[] args){
        GrpcServer.create(new BankService())
                .start()
                .await();
    }

}
