public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задание 1
        byte a = 3;
        System.out.println(a);
        short b = 9;
        System.out.println(b);
        int c = 13;
        System.out.println(c);
        long d = 21;
        System.out.println(d);
        float f = 2.3f;
        System.out.println(f);
        double g = 0.9;
        System.out.println(g);
        char t = 36;
        System.out.println (t);


        // задание 2

        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float weightOfAllBoxer = boxer1+boxer2;
        System.out.println (" общий вес боксеров " + weightOfAllBoxer + " кг " );
        float theDifferenceInTheWeightOfBoxer = boxer2 - boxer1;
        System.out.println(" Разница в весе составляет " + theDifferenceInTheWeightOfBoxer + " кг ");

        // Задание 3

        short banana = 5;
        short weight1Banana  = 80;
        int weightBananas = banana*weight1Banana;
        System.out.println(" Вес бананов составляет " + weightBananas + " грамм ");

        int milk = 200;
        short weight100Ml = 105;
        int weightMilk = weight100Ml * 2;
        System.out.println(" Вес молока составляет " + weightMilk + " грамм ");

        byte iceCreamBriquette = 2;
        byte weight1Briquette = 100;
        int weightIceCream = iceCreamBriquette * weight1Briquette ;
        System.out.println(" Вес мороженного составляет " + weightIceCream + " грамм " );

        byte eggs = 4;
        byte egg1 = 70;
        int weightEggs = eggs * egg1;
        System.out.println( " Вес яиц составляет " + weightEggs + " грамм ");

        int allWeight = weightBananas + weightMilk + weightIceCream + weightEggs;
        System.out.println(" Общий вес завтрака " + allWeight + " грамм ");


        float weight1Kg = 1000;
        float allBreakfast = allWeight / weight1Kg;
        System.out.println( " Вес завтрака составляет " + allBreakfast + " кг ");

        // Задание 4

        byte loseWeigt = 7;
        short kg1Weight  = 1000;
        int loseGramm = loseWeigt * kg1Weight;
        System.out.println( " Нужно сбросить " + loseGramm + " грамм ");

        short minGramm = 250;
        int maxDay = loseGramm / minGramm;
        System.out.println(" Максимальное количество дней для похудения " + maxDay + " Если он будет сбрасывать по 250 грамм в день " );

        short maxGramm = 500;
        int minDay = loseGramm / maxGramm;
        System.out.println( " Максимальное количество дней для похудения " + minDay + " Если он будет сбрасывать по 500 грамм в день");

        // Задание 5
        int masha = 67760;
        byte persent = 10;
        int newSalaryMasha = ((masha / 100 ) * persent) + masha;
        System.out.println( "Новая зарплата Маши состовляет " + newSalaryMasha + " рублей ");
        int oldAnnualIncomeM = 12 * masha;
        System.out.println( " Старый годовой доход составляет " + oldAnnualIncomeM  + " Рублей ");
        int newAnnualIncomeM = 12 * newSalaryMasha;
        System.out.println(" Новый годовой доход Маши равен " + newAnnualIncomeM + " Рублям ");
        int salaryDifferenceM = newAnnualIncomeM - oldAnnualIncomeM;
        System.out.println(" Разница в доходе равна " + salaryDifferenceM + " рублей ");
        System.out.println(" Маша теперь получает " + newSalaryMasha + " Рублей. " + " Ее годовой доход вырос на " + salaryDifferenceM + " рублей");

        int denis = 83690;
        int newSalaryDenis = ((denis/100)* persent ) + denis;
        System.out.println(" Новая зарплата Дениса составляет " + newSalaryDenis + " Рублей " );
        int oldAnnualIncomeD = 12 * denis;
        System.out.println(" Старый годовой доход Дениса равен " + oldAnnualIncomeD + " Рублей ");
        int newAnnualIncomeD = 12 * newSalaryDenis;
        System.out.println(" Новый годовой доход Дениса равен " + newAnnualIncomeD + " Рублей ");
        int salaryDifferenceD = newAnnualIncomeD - oldAnnualIncomeD;
        System.out.println(" Разница в доходе составляет " + salaryDifferenceD + " Рублей ");
        System.out.println(" Денис теперь получает " + newSalaryDenis + " Рублей." + "Его годовой доход вырос на" + salaryDifferenceD + " Рублей ");

        int kristina = 76230;
        int newSalaryKristina = ((kristina/100)*persent)+kristina;
        System.out.println(" Новая зарплата Кристины равна " + newSalaryKristina + "Рублей ");
        int oldAnnualIncomeK = 12 * kristina;
        System.out.println(" Старый годовой доход Кристины равен " + oldAnnualIncomeK + " Рублей ");
        int newAnnualIncomeK = 12 * newSalaryKristina;
        System.out.println( " Новый годовой доход Кристины равен " + newAnnualIncomeK + " Рублей ");
        int salaryDifferenseK = newAnnualIncomeK - oldAnnualIncomeK;
        System.out.println(" Разница в доходе составляет " + salaryDifferenseK + " Рублей ");
        System.out.println(" Кристина теперь получает " + newSalaryKristina + " Рублей. " + "Ее годовой доход вырос на " + salaryDifferenseK + " Рублей ");









    }
}
