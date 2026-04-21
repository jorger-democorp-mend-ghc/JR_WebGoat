package org.simple-jr-secret;

public class SecretExposureExample {

    // Hardcoded API Key - Security Risk
    private static final String API_KEY = "12345-ABCDE-SECRET-KEY";

    public static void main(String[] args) {
        System.out.println("Using API Key: " + API_KEY);

        // Simulated API call
        makeApiCall(API_KEY);
    }

    private static void makeApiCall(String apiKey) {
        System.out.println("Making API call with key: " + apiKey);

        // In a real scenario, this would use the API key in an HTTP request
        // Example: HttpURLConnection or any HTTP client library.
    }
}
