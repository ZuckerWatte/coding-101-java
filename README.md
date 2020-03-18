# Coding-101-java
This project contains a set of unit tests to guide a hands-on learning journey to coding basics. The used project language is java. 
The exercises are supposed to be used in combination with some kind of learning material (presentation/handouts) that provide the students with basic understanding for the following topics:
* variables and data types
* logging to the console
* arithmetic, relational and logical operators
* decision making (if-else clauses, loops)
* classes and functions


## Structure/Concept
For each test class located in `src/main/testing` a respective class exists inside `src/main/learnjava`. The classes provide boilerplate method bodies and signatures, which will need to be filled in order to make all tests pass.  

When running the unit tests, there will be test output printed to the console stating the expected behavior for a given method. If necessary there will be dummy return values in the methods or additional comments for comprehension.
The idea is that the participants don't need to know the details of the unit tests located inside `src/main/testing`.  




## How to use
This repository is meant to be imported to https://repl.it/ in order to remove the overhead of setting up IDEs on the participants computers. The file `.replit` contains the commands that will be executed by repl.it when the participant presses the "Run" Button in the UI.

To provide the coding-101 to your students, follow these steps:
* sign up at https://repl.it/
* hit *import repo* on the top right of the screen
* import this repo `https://github.com/ZuckerWatte/coding-101-java`
* now you can copy the link out of your browser url bar and share it with your students
* in order to be able to edit the code your students will have to *fork* the replit
* there's a *fork* button on the top center of the page above the code editor 

## Run on a local machine
To run the tests locally you only need to make sure you have a valid java installation on your operating system. Testing dependencies are bundled with the project to ensure consistent behavior for development and on repl.it 

To run the test suites execute the command specified in the `.replit` file:
```
javac -classpath .:./lib/junit-4.12.jar:./lib/hamcrest-core-1.3.jar ./src/main/testing/*.java ./src/main/learnjava/*.java  && cd src/main && java -classpath .:../../lib/junit-4.12.jar:../../lib/hamcrest-core-1.3.jar learnjava.Main && cd ../..
```