// Write a program in JAVA to show that the object is passed by reference but
// primitive data types are passed by value. 

// package chapterc_101_4;

public class ChapterC_101_4 {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2= new Example();
        System.out.println("Before passing by value : " + obj1.a);
        obj1.passVal(20);
        System.out.println("After passing by value : " + obj1.a);
        System.out.println("Before passing by reference : " + obj2.a);
        obj2.passObj(obj2);
        System.out.println("After passing by reference : " + obj2.a);
    }
}

class Example {
    int a = 10;

    void passVal(int a) {
        this.a = a + 10;
    }

    void passObj(Example ex) {
        ex.a = ex.a + 10;
    }
}

/*
 * OUTPUT --
 * 
 * Before passing by value : 10
 * After passing by value : 10
 * Before passing by reference : 10
 * After passing by reference : 20
 */
