# 📱 WhatsApp Chatbot Backend (Spring Boot)

## 🚀 Project Overview

This project is a simple WhatsApp chatbot backend simulation built using Java and Spring Boot.

It exposes a REST API endpoint `/webhook` that accepts POST requests and returns predefined responses based on user input.

---

## ✨ Features

* Accepts JSON messages
* Returns predefined replies:

  * "Hi" → "Hello"
  * "Bye" → "Goodbye"
* Logs all incoming messages in console
* Clean MVC structure (Controller, Service, Model)

---

## 🔗 API Endpoint

### POST /webhook

### Request:

```json
{
  "message": "Hi"
}
```

### Response:

```json
{
  "reply": "Hello"
}
```

---

## 📸 Screenshots

### 🟢 Postman Request & Response

(Add your screenshot here)

### 🟢 Console Logs

(Add screenshot showing: Incoming message: Hi)

### 🟢 Project Structure

(Add VS Code structure screenshot)

---

## ⚙️ How to Run

1. Clone the repository:

```
git clone https://github.com/vaibhavi1512/chatbot-assignment.git
```

2. Open in VS Code / IntelliJ

3. Run:

```
ChatbotApplication.java
```

4. Test using Postman:

```
POST http://localhost:8080/webhook
```

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* REST API
* Maven

---

## 💡 Future Improvements

* Integrate with real WhatsApp API
* Add database for chat history
* Build frontend UI

---
