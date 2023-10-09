# Capstone-Project
# Software Requirement Specification

## 1. Introduction

### 1.1 Purpose
The purpose of this document is to outline the software requirements for the development of a Product Management System. The system aims to provide a platform for managing products, features, and parameters in a hierarchical structure.

### 1.2 Scope
The system will allow users to log in as existing customers or sign up for new accounts. It will include features for adding, editing, and viewing products, features, and parameters. The hierarchy will be represented in a tree structure on the summary page.

## 2. System Overview

### 2.1 System Description
The system will consist of a frontend developed in Angular 16 with HTML5, a middleware implemented in Java using the Spring Boot framework, and a backend database using PostgreSQL. The server will be hosted on an embedded Tomcat server, and Maven will be used as the build tool.

### 2.2 Features
1. User Authentication:
   - Users can log in if they are existing customers or sign up for new accounts.

2. Product Specification Page:
   - UI for adding a new product with fields: Name, Internal name, Product ID, Details, Maximum Products per location.
   - Product ID is a numeric, auto-generated field that is not editable.

3. Feature Specification Page:
   - Under a product, features can be added with fields: Name, Internal name, Feature ID, Details.
   - Products can contain any number of features.

4. Parameter Specification Page:
   - Parameters can be added to features with fields: Name, Internal name, Parameter ID, Details, Parameter type dropdown (values: quantity, price, other).
   - Price allows only float/double values, and Quantity must be an integer value.

5. Edit Options:
   - Users can edit information on Product, Feature, and Parameter specification pages.

6. Summary Page:
   - View hierarchy in a tree structure: Product -> Feature -> Parameter.
   - Minimum of 3 features under a product.
   - Minimum of 3 parameters in a feature.

## 3. Functional Requirements

### 3.1 User Authentication
1. Users can log in with existing credentials.
2. New users can sign up by providing necessary details.

### 3.2 Product Specification
1. UI for adding a new product with specified fields.
2. Product ID is automatically generated and not editable.

### 3.3 Feature Specification
1. Add features under a product with specified fields.

### 3.4 Parameter Specification
1. Add parameters to features with specified fields.
2. Validate input types for Price and Quantity.

### 3.5 Edit Options
1. Allow users to edit information on Product, Feature, and Parameter specification pages.

### 3.6 Summary Page
1. Display hierarchy in a tree structure.
2. Ensure a minimum of 3 features under a product.
3. Ensure a minimum of 3 parameters in a feature.

## 4. Non-functional Requirements

### 4.1 Technologies
1. UI / Framework: Angular 16, HTML5.
2. Middleware: Java/Spring Boot.
3. Backend: PostgreSQL.
4. Server: Embedded Tomcat.
5. Build tool: Maven.

### 4.2 APIs and Swagger
1. Expose APIs using Spring Boot REST Controller.
2. Implement Swagger API for testing APIs.

### 4.3 Java Concepts
1. Utilize Java concepts, including Streams and Lombok.

### 4.4 Database Relationships
1. Implement one-to-many and many-to-one relationships between tables for fetching/updating in the database.

## 5. Constraints

1. The system must adhere to the specified technologies.
2. UI components must be developed using Angular 16 and HTML5.
3. Java concepts such as Streams and Lombok must be employed in the backend.
4. Database relationships must be established as per the specifications.

## 6. Assumptions and Dependencies

1. The system assumes a stable network connection for user authentication and data retrieval.
2. Dependencies include Angular 16, Java/Spring Boot, PostgreSQL, and Maven for building.

## 7. Glossary

1. UI: User Interface
2. API: Application Programming Interface
3. JDBC: Java Database Connectivity
