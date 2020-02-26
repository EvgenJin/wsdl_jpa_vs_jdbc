/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evg_ws.webservice;

import com.cleverbuilder.bookservice.GetAllBooksResponse.Book;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author eshahov
 */
@WebService(serviceName = "BookService", portName = "BookServiceSOAP", endpointInterface = "com.cleverbuilder.bookservice.BookService", targetNamespace = "http://www.cleverbuilder.com/BookService/", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/service_example.wsdl")
public class NewWebServiceFromWSDL {

    com.evg_ws.jdbc.ModelsDAO modelsDaoJdbc = new com.evg_ws.jdbc.ModelsDAO();
    com.evg_ws.jpa.ModelsDAO modelsDaoJpa = new com.evg_ws.jpa.ModelsDAO();
    
    public void getBook(javax.xml.ws.Holder<java.lang.String> id, javax.xml.ws.Holder<java.lang.String> title, javax.xml.ws.Holder<java.lang.String> author) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String addBook(java.lang.String title, java.lang.String author) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<com.cleverbuilder.bookservice.GetAllBooksResponse.Book> getAllBooks() throws Exception {       
        Book book = new Book();
        List<Book> list = new ArrayList();
        
        // JPA Style
//        com.evg_ws.jpa.Models m = modelsDaoJpa.getById(2);

        // JDBC Style
        com.evg_ws.jdbc.Models m = modelsDaoJdbc.getById(2);
        
        book.setAuthor(m.getName());
        book.setID(String.valueOf(m.getTypeId()));
        book.setTitle(String.valueOf(m.getManufacturerId()));
        list.add(book);
        return list;
    }
    
}
