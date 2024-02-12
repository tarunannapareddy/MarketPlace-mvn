package marketplace.services;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Timer;
import java.util.TimerTask;
/*
public class ClientSessionTimer {

    private Timer timer;

    public ClientSessionTimer() {
        this.timer = new Timer(true);
    }

    public void startSessionTimeoutTimer(ObjectOutputStream objectOutputStream) {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    // Send a warning message to the client
                    objectOutputStream.writeObject("Session timeout imminent. Please perform an action to stay logged in.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, 1 * 60 * 1000, 30 * 1000); // Display a warning every minute starting from 4 minutes
    }


    // Method to reset the session timeout timer
    public void resetSessionTimeoutTimer(ObjectOutputStream objectOutputStream, Socket clientSocket) {
        timer.cancel();
        timer = new Timer(true);
        startSessionTimeoutTimer(objectOutputStream);
        stopSessionTimeoutTimer(objectOutputStream, clientSocket);
    }

    // Method to stop the session timeout timer
    public void stopSessionTimeoutTimer(ObjectOutputStream objectOutputStream, Socket clientSocket) {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    // Perform automatic logout after 5 minutes of inactivity
                    objectOutputStream.writeObject("Automatic logout due to inactivity.");
                    clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, 2 * 60 * 1000);
    }
}

 */
