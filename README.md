# ReminderApp

Setting Up the Project
Create a Dynamic Web Project in Eclipse:

1. Open Eclipse IDE.
   
File > New > Dynamic Web Project.
Give your project a name (e.g., ReminderApp).

3. Add a Servlet:

Right-click on the src folder > New > Servlet.
Name your servlet (e.g., ReminderServlet).

Now create all the files accordingly

#Testing
Open your browser and navigate to http://localhost:8080/ReminderApp/index.html. Fill in the form and submit it. You should see the reminder details displayed on the screen.

#Enhancements
1. Scheduling Reminders:

Use a backend scheduling library like Quartz to handle scheduling reminders.
Store reminders in a database and retrieve them as needed.
2. Playing a Sound:

For web-based sound notifications, you can use the Web Audio API in JavaScript.
Alternatively, use desktop notifications for local applications.
