package br.sp.senai.jandira.Controller;

import br.sp.senai.jandira.Model.Conection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CompanyController {

    public void consultarFuncionarios() throws SQLException {
        Conection conection = new Conection();

        Connection objConnection = conection.getConection();

        Statement statement = objConnection.createStatement();

        String queryConsulta = "SELECT * FROM employees";

        ResultSet resultSet = statement.executeQuery(queryConsulta);

        while (resultSet.next()){
            int idFuncionario = resultSet.getInt("ID");
            String nome = resultSet.getString("nameEmployee");
            String cargo = resultSet.getString("cargo");
            String departamento = resultSet.getString("departamento");
            Double salario = resultSet.getDouble("salario");


            System.out.println(idFuncionario);
            System.out.println(nome);
            System.out.println(cargo);
            System.out.println(departamento);
            System.out.println(salario);
            System.out.println("-----------------------");
        }
    }

}
