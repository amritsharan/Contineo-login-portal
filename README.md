# Contineo Login Portal

A simple Java-based login redirect system that demonstrates conditional user redirection based on username and password.

## 🌐 Project Overview

This project simulates a basic login system where users are redirected to different destinations based on their credentials. Currently, it's a console-based Java program that can later be extended into a full portal with GUI and database support.

## 📁 File Structure

Contineo-login-portal/
├── LoginRedirect.java
└── README.md



## 🚀 Features

- Role-based redirection
- Hardcoded credential validation
- Simple and clean Java code
- Console-based interaction

## 🔐 Login Rule

- ✅ If the **username is `AMRIT`** and **password is `2005`**, the system will redirect to the **Contineo page**.
- ❌ For all other credentials, access will be **denied**.

## 🛠️ Prerequisites

- Java JDK 8 or above
- A terminal or IDE (e.g., IntelliJ IDEA, Eclipse, VS Code with Java extension)

## 🔧 How to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/amritsharan/Contineo-login-portal.git
2. **Navigate to the project directory:**
   cd Contineo-login-portal

3. **Compile the program:**
   javac LoginRedirect.java
4. **Run the program:**
   java LoginRedirect

   
🧪 **Sample Output**
Valid credentials (AMRIT/2005):


Enter username:
AMRIT
Enter password:
2005
Redirecting to Contineo Page...
Invalid credentials:


Enter username:
john
Enter password:
1234
Invalid credentials. Access denied.

📈 **Future Enhancements**
GUI-based login form

Database integration for real user data

Password hashing & encryption

Session management

Unit tests

🤝**Contributing**
Contributions are welcome! Feel free to fork the repo and submit pull requests.

📄 **License**
This project is open-source and available under the MIT License.

Made with ❤️ by Amrit

---

Let me know if you want me to generate and upload this file for you (`README.md`) or also create a LICENSE file.


