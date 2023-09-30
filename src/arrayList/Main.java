package arrayList;

public class Main {
    public static void main(String[] args) {

        Work work = new Work();
        work.addValue("21");
        work.addValue("reer");
        work.addValue("fefrf");
        System.out.println("Всі додані елементи");
        System.out.println(work.arrayList);

        work.removeValue(1);
        System.out.println("Після видалення елементу");
        System.out.println(work.arrayList);


    }
}