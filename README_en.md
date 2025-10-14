# Exercise Sheet
[Link to German Version](./README.md)

In this exercise sheet, you will learn about test cases in Java projects and how to use the integrated test cases to check your solution. All exercise sheets in the course **INF520-Programming Project** include test cases to help you solve the exercises correctly. However, the test cases are only helpful if you run them regularly.

This exercise sheet does **not** require you to write your own test cases for your programs. You will learn how to do this later.

## Exercise 0: Tutorial on Tests in Visual Studio Code

Watch the tutorials linked in Moodle on how to run test cases in Visual Studio Code:
* [VS Code: Run/Debug test cases](https://code.visualstudio.com/docs/java/java-testing#_rundebug-test-cases)
* https://youtu.be/vZm0lHciFsQ?t=336
* https://youtu.be/nYQaDWISKUI?t=198

## Exercise 1: Complete the Test Cases

The package [`de.phl.programmingproject.calculator`](src/main/java/de/phl/programmingproject/calculator/) contains a simple implementation of a calculator ([`SimpleCalculator`](src/main/java/de/phl/programmingproject/calculator/SimpleCalculator.java)). The [`SimpleCalculator`](src/main/java/de/phl/programmingproject/calculator/SimpleCalculator.java) supports the four basic arithmetic operations:

* Addition
* Subtraction
* Multiplication
* Division

To test the implementation, there is a class [`SimpleCalculatorTest`](src/test/java/de/phl/programmingproject/calculator/SimpleCalculatorTest.java) in the test folder. There is one test case for each arithmetic operation, but they are still incomplete.

**Tasks:**

1. Complete the test cases according to the **`TODO` comments**.
2. Run the test cases and check whether all operations work correctly.
3. Analyze any failing test cases and describe the cause.
4. Create a file `calculator.md` in the main directory and document which errors you found.
5. Upload the file `calculator.md` to the repository.

---

## Exercise 2: Correcting Faulty Code

In the previous exercise, you may have discovered faulty implementations. Correct them as follows:

**Tasks:**

1. Fix the errors in the affected methods.
2. Run the test cases again.
3. Repeat the corrections until all tests pass successfully.
4. Upload the corrected code to the repository.