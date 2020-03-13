/**
 * Person
 */
public class Person {
String name;
int age;
boolean isMale;

void setAge(int age){
this.age=age;
}
int getAge(){
    return age;
}
void setName(String name){
    this.name=name;
}
String getName(){
    return name;

}
void setGender(boolean isMale){
    this.isMale = isMale;

}
String getGender(){
    String laki2 = "laki-laki";
    String perempuan = "perempuan";
    if(isMale==true){
        return laki2;

    }
    else{
        return perempuan;
    }
    
}
    void output(){
        System.out.println("nama\t = " + getName());
        System.out.println("age\t = " + getAge());
        System.out.println("gender\t = " + getGender());
    }
    
    

}

