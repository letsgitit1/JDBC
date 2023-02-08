package org.iclass.book;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iclass.main.Controller;

public class NewFormController implements Controller {

   @Override
   public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      // newForm : 등록
      RequestDispatcher dispatcher = request.getRequestDispatcher("newForm.jsp");
      dispatcher.forward(request, response);

   }

}