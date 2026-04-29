# 🚀 60 Days Backend Mastery Challenge (Java)
This repository documents my 60-day journey to master backend development using Java.

## Day 1
🔥 What I'm Doing

Building backend concepts from scratch
Writing clean, structured, and scalable code
Solving real-world problems through mini projects

### 📚 Topics Covered
Java (OOP, Collections, Exception Handling)
Data Structures & Problem Solving
Backend Fundamentals (APIs, Design Patterns)
Database Integration (SQL)

### 🎯 Goal
To become a job-ready backend developer by focusing on consistency, practical implementation, and strong fundamentals.

### 📅 Progress
Daily commits with code, explanations, and improvements.

---

## Day 2 - Payment System (OOP Practice)
This module demonstrates core Object-Oriented Programming concepts in Java using a simple payment system.

### Concepts Covered
- Abstraction using an abstract Payment class
- Inheritance with specific implementations (UPIPayment, CardPayment)
- Runtime Polymorphism through method overriding
- Input validation and basic exception handling
  
### Features
- Common payment interface for different payment methods
- Extensible design to add new payment types
- Simple validation for invalid payment amounts
  
#### Example
- UPI payment processing
- Card payment processing
- This is part of my 60-day backend development challenge to strengthen Java fundamentals.
- Order Processing System (Java – OOP Based)
  
This project is a simple backend-focused system that demonstrates how to process orders using different payment methods by applying core OOP principles like Abstraction and Runtime Polymorphism.

The system defines a common Payment contract and allows multiple implementations (e.g., UPI, Card), where the actual payment logic is decided at runtime. This makes the design flexible, scalable, and easy to extend.

#### Key Features
- Abstract Payment class defining a common structure
- Multiple payment implementations (UPI, Card)
- Runtime polymorphism to execute different behaviors dynamically
- Clean separation between order processing and payment logic
  
#### Tech Stack
- Java
- Object-Oriented Programming (OOP)
  
#### Sample Output:
```
Paid 250.0 via Card.
Amount: 250.0, Status: PAID
Amount: 250.0, Status: SHIPPED
```

---

## Collections - ArrayList, HashSet

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

---

## Day 3: User Storage System

A simple backend-focused project demonstrating the practical use of ArrayList and HashSet from the Java Collections Framework.

### Objective
To understand how to efficiently manage user data while preventing duplicates using appropriate data structures.

#### Key Concepts
  ArrayList for ordered data storage
- HashSet for fast lookup and duplicate prevention
- Time complexity optimization (O(1) vs O(n))
- Separation of concerns (data storage vs validation)
  
#### Features
- Add users with unique email validation
- Prevent duplicate entries using HashSet
- Maintain insertion order using ArrayList
- Display all stored users
  
### How It Works
- Users are stored in a List for ordered access
- Emails are stored in a Set for constant-time duplicate checks
- Before adding a user, the system checks if the email already exists
  
### Example
Add: a@gmail.com → Added Add: a@gmail.com → Rejected (duplicate)
```
Output
User added
User added
User added
mahi -> mahi@gmail.com
ravi -> ravi@gmail.com
siva -> siva@gmail.com
Invalid user details
```

---

## Day 4 - User Lookup System (HashMap + HashSet)
This module implements a simple user management system using Java Collections Framework.

### Concepts Covered
- HashMap for storing users with unique IDs
- HashSet for enforcing unique email constraints
- Basic CRUD operations (Add, Fetch, Delete)
- Input validation using constructors and regex
  
#### Features
- Add users with unique ID and email
- Prevent duplicate email entries
- Retrieve user details by ID
- Delete users and maintain data consistency
  
#### Example Workflow
- Add user with ID and email
- Fetch user using ID
- Delete user and verify removal

---

## Day 5 - Custom HashMap Implementation (Java)
This module demonstrates the internal working of a HashMap by building a custom implementation from scratch using arrays and linked lists.

### Concepts Covered
- Hashing and index calculation
- Collision handling using separate chaining (Linked List)
- Basic map operations: put, get, remove
- Node-based data structure design
  
#### How It Works
- Keys are converted into bucket indices using a hash function
- Each bucket stores a linked list of nodes
- On collision, new entries are appended to the list
- Retrieval and deletion traverse the chain to find the key
- Custom LinkedList Implementation (Java)
  
This module demonstrates the implementation of a singly linked list from scratch using a custom Node structure.

#### Concepts Covered
- Node-based data structure design
- Dynamic memory linking using pointers (references)
- Traversal of linked list
- Basic operations on linked list
  
