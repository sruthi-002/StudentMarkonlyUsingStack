package com.company;
import java.util.Scanner;
import java.util.*;
import com.company.pojo.Student;
import com.company.pojo.Mark;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,i;
        float a;
        Stack<Student>s = new Stack<Student>();
        Student myobj=new Student();
        Mark sub =new Mark();
        Student myobj1 = new Student();
        for(i=0;i<5;i++) {
            myobj=new Student();
            myobj.setName(in.next());
            s.add(myobj);
            sub.setTamil(in.nextInt());
            sub.setEnglish(in.nextInt());
            sub.setMaths(in.nextInt());
            sub.setScience(in.nextInt());
            sub.setSocial(in.nextInt());
            s.get(i).setSubjects(sub);
        }
        for(i=0;i<5;i++)
        {
            int sum = s.get(i).getSubjects().getTamil()+s.get(i).getSubjects().getEnglish()+s.get(i).getSubjects().getMaths()+s.get(i).getSubjects().getScience()+s.get(i).getSubjects().getSocial();
            System.out.println(i+1 + "."+ " "+ s.get(i).getName() + " "+ s.get(i).getSubjects().getTamil()+ " "+ s.get(i).getSubjects().getEnglish()+ " "+s.get(i).getSubjects().getMaths()+ " "+ s.get(i).getSubjects().getScience() + " "+ s.get(i).getSubjects().getSocial() + " "+sum+" "+ s.get(i).getSubjects().getAvg() +" ");
        }
    }
}

package com.company.pojo;

public class Student {
    String name;
    Mark Subjects;
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mark getSubjects() {
        return Subjects;
    }

    public void setSubjects(Mark subjects) {
        Subjects = subjects;
    }

}

package com.company.pojo;
public class Mark {
    int Tamil,English,Maths,Science,Social;
    float avg;
    public int getTamil() {
        return Tamil;
    }

    public void setTamil(int tamil) {
        this.Tamil = tamil;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        this.English = english;
    }

    public int getMaths() {
        return Maths;
    }

    public void setMaths(int maths) {
        this.Maths = maths;
    }

    public int getScience() {
        return Science;
    }

    public void setScience(int science) {
        this.Science = science;
    }

    public float getAvg() {
        return (getTamil() + getEnglish() + getMaths() + getScience() + getSocial())/5;
    }

    public int getSocial() {

        return Social;
    }

    public void setSocial(int social) {
        this.Social = social;
    }

}


