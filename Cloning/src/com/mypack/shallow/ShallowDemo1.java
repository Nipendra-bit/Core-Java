package com.mypack.shallow;
//it shows cloning or shallow cloning(by default shallow cloning it support)
class Student1 implements Cloneable
{
    String name;
    int age;
    public Student1(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void show()
    {
        System.out.println(name+" "+age);
    }
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }
}

public class ShallowDemo1 {

	public static void main(String[] args)throws CloneNotSupportedException
    {
        Student1 s=new Student1("Nipendra",22);
        s.show();
        System.out.println("*****************");
        Student1 temp=(Student1)s.clone();
        temp.show();
    }
}
