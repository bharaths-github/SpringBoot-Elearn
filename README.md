# LearnSphere

LearnSphere is a web application developed using Spring Boot for managing courses and lessons. It provides functionalities for users to register, log in, purchase courses, view their purchased courses, view lessons, and more.

## Table of Contents
- [Introduction](#introduction)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)

## Introduction

LearnSphere is built with Spring Boot and provides features for both trainers and students. Trainers can add courses, view courses, and add lessons to courses. Students can register, log in, purchase courses, view their purchased courses, and view lessons.

## Installation

To run LearnSphere locally, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/learnsphere.git

2. Navigate to the project directory: mvn clean package
    cd learnsphere

3. Build the project using Maven:
    mvn clean package

4. Run the Spring Boot application:
    java -jar target/learnsphere-0.0.1-SNAPSHOT.jar

5. Open a web browser and go to http://localhost:8080 to access the application.

Usage
1.Register an Account: Users can register a new account by providing their details such as email, password, and role.

2.Log In: Existing users can log in to their accounts using their email and password.

3.Purchase Courses: Students can purchase courses available on the platform.

4.View Purchased Courses: After purchasing courses, students can view their purchased courses on the "My Courses" page.

5.View Lessons: Students can view lessons within the courses they have purchased.

6.Add Courses (Trainers): Trainers can add new courses to the platform.

7.Add Lessons (Trainers): Trainers can add lessons to the courses they have created.

Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.
