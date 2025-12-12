# Containerize a Multi-Service Application

This sample project contains a minimal multi-service application:

- Frontend: React (served by nginx)
- Backend: Spring Boot (REST API)
- Database: MySQL

Everything is containerized with per-service Dockerfiles and composed with docker-compose. Best practices used:
- Multi-stage builds
- Small base images (alpine where possible)
- healthchecks, named volumes, custom network
- .env file for configuration

## Quick start
1. Build & run:
```bash
docker-compose up --build
```

2. Access frontend: http://localhost:3000
   Frontend calls backend API at /api/messages

3. Stop & remove:
```bash
docker-compose down -v
```

## Files included
- frontend/: React app + Dockerfile (multi-stage)
- backend/: Spring Boot app + Dockerfile (multi-stage)
- db/: init SQL
- docker-compose.yml
- .env

## Testing endpoints
- Frontend: http://localhost:3000
- Backend API: http://localhost:8080/api/messages
- Health checks: /actuator/health

