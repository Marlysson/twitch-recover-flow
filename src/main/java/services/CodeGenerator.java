package services;

import org.aspectj.apache.bcel.classfile.Code;

import java.util.Random;
import java.util.stream.IntStream;

public class CodeGenerator {

    public static Integer CODE_LENGTH = 6;
    public static Integer MAX_NUMBER_GENERATED = 9;

    private static String code = "";

    public static String generate() {

        for( int i = 0; i < CODE_LENGTH; i++){
            code += generateRandomNumber();
        }

        return code;
    }

    private static Integer generateRandomNumber(){
        return new Random().nextInt(MAX_NUMBER_GENERATED + 1);
    }
}
