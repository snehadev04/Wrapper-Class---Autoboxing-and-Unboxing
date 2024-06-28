### Repository Name
`Wrapper-Classes-Autoboxing-Autounboxing`

### README

# Java Wrapper Classes with Autoboxing and Autounboxing

This repository contains a simple Java program that demonstrates the use of wrapper classes with autoboxing and autounboxing. 
Wrapper classes in Java allow primitive data types to be treated as objects. Autoboxing is the automatic conversion of primitive types to their corresponding wrapper classes, 
and autounboxing is the automatic conversion of wrapper class objects to their corresponding primitive types.

## Classes

### WrapperExample Class

The `WrapperExample` class contains the `main` method which demonstrates autoboxing and autounboxing.

## How to Run

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/java-wrapper-classes-autoboxing-autounboxing.git
    cd java-wrapper-classes-autoboxing-autounboxing
    ```

2. **Compile and run the program**:
    ```bash
    javac WrapperExample.java
    java WrapperExample
    ```

## Expected Output

```
Autoboxing: Primitive int 5 to Integer 5
Autounboxing: Integer 10 to primitive int 10
Values in integerList: 
20
30
Sum of 50 and 100 is 150
```

## Explanation of Output

1. The first part demonstrates autoboxing by converting a primitive `int` to an `Integer` object.
2. The second part demonstrates autounboxing by converting an `Integer` object to a primitive `int`.
3. The third part shows how wrapper classes can be used in collections, with autoboxing occurring when adding elements to the list and autounboxing occurring when retrieving elements.
4. The final part demonstrates autoboxing and autounboxing in expressions, where `Integer` objects are converted to `int` for the addition operation and the result is autoboxed back to an `Integer`.



## Contributing

Feel free to submit issues or pull requests if you find any bugs or have suggestions for improvements.
