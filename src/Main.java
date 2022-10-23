public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");
        byte a = 1;
        System.out.println("Значение переменной a, с типом byte равно " + a );
        short b =2;
        System.out.println("Значение переменной b, с типом short равно " + b );
        int hamster = 3;
        System.out.println("Значение переменной hamster, с типом int равно " + hamster );
        long d = 45L;
        System.out.println("Значение переменной d, с типом long равно " + d );
        float e = 5.0F;
        System.out.println("Значение переменной e, с типом float равно " + e );
        double f = 6.555;
        System.out.println("Значение переменной f, с типом double равно " + f );
        char g = 33;
        System.out.println("Значение переменной g, с типом char равно " + g );
        boolean hamsterIsAdult = hamster>5;
        System.out.println("Значение переменной hamsterIsAdult, с типом boolean равно " + hamsterIsAdult);

        // Задание 2
        System.out.println("Задание 2");

        float sugar = 27.12F;
        System.out.println("sugar " + sugar);
        short apple = -159;
        System.out.println("apple " + apple);
        long rice =  27897L;
        System.out.println("rice " +rice);
        byte pear = 67;
        System.out.println("pear " + pear);
        char p = 2;
        System.out.println("p " + p);
        boolean pearSalesPlan = pear>100;
        System.out.println("pearSalesPlan " +pearSalesPlan);
        long money = 987L;
        System.out.println("money " +money);
        int toys   = 786;
        System.out.println("toys " +toys);
        short telephone = 569;
        System.out.println("telephone " + telephone);

        // Задание 3
        System.out.println("Задание 3");
        short class1 = 23;
        short class2 = 27;
        short class3 = 30;
        short paper = 480;
        int paperPeople = paper/(class1+class2+class3);
        System.out.println("На каждого ученика рассчитано " + paperPeople + " листов бумаги");

        // Задание 4
        System.out.println("Задание 4");
        int twoMinutes = 16;
        int twentyMinutes = twoMinutes*10;
        System.out.println("За 20 минут работы машины произвела бутылок " + twentyMinutes + " штук");
        int day = 24*60/2* twoMinutes;
        System.out.println("За сутки работы машины произвела бутылок " + day + " штук");
        int threeDay= 24*60*3/2* twoMinutes;
        System.out.println("За три дня работы машины произвела бутылок " + threeDay + " штук");
        int thirtyDays= 24*60*30/2* twoMinutes;
        System.out.println("За тридцать дней работы машины произвела бутылок " + thirtyDays + " штук");

        // Задание 5
        System.out.println("Задание 5");
        byte totalPaint = 120;
        byte whitePaintClass = 2;
        byte brownPaintClass = 4;
        int totalClass = totalPaint/(whitePaintClass+brownPaintClass);
        int totalWhitePaintClass = totalClass*whitePaintClass;
        int totalBrownPaintClass = totalClass*brownPaintClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePaintClass +" банок белой краски и "+totalBrownPaintClass+" банок коричневой краски.");

        // Задание 6
        System.out.println("Задание 6");
        double bananas = 5*80.000;
        double milk = 105.000*2;
        double iceCream = 2*100.000;
        double eggs = 4*70.000;
        double totalBreakfastWeight = (bananas+milk+iceCream+eggs)/1000;
        System.out.println("Вес спортивного завтрака равен " + totalBreakfastWeight + " килограмм");

        // Задание 7
        System.out.println("Задание 7");
        int totalDaysTwoHundredAndFifty= 7000/250;
        System.out.println("На похудение спортсмена уйдет " + totalDaysTwoHundredAndFifty + " дней, если он будет терять каждый день по 250 грамм");
        int totalDaysFiveHundred= 7000/500;
        System.out.println("На похудение спортсмена уйдет " + totalDaysFiveHundred + " дней, если он будет терять каждый день по 500 грамм");
        int averageNumberOfDays = (totalDaysTwoHundredAndFifty+totalDaysFiveHundred)/2;
        System.out.println("В среднем на похудение спортсмена уйдет " + averageNumberOfDays + " день!");

        // Задание 8
        System.out.println("Задание 8");
        int employeeMasha= 67760;
        int employeeDenis= 83690;
        int employeeChristina= 76320;
        double employeeMashaIncreasedSalary=employeeMasha*0.1+employeeMasha;
        double employeeDenisIncreasedSalary= employeeDenis*0.1+employeeDenis;
        double employeeChristinaIncreasedSalary= employeeChristina*0.1+employeeChristina;
        double employeeMashaAnnualIncomeDifference = (employeeMashaIncreasedSalary-employeeMasha)*12;
        double employeeDenisAnnualIncomeDifference= (employeeDenisIncreasedSalary-employeeDenis)*12;
        double employeeChristinaIncomeDifference=(employeeChristinaIncreasedSalary-employeeChristina)*12;
        System.out.println("Маша теперь получает " + employeeMashaIncreasedSalary + " рублей. Годовой доход вырос на "+employeeMashaAnnualIncomeDifference+ " рублей.");
        System.out.println("Денис теперь получает " + employeeDenisIncreasedSalary + " рублей. Годовой доход вырос на "+employeeDenisAnnualIncomeDifference+ " рублей.");
        System.out.println("Кристина теперь получает " + employeeChristinaIncreasedSalary + " рублей. Годовой доход вырос на "+employeeChristinaIncomeDifference+ " рублей.");



    }
}