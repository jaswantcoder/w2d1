package com.sapient.programs;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Enumeration;

import com.mysql.cj.jdbc.Driver;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class CheckDbConnection {

    public static void main(String[] args) throws Exception {

        log.debug("List of drivers registered with DriverManager");
        Enumeration<java.sql.Driver> drivers = DriverManager.getDrivers();

        while (drivers.hasMoreElements()) {
            Driver dr = (Driver) drivers.nextElement();
            log.debug("{}", dr.getClass().getName());
        }
        // http://www.vinod.co:80/blog/
        // https://www/.vinod.co:333/blog ...it should not work
        // where is my mysql? it is on port no. 3306 while setting with docker.
        String url = "jdbc:mysql://localhost:3306/trainingdb";
        String user = "root";
        String password = "Welcome#123";
        Connection conn = DriverManager.getConnection(url, user, password);
        log.debug("conn is of type {}", conn.getClass().getName());
    }

}
