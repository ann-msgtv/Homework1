public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("task1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task2
        System.out.println("task2");
        dog = dog+4;
        cat = cat+4;
        paper = paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task3
        System.out.println("task3");
        dog = dog-3.5;
        cat = cat-1.6;
        paper = paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task4
        System.out.println("task4");
        var friend = 19;
        System.out.println(friend);
        friend = friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);

        //task5
        System.out.println("task5");
        var frog=3.5;
        System.out.println(frog);
        frog *=10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog +=4;
        System.out.println(frog);

        //task6
        System.out.println("task6");
        var boxer1=78.2;
        var boxer2=82.7;
        var sumMass=boxer1+boxer2;
        System.out.println(sumMass);
        var subMass=boxer2-boxer1;
        System.out.println(subMass);

        //task7
        System.out.println("task7");
        var remDivMass = boxer2%boxer1;
        System.out.println(remDivMass);

        //task8
        System.out.println("task8");
        var workingHours = 640;
        var hours = 8;
        var workers = workingHours/hours;
        System.out.println("Всего работников в компании — "+workers+" человек.");

        workers +=94;
        var workingHours2 = workers*hours;
        System.out.println("Если в компании работает "+workers+" человека, то всего "+workingHours2+" часа работы может быть поделено между сотрудниками».");




    }
}

