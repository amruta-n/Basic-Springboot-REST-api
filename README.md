# Basic-Springboot-REST-api
This Repository contains code for a very basic REST api in Spring Boot written in JAVA. It is connected to a MySQL database.  

Keywords: 
Java
• Spring Boot (STS) • MySQL
• Maven
• REST api • Postman

# Basic CRUD Operations through Postman

1. Create: (POST)
- Postman: localhost:9090/home 
- Body:
  {
    "id": 10001,
    "name": "Aditya", "city": “Pune 
  }

2. Update: (PUT)
- Postman: localhost:9090/home
- Body:
  {
    "id": 10001,
    "name": "Aditi",
    "city": "Pune" 
    }
Note: keep the employee same id same and only update either name or city
    
3. Delete: (DELETE)
- Postman: localhost:9090/home/10001

4. Show: (GET)
- Postman: localhost:9090/home

# Structure of the Database Table:
- Database name: EmployeeDB
- Table name: employee(id [Primary Key], name, city)

