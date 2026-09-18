# Student Result Management System

## Overview

The **Student Result Management System** is a simple Java-based console application created to make it easier to manage student details and academic results. Instead of calculating results and maintaining records manually, the system allows the user to enter student information and marks and automatically generates the required result.

The project is designed as a beginner-friendly Java application and demonstrates how different Java concepts can be combined to solve a practical problem.

## Features

The system provides the following features:

* Add new student details
* View the list of students
* Search for a student using their roll number
* Enter marks for different subjects
* Automatically calculate total marks
* Calculate the student's percentage
* Assign a grade based on the percentage
* Generate a simple result report
* Save result details in a text file
* Validate user input
* Handle file-related errors using exception handling

## Technologies Used

* **Java** – Main programming language
* **ArrayList** – Used to store student records
* **File Handling** – Used to save result information
* **Exception Handling** – Used to handle errors during file operations
* **Git & GitHub** – Used for version control and project submission

## How to Run

To run the project:

1. Download or clone the repository.
2. Open the project in a Java-supported IDE such as IntelliJ IDEA, Eclipse, or VS Code.
3. Make sure all the Java files are inside the `src` folder.
4. Compile the Java files.
5. Run `Main.java`.
6. Choose an option from the menu and follow the instructions displayed on the screen.

## Testing

The project was tested with different types of inputs to make sure the main features work correctly.

Testing included:

* Adding students with valid details
* Checking invalid roll numbers
* Entering valid and invalid marks
* Searching for existing students
* Searching for students who are not in the records
* Checking total and percentage calculations
* Checking grade generation
* Saving result information to the text file
* Testing file-related error handling

## Project Structure

```text
src/
├── Main.java
├── Student.java
├── StudentManager.java
├── Result.java
├── ResultCalculator.java
├── InputValidator.java
├── FileManager.java
└── ReportGenerator.java
```

Each class has a specific responsibility, which keeps the project organized and makes the code easier to understand and maintain.

## Author

**Anushka Tandon**

