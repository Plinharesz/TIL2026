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
