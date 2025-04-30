# Veerus Online Bakery 🧁

An e-commerce web application for an online bakery store, built with modern web technologies and a robust backend. This platform allows users to browse delicious baked goods by category, view detailed product descriptions, and experience a smooth shopping interface.

## 🚀 Tech Stack

- **Backend:** Spring Boot, Java
- **Frontend:** HTML, CSS, JavaScript
- **Database:** PostgreSQL
- **Build Tool:** Maven

## 📂 Project Structure

ecommerce/ │ ├── src/ │ ├── main/ │ │ ├── java/ # Java source files │ │ ├── resources/ # application.properties, templates, static assets │ ├── pom.xml # Maven project configuration └── README.md # Project documentation

markdown
Copy
Edit

## 💡 Features

- Admin panel for managing categories and products
- Product listings grouped by categories (e.g., Cakes, Chips, Biscuits, Puffs, Rolls, Chocolates)
- Detailed product descriptions
- Real-time bakery listings
- PostgreSQL database integration
- Clean and responsive user interface

## 🛠️ Getting Started

### Prerequisites

- Java 17+
- Maven
- PostgreSQL
- Git

### Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/veerupenudhota/Veerus-Online-Bakery.git
   cd Veerus-Online-Bakery
Configure PostgreSQL

Create a database named ecommerce

Update application.properties with your DB credentials:

ini
Copy
Edit
spring.datasource.url=jdbc:postgresql://localhost:5432/ecommerce
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword
Run the application

bash
Copy
Edit
mvn spring-boot:run
Access the app Open your browser and go to: http://localhost:8080

📄 License
This project is licensed under the MIT License - see the LICENSE file for details.
