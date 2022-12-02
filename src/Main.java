public class
Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        byte a = 127;
        short b = 32760;
        int c = 1000000;
        long d = 3000000L;
        float e = (float) 31.907;
        double g = 32.12345689;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной g с типом double равно " + g);
    }

    public static void task2() {
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
    }

    public static void task3() {
        byte classLudPav = 23;
        byte classAnnSer = 27;
        byte classEkAn = 30;
        int allStudent = classLudPav + classAnnSer + classEkAn;
        short piecePaper = 480;
        int everStudent = piecePaper / allStudent;
        System.out.println("На каждого ученика рассчитано " + everStudent + " листов бумаги");

    }

    public static void task4() {
        byte productivity = 16;
        byte time = 2;
        int inMinute = productivity / time;
        byte time2 = 20;
        int productivity2 = time2 * inMinute;
        int time3 = 24 * 60;
        int productivity3 = time3 * inMinute;
        int time4 = 24 * 3 * 60;
        int productivity4 = time4 * inMinute;
        int time5 = 30 * 24 * 60;
        int productivity5 = time5 * inMinute;
        System.out.println("За 20 минут машина произвела " + productivity2 + " штук бутылок");
        System.out.println("За сутки машина произвела " + productivity3 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivity4 + " штук бутылок");
        System.out.println("За месяц (30 дней) машина произвела " + productivity5 + " штук бутылок");
    }

    public static void task5() {
        short allPaint = 120;
        short whitePaint = 2;
        short brownPaint = 4;
        short oneClass = (short) (whitePaint + brownPaint);
        short allClass = (short) (allPaint / oneClass);
        short allWhitePaint = (short) (whitePaint * allClass);
        short allBrownPaint = (short) (brownPaint * allClass);
        System.out.println("В школе, где " + allClass + "  классов, нужно " + allWhitePaint + " банок белой краски и " + allBrownPaint + " банок коричневой краски");
    }

    public static void task6() {
        short banana = 5;
        short bananaWeight = 80;
        short allWeightBanana = (short) (banana * bananaWeight);
        short milkML = 200;
        short milkWeight = 105;
        short allWeightM = (short) (milkML / 100 * milkWeight);
        short ice = 2;
        short iceWeight = 100;
        short allWeightI = (short) (ice * iceWeight);
        short egg = 4;
        short eggWeight = 70;
        short allWeightE = (short) (egg * eggWeight);
        short weightBreakfastGram = (short) (allWeightBanana + allWeightM + allWeightI + allWeightE);
        int grPerKg = 1000;
        float weightKg = weightBreakfastGram / (float)grPerKg;
        System.out.println("Вес спортзавтрака в граммах " + weightBreakfastGram);
        System.out.println("Вес спортзавтрака в граммах " + weightKg);

    }

    public static void task7() {
        short allWeight = 7;
        short lossGr = 250;
        float lossKg = lossGr / 1000f;
        short lossGr2 = 500;
        float lossKg2 = lossGr2 / 1000f;
        float allDay = allWeight / lossKg;
        float allDay2 = allWeight / lossKg2;
        float mean = (allDay + allDay2) / 2;
        System.out.println(allDay + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(allDay2 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println("За " + mean + " дней в среднем понадобится, чтобы добиться результата похудения.");

    }

    public static void task8() {
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int masha2 = masha + (masha / 100 * 10);
        int denis2 = denis + (denis / 100 * 10);
        int kristina2 = kristina + (kristina / 100 * 10);
        int masha3 = (masha2 * 12) - (masha * 12);
        int denis3 = (denis2 * 12) - (denis * 12);
        int kristina3 = (kristina2 * 12) - (kristina * 12);
        System.out.println("Маша теперь получает " + masha2 + " рублей. Годовой доход вырос на " + masha3 + " рублей");
        System.out.println("Денис теперь получает " + denis2 + " рублей. Годовой доход вырос на " + denis3 + " рублей");
        System.out.println("Кристина теперь получает " + kristina2 + " рублей. Годовой доход вырос на " + kristina3 + " рублей");

    }
}



