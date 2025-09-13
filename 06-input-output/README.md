# 🖥️ Java Input and Output (I/O)

In Java, **Input and Output (I/O)** refers to the way a program interacts with the **user or external data sources**.  
The most common I/O in beginner programs is **console input and output**.

---

## 🔹 1. Printing to the Console

Java provides the `System.out` object for printing messages to the console.

### 1.1 `println`
Prints the message **and moves to a new line**.
```java
public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello, World!");
        System.out.println("Welcome to Java I/O");
    }
}
````

**Output:**

```
Hello, World!
Welcome to Java I/O
```

### 1.2 `print`

Prints the message **without moving to a new line**.

```java
public class Main 
{
    public static void main(String[] args) 
    {
        System.out.print("Hello, ");
        System.out.print("World!");
    }
}
```

**Output:**

```
Hello, World!
```

### 1.3 `printf`

Prints formatted output, similar to C's `printf`.

```java
public class Main 
{
    public static void main(String[] args) 
    {
        int age = 25;
        double height = 5.9;
        System.out.printf("Age: %d, Height: %.1f feet%n", age, height);
    }
}
```

**Output:**

```
Age: 25, Height: 5.9 feet
```

---

## 🔹 2. Reading Input from the User

The `Scanner` class from `java.util` package is commonly used for console input.

### 2.1 Importing Scanner

```java
import java.util.Scanner;
```

### 2.2 Creating a Scanner Object

```java
Scanner scanner = new Scanner(System.in);
```

### 2.3 Reading Different Types of Input

```java
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Reading an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Reading a double
        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();

        // Reading a single word (String)
        System.out.print("Enter your name: ");
        String name = scanner.next();

        // Reading a full line (String)
        scanner.nextLine(); // consume newline
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.println("\nYou entered:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Address: " + address);

        scanner.close();
    }
}
```

---

## 🔹 3. Notes and Best Practices

1. Always **import `java.util.Scanner`** when using Scanner.
2. Use `scanner.close()` to **release system resources**.
3. `next()` reads input until a space, `nextLine()` reads the **entire line**.
4. For numeric input, ensure the user enters the **correct type** to avoid exceptions.
5. Combine **`print`**, **`println`**, and **`printf`** for formatted and user-friendly messages.

---

## 🔹 4. Example: Simple Calculator

```java
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        System.out.printf("The sum of %.2f and %.2f is %.2f%n", num1, num2, sum);

        scanner.close();
    }
}
```

**Sample Input:**

```
5.5
4.5
```

**Output:**

```
The sum of 5.50 and 4.50 is 10.00
```
