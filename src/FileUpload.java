import com.oreilly.servlet.MultipartRequest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileUpload extends HttpServlet {

    MultipartRequest m;
    //String biometricFile, salesforceFile, emailFile, holidayFile;

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        File upload = new File("C:\\Users\\AroraA\\New folder");
        response.setContentType("text/html");
        /*
        biometricFile = m.getFilesystemName("biometricFile");
        salesforceFile = m.getFilesystemName("salesforceFile");
        emailFile = m.getFilesystemName("emailFile");
        holidayFile = m.getFilesystemName("holidayFile");
*/
        PrintWriter out = response.getWriter();
        m = new MultipartRequest(request, upload.toString());
        String filename = m.getFilesystemName("biometricFile");
        out.println(filename);
        out.println("File Uploaded");

        /*(Enumeration files = m.getFileNames();
        while (files.hasMoreElements()) {
            String name = (String) files.nextElement();
            String filename = m.getFilesystemName(name);
            if(filename.equals(biometricFile))
                System.out.println("Biometric File");
            else if(filename.equals(salesforceFile))
                System.out.println("Salesforce File");
            else if(filename.equals(emailFile))
                System.out.println("Email File");
            else if(filename.equals(holidayFile))
                System.out.println("Holiday File");

*/
            /*
            Enumeration files = m.getFileNames();
            while (files.hasMoreElements()) {
                String name = (String) files.nextElement();
                String filename = m.getFilesystemName(name);
                String type = m.getContentType(name);
                File f = m.getFile(name);
                out.println("name: " + name);
                out.println("filename: " + filename);
                out.println("type: " + type);
                if (f != null) {
                    out.println("f.toString(): " + f.toString());
                    out.println("f.getName(): " + f.getName());
                    out.println("f.exists(): " + f.exists());
                    out.println("f.length(): " + f.length());
                    out.println();
                }
            }
*/

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
        requestDispatcher.include(request, response);

    }


}
