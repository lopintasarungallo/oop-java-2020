public class Person {
    String name;
    int age;
    boolean isMale;

    void setName(String name){
        this.name = name;
    }
    void setAge(Integer age){
        this.age = age;
    }
    void serGender(boolean isMale){
        this.isMale = isMale;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getGender(){
        String male = "Laki-laki";
        String female = "Perempuan";
        
        if (isMale == true){
            return male;
        }else{
            return female;
        }
    }
    void ouput (){
        System.out.println("Nama\t\t : " + getName());
        System.out.println("Umur\t\t : " + getAge());
        System.out.println("Jenis kelamin\t : " + getGender());
    }
    }
