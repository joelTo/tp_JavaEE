package fr.console;

import fr.dao.client.ClientDaoConsoleJPA;
import fr.dao.client.ClientDaoFactory;
import fr.model.Client;

public class PizzeriaClientConsoleApp {

	public static void main(String[] args) {
		ClientDaoFactory test = new ClientDaoConsoleJPA();
		test.signIn((new Client("TOTO", "Jojo", "joel@gmail.com", "test")));
	}

}
