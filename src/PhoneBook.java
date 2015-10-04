import java.awt.*;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        int ID, number;
        String name, surname, tag, type;
    Number a1=new Number();
        a1.showNumber();

        System.out.println("Выберите необходимое действие:");
        System.out.println("1 - добавить запись; 2 - удалить.");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        switch (a) {
            case 1:

                ID= in.nextInt();

                Number x = new Number(ID, in.nextLine(), in.nextLine(), in.nextLine(), new Phone("sdf", in.nextLine()));

                break;
            case 2:

                break;
        }

    }
}
////////////////////////////////////////////////////////////////////
class Phone{
    private String type;
    private String numb;

    public Phone(){
        type="mob";
        numb="9876543210";
    }
    public Phone(String type, String number){
        this.type=type;
        this.numb=number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumb() {
        return numb;
    }

    public void setNumb(String number) {
        this.numb = number;
    }
}
////////////////////////////////////////////////////////////////////
class Number{
    private int ID;
    private String name;
    private String surname;
    private String tag;
    Phone tel=new Phone();

    public Number(){
        ID=0;
        name="Ivan";
        surname="Ivanov";
        tag="friend";
    }

    public Number(int ID, String name, String surname, String tag, Phone tel) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.tag = tag;
        this.tel = tel;
    }

    public int getID() {

        return ID;

    }//?????при добавлении if скобка красная

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Phone getTel() {
        return tel;
    }

    public void setTel(Phone tel) {
        this.tel = tel;
    }

    public void showNumber(){
        System.out.printf("%d %s %s %s %s", ID, name, surname, getTel(), tag);
    }
}