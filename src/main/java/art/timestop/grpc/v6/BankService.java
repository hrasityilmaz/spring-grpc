package art.timestop.grpc.v6;

import art.timestop.grpc.v6.repository.AccountRepository;
import art.timestop.models.v6.AccountBalance;
import art.timestop.models.v6.BalanceCheckRequest;
import art.timestop.models.v6.BankServiceGrpc;
import io.grpc.stub.StreamObserver;

public class BankService extends BankServiceGrpc.BankServiceImplBase {

    @Override
    public void getAccountBalance(BalanceCheckRequest request, StreamObserver<AccountBalance> responseObserver) {
       var accountNumber = request.getAccountNumber();
       var balance = AccountRepository.getBalance(accountNumber);
       System.out.println(balance);
       var accountBalance = AccountBalance.newBuilder()
                                .setAccountNumber(accountNumber)
                                .setBalance(balance)
                                .build();
       responseObserver.onNext(accountBalance);
       responseObserver.onCompleted(); 
    }

}
