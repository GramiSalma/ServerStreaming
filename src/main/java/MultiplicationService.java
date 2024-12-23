import io.grpc.Server;
import io.grpc.ServerBuilder;
import stub.MultiplicationGrpc;
import stub.MultiplicationOuterClass;
import io.grpc.stub.StreamObserver;

import java.io.IOException;


public class MultiplicationService extends MultiplicationGrpc.MultiplicationImplBase{
    @Override
    public void getMultiplicationTable(MultiplicationOuterClass.MultiplicationRequest request,

                                       StreamObserver<MultiplicationOuterClass.MultiplicationResponse> responseObserver) {

        int nombre = request.getNombre();
        int limite = request.getLimite();
        for (int i = 1; i <= limite; i++) {
            String result = nombre + " x " + i + " = " + (nombre * i);
            MultiplicationOuterClass.MultiplicationResponse response = MultiplicationOuterClass.MultiplicationResponse.newBuilder()
                    .setResultat(result)
                    .build();
// Envoyer le message au client
            responseObserver.onNext(response);
        }
// Terminer le streaming
        responseObserver.onCompleted();
    }


    public static void main(String[] args) throws IOException,
            InterruptedException {
        Server server = ServerBuilder.forPort(50051)
                .addService(new MultiplicationService())
                .build();
        System.out.println("Serveur gRPC démarré sur le port 50051...");
        server.start();
        server.awaitTermination();
    }
}