package com.mssql.mssql00.routers;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.AbstractDataSource;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;
//import org.apache.camel.component.sql.SqlComponent.DataSource;

@Component
public class EmployeeRouter extends RouteBuilder {
    
    @Autowired
    DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    // public void setDataSource(AbstractDataSource dataSource) {
    //     this.dataSource = dataSource;
    // }

    @Override
    public void configure() {        
        from("timer:myTimer?repeatCount=1")
        .setBody(simple("SELECT empName, empEmail FROM LEARN101.dbo.employees"))
        .log("SQL: ${body}")
        .to("jdbc:dataSource")
        .log("Out: ${body}");
    }

}
