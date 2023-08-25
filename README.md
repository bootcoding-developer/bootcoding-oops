In Java, data types are used to define the type of data that a variable can hold. Java supports two categories of data types: primitive data types and reference data types. Here's a brief overview of each data type with examples:

### Primitive Data Types:

1. **byte**: It represents a 8-bit signed integer. Its range is -128 to 127.
   ```java
   byte age = 25;
   ```

2. **short**: It represents a 16-bit signed integer. Its range is -32,768 to 32,767.
   ```java
   short temperature = -10;
   ```

3. **int**: It represents a 32-bit signed integer. Its range is -2^31 to 2^31 - 1.
   ```java
   int count = 1000;
   ```

4. **long**: It represents a 64-bit signed integer. Its range is -2^63 to 2^63 - 1.
   ```java
   long bigNumber = 123456789L;
   ```

5. **float**: It represents a 32-bit floating-point number.
   ```java
   float pi = 3.14f;
   ```

6. **double**: It represents a 64-bit floating-point number (default for floating-point numbers).
   ```java
   double price = 99.99;
   ```

7. **char**: It represents a single 16-bit Unicode character.
   ```java
   char grade = 'A';
   ```

8. **boolean**: It represents a boolean value `true` or `false`.
   ```java
   boolean isJavaFun = true;
   ```

### Reference Data Types:

Reference data types in Java are used to refer to objects.

1. **String**: It represents a sequence of characters (not a primitive data type, but a commonly used reference type).
   ```java
   String name = "John Doe";
   ```

2. **Arrays**: It represents a collection of elements of the same data type.
   ```java
   int[] numbers = {1, 2, 3, 4, 5};
   ```

3. **Classes**: They represent user-defined types and can be instantiated to create objects.
   ```java
   class Person {
       String name;
       int age;
   }
   Person person1 = new Person();
   ```

4. **Interfaces**: They represent a contract for a class to implement certain methods.
   ```java
   interface Shape {
       void draw();
   }
   ```

5. **Enums**: They represent a fixed set of constants.
   ```java
   enum DayOfWeek {
       MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
   }
   ```

Remember that Java is statically typed, so you need to declare the data type of a variable before using it. For example:

```java
int age = 25;
String name = "John";
boolean isAdult = true;
```

Always ensure that the data type you choose is appropriate for the kind of data you intend to store in the variable.