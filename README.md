<h1 align="center" style="font-weight: bold;">Auth System 💻</h1>

<p align="center">
 <a href="#tech">Technologies</a> • 
 <a href="#started">Getting Started</a> • 
  <a href="#routes">API Endpoints</a> •
 <a href="#contact">Contact</a> •
</p>

<p align="center">
    <b>This project was made for share how authentication and authorization works</b>
</p>

<h2 id="technologies">💻 Technologies</h2>

- Java 21+
- Spring Security
- Spring Web
- H2 Database
- JWT Token

<h2 id="started">🚀 Getting started</h2>

<h3>Prerequisites</h3>

- Java 21+
- IDE (I use IntelliJ)
- Git
- Maven

<h3>Cloning</h3>

```bash
$ git clone https://github.com/luizgmelo/authSystem-springboot.git
```

<h3>Starting</h3>

How to start your project

```bash
$ cd auth-system
$ ./mvnw install
$ ./mvnw spring-boot:run
```

<h2 id="routes">📍 API Endpoints</h2>

Here you can list the main routes of your API, and what are their expected request bodies.
​
| route               | description                                          
|----------------------|-----------------------------------------------------
| <kbd>GET /users</kbd>     | register a user in my database see [response details](#create-user)
| <kbd>POST /users/login</kbd>     | authenticate user into the api see [request details](#post-auth-detail)
|  <kbd>GET /users/test</kbd>     | test if user is authenticated see (any role is accepted) [response details](#get-users-test)
| <kbd>POST /users/test/customer</kbd>     | test if user authenticated see only role customer is accepted [request details](#get-customer-test)
| <kbd>POST /users/test/administrator</kbd>     | test if user authenticated see only role administrator accepted [request details](#get-administrator-test)

<h3 id="create-user">GET /users</h3>

**RESPONSE**
<br> **Status: 201 CREATED**
```json
{}
```

<h3 id="post-auth-detail">POST /users/login</h3>

**REQUEST**
```json
{
  "email": "guilherme@example.com",
  "password": "4444444"
}
```

**RESPONSE**
```json
{
  "token": "OwoMRHsaQwyAgVoc3OXmL1JhMVUYXGGBbCTK0GBgiYitwQwjf0gVoBmkbuyy0pSi"
}
```

<h3 id="get-users-test">POST /users/test</h3>

**RESPONSE**
```json
{
  Authentication success!
}
```

<h3 id="get-customer-test">POST /users/test/customer</h3>

**RESPONSE**
```json
{
  Customer Authentication success!
}
```

<h3 id="get-administrator-test">POST /users/test/administrator</h3>

**RESPONSE**
```json
{
  Administrator Authentication success!
}
```

<h3 id="contact">Contacts</h3>

<p align='left'>
   <a href="https://www.linkedin.com/in/luiz-g-melo/" target="_blank"><img height="30" src="https://img.shields.io/badge/-Linkedin-%23333?style=for-the-badge&logo=Linkedin&logoColor=blue"></a>&nbsp;&nbsp;      
  <a href="mailto:luizgmelo64@gmail.com" target="_blank"><img height="30" src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=blue&link=mailto:luizgmelo64@gmail.com"></a>&nbsp;&nbsp;
 </p>
