# Data Structure & Graph Analyzer

## 1. Project Information

**Module:** CIT300 – Data Structures and Algorithms

**Assignment:** Graded Practical Assignment 2

**Project Title:** Data Structure & Graph Analyzer

**Programming Language:** Java

**Application Type:** Console-Based Application

---

## 2. Project Description

The Data Structure & Graph Analyzer is a Java-based console application developed to demonstrate the practical use of data structures, searching algorithms, graph operations, and algorithmic complexity.

The application allows users to perform different operations through a menu-driven interface. It demonstrates how data structures store and manage information and how algorithms process and search for data.

The system also provides performance information to help users understand the differences between algorithms and their computational complexity.

---

## 3. Project Objectives

The main objectives of this project are:

- To implement and demonstrate different data structures using Java.
- To perform insertion, deletion, searching, and display operations.
- To implement Linear Search and Binary Search.
- To represent graphs and perform graph operations.
- To implement Breadth-First Search (BFS) and Depth-First Search (DFS).
- To demonstrate algorithmic complexity and performance information.
- To practise object-oriented programming and modular code organisation.
- To develop an integrated console-based application.
- To collaborate as a group using GitHub.

---

## 4. Group Members and Responsibilities

### 4.1 M.R.F Rukaiya

**Student ID:** 23DA2-0912

**Role:** Group Leader

**Assigned Responsibilities:**
- Project introduction and application overview.
- Main menu and system integration.
- Graph operations and graph traversal.
- Performance comparison and complexity explanation.
- System testing and verification.
- README preparation and project documentation.
- Final presentation and conclusion.

**Contribution:**

Responsible for explaining the overall system, demonstrating the graph component, discussing algorithmic complexity and performance information, testing the integrated application, and preparing project documentation.

### 4.2 M.T Aanisha Sahla

**Student ID:** 23DA2-1021

**Assigned Responsibilities:**
- Array operations.
- Linked-list operations.

**Contribution:**

Responsible for explaining and demonstrating array insertion, deletion, searching, and display operations, together with linked-list insertion, deletion, searching, and display operations.

### 4.3 Zaid Ahamed

**Student ID:** 23DA2-1061

**Assigned Responsibilities:**
- Stack operations.
- Queue operations.

**Contribution:**

Responsible for explaining and demonstrating stack operations, including push, pop, peek, and display, and queue operations, including enqueue, dequeue, front, and display. The demonstration also covers handling empty-stack and empty-queue conditions.

### 4.4 M.T Arrahuman

**Student ID:** 23DA2-0918

**Assigned Responsibilities:**
- Searching algorithms.
- Linear Search.
- Binary Search.

**Contribution:**

Responsible for explaining and demonstrating Linear Search and Binary Search, comparing their approaches, and discussing their time complexity.

---

## 5. Technologies Used

The project uses the following technologies and tools:

- **Java:** Main programming language.
- **Java Collections Framework:** Used for managing collections where appropriate.
- **Visual Studio Code:** Source-code editing and development environment.
- **Java Development Kit (JDK):** Used to compile and execute the Java program.
- **GitHub:** Source-code hosting and project collaboration.

---

## 6. Main System Features

### 6.1 Main Menu

The application provides a menu-driven interface that allows users to select the required operations and navigate between different components.

### 6.2 Array Operations

The array component supports:

- Inserting values.
- Deleting values.
- Searching for values.
- Displaying array contents.

### 6.3 Stack Operations

The stack component supports:

- Push.
- Pop.
- Peek.
- Display.

The application also handles attempts to remove an item from an empty stack.

A stack follows the Last In, First Out (LIFO) principle.

### 6.4 Queue Operations

The queue component supports:

- Enqueue.
- Dequeue.
- Viewing the front element.
- Displaying queue contents.

The application also handles attempts to remove an item from an empty queue.

A queue follows the First In, First Out (FIFO) principle.

### 6.5 Linked-List Operations

The linked-list component supports:

- Inserting values.
- Deleting values.
- Searching for values.
- Displaying the linked list.

A linked list consists of nodes connected through references.

### 6.6 Searching Algorithms

The application demonstrates:

**Linear Search**

Linear Search examines elements sequentially until the target value is found or the search reaches the end of the collection.

Its worst-case time complexity is O(n).

**Binary Search**

Binary Search repeatedly divides the search interval into smaller sections to locate the target value.

Its time complexity is O(log n) when the input is sorted.

The application uses a sorted copy of the array for Binary Search.

### 6.7 Graph Operations

The graph component supports:

- Adding vertices through graph operations.
- Adding edges.
- Displaying graph connections.
- Breadth-First Search (BFS).
- Depth-First Search (DFS).

The graph is represented using an adjacency list.

The implementation uses an undirected graph, in which an edge connects two vertices in both directions.

### 6.8 Breadth-First Search (BFS)

BFS visits graph vertices level by level. It uses a queue to manage the order in which vertices are visited.

Using an adjacency-list representation, its time complexity is O(V + E), where V is the number of vertices and E is the number of edges.

### 6.9 Depth-First Search (DFS)

DFS explores a path as far as possible before returning to explore other available paths.

Using an adjacency-list representation, its time complexity is O(V + E), where V is the number of vertices and E is the number of edges.

### 6.10 Performance and Complexity

The application provides performance information for selected operations, including search and graph traversal.

It records relevant operation results and execution-time measurements where implemented.

The displayed information helps demonstrate how different algorithms behave and how their computational complexity differs.

---

## 7. Algorithmic Complexity Summary

| Operation or Algorithm | Typical Time Complexity |
|---|---|
| Array Search | O(n) |
| Array Insertion or Deletion | O(n) |
| Stack Push | O(1) |
| Stack Pop | O(1) |
| Stack Peek | O(1) |
| Queue Enqueue | O(1) |
| Queue Dequeue | O(1) |
| Linked-List Search | O(n) |
| Linear Search | O(n) |
| Binary Search | O(log n) |
| Breadth-First Search | O(V + E) |
| Depth-First Search | O(V + E) |

**Note:** These are typical complexity values. Actual performance depends on the implementation, data size, and operation being performed. Binary Search requires sorted input. Array insertion and deletion can require shifting elements.

---

## 8. System Requirements

To compile and run the application, the computer requires:

- A compatible Java Development Kit (JDK).
- Visual Studio Code or another Java development environment.
- A terminal or command prompt.
- The project source file, `Main.java`.

---

## 9. How to Run the Application

### Step 1: Open the Project

Open the project folder in Visual Studio Code.

### Step 2: Open the Terminal

In Visual Studio Code, select:

**Terminal → New Terminal**

### Step 3: Check Java

Run the following command:

```bash
java -version