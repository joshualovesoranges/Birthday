import java.util.Random;

public class Person {
    int birthday;//each person has a birthday
    Random rand = new Random();


    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getBirthday(){
        return birthday;
    }
}
