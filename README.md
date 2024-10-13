# Yabi Chat  

Yabi Chat is a desktop application built using Java Swing that allows users to communicate in real time. This application utilizes a MySQL database to manage user data and messages efficiently.  

## Features  

- **Real-Time Chat:** Communicate with other users in real time.  
- **User Authentication:** Secure login and registration for users.  
- **Message History:** View past conversations stored in the database.  
- **User-Friendly Interface:** Intuitive design for easy navigation and use.  

## Technologies Used  

- **Java:** The primary programming language for building the application.  
- **Java Swing:** For creating the graphical user interface.  
- **MySQL:** For managing user data and chat history.  
- **JDBC:** For database connectivity.  
- **Socket.IO:** For real-time communication  

## Installation

Our adventure begins with setting up Yabi Chat on your local machine. To do that, follow these steps:  

1. **Clone the repository:**  

   ```bash
   git clone https://github.com/muniab047/Yabi-Chat-Application.git
2. **Install MySQL:**  

Ensure that MySQL is installed on your machine. You can download it from the official MySQL website.  

3. **Set Up the Database:**  

Create a new database named yabi_chat.  
Import the SQL schema from the database/ folder in this repository to set up the required tables.  
Configure the Database Connection:  

Find the sacred file known as config.properties (or its equivalent in your project). Here, update the database connection details so that your app can communicate with MySQL.  

4. **Run the Application:**  

Once your environment is set, you’re ready to run the app! If you're using the command line, the magic words are:  

```bash
javac -d bin src/*.java
java -cp bin Main
```
Usage  
With Yabi Chat installed, you can now launch the application, and the following possibilities await:  
Register for a new account or log in with your existing credentials.
Start chatting with other users in real time!
