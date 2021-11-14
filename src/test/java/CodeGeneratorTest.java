import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.CodeGenerator;

public class CodeGeneratorTest {

    @Test
    @DisplayName("Test should generate a code with specific length")
    public void test_should_generate_a_code_with_specific_length(){
        String code = CodeGenerator.generate();
        Assertions.assertEquals(code.length(), CodeGenerator.CODE_LENGTH);
    }

    @Test
    @DisplayName("Test should generate different values between generations")
    public void test_should_generate_different_values_between_generations() {
        String code1 = CodeGenerator.generate();
        String code2 = CodeGenerator.generate();

        Assertions.assertNotEquals(code1, code2);
    }
}
