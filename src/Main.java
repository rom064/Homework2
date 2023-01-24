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

        public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println("dog = " + dog);
        var cat = 3.6;
        System.out.println("cat = " + cat);
        var paper = 763789;
        System.out.println("paper = " + paper);
        System.out.println(" ");
    }

        public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println("dog = " + dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println("cat = " + cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println("paper = " + paper);
        System.out.println(" ");
    }

        public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog + 4;
        dog = dog - 3.5;
        System.out.println("dog = " + dog);
        var cat = 3.6;
        cat = cat + 4;
        cat = cat - 1.6;
        System.out.println("cat = " + cat);
        var paper = 763789;
        paper = paper + 4;
        paper = paper - 7639;
        System.out.println("paper = " + paper);
        System.out.println(" ");
    }

        public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);
        System.out.println(" ");
    }

        public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);
        System.out.println(" ");
    }

        public static void task6() {
        System.out.println("Задача 6");
        var boxerWeight1 = 78.2;
        System.out.println("Вес одного боксера - " + boxerWeight1 + " кг!");
        var boxerWeight2 = 82.7;
        System.out.println("Вес второго боксера - " + boxerWeight2 + " кг!");
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес бойцов - " + totalWeight + " кг!");
        System.out.println(" ");
    }

        public static void task7() {
        System.out.println("Задача 7");
        var boxerWeight1 = 78.2;
        System.out.println("Вес одного боксера - " + boxerWeight1 + " кг!");
        var boxerWeight2 = 82.7;
        System.out.println("Вес второго боксера - " + boxerWeight2 + " кг!");
        var weightDifference1 = boxerWeight2 - boxerWeight1;
        System.out.println("Разница между весами бойцов - " + weightDifference1 + " кг! ( первый способ ) ");
        var weightDifference2 = boxerWeight2 % boxerWeight1;
        System.out.println("Разница между весами бойцов - " + weightDifference2 + " кг! ( второй способ ) ");
        System.out.println(" ");
    }

        public static void task8() {
            System.out.println("Задача 8");
        /*
        Решите задачу с помощью функций сложения, вычитания, умножения и деления.
 640 часов работы поделено между сотрудниками.
 Если каждый сотрудник посвящает работе 8 часов, то сколько всего работников в компании?
 Выведите результат задачи в консоль в формате: «Всего работников в компании — … человек».
 Посчитайте, сколько часов работы должно быть поделено между сотрудниками, если в компании работает на 94 человека больше.
  Выведите результат задачи в консоль в формате: «Если в компании работает … человек, то всего … часов работы может
   быть поделено между сотрудниками».
Для решения этой задачи используйте тип переменной var.
         */
            var laborExpenditure = 640;
            System.out.println("Трудозатраты - " + laborExpenditure + " часов");
            var workingDay = 8;
            System.out.println("Рабочий день сотрудника " + workingDay + " часов");
            var amountOfWorkers = laborExpenditure / workingDay;
            System.out.println("Всего работников в компании — " + amountOfWorkers + " человек.");
            amountOfWorkers = amountOfWorkers + 94;
            System.out.print("Если в компании работает " + amountOfWorkers + " человек,");
            laborExpenditure = amountOfWorkers * workingDay;
            System.out.println(" то всего " + laborExpenditure + " часов работы может быть поделено между сотрудниками.");
            System.out.println(" ");
        }
    }