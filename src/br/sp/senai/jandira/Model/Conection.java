package br.sp.senai.jandira.Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conection {

    private String server, password, user, database;
    private int gate;
    public Connection conection;
    public Conection(){
        this.server = "localhost";
        this.database = "db_company";
        this.user = "root";
        this.password = "bcd127";
        this.gate = 3306;

    }

    public boolean conectDrive(){
        try {
            this.conection = DriverManager.getConnection("jdbc:mysql://" + this.server + "/" + this.database, this.user, this.password);

            return true;

        } catch (Exception erro){
            System.out.println(erro);
            return false;
        }

    }
    public Connection getConection(){
        conectDrive();
        return conection;

    }
}
