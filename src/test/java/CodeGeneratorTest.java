import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.CodeGenerator;

public class CodeGeneratorTest {

    @Test
    public void test_should_generate_a_code_with_specific_length(){
        String code = CodeGenerator.generate();
        Assertions.assertEquals(code.length(), CodeGenerator.CODE_LENGTH);
    }

    @Test
    public void test_should_generate_different_values_between_generations() {
        String code1 = CodeGenerator.generate();
        String code2 = CodeGenerator.generate();

        Assertions.assertNotEquals(code1, code2);
    }
}
