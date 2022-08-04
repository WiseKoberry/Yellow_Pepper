# Home Challenge
## _Brian Castillo_


## Test cases proposed for automation

- Get Pet Inventory to check availability
- Post Store Order to place a new order in the store

## Tech

To work properly use these technologies:

- [TestNG](https://testng.org/doc/) - an automation testing framework
- [Rest-assured](https://rest-assured.io/) - a library that provides a domain-specific language (DSL) for writing powerful, maintainable tests for RESTful APIs 
- [Json-simple](https://code.google.com/archive/p/json-simple/) - a library for JSON processing, read and write JSON data and full compliance with JSON specification
- [Maven](https://maven.apache.org/) - a tool that is based on POM (project object model). It is used for projects build, dependency and documentation.

## Installation

This API testing requires [Maven](https://maven.apache.org/) v 3.8.1 + to run.

Install the dependencies .

```sh
TestNg 7.6.1
io.rest-assured 5.1.1
slf4j-simple 1.7.36
json-simple 1.1.1
```

## Development

This API testing uses TestNg for annotations and test excecution.

Open the project and navigate to TestNg.xml file, then you can run any avaliable test listed in that file.
The indications for each test case are as follows:

GetStoreInventory:

```sh
API URI https://petstore3.swagger.io/api/v3/store/inventory 
GET method
expected "200 code" as assert validation
{
    "approved": 57,
    "placed": 100,
    "delivered": 50
}
```

PostStoreOrder:

```sh
API URI https://petstore3.swagger.io/api/v3/store/order
POST method
expected "The status received: HTTP/1.1 200 OK" as Assert validation
Parameters:
  {
  "id": 10,
  "petId": 198772,
  "quantity": 7,
  "shipDate": "2022-08-03T03:40:45.229Z",
  "status": "approved",
  "complete": true
  }
```

