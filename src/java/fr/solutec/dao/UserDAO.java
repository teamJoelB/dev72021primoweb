
package fr.solutec.dao;

import fr.solutec.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    public static User getByLoginAndPassword(String login, String password) throws  SQLException{
        User u = null;       
        String sql = "SELECT * FROM person WHERE login = ? AND mdp = ?";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, login);
        prepare.setString(2, password);
        ResultSet result = prepare.executeQuery();
        if(result.next()){
            u = new User();
            u.setId(result.getInt("idperson"));
            u.setNom(result.getString("nom"));
            u.setPrenom(result.getString("prenom"));
            u.setLogin(result.getString("login"));
        }
        return u;
    }
    
    public static void insertUser(User u) throws SQLException {
        String sql = "INSERT INTO person (nom, prenom, login, mdp) VALUES (?, ?, ?, ?)";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, u.getNom());
        prepare.setString(2, u.getPrenom());
        prepare.setString(3, u.getLogin());
        prepare.setString(4, u.getMdp());

        prepare.execute();
    }
}
