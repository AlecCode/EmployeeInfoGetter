# EmployeeInfoGetter

Before Running:
- Install postgres
  - Run: brew -install postgres
- Install Intellij
  - Install community edition from https://www.jetbrains.com/idea/
    
Instructions:
- Pull repository (https://github.com/AlecCode/EmployeeInfoGetter)
- Open repository in Intellij
- Open terminal
    - Enter: psql postgres
    - Enter: CREATE DATABASE employee;
- Run EmployeeInfoGetterApplication in Intellij
- Open a web browser (Firefox, Chrome, etc.)
- Enter into browser URL: localhost:8080/api/v1/{command}
    - Commands (Very case-sensitive):
      - employees
      
      ![localhost:8080/api/v1/employees](https://github.com/AlecCode/EmployeeInfoGetter/blob/main/Example%20Images/employees.png?raw=true)
      
      - employee/{id}
      
      ![localhost:8080/api/v1/employee/1](https://github.com/AlecCode/EmployeeInfoGetter/blob/main/Example%20Images/employee:%5Bid%5D.png?raw=true)
      
      - employee/first_name/{first name}
      
      ![localhost:8080/api/v1/employee_first_name/foo](https://github.com/AlecCode/EmployeeInfoGetter/blob/main/Example%20Images/employee_first_name:%5Bfirst%20name%5D.png?raw=true)
      
      - employee/last_name/{last name}
      
      ![localhost:8080/api/v1/employee_last_name/foo](https://github.com/AlecCode/EmployeeInfoGetter/blob/main/Example%20Images/employee_last_name:%5Blast%20name%5D.png?raw=true)
      
      - employee/address/{address}
      
      ![localhost:8080/api/v1/employee_address/333 Street St](https://github.com/AlecCode/EmployeeInfoGetter/blob/main/Example%20Images/employee_address:%5Baddress%5D.png?raw=true)
      
      - employee/phone/{phone number}
      
      ![localhost:8080/api/v1/employee_phone/5555555555](https://github.com/AlecCode/EmployeeInfoGetter/blob/main/Example%20Images/employee_phone:%5Bphone%20number%5D.png?raw=true)
