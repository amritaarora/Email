import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

/* Created by AroraA on 16-02-2016.
        */

//@WebServlet(name = "EmailServlet" , urlPatterns = "/EmailServlet")
public class EmailServlet extends HttpServlet{

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {

        String to = "amrita.arora.1192@gmail.com";

        String from = "sample.id1192@gmail.com";
        String host = "smtp.gmail.com";
        String pass = "Amrita@12345";

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.transport.protocol", "smtp");
        properties.setProperty("mail.smtp.starttls.enable", "true");

        properties.setProperty("mail.smtp.port", "587");
        properties.setProperty("mail.smtp.password", pass);
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.user", from);


        Session mailSession = Session.getDefaultInstance(properties);

        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(mailSession);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));
            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));
            // Set Subject: header field
            message.setSubject("This is the Subject Line!");
            // Now set the actual message
            message.setText("This is actual message");
            // Send message

            Transport transport = mailSession.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            out.print("Successful");
            RequestDispatcher rd=request.getRequestDispatcher("./ThankYou.html");
            rd.include(request,response);

        } catch (MessagingException mex) {
            mex.printStackTrace();
            out.print( "Error: unable to send message....");
            RequestDispatcher rd=request.getRequestDispatcher("./ThankYou.html");
            rd.include(request,response);
            out.print(mex);
        }
    }
}