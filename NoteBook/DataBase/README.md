# Data Base
## 1- What is a Relational Data Base?

 A relational database organizes all informations in tables (composed of lines/registers and columns /fields) that can be interrelated.

### Fundamental principles:
→ *Primary Key (PK)*: Unique identifier of an register in a table (ex: id_client). It can not be duplicate or null values.

→ *Foreign Key (FK)*: Field that connects a table to the Primary Key of another table, creating the relationship between them.

→ *ACID properties*:
 - Atomicity: Either the entire transaction is executed, or nothing ir executed.
 - Consistence: The database transitions only from one valid state to another.
 - Isolation: Concurrent transactions do not interfere with each other.
 - Durability: The result of a confirmed transaction in permanent.

## 2- Command Division of SQL
SQL language is divided into subgroups depending on the purpose of the command:

| ACRONYM | CATEGORY                   | DESCRIPTION                                   | COMMAND EXAMPLE        |
|---------|----------------------------|-----------------------------------------------|------------------------|
|         |                            |                                               |                        |
| DDL     | Data Definition Language   | Defines the database structure.               | CREATE, ALTER, DROP    |
| DML     | Data Manipulation Language | Manipulates the datas contained in the table. | INSERT, UPDATE, DELETE |
| DQL     | Data Query Language        | Queries stored datas.                         | SELECT                 |
| DCL     | Data Control Language      | Manage permissions and acesses of users.      | GRANT, REVOKE          |


## Practice - Main Commands in Action
### DDL - Defining the Structure 
Creating a related table of clients and a table of orders.

```
-- Creating Client table
   CREATE TABLE Clients (
   id INT PRIMARY KEY AUTO_INCREMENT, 
   name VARCHAR(100) NOT NULL,
   email VARCHAR(100) UNIQUE NOT NULL, 
   register_date DATE DEFAULT CURRENT_DATE
   );
   
-- Creating order table with relationship (FK)
    CREATE TABLE Orders (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_client INT,
    value DECIMAL(10,2) NOT NULL,
    order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_client) REFERENCES Clients(id)
    );
```

### DML - Manipulating Datas
```
-- Inserting data (INSERT)
INSERT INTO Clients (name, email)
VALUES ('Ana Silva', 'ana@email.com'),
       ('Carlos Souza', 'carlos@email.com');
       
-- Updating datas (UPDATE)
-- Caution: Always use WHERE to not change the entire table!
UPDATE Clients 
SET email = 'ana.silva@email.com'
WHERE id=1;;

-- Deleting data (DELETE)
-- Caution: Always use WHERE to not delete the entire table!
DELETE FROM Clients
WHERE id=2;       
```
### DQL - Consulting Data 
Basic Query and filtering
```
SELECT name, email
FROM Clients
WHERE data_cadastro >= '2026-01-01'
ORDER BY name ASC
```
### Grouping and Metrics
```
--- Total amount spent by the costumer
SELECT id_client, sum(value) AS total_spent, COUNT(id) AS orders_amount
FROM orders
GROUP BY id_client

HAVING total_spent > 100.00;
```

### Tables Junctions (JOINS)
The JOINS allows cross-referencing data between related tables:

→ INNER JOIN: Return only the registers that have a corresponding entry in both tables 

→ LEFT JOIN: Return all registers of the left table, even without any corresponding entry in right table.
