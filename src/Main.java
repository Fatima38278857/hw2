public class Main {
    public static void main(String[] args) {

            //Задание 1
            System.out.println("Задание 1");
            var dog = 8.0;
            var cat = 3.6;
            var papper = 763789;
            System.out.println("собак " + dog);
            System.out.println("котов " + cat);
            System.out.println("бумаги " + papper);

            //задание 2
            System.out.println("Задание 2");
            dog = dog + 4;
            cat = cat + 4;
            papper = papper + 4;
            System.out.println("собак " + dog);
            System.out.println("котов " + cat);
            System.out.println("бумаги " + papper);

            //Задание 3
            System.out.println("Задание 3");
            dog = dog - 3.5;
            cat = cat - 1.6;
            papper = papper - 7639;
            System.out.println("собак " + dog);
            System.out.println("котов " + cat);
            System.out.println("бумаги " + papper);

            // задание 4

            System.out.println("Задание 4");

            var friend  = 19;
            System.out.println(friend);
            friend = friend + 2;
            System.out.println(friend);
            friend = friend / 7;
            System.out.println(friend);

            // задача 5

             System.out.println("Задание 5");

             var frog = 3.5;
             System.out.println(frog);
             frog = frog * 10;
             System.out.println(frog);
             frog = frog / 3.5;
             System.out.println(frog);
             frog = frog + 4;
             System.out.println(frog);

             // задание 6

             System.out.println("Задание 6");

             var weightFirstBoxers = 78.2;
             var weightSecondBoxers = 82.7;
             System.out.println("Вес первого боксера = " + weightFirstBoxers + "кг." );
             System.out.println("Вес второго боксера = " + weightSecondBoxers + "кг." );
             var totalWeightBoxers = weightFirstBoxers + weightSecondBoxers;
             System.out.println("В сумме вес боксеров = " + totalWeightBoxers + "кг." );
             var differenceWeightBoxers = weightFirstBoxers - weightSecondBoxers;
             System.out.println("Вес первого боксера = " + weightFirstBoxers + "кг." );
             System.out.println("Разница весе боксеров = " + differenceWeightBoxers + "кг." );


             // задание 7

            System.out.println("Задание 7");

             var rvznitsaWeight = weightSecondBoxers - weightFirstBoxers;
             System.out.println("Вычисляем разницу в весе боксеро (отнимаем меньшее от большего) - " + rvznitsaWeight + "кг.");
             rvznitsaWeight = weightSecondBoxers % weightFirstBoxers;
             System.out.println("Разница в весе боксеров (используем функцию остаток от деления) ="  + rvznitsaWeight + "кг.");

              // задание 8

             System.out.println("Задание 8");

             var totalNumberHours = 640;
             var openingHours = 8;
             var numberEmployees = totalNumberHours / openingHours;
             System.out.println("Всего работников в компании -"  + numberEmployees + "человек.");
             numberEmployees = numberEmployees + 94;
             System.out.println("Если в компании работает" +   numberEmployees  + "человек, то  всего" +  (numberEmployees * openingHours)  + "часов работы может быть поделено между сотрудниками");


    }
}

