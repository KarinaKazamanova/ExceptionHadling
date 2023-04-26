package Prefinalwork;

public class Personaldata {
    String name;
    String surname;
    String lastname;
    String birthdate;
    Integer telephone;
    String sex;

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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public Integer getPhone() {
        return telephone;
    }
    
    public void setPhone(Integer phone) {
        this.telephone = phone;
    }

    public Personaldata (String name, String surname, String lastname, String birthdate, String sex){
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.sex = sex;
    }
    @Override
    public String toString() {
        String result = "";
        return result + "<" + lastname + "><" + name + "><" + surname + "><" + birthdate + "><" + sex + ">";

}

}


