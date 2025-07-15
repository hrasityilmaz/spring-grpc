package art.timestop.grpc_playgound.v4;

import art.timestop.models.v4.AccountBalance;
import art.timestop.models.v4.BalanceCheckRequest;
import art.timestop.models.v4.BankServiceGrpc;
import io.grpc.stub.StreamObserver;

public class BankService extends BankServiceGrpc.BankServiceImplBase {

    @Override
    public void getAccountBalance(BalanceCheckRequest request, StreamObserver<AccountBalance> responseObserver) {
        // TODO Auto-generated method stub
        super.getAccountBalance(request, responseObserver);
    }

}
