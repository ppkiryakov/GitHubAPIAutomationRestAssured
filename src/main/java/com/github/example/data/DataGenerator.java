package main.java.com.github.example.data;

import main.java.com.github.example.models.requests.CreateRepositoryReq;

import java.util.Random;

public class DataGenerator {

    public CreateRepositoryReq generateCreateRepositoryPOSTRequest() {
        CreateRepositoryReq createRepositoryReq = new CreateRepositoryReq();
        createRepositoryReq.setName(generateRandomStringAndDigits(9));
        createRepositoryReq.setDescription("Creating an example repo");

        return createRepositoryReq;
    }

    private String generateRandomStringAndDigits(int maxStringAndNumbersLength) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder nameBuilder = new StringBuilder();

        // Generate a random name by selecting characters randomly
        for (int i = 0; i < maxStringAndNumbersLength; i++) {
            char randomChar = characters.charAt(random.nextInt(characters.length()));
            nameBuilder.append(randomChar);
        }

        return nameBuilder.toString();
    }
}
