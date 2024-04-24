public class Main {
    public static void main(String[] args) {

        System.out.println("number1");
        int a = 214_748_364_7 ;
        System.out.println(a);
        byte  b = - 128 ;
        System.out.println(b);
        short d = -32768 ;
        System.out.println(d);
        long c = 922_337_203 ;
        System.out.println(c);
        float f = -38;
        System.out.println(f);
        double q = 1.7 ;
        System.out.println(q);
        System.out.println();

        System.out.println("number2");
        float f1 = 27.12f ;
        long c1 = 987_678_965_549L ;
        double q1= 2.786 ;
        int a1 = 569 ;
        short d1 =-159 ;
        int a2 = 27897 ;
        byte b1 = 67 ;
        System.out.println(f1);
        System.out.println(c1);
        System.out.println(q1);
        System.out.println(a1);
        System.out.println(d1);
        System.out.println(a2);
        System.out.println(b1);
        System.out.println();

        System.out.println("number3");
        int totalPaper = 480 ;
        int luda = 23 ;
        int anna = 27;
        int katia = 30 ;
        int teachers = luda + anna + katia ;
        int student = totalPaper / teachers ;
        System.out.println("На каждого ученика рассчитано " + student +
                "  листов бумаги");
        System.out.println();

        System.out.println("number4");
        int perMin  = 16 / 2 ;
        int per20Min = 20 * perMin ;
        int perDay = 24 * 60 * perMin ;
        int per3Days = 3 * perDay ;
        int per1Month = 30 * perDay;
        System.out.println("за 20 мин машина произвела " + per20Min + " штук бутылок ");
        System.out.println("за 1 день мин машина произвела " + perDay + " штук бутылок ");
        System.out.println("за 3 дня мин машина произвела " + per3Days + " штук бутылок ");
        System.out.println("за 1 месяц  мин машина произвела " + per1Month + " штук бутылок ");
        System.out.println();

        System.out.println("number5");
        int totalPot = 120 ;
        int whiterPot = 4 ;
        int crownPot = 2 ;
        int classSchool = totalPot / (whiterPot + crownPot) ;
        int totalWhiterPot = whiterPot + classSchool ;
        int totalCrownPot = crownPot + classSchool ;
        System.out.println("В школе, где " + classSchool +
                " классов, нужно " + totalWhiterPot +
                " банок белой краски и " + totalCrownPot +
                " банок коричневой краски».");
        System.out.println();

        System.out.println("number6");
        int bananas = 5 * 80  ;
        double milk = 200 * 1.05 ;
        int frozen = 2 * 100;
        int egg = 5 * 100 ;
        double inGrams = (bananas + milk + frozen + egg) ;
        double inKg = (bananas + milk + frozen + egg) ;
        System.out.println(inGrams + "грамм");
        System.out.println(inKg + "кг");
        System.out.println();

        System.out.println("number7");
        int weight = 7 * 1000 ;
        int sportsmenMax = weight / 500 ;
        int sportsmenMin = weight / 250 ;
        System.out.println(sportsmenMax);
        System.out.println(sportsmenMin);
        int average = (sportsmenMax +sportsmenMin) / 2 ;
        System.out.println(average);
        System.out.println();

        System.out.println("number8");
        int masha = 67_760 ;
        int den = 83_690 ;
        int kris = 76_230 ;
        double mashaNewSalary = masha *  1.10 ;
        double denNewSalary = den *  1.10 ;
        double krisNewSalary = kris *  1.10 ;
        int mashaYearSalary = masha * 12 ;
        double mashaNewYearSalary = mashaNewSalary * 12 ;
        int denYearSalary = den * 12 ;
        double denNewYearSalary = denNewSalary * 12 ;
        int krisYearSalary = den * 12 ;
        double krisNewYearSalary =krisNewSalary * 12 ;
        System.out.println("Маша теперь получает " + mashaNewSalary +
                " рублей. Годовой доход вырос на " + (mashaNewYearSalary - mashaYearSalary) +
                " рублей.");
        System.out.println("Денис теперь получает " + denNewSalary +
                " рублей. Годовой доход вырос на " +  (denNewYearSalary - denYearSalary) +
                " рублей.");
        System.out.println("Кристина теперь получает " + krisNewSalary +
                " рублей. Годовой доход вырос на " + (krisNewYearSalary - krisYearSalary) +
                " рублей.");
        System.out.println();





    }
}