# LowCarbPower

### 1 what is it?
LowCarbPower is the name of a company that sells electricity according to a mix 81% (green energy) 19% (polluting energy). Energy produced by external suppliers.

The LowCarbPower application presented below is a web application developed in Microservices allowing a customer prospect to receive an estimate of the price per kiloWatt if he decides to join LowCarbPower.

This development focuses on the Back-end aspect, although a summary view is present. A TDD approach has been implemented for Price and LowcarbService.

### 2 Requirements 
![Java Version](https://img.shields.io/badge/Java-17-red)
![Maven Version](https://img.shields.io/badge/Maven-blue)
![MySQL Version](https://img.shields.io/badge/H2-green)
![Docker Version](https://img.shields.io/badge/Spring-cyan)

### 3 code structure

**Domain** : <br>&nbsp;&nbsp;&nbsp;&nbsp;
Internal library for this project. Provides a POJO structure that can be easily used by other microservices.

**EurekaServer** : <br>&nbsp;&nbsp;&nbsp;&nbsp;
his Eureka server allows me to make my other MS discoverable and thus facilitate the evolution of my Java code.

**Front Energy** : <br>&nbsp;&nbsp;&nbsp;&nbsp; a basic single-page app including the request form and a JS code allowing the asynchronous call of the QuotingService API in order to return an estimate to the future customer.

**PrometheusTest** : <br>&nbsp;&nbsp;&nbsp;&nbsp; this component is not part of the application anymore.

**QuotingService** : <br>&nbsp;&nbsp;&nbsp;&nbsp; this microservice is in charge of calculating the price of the " clean energy/dirty energy " mix.

**LowcarbService** : <br>&nbsp;&nbsp;&nbsp;&nbsp; calls every hour the api of the external company that provides clean energy and stores this information in a database. When called this API provides the last price present in the database.

**Price** : <br>&nbsp;&nbsp;&nbsp;&nbsp; simulates the behavior of the external api providing the clean energy.

**Spring-server-generated** : <br>&nbsp;&nbsp;&nbsp;&nbsp; Based on an OpenAPI specification that was provided to me in Yml format. This application generated by Swagger simulates the behavior of the external api providing clean energy.


