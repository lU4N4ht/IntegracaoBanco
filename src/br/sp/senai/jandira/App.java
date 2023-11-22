package br.sp.senai.jandira;

import br.sp.senai.jandira.Controller.CompanyController;
import br.sp.senai.jandira.Model.Conection;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {

        CompanyController company = new CompanyController();

        company.consultarFuncionarios();
    }
}
