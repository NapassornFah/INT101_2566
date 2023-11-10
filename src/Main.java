
import work02.Person;
import work03.Account;

import static work01.Utilitor.*;


public class Main {

    public static void main(String[] args) {
        work01Utilitor();
        work02Person();
        work03Account();
    }

    static void work01Utilitor() {
        //System.out.println(testString(null));
        System.out.println(testString("TT"));
//        System.out.println(testString(""));
        System.out.println(testPositive(17.0));
        //System.out.println(computeIsbn10(030640615L));
        System.out.println(computeIsbn10(123456789L));
    }

    static void work02Person() {
        Person No1 = new Person("aaa","AAA");
        Person No2 = new Person("bbb","BBB");
        Person No3 = new Person("ccc","CCC");
        System.out.println(No1.getFirstname());
        System.out.println(No2.getId());
        System.out.println(No2.getFirstname());
        System.out.println(No3.getLastname());
        System.out.println(No3.equals(No2));
        No2.setFirstname("two");
        System.out.println(No2.toString());
        System.out.println(No2.getFirstname());
        System.out.println(No3);
    }

    static void work03Account() {
        Person No4 = new Person("ddd","DDD");
        Person No5 = new Person("eee","EEE");
        Account a1 =  new Account(No4);
        Account a2 =  new Account(No5);
        System.out.println(a1.getNo());
        System.out.println(a2.getNo());
        System.out.println(a1.getOwner());
        System.out.println(a2.getOwner());
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
        a1.deposit(10000);
        System.out.println(a1.getBalance());
        a1.withdraw(2000);
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
        a1.transfer(3000,a2);
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        a2.deposit(2000);
        System.out.println(a2.getBalance());
        a2.withdraw(1000);
        System.out.println(a2.getBalance());
        a2.deposit(10000);
        System.out.println(a2.getBalance());
        a2.transfer(6000,a1);
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
    }
}