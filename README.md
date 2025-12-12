# 🚀 Containerized Multi-Service Application

This project containerizes a simple frontend + backend + database application using Docker and Docker Compose.

🧱 Services: 
Frontend: React (served by Nginx)
Backend: Spring Boot REST API
Database: MySQL with init script

Everything is containerized with per-service Dockerfiles and composed with docker-compose. Best practices used:
- Multi-stage builds
- Small base images (alpine where possible)
- healthchecks, named volumes, custom network
- .env file for configuration

## Quick start
▶️ How to Run
1. Start all services
docker-compose up -d --build

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

