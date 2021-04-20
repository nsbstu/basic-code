package cn.itcast.day06.demo03;

public class Student {
    private String name;
    private int age;
    private boolean male;//是不是男
    public void setMale(boolean b){
        male = b;
    }
    //布尔型的get方法是isxxx
    public boolean isMale(){
        return male;
    }




    public void setName(String str){
        name = str;
    }
    public String getName(){
        return name;
    }
    public void setAge(int num){
        age = num;
    }
    public int getAge(){
        return age;
    }

}
