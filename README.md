# Java AQA Test Task
Implementation language: Java 11

- [Tasks](#tasks)
- [Task 1](#task-1)
  - [Technologies](#technologies)
  - [Project Structure](#project-structure)
  - [Build the Project](#build-the-project)
  - [Run Tests](#run-tests)
  - [Run the Application](#run-the-application)
  - [Unit Tests](#unit-tests)
- [Task 2](#task-2)


## Tasks
1. Make up an algorithm 
   1. If the entered number is greater than 7, then print “Hello”
   2. If the entered name matches “John”, then output “Hello, John”, if not, then output "There is no such name"
   3. There is a numeric array at the input, it is necessary to output array elements that are multiples of 3
2. Answer the questions. Given bracket sequence: \[((())()(())]]
   1. Can this sequence be considered correct? 
   2. If the answer to the previous question is “no”, then what needs to be changed in it to make it correct? 

## Task 1
### Technologies
- Java 11
- Maven
- JUnit 5

### Project Structure
```text
maliukov_java/
├── pom.xml
├── README.md
├── .gitignore
└── src/
    ├── main/
    │   └── java/
    │       ├── Main.java
    │       └── TasksFunctions.java
    └── test/
        └── java/
            └── TasksFunctionsTest.java    
```

### Build the Project
```
mvn clean package
```
### Run Tests
```
mvn test
```

### Run the Application
```
java -cp target/classes Main
```

### Unit Tests
The project includes JUnit 5 unit tests covering:

#### Number validation
- numbers greater than 7;
- numbers less than 7;
- boundary value 7.

#### Name validation
- valid name `John`;
- invalid names;
- case-sensitive name matching.

#### Array processing
- filtering array elements that are multiples of 3;
- arrays without elements divisible by 3.

## Task 2
Bracket sequence: `[((())()(())]]`
- Can this sequence be considered correct?
   - No, this sequence cannot be considered correct because it has unmatched brackets and parentheses:
      - **Square bracket problems:** One opening bracket at the beginning and two closing brackets at the end.
      - **Parentheses problems:** One opening parenthesis does not have a matching closing parenthesis.
- If the answer to the previous question is “no”, then what needs to be changed to make it correct?
   - One of the possible options: Add one opening square bracket `[` at the beginning and add one closing parenthesis `)` before the closing square brackets.
  