#### Features
- Convert an array into a linked list
- Traverse and print elements
- Calculate length of the linked list
- Delete the head node

---

## Doubly Linked List Implementation in Java
📌 Overview
This project demonstrates a custom implementation of a Doubly Linked List (DLL) in Java without using built-in collections.

The objective is to understand how bidirectional node connections work internally and how common operations are performed efficiently using references.

### ⚙️ Features Implemented
1 Convert Array → Doubly Linked List
2 Traverse and Print the List
3 Delete Head Node
4 Delete Tail Node
5 Delete Node by Value
6 Delete Node by Position (Kth Node)
7 Find Length of the List
8 Check if an element exists (search)

####🧠 Core Concepts
A Doubly Linked List consists of nodes where each node contains:

data → stores the value
next → points to the next node
back → points to the previous node

### This enables:

Forward traversal (head → tail)
Backward traversal (tail → head)

### ⏱️ Time Complexity
Operation	Time Complexity

| Operation             | Time Complexity |
|-----------------------|-----------------|
| Insert (end)          | O(n)            |
| Search                | O(n)            |
| Delete (head/tail)    | O(1) / O(n)     |
| Delete (middle)       | O(n)            |

--- 

## 🚀Day 6: LRU Cache Implementation in Java

### 📌 Overview
This project implements an LRU (Least Recently Used) Cache using:

HashMap (O(1) lookup)
Doubly Linked List (O(1) insertion & deletion)
The goal is to achieve O(1) time complexity for both get() and put() operations — a common requirement in backend systems and interviews.

### 🧠 Problem Statement
Design a data structure that follows the constraints of an LRU Cache:

- get(key) → Returns value if exists, else -1
- put(key, value) → Insert/update key
- When capacity is exceeded → remove least recently used item
  
### ⚙️ Approach
This implementation combines:

1. HashMap
Stores key → node mapping for fast access

2. Doubly Linked List
Maintains usage order:
```
Most Recently Used → near head
Least Recently Used → near tail
```

#### 🏗️ Internal Design
Head <-> Node1 <-> Node2 <-> ... <-> Tail

head → dummy node (MRU side)
tail → dummy node (LRU side)

#### ⚠️ Limitations / Issues
This is NOT production-ready. Here’s what’s missing:

❌ 1. No Thread Safety

Not safe for concurrent systems
❌ 2. No Capacity Update

Capacity is fixed after initialization
❌ 3. No Generic Support

Works only with integers

---

## 🚀 Day7: Java Multithreading Basics 

### 📌 Overview
This project demonstrates fundamental concepts of **multithreading in Java**, including:

- Creating threads using `Runnable`
- Thread execution behavior (non-deterministic output)
- Synchronization and thread safety using locks

---

### 🧠 Concepts Covered

#### 1. Thread Creation
Using `Runnable` interface and `Thread` class

#### 2. Thread Scheduling
Understanding that thread execution order is **not guaranteed**

#### 3. Synchronization
Preventing race conditions using:
- `synchronized` keyword
- `ReentrantLock`

---

## 🧪 Task 1: Concurrent Number Printing

### 📌 Objective
Print numbers from:
- Thread 1 → 1 to 5  
- Thread 2 → 6 to 10  

Both threads run simultaneously.

---

### ⚙️ Implementation

```java id="1a9kdl"
Thread t1 = new Thread(new PrintNum1to5());
Thread t2 = new Thread(new PrintNum6to10());

t1.start();
t2.start();
```
#### 📤 Output:
```
6 1 7 2 8 3 4 9 5 10
```

## 🧪 Task 2: Thread-Safe Counter

### 📌 Objective
Increment a shared counter using multiple threads safely.

#### 📤 Output
```
Final Count: 2000
```

## ⚡ Concepts Breakdown

| Concept          | Explanation                                                |
|------------------|------------------------------------------------------------|
| Race Condition   | Multiple threads accessing/modifying shared data unsafely  |
| Synchronization  | Restricting access so only one thread enters critical code |
| Locking          | Explicit control over thread access using ReentrantLock    |
| join()           | Forces main thread to wait until other threads finish      |

---

## 🚀Day 8: Thread-Safe LRU Cache in Java

### 📌 Overview
This project implements a **thread-safe LRU (Least Recently Used) Cache** using:

- HashMap for O(1) access
- Doubly Linked List for maintaining usage order
- `synchronized` methods for thread safety

The cache supports concurrent access while ensuring data consistency.
