package hu.unideb.inf;

import java.sql.SQLException;

import org.h2.tools.Server;

public class Application {

    public static void main(String[] args) throws SQLException {
        startDatabase();

        AnimalManager.setaDAO(new JPAAnimalDAO());
        AnimalManager.manageAnimals();
    }

    private static void startDatabase() throws SQLException {
        new Server().runTool("-tcp", "-web", "-ifNotExists");
    }
}
