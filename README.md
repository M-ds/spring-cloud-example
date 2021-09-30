# Spring Cloud

Within this project some basic concepts are explained regarding Spring Cloud and microservices.

## Examples

| Call   |      Possible value   |      Response   |
|----------|:-------------:|-------------|
|http://localhost:9191/employee/find/{id} | 1, 2, 3, 4, 5 | Returns Employee object |
|http://localhost:9191/employee/find/company/{id}|1 , 2, 3 | Array of Employees |
|http://localhost:9191/employee/save |  Employee object | Returns saved entity |
|http://localhost:9191/company/find/{id} |  1, 2, 3 | Returns company data |
|http://localhost:9191/company/save | Company object | Returns saved company entity |
