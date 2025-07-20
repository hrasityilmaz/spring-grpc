package art.timestop.grpc.v6;

import java.time.Duration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import art.timestop.models.v6.AccountBalance;
import art.timestop.models.v6.BalanceCheckRequest;
import art.timestop.models.v6.BankServiceGrpc;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


public class GrpcClient {


    private static final Logger log = LoggerFactory.getLogger(GrpcClient.class);

    public static void main(String[] args) throws InterruptedException{

        var channel = ManagedChannelBuilder.forAddress("localhost", 6664)
                                            .usePlaintext()
                                            .build();

        var stub = BankServiceGrpc.newStub(channel);

        stub.getAccountBalance(BalanceCheckRequest.newBuilder().setAccountNumber(2).build(), new
        StreamObserver<AccountBalance>() {

            @Override
            public void onCompleted() {
                log.info("completed");
            }

            @Override
            public void onError(Throwable throwable) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'onError'");
            }

            @Override
            public void onNext(AccountBalance accountBalance) {
                log.info("{}", accountBalance);
            }

        });

        log.info("done");
        Thread.sleep(Duration.ofSeconds(1).toMillis());
    }

}
