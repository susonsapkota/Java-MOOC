
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Suson
 */
public class Phonebook {

    private ArrayList<Person> person;

    public Phonebook() {
        this.person = new ArrayList<Person>();
    }

    public Phonebook(ArrayList<Person> person) {
        this.person = person;
    }

    public void add(String name, String number) {
        person.add(new Person(name, number));
    }

    public void printAll() {
        for (Person allPerson : person) {
            System.out.println(allPerson.toString());
        }
    }

    public String searchNumber(String name) {
        String user = "";
        for (Person allPerson : person) {
            if (allPerson.getName().equals(name)) {
                user = allPerson.getNumber();
            }
        }

        if (user.equals("")) {
            return "number not known";
        } else {
            return user;
        }
    }

}
