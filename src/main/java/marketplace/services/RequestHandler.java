package marketplace.services;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

@Component
public class RequestHandler {
    public static String sendPutRequest(String apiUrl, String requestBody) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Set request method
        connection.setRequestMethod("PUT");

        // Set request headers
        connection.setRequestProperty("Content-Type", "application/json");

        // Enable input and output streams
        connection.setDoInput(true);
        connection.setDoOutput(true);

        // Write the request body to the output stream
        try (DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream())) {
            outputStream.write(requestBody.getBytes());
        }

        // Get the response from the server
        int responseCode = connection.getResponseCode();
        StringBuilder responseBody = new StringBuilder();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    responseBody.append(line);
                }
            }
        } else {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    responseBody.append(line);
                }
            }
        }

        // Close the connection
        connection.disconnect();

        return responseBody.toString();
    }
}
