# Library Management System

A desktop Library Management System built in Java (Swing) with a MySQL backend. Manages books, members, and borrowing transactions through a GUI — designed for small to mid-sized libraries.

## Features

- Add, update, and delete book records
- Member registration and management
- Issue and return book tracking with due dates
- Fine calculation for overdue returns
- Search books by title, author, or ISBN
- Login screen with role-based access (admin / librarian)

## Tech Stack

| Layer | Technology |
|-------|-----------|
| Language | Java (JDK 8+) |
| GUI | Java Swing |
| Database | MySQL |
| IDE | NetBeans / Eclipse |
| Connector | MySQL JDBC Connector |

## Getting Started

### Prerequisites

- JDK 8 or above
- MySQL Server 5.7+
- MySQL JDBC Connector JAR

### Database Setup

```sql
-- Import the provided SQL dump
mysql -u root -p < database/p2p_library.sql
```

### Run

1. Open the project in NetBeans or Eclipse
2. Add `mysql-connector-java.jar` to the build path
3. Update DB credentials in the connection class
4. Build and run `Main.java`

## Project Structure

```
source_code/        # Java source files
database/           # SQL dump (p2p_library.sql)
mysql_db/           # Alternate DB setup script
Img/                # UI image assets
```

## License

MIT
