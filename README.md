/**
 * ==========================================
 * Email Sender Microservice
 * ==========================================
 *
 * Developer: Mohamed El khazen
 * Email: mohammed.elkhazen@gmail.com
 * Created: January 2026
 * Version: 1.0.0
 *
 * DESCRIPTION:
 * A production-ready email microservice that provides a RESTful API
 * for sending emails. Built with Spring Boot and designed for cloud
 * deployment on AWS EC2 with security best practices.
 *
 * FEATURES:
 * • RESTful API with JSON request/response
 * • Gmail SMTP integration with OAuth2 app passwords
 * • Comprehensive error handling and logging
 * • DTO pattern for clean architecture
 * • Service layer abstraction
 * • AWS EC2 deployment configuration
 * • HTTPS support ready
 *
 * TECHNOLOGY STACK:
 * • Backend Framework: Spring Boot 4.0.1
 * • Language: Java 17
 * • Mail Library: JavaMail API / Spring Mail
 * • Build Tool: Maven
 * • Deployment: AWS EC2
 * • Email Provider: Gmail SMTP
 *
 * PROJECT STRUCTURE:
 * com.melkhazen.emailsender
 * ├── controller/     - REST API endpoints
 * ├── service/        - Business logic layer
 * ├── dto/            - Data Transfer Objects
 * └── config/         - Configuration classes
 *
 * API DOCUMENTATION:
 * Base URL: http://localhost:8081 (dev) | https://your-domain.com (prod)
 * Endpoint: POST /api/v1/emails/send
 *
 * DEPLOYMENT:
 * Production URL: http://18.207.122.7:80
 *
 * LICENSE: MIT License (Open Source)
 * ==========================================
 */


src/main/java/com/melkhazen/emailsender/
├── EmailSenderApplication.java
├── controller/
│   └── EmailController.java
├── service/
│   ├── EmailService.java
│   └── impl/
│       └── EmailServiceImpl.java
├── dto/
│   ├── request/
│   │   └── EmailRequest.java
│   └── response/
│       └── EmailResponse.java
└── config/
    └── (future configuration classes)

```

src/main/resources/
├── application.yml
└── application-prod.yml
