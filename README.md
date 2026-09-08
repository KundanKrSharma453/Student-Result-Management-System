# 🎓 Student Result Management System

<p align="center">
  <img
    src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=600&size=28&pause=1200&color=36BCF7&center=true&vCenter=true&width=750&lines=Student+Result+Management+System;Core+Java+%7C+OOP+%7C+Validation;Simple.+Clean.+Object-Oriented."
    alt="Student Result Management System"
  />
</p>

<p align="center">
  <b>A beginner-friendly Core Java console application for managing student details and calculating academic results.</b>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Core%20Java-OOP-blue?style=for-the-badge&logo=java&logoColor=white" alt="Core Java"/>
  <img src="https://img.shields.io/badge/Application-Console-success?style=for-the-badge" alt="Console Application"/>
  <img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" alt="Status"/>
</p>

<p align="center">
  <img src="https://img.shields.io/github/repo-size/KundanKrSharma453/Student-Result-Management-System?style=flat-square" alt="Repository Size"/>
  <img src="https://img.shields.io/github/last-commit/KundanKrSharma453/Student-Result-Management-System?style=flat-square" alt="Last Commit"/>
  <img src="https://img.shields.io/github/license/KundanKrSharma453/Student-Result-Management-System?style=flat-square" alt="License"/>
</p>

---

## 📌 Overview

**Student Result Management System** is a console-based Java project created to practice fundamental programming and Object-Oriented Programming concepts.

The application collects a student's personal information and marks for **5 subjects**, validates the input, and generates a complete academic result.

### The system calculates

```text
📊 Total Marks
📈 Average Marks
🧮 Percentage
🏆 Grade
```

The project focuses on writing clean, understandable Java code while demonstrating how multiple Core Java concepts work together in a small real-world application.

---

## ✨ Features

<table>
<tr>
<td width="50%">

### 👨‍🎓 Student Management

* Student ID
* Name
* Email
* Age
* Subject marks

</td>
<td width="50%">

### 📊 Result Calculation

* Total marks
* Average marks
* Percentage
* Automatic grade calculation

</td>
</tr>

<tr>
<td>

### 🔐 Data Protection

* Private instance variables
* Getters
* Setters
* Constructor-based initialization

</td>
<td>

### 🛡️ Input Validation

* Positive student ID
* Valid age
* Marks between 0–100
* Non-empty name
* Exception handling

</td>
</tr>
</table>

---

## 🎯 Project Objective

The main objective is to build a simple Java application while practicing the following concepts:

```text
Variables
   ↓
Data Types
   ↓
Scanner
   ↓
Strings
   ↓
Arrays
   ↓
Operators
   ↓
Conditions
   ↓
Loops
   ↓
Methods
   ↓
Classes & Objects
   ↓
Constructors
   ↓
Encapsulation
   ↓
Exception Handling
```

---

## 🧠 Concepts Practiced

| Concept            | Usage                               |
| ------------------ | ----------------------------------- |
| Variables          | Store student information           |
| Data Types         | `int`, `String`, `double`           |
| Scanner            | Read user input                     |
| Arrays             | Store marks for 5 subjects          |
| Strings            | Store student name and email        |
| Operators          | Perform calculations                |
| if-else            | Validate input and calculate grades |
| Loops              | Read multiple subject marks         |
| Methods            | Separate application logic          |
| Classes            | Define the `Student` object         |
| Objects            | Create student instances            |
| Constructors       | Initialize student data             |
| Encapsulation      | Private fields with getters/setters |
| Exception Handling | Handle invalid input                |

---

## 🏗️ Application Architecture

The project follows a simple two-class structure:

```text
┌─────────────────────────────────────────┐
│ Student_Result_Management_System.java   │
│                                         │
│ • Scanner / User Input                  │
│ • Input Validation                      │
│ • Student Object Creation               │
│ • Result Display                        │
└───────────────────┬─────────────────────┘
                    │
                    │ creates
                    ▼
┌─────────────────────────────────────────┐
│ Student.java                             │
│                                         │
│ • Student Information                   │
│ • Marks Array                            │
│ • Getters / Setters                      │
│ • Total Calculation                      │
│ • Average Calculation                    │
│ • Percentage Calculation                 │
│ • Grade Calculation                      │
└─────────────────────────────────────────┘
```

---

## 📂 Project Structure

```text
Student-Result-Management-System/
│
├── Student.java
│   └── Student data model & result calculations
│
├── Student_Result_Management_System.java
│   └── Main program, input & output handling
│
├── README.md
│   └── Project documentation
│
└── .gitignore
    └── Ignored IDE/build files
```

> Build files, compiled `.class` files, IDE configuration files, and generated output directories are excluded through `.gitignore`.

---

## 👨‍🎓 Student Class

The `Student` class represents a student and stores all student-related information.

### Fields

```java
private int studentId;
private String name;
private String email;
private int age;
private int[] marks;
```

### Constructor

```java
public Student(
    int studentId,
    String name,
    String email,
    int age,
    int[] marks
)
```

The parameterized constructor initializes all student information when a `Student` object is created.

---

## ⚙️ Result Calculation

### Total Marks

The total is calculated by adding the marks obtained in all 5 subjects.

```text
Total = Subject 1 + Subject 2 + Subject 3 + Subject 4 + Subject 5
```

### Average

```text
Average = Total Marks / Number of Subjects
```

