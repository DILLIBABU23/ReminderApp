package com.tap;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReminderServlet")
public class ReminderServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ReminderServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String day = request.getParameter("day");
        String time = request.getParameter("time");
        String activity = request.getParameter("activity");

        // For simplicity, we'll just print the reminder details
        // In a real-world scenario, you would schedule the reminder here
        response.setContentType("text/html");
        response.getWriter().append("<html><body>")
                .append("Reminder set for " + day + " at " + time + " to " + activity)
                .append("</body></html>");
    }
}
