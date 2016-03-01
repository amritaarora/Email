import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.oreilly.servlet.MultipartRequest;

public class FileUpload extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        MultipartRequest m = new MultipartRequest(request, "C:\\Users\\AroraA\\New folder");
        /*Enumeration fileNames=m.getFileNames();
        while(fileNames.hasMoreElements()){
            System.out.println(fileNames.nextElement());
        }
        out.print("successfully uploaded");
        */
    }
}