package de.phl.programmingproject.calculator;

import org.junit.jupiter.api.Test;
import de.phl.programmingproject.TestBase;
import de.phl.programmingproject.TestUtils;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class SimpleCalculatorTestTest extends TestBase {

    @Test
    void task_1_test_cases_filled_out() throws Exception {
        String content = TestUtils.getFileContentForFileInRootOrSrcDirectory("/src/test/java/de/phl/programmingproject/calculator/SimpleCalculatorTest.java");
        assertFalse(content.contains("= -1"), "There are still '-1' placeholders in the test cases. Please fill out all test values.");
    }

    @Test
    void task_1_calculator_markdown_exists() {
        assertTrue(TestUtils.fileExistsInRootOrSrcDirectory("calculator.md"), "calculator.md file is missing in the project root.");
    }

    /**
     * Invokes all public test methods in SimpleCalculatorTest and asserts all succeed.
     */
    @Test
    void task_2_all_test_cases_succeed() throws Exception {
        SimpleCalculatorTest test = new SimpleCalculatorTest();
        Method[] methods = SimpleCalculatorTest.class.getDeclaredMethods();
        List<String> failedMethods = new ArrayList<>();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class) && method.getParameterCount() == 0) {
                try {
                    method.invoke(test);
                } catch (InvocationTargetException e) {
                    failedMethods.add(method.getName() + ": " + e.getTargetException());
                } catch (Throwable t) {
                    failedMethods.add(method.getName() + ": " + t);
                }
            }
        }
        if (!failedMethods.isEmpty()) {
            fail("Some test methods in SimpleCalculatorTest failed:\n" + String.join("\n", failedMethods));
        }
    }
}