### Percentage

Since each subject has a maximum of 100 marks:

```text
Percentage = (Total Marks / 500) × 100
```

### Grade

```text
90–100  → A
80–89   → B
70–79   → C
60–69   → D
Below 60 → F
```

---

## 🏆 Grade System

<table align="center">
<tr>
<th>Percentage</th>
<th>Grade</th>
<th>Performance</th>
</tr>

<tr>
<td align="center">90 – 100</td>
<td align="center">🅰️ <b>A</b></td>
<td align="center">Excellent</td>
</tr>

<tr>
<td align="center">80 – 89</td>
<td align="center">🅱️ <b>B</b></td>
<td align="center">Very Good</td>
</tr>

<tr>
<td align="center">70 – 79</td>
<td align="center">🅲 <b>C</b></td>
<td align="center">Good</td>
</tr>

<tr>
<td align="center">60 – 69</td>
<td align="center">🅳 <b>D</b></td>
<td align="center">Satisfactory</td>
</tr>

<tr>
<td align="center">Below 60</td>
<td align="center">🅵 <b>F</b></td>
<td align="center">Needs Improvement</td>
</tr>
</table>

---

## 🔄 Program Workflow

```text
                         ┌──────────────┐
                         │    START     │
                         └──────┬───────┘
                                │
                                ▼
                   ┌────────────────────────┐
                   │ Enter Student Details  │
                   └────────────┬───────────┘
                                │
                                ▼
                   ┌────────────────────────┐
                   │    Validate Input      │
                   └────────────┬───────────┘
                                │
                                ▼
                   ┌────────────────────────┐
                   │ Enter Marks for 5      │
                   │ Subjects               │
                   └────────────┬───────────┘
                                │
                                ▼
                   ┌────────────────────────┐
                   │    Create Student     │
                   │       Object          │
                   └────────────┬───────────┘
                                │
                                ▼
              ┌──────────────────────────────────┐
              │          Calculate Result        │
              │                                  │
              │  Total → Average → Percentage   │
              │              ↓                   │
              │            Grade                 │
              └────────────────┬─────────────────┘
                               │
                               ▼
                   ┌────────────────────────┐
                   │    Display Result      │
                   └────────────┬───────────┘
                                │
                                ▼
                         ┌──────────────┐
                         │     END      │
                         └──────────────┘
```

---

## 🛡️ Input Validation

The application prevents invalid data using validation and exception handling.

### Student ID

```text
Must be greater than 0
```

### Name

```text
Must not be empty
```

### Age

```text
Must be greater than 0
```

### Marks

```text
Must be between 0 and 100
```

### Invalid Input

```text
Invalid numeric input → handled using exception handling
```

---

## 💻 Example

### Input

```text
========================================
       STUDENT RESULT SYSTEM
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
```

### Output

```text
========================================
          STUDENT RESULT
========================================

Student ID   : 101
Name         : Rahul
Email        : rahul@gmail.com
Age          : 20

----------------------------------------
Subject 1    : 85
Subject 2    : 90
Subject 3    : 78
Subject 4    : 88
Subject 5    : 92
----------------------------------------

Total Marks  : 433
Average      : 86.60
Percentage   : 86.60%
Grade        : B

========================================
```

---

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/KundanKrSharma453/Student-Result-Management-System.git
```

### 2. Navigate into the project

```bash
cd Student-Result-Management-System
```

### 3. Compile the Java files

```bash
javac Student.java Student_Result_Management_System.java
```

### 4. Run the application

```bash
java Student_Result_Management_System
```

---

## 🧪 Test Cases

| Test           | Input              | Expected Result  |
| -------------- | ------------------ | ---------------- |
| Valid student  | ID `101`, age `20` | Student accepted |
| Negative ID    | `-10`              | Validation error |
| Invalid age    | `0`                | Validation error |
| Empty name     | `""`               | Validation error |
| Invalid marks  | `105`              | Validation error |
| Negative marks | `-5`               | Validation error |
| High score     | `90+`              | Grade A          |
| Low score      | `<60`              | Grade F          |

---

## 🧰 Technologies Used

<p align="center">
  <img src="https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/OOP-Object%20Oriented-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Scanner-Input-success?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Arrays-Data%20Storage-purple?style=for-the-badge" />
</p>

---

## 🚀 Learning Outcomes

After completing this project, you should be comfortable with:

```text
✓ Creating classes
✓ Creating objects
✓ Using constructors
✓ Applying encapsulation
✓ Working with arrays
✓ Writing reusable methods
✓ Using loops
✓ Using conditional statements
✓ Performing calculations
✓ Validating user input
✓ Handling exceptions
✓ Building a complete console application
```

---

## 🔮 Possible Future Improvements

This project can be extended with:

* Multiple student records
* Search student by ID
* Update student details
* Delete student records
* File-based data storage
* Database integration
* Menu-driven interface
* Subject names
* Rank calculation
* Result report generation
* GUI interface
* REST API backend

---

## 📜 License

This project is created for **educational and Java programming practice purposes**.

You are free to study, modify, and extend the project for learning.

---

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&height=120&section=footer&text=Keep%20Learning%20Java&fontSize=24&fontAlignY=65" alt="Footer"/>
</p>

<p align="center">
  ⭐ <b>If this project helped you learn Java, consider giving it a star!</b>
</p>
