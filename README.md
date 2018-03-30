# Trademindx discovery service

Based on Netflix Eureka service registry.

Essentially this implementation wraps a Spring Boot app around Eureka and allows other Trademindx micro-services to
register with Eureka and be discoverable.

Run:

- mvn spring-boot:run
- web ui: http://localhost:8761/