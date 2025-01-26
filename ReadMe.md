# Ashram Accommodation Management System

This project is a **Spring Boot-based web application** designed to manage accommodations for an Ashram. It includes a comprehensive form to collect user details and a secure admin panel for managing accommodations.

---

## Features

- **Accommodation Form**: Users can submit details like name, address, contact information, and visa details (if applicable).
- **Admin Panel**: Admins can view and manage accommodations and bookings securely.
- **Database Management**: Automatically create and manage MySQL database tables via `schema.sql`.

---

Technologies Used
Backend: Java, Spring Boot
Frontend: Thymeleaf, HTML, CSS
Database: MySQL
---

## Project Structure

```plaintext
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.accomodation.Ashram
│   │   │       ├── config         # Security configuration
│   │   │       ├── controller     # Controllers for user and admin flows
│   │   │       ├── exception      # Custom exception handling
│   │   │       ├── model          # Data models (FormData, Admin)
│   │   │       ├── repository     # Repositories for database interaction
│   │   │       └── service        # Business logic services
│   │   └── resources
│   │       ├── static             # Static assets (CSS)
│   │       ├── templates          # HTML templates (Thymeleaf)
│   │       └── application.properties
├── README.md
└── schema.sql                     # SQL schema for database creation
'''
