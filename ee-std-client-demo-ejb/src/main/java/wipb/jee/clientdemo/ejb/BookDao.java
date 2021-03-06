/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wipb.jee.clientdemo.ejb;

import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Stateless;
import wipb.jee.clientdemo.model.Book;

@DataSourceDefinition(
        name="java:global/DemoDataSource",
        className="org.apache.derby.jdbc.ClientDataSource",
        minPoolSize = 1,
        initialPoolSize = 1,
        portNumber = 1527,
        serverName = "localhost",
        user = "app",
        password = "app",
        databaseName = "testdb1",
        properties = {"connectionAttributes=;create=true"}
)
@Stateless
public class BookDao extends AbstractDao<Book,Long> {
    public BookDao() {
        super(Book.class);
    } 
}
