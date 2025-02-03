# Library Management System  

## Description  
The **Library Management System** is a user-friendly Java-based desktop application developed using **NetBeans**. Designed to simplify the operations of a library, this system allows for the management of books and issuers (library members). It includes essential features for day-to-day library management, such as adding, deleting, updating, and searching for books and issuers, along with issuing and returning books. The application also offers a comprehensive transaction management system, tracking book issuance and returns with due dates, making it easy to manage library records efficiently.

---

## Features  
### **Book Management**  
- Add new books to the catalog.  
- Update existing book details (e.g., title, author, publisher, etc.).  
- Delete books from the system.  
- Search for books by **Book_ID**.  
- View a list of all books in the library.  
- View books available for issue.  
- View a list of books that are issued or returned.

### **Issuer Management**  
- Add new library members (issuers).  
- Update issuer details (e.g., username, email, etc.).  
- Delete issuer records from the system.  
- Search for issuers by **username**.

### **Transaction Management**  
- Issue books to users, track due dates, and monitor the status of each transaction.  
- Return books and update their availability status in the catalog.

---

## Technology Stack  
- **Programming Language**: Java  
- **Integrated Development Environment (IDE)**: NetBeans  
- **Database**: MySQL  
- **GUI**: Swing (for creating user interface forms)  
- **JDBC**: Java Database Connectivity (to interact with the MySQL database)

---

## Prerequisites  
Before you begin, ensure you have the following installed on your system:

- **NetBeans IDE** (for Java development)
- **MySQL Database Server**
- **JDBC Driver for MySQL** (available in NetBeans by default)

---

## Setup Instructions  

### 1. **Download and Extract the Project Files**  
   - Download the project ZIP file and extract it to your desired location on your computer.

### 2. **Set Up the MySQL Database**  
   - Open MySQL Workbench or any MySQL client, and run the SQL queries in the `database_queries.txt` file to create the necessary database and tables:

### 3. **Open the Project in NetBeans**  
   - Open **NetBeans IDE** and select **File → Open Project**.  
   - Navigate to the extracted folder and select the **Library Management System** project folder.

### 4. **Configure Database Connection**  
   - In the **ConnectionClass.java** file, make sure the MySQL database connection details (username, password) are configured correctly.
     add your own Mysql command line's password
     
### 5. **Run the Project**  
   - In NetBeans, open the **Admin_Login** form and press **Shift + F6** to run the login form.
   - You can sign up as an admin.

### 6. **Admin Dashboard**  
   - After logging in as an admin, you can manage books, issuers, and transactions through the **Admin Dashboard**.
   
---

## Usage  
- **Admin Dashboard**:  
   The dashboard allows the admin to manage books, issuers, and transactions. You can:
   - Add, delete, or update book records.
   - View all books and available books.
   - Manage issuers by adding, updating, or deleting issuer information.
   - Issue books to users and track their return dates.

- **Issuer Management**:  
   Issuers can sign in to check the status of their issued books, and they can request to issue new books or return books.

