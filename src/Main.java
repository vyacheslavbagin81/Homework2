public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1(){
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2(){
        var dog = 8;
        dog = dog + 4;
        var cat = 3.6;
        cat = cat + 4;
        var paper = 763789;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3(){
        var dog = 8.0;
        dog = dog - 3.5;
        var cat = 3.6;
        cat = cat - 1.6;
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4(){
        var friend = 19;
        System.out.println(friend);
        friend = friend + 19;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5(){
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 (){
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println(totalWeight);
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println(weightDifference);
    }
    public static void task7(){
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var subtraction = boxerWeight2 - boxerWeight1;
        System.out.println(subtraction);
        var division = boxerWeight2 / boxerWeight1;
        System.out.println(division);
    }
    public static void task8(){
        var hourTotal = 640;
        var hourDay = 8;
        var worker = hourTotal/hourDay;
        System.out.println("Всего работников в компании - "+worker+" человек.");
        worker = worker + 94;
        hourTotal = worker * hourDay;
        System.out.println("Если в компании работает "+worker+" человек, то всего "+hourTotal+" часов работы может быть поделено между сотрудниками.");
    }
}