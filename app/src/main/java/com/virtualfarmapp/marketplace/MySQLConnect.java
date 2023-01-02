package com.virtualfarmapp.marketplace;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLConnect {
    static final String DATA_URI = "http://192.168.2.65/vfarm/marketplace.php?id=";

    static final String productName = "productName";
    static final String description = "description";
    static final String price ="price";
}
