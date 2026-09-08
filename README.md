\# Student Result Management System



<p align="center">

&#x20; <img src="https://readme-typing-svg.demolab.com?font=Fira+Code\&size=26\&pause=1000\&color=36BCF7\&center=true\&vCenter=true\&width=650\&lines=Student+Result+Management+System;Built+with+Core+Java;OOP+%7C+Arrays+%7C+Validation" alt="Student Result Management System" />

</p>



<p align="center">

&#x20; <img src="https://img.shields.io/badge/Java-Core%20Java-orange?style=for-the-badge\&logo=openjdk" />

&#x20; <img src="https://img.shields.io/badge/Type-Console%20Application-blue?style=for-the-badge" />

&#x20; <img src="https://img.shields.io/badge/OOP-Practice-success?style=for-the-badge" />

</p>



\---



\## About



A console-based Java application for managing student information and calculating academic results.



The program accepts student details and marks for \*\*5 subjects\*\*, then calculates:



\* Total Marks

\* Average Marks

\* Percentage

\* Grade



It also validates user input and handles invalid data using exception handling.



\---



\## Objective



This project is designed to practice fundamental \*\*Java\*\* and \*\*Object-Oriented Programming\*\* concepts.



\### Concepts Covered



\* Variables

\* Data Types

\* Scanner

\* Arrays

\* Strings

\* Operators

\* if-else

\* Loops

\* Methods

\* Classes

\* Objects

\* Constructors

\* Instance Variables

\* Encapsulation

\* Exception Handling

\* Input Validation



\---



\## Features



| Feature            | Description                                 |

| ------------------ | ------------------------------------------- |

| Student Details    | Stores ID, name, email and age              |

| Subject Marks      | Accepts marks for 5 subjects                |

| Total              | Calculates total marks                      |

| Average            | Calculates average marks                    |

| Percentage         | Calculates percentage                       |

| Grade              | Automatically calculates grade              |

| Encapsulation      | Uses private variables with getters/setters |

| Validation         | Validates student information and marks     |

| Exception Handling | Handles invalid input                       |



\---



\## Grade System



| Percentage | Grade |

| ---------: | :---: |

|     90–100 |   A   |

|      80–89 |   B   |

|      70–79 |   C   |

|      60–69 |   D   |

|   Below 60 |   F   |



\---



\## Student Class



The `Student` class contains:



```java

private int studentId;

private String name;

private String email;

private int age;

private int\[] marks;

```



\### Methods



```text

displayStudentDetails()

calculateTotal()

calculateAverage()

calculatePercentage()

calculateGrade()

```



The class also provides getters and setters for all instance variables.



\---



\## Program Flow



```text

START

&#x20; │

&#x20; ▼

Enter Student Details

&#x20; │

&#x20; ▼

Validate Input

&#x20; │

&#x20; ▼

Enter Marks for 5 Subjects

&#x20; │

&#x20; ▼

Create Student Object

&#x20; │

&#x20; ▼

Calculate Result

&#x20; │

&#x20; ├── Total

&#x20; ├── Average

&#x20; ├── Percentage

&#x20; └── Grade

&#x20; │

&#x20; ▼

Display Student Result

&#x20; │

&#x20; ▼

END

```



\---



\## Project Structure



```text

Student-Result-Management-System/

│

├── Student.java

├── Student\_Result\_Management\_System.java

├── README.md

└── .gitignore

```



\---



\## How to Run



\### Compile



```bash

javac Student.java Student\_Result\_Management\_System.java

```



\### Run



```bash

java Student\_Result\_Management\_System

```



\---



\## Example Output



```text

========================================

&#x20;      STUDENT RESULT SYSTEM

========================================



Enter Student ID: 101

Enter Name: Rahul

Enter Email: rahul@gmail.com

Enter Age: 20



Enter marks for 5 subjects:

Subject 1: 85

Subject 2: 90

Subject 3: 78

Subject 4: 88

Subject 5: 92



========================================

&#x20;         STUDENT RESULT

========================================



Student ID   : 101

Name         : Rahul

Email        : rahul@gmail.com

Age          : 20



Total Marks  : 433

Average      : 86.60

Percentage   : 86.60%

Grade        : B



========================================

```



\---



\## Input Validation



The application ensures:



\* Student ID must be positive

\* Age must be greater than 0

\* Marks must be between 0 and 100

\* Name must not be empty

\* Invalid numeric input is handled



\---



\## Learning Outcomes



By completing this project, you will learn how to:



\* Create Java classes and objects

\* Use constructors

\* Apply encapsulation

\* Work with arrays

\* Create reusable methods

\* Perform calculations

\* Use conditional statements

\* Use loops

\* Validate input

\* Handle exceptions

\* Build a complete console-based Java application



\---



\## Technologies



\* Java

\* Core Java

\* Object-Oriented Programming

\* Scanner

\* Arrays

\* Exception Handling



\---



\## License



This project is created for educational and Java programming practice purposes.



\---



<p align="center">

&#x20; ⭐ If this project helped you learn Java, consider giving it a star!

</p>



