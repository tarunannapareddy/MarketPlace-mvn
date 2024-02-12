package marketplace.services;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Timer;
/*
public class ClientHandler implements Runnable{
    private Socket clientSocket;
    private boolean loggedIn;

    private ClientSessionTimer clientSessionTimer;
    Session session;

    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
        loggedIn = false;
        clientSessionTimer = new ClientSessionTimer();
        session = new Session();
    }
    public void run() {
        try {
            System.out.println("Client connected to the thread "+Thread.currentThread().getId());
            ObjectInputStream objectInputStream = new ObjectInputStream(clientSocket.getInputStream());
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(clientSocket.getOutputStream());
            clientSessionTimer.startSessionTimeoutTimer(objectOutputStream);
            while(true) {
                Operation operation = (Operation) objectInputStream.readObject();
                System.out.println("executing request Operation "+operation);
                clientSessionTimer.resetSessionTimeoutTimer(objectOutputStream, clientSocket);
                if(Operation.LOGOUT.equals(operation)){
                    break;
                }
                Object request = objectInputStream.readObject();
                System.out.println(operation + " received request " + request);
                if(session.getSessionId() == null && !(Operation.LOGIN.equals(operation)|| Operation.CREATE_ACCOUNT.equals(operation))){
                    objectOutputStream.writeObject("Please LogIn to the System or Create Account");
                    break;
                }
                Object response;
                try {
                    response = RequestHandlerMapper.getRequestHandler(operation).handle(request, session);
                } catch (Exception e){
                    response = e.getMessage();
                }
                objectOutputStream.writeObject(response);
            }

            objectOutputStream.writeObject("closing the connection");
            objectInputStream.close();
            objectOutputStream.close();
            clientSocket.close();
        }  catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

 */
