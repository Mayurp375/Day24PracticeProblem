package classProblemByAmolMateSir.Day24PracticeProblem;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Contact implements Comparable<Contact> {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String email;
    int zip;
    long phoneNumber;
    ArrayList<Contact> contacts = new ArrayList<>();

    public Contact(String firstName, String lastName, String address, String city, String state, String email, int zip, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    public Contact() {

    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return zip == contact.zip && phoneNumber == contact.phoneNumber && firstName.equals(contact.firstName) && lastName.equals(contact.lastName) && address.equals(contact.address) && city.equals(contact.city) && state.equals(contact.state) && email.equals(contact.email);
    }

    @Override
    public int compareTo(Contact o) {

        return 0;
    }

    //ability to find city and state vise
    public void searchPerson(String findCity, String findState) {
        for (Contact contact : contacts) {
            if (findCity == this.getCity() && findState == this.getState()) {
                System.out.println(contact.getFirstName());
            } else {
                System.out.println(findCity + " and " + findState + " not found in contact.");
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, address, city, state, email, zip, phoneNumber);
    }

    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        Contact contactOne = new Contact("Mayur", "polojwar", "chamorshi", "chamorhsi", "maharashtra", "mayur@", 440042, 858566588);
        Contact contactTwo = new Contact("nandini", "witg", "ka", "ch", "ka", "nam@", 440042, 858566588);
        Contact contactThree = new Contact("yamini", "sinde", "medachal", "guntur", "chandigarh", "hii@", 4585, 58568641);
        Contact contactFour = new Contact("katrina", "lambe", "gad", "nag", "maharashtra", "hah@", 455225, 858566588);

        //ading contacts to list

        contacts.add(contactOne);
        if (contactOne.equals(contactTwo))
            contacts.add(contactTwo);
        contacts.add(contactThree);
        contacts.add(contactFour);


        System.out.println("welcome to address book. " +
                "select any of the choice in the below " +
                "\n Hint -> 1. Display contact 2. edit existing contact 3.remove existing contact 4.Search by City or State");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("display adress book");
            for (Contact e : contacts) {
                System.out.println(e);
            }
        } else if (choice == 2) {
            System.out.println("edit existing contact");
            System.out.println("select which contact have to edit" +
                    "ie.1 . mayur 2. nandini 3.yamini 4.katrina");
            int edit = scanner.nextInt();
            if (edit == 1) {
                System.out.println("mayur");
                System.out.println("revise name");
                contactOne.setFirstName(scanner.next());
                System.out.println("revise lastName");
                contactOne.setLastName(scanner.next());
                System.out.println("revise address");
                contactOne.setAddress(scanner.next());
                System.out.println("revise city");
                contactOne.setCity(scanner.next());
                System.out.println("revise State");
                contactOne.setState(scanner.next());
                System.out.println("revise email");
                contactOne.setEmail(scanner.next());
                System.out.println("revise zip");
                contactOne.setZip(scanner.nextInt());
                System.out.println("revise phoneNumber");
                contactOne.setPhoneNumber(scanner.nextLong());
                System.out.println("this is revised Address book");
                for (Contact e : contacts) {
                    System.out.println(e);
                }
            } else if (edit == 2) {
                System.out.println("nadini");
                System.out.println("revise name");
                contactTwo.setFirstName(scanner.next());
                System.out.println("revise lastName");
                contactTwo.setLastName(scanner.next());
                System.out.println("revise address");
                contactTwo.setAddress(scanner.next());
                System.out.println("revise city");
                contactTwo.setCity(scanner.next());
                System.out.println("revise State");
                contactTwo.setState(scanner.next());
                System.out.println("revise email");
                contactTwo.setEmail(scanner.next());
                System.out.println("revise zip");
                contactTwo.setZip(scanner.nextInt());
                System.out.println("revise phoneNumber");
                contactTwo.setPhoneNumber(scanner.nextLong());
                System.out.println("this is revised Address book");
                for (Contact e : contacts) {
                    System.out.println(e);
                }
            } else if (edit == 3) {
                System.out.println("yamini");
                System.out.println("revise name");
                contactThree.setFirstName(scanner.next());
                System.out.println("revise lastName");
                contactThree.setLastName(scanner.next());
                System.out.println("revise address");
                contactThree.setAddress(scanner.next());
                System.out.println("revise city");
                contactThree.setCity(scanner.next());
                System.out.println("revise State");
                contactThree.setState(scanner.next());
                System.out.println("revise email");
                contactThree.setEmail(scanner.next());
                System.out.println("revise zip");
                contactThree.setZip(scanner.nextInt());
                System.out.println("revise phoneNumber");
                contactThree.setPhoneNumber(scanner.nextLong());
                System.out.println("this is revised Address book");
                for (Contact e : contacts) {
                    System.out.println(e);
                }
            } else if (edit == 4) {
                System.out.println("katrina");
                System.out.println("revise name");
                contactFour.setFirstName(scanner.next());
                System.out.println("revise lastName");
                contactFour.setLastName(scanner.next());
                System.out.println("revise address");
                contactFour.setAddress(scanner.next());
                System.out.println("revise city");
                contactFour.setCity(scanner.next());
                System.out.println("revise State");
                contactFour.setState(scanner.next());
                System.out.println("revise email");
                contactFour.setEmail(scanner.next());
                System.out.println("revise zip");
                contactFour.setZip(scanner.nextInt());
                System.out.println("revise phoneNumber");
                contactFour.setPhoneNumber(scanner.nextLong());
                System.out.println("this is revised Address book");
                for (Contact e : contacts) {
                    System.out.println(e);
                }
            } else {
                System.out.println("your address book is end");
            }

        } else if (choice == 3) {
            System.out.println("remove contact from the book");
            System.out.println("edit existing contact");
            System.out.println("select which contact have to edit" +
                    "ie.1 . mayur 2. nandini 3.yamini 4.katrina");
            int edit = scanner.nextInt();
            if (edit == 1) {
                contacts.remove(contactOne);
                System.out.println("Successfully removed");
                for (Contact e : contacts) {
                    System.out.println(e);
                }
            } else if (edit == 2) {
                System.out.println("Successfully removed");
                contacts.remove(contactTwo);
                for (Contact e : contacts) {
                    System.out.println(e);
                }
            } else if (edit == 3) {
                System.out.println("Successfully removed");
                contacts.remove(contactThree);
                for (Contact e : contacts) {
                    System.out.println(e);
                }
            } else if (edit == 4) {
                System.out.println("Successfully removed");
                contacts.remove(contactFour);
                for (Contact e : contacts) {
                    System.out.println(e);
                }
            } else {
                System.out.println("Invalid");
            }
        } else if (choice == 4) {   // ability find city and state
            System.out.println("enter City and State");
            String city = scanner.next();
            System.out.println("city ->");
            String state = scanner.next();
            System.out.println("state ->");

            Contact cont = new Contact();
            cont.searchPerson(city, state);
        } else {
            System.out.println("Invalid input");
        }
    }
}