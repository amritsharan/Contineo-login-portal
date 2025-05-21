# 🔐 Java Swing Login for Contineo Portal

This is a simple Java Swing-based desktop login interface built using `JFrame`, `JTextField`, and `JPasswordField`. Upon entering valid credentials, the app launches the SIT **Contineo** (SIMS) portal in your default web browser.

---

## 💻 Features

- Lightweight GUI login window
- Validates hardcoded username & password
- Opens Contineo portal (https://sims.sit.ac.in/parents/) on success
- Shows a message dialog on failure

---

## 🧪 Demo Credentials

- **Username:** `Amrit`  
- **Password:** `password`

> ⚠️ These are placeholder values for demonstration only. You should enhance security if using this in real applications.

---

## 🚀 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/amritsharan/java-login-contineo.git
cd java-login-contineo

javac LoginApp.java
java LoginApp



🧠 Technologies Used
	Java (JDK 8+)
	Java Swing (JFrame, JTextField, JPasswordField, JButton)
	Desktop URI handling

🛡️ Security Note
	This is a basic proof-of-concept. For production:
	Avoid hardcoding passwords
	Use secure authentication and hashing
	Consider a backend for real login systems
