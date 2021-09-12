package services;

import java.util.Random;
import java.util.stream.IntStream;

public class CodeGenerator {

    public static Integer CODE_LENGTH = 6;
    public static Integer MAX_NUMBER_GENERATED = 9;

    public static String generate() {

        String result = "";

        for (int i = 0; i < CODE_LENGTH; i++) {
            Integer number = generateRandomNumber();
            result += number.toString();
        }

        return result;
    }

    private static Integer generateRandomNumber(){
        return new Random().nextInt(MAX_NUMBER_GENERATED + 1);
    }
}
