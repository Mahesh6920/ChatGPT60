# 🚀 60 Days Backend Mastery Challenge (Java)

This repository documents my 60-day journey to master backend development using Java.

## Day 1
🔥 What I'm Doing
  - Building backend concepts from scratch
  - Writing clean, structured, and scalable code
  - Solving real-world problems through mini projects
    
### 📚 Topics Covered
  - Java (OOP, Collections, Exception Handling)
  - Data Structures & Problem Solving
  - Backend Fundamentals (APIs, Design Patterns)
  - Database Integration (SQL)
    
### 🎯 Goal
To become a job-ready backend developer by focusing on consistency, practical implementation, and strong fundamentals.

### 📅 Progress

Daily commits with code, explanations, and improvements.

## Day 2 - Payment System (OOP Practice)

This module demonstrates core Object-Oriented Programming concepts in Java using a simple payment system.

### Concepts Covered
- Abstraction using an abstract `Payment` class
- Inheritance with specific implementations (`UPIPayment`, `CardPayment`)
- Runtime Polymorphism through method overriding
- Input validation and basic exception handling

### Features
- Common payment interface for different payment methods
- Extensible design to add new payment types
- Simple validation for invalid payment amounts

### Example
- UPI payment processing
- Card payment processing

This is part of my 60-day backend development challenge to strengthen Java fundamentals.

## Order Processing System (Java – OOP Based)

This project is a simple backend-focused system that demonstrates how to process orders using different payment methods by applying core OOP principles like Abstraction and Runtime Polymorphism.

The system defines a common Payment contract and allows multiple implementations (e.g., UPI, Card), where the actual payment logic is decided at runtime. This makes the design flexible, scalable, and easy to extend.

### Key Features
  - Abstract Payment class defining a common structure
  - Multiple payment implementations (UPI, Card)
  - Runtime polymorphism to execute different behaviors dynamically
  - Clean separation between order processing and payment logic

### Tech Stack
  - Java
  - Object-Oriented Programming (OOP)

### Sample Output: 
```
Paid 250.0 via Card.
Amount: 250.0, Status: PAID
Amount: 250.0, Status: SHIPPED
```

### Collections - ArrayList, HashSet
### Concepts Covered
  - Dynamic arrays using ArrayList
  - Set behavior using HashSet (no duplicates)
  - Time complexity and performance differences
  - Internal working (resizing, hashing)

### Implementations
  - Adding, removing, and accessing elements
  - Handling duplicates
  - Iteration techniques
  - Real-world use cases and edge cases

## Day 3: User Storage System

A simple backend-focused project demonstrating the practical use of ArrayList and HashSet from the Java Collections Framework.

### Objective

To understand how to efficiently manage user data while preventing duplicates using appropriate data structures.

### Key Concepts
  - ArrayList for ordered data storage
  - HashSet for fast lookup and duplicate prevention
  - Time complexity optimization (O(1) vs O(n))
  - Separation of concerns (data storage vs validation)

### Features
  - Add users with unique email validation
  - Prevent duplicate entries using HashSet
  - Maintain insertion order using ArrayList
  - Display all stored users

### How It Works
  - Users are stored in a List for ordered access
  - Emails are stored in a Set for constant-time duplicate checks
  - Before adding a user, the system checks if the email already exists
    
### Example
Add: a@gmail.com → Added
Add: a@gmail.com → Rejected (duplicate)

### Output
```
User added
User added
User added
mahi -> mahi@gmail.com
ravi -> ravi@gmail.com
siva -> siva@gmail.com
Invalid user details
```

## Day 4 - User Lookup System (HashMap + HashSet)

This module implements a simple user management system using Java Collections Framework.

### Concepts Covered
- HashMap for storing users with unique IDs
- HashSet for enforcing unique email constraints
- Basic CRUD operations (Add, Fetch, Delete)
- Input validation using constructors and regex

### Features
- Add users with unique ID and email
- Prevent duplicate email entries
- Retrieve user details by ID
- Delete users and maintain data consistency

### Example Workflow
- Add user with ID and email
- Fetch user using ID
- Delete user and verify removal

## Day 5 - Custom HashMap Implementation (Java)

This module demonstrates the internal working of a HashMap by building a custom implementation from scratch using arrays and linked lists.

### Concepts Covered
- Hashing and index calculation
- Collision handling using separate chaining (Linked List)
- Basic map operations: put, get, remove
- Node-based data structure design

### How It Works
- Keys are converted into bucket indices using a hash function
- Each bucket stores a linked list of nodes
- On collision, new entries are appended to the list
- Retrieval and deletion traverse the chain to find the key

## Custom LinkedList Implementation (Java)

This module demonstrates the implementation of a singly linked list from scratch using a custom Node structure.

### Concepts Covered
- Node-based data structure design
- Dynamic memory linking using pointers (references)
- Traversal of linked list
- Basic operations on linked list

### Features
- Convert an array into a linked list
- Traverse and print elements
- Calculate length of the linked list
- Delete the head node
