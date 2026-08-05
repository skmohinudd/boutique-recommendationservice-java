# boutique-recommendationservice-java

Returns product recommendations using catalog information.

## Overview

- **Type:** Spring Boot service
- **Stack:** Java 21, Spring Boot, Maven, Actuator, Docker

## Flow

```text
Client / service → Controller → Business logic → Database / events / downstream services
```

## Configuration

```text
DB_CONNECTION_TIMEOUT_MS
DB_MAX_LIFETIME_MS
DB_POOL_MAX_SIZE
DB_POOL_MIN_IDLE
DB_VALIDATION_TIMEOUT_MS
DEPLOYMENT_ENVIRONMENT
MAVEN_USER_HOME
MVNW_PASSWORD
```

## Run

```bash
./mvnw spring-boot:run
./mvnw clean verify
```

## Docker

```bash
docker build -t boutique-recommendationservice-java:local .
```

## CI/CD

This repository is built and deployed independently through its own GitHub Actions workflow.
