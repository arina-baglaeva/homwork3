//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1 задача
        int a = 10000;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 125;
        System.out.println("Значение переменной b с типом byte равно " + b );
        short s = 32767;
        System.out.println("Значение переменной s с типом short равно " + s);
        long l = 23333333333333256L;
        System.out.println("Значение переменной l с типом long равно " + l);
        float f = 5.693f;
        System.out.println("Значение переменной f с типом float равно " + f);
        double d = 6.1566;
        System.out.println("Значение переменной d с типом double равно " + d );
        //2 задача
        short i = -159;
        System.out.println("Значение переменной i с типом int равно " + i);
        short p = 569;
        System.out.println("Значение переменной p с типом int равно " + p);
        byte y = 67;
        System.out.println("Значение переменной y с типом byte равно " + y );
        short h = 27897;
        System.out.println("Значение переменной h с типом short равно " + h);
        long o = 987678965549L;
        System.out.println("Значение переменной o с типом long равно " + o);
        float t = 27.12f;
        System.out.println("Значение переменной t с типом float равно " + t);
        double u = 2.786;
        System.out.println("Значение переменной u с типом double равно " + u );
        //3 задача
        b = 23; y = 27;
        byte m = 30;
        short lists = 480;
        int perPaper = lists/(b+y+m);
        System.out.println("На каждого ученика рассчитано "+ perPaper + " листов бумаги");
        //4 задача
        int speedMin = 16/2;
        int twentyMin = 20*speedMin;
        int day = 24*60* speedMin;
        int day3 = 24*60*speedMin*3;
        int day30 =24*60*speedMin*30;
        System.out.println("За 20 минут машина произвела "+ twentyMin +" штук бутылок");
        System.out.println("За сутки машина произвела "+ day+" штук бутылок");
        System.out.println("За 3 дня машина произвела "+ day3+" штук бутылок");
        System.out.println("За месяц машина произвела "+ day30+" штук бутылок");
        //5 задача
        byte allBun = 120;
        int perClass = 2+4;
        int numClass = allBun/perClass;
        int whiteBun = numClass *2;
        int brownBun = numClass * 4;
        System.out.println("В школе, где "+numClass+" классов, нужно "+whiteBun+" банок белой краски и "+brownBun+" банок коричневой краски");
        //6 задача
        int banan = 5*80;
        int milk = 105*2;
        int iceCream = 2*100;
        int eggs = 4*70;
        int allWeightGramm = banan+milk+iceCream+eggs;
        int allWeightKg = allWeightGramm/1000;
        System.out.println("Вес завтрака составляет "+allWeightGramm+" грамм и "+allWeightKg+" килограмм");
        //7 задача
        int day250 = 7000/250;
        int day500 = 7000/500;
        System.out.println("Если худеть по 250 грамм в день, то понадобится "+day250+" дней, а если по 500 грамм в день, то "+day500+" дней");
        //8 задача
        int solary =67760;
        int solary10= 110 * (solary/100);
        int razn = solary10- solary;
        System.out.println("Маша теперь получает " +solary10 + " рублей. Годовой доход вырос на "+ razn +" рублей");
        solary =83690;
        solary10= 110 * (solary/100);
        razn = solary10- solary;
        System.out.println("Денис теперь получает " +solary10 + " рублей. Годовой доход вырос на "+ razn +" рублей");
        solary =76230;
        solary10= 110 * (solary/100);
        razn = solary10- solary;
        System.out.println("Кристина теперь получает " +solary10 + " рублей. Годовой доход вырос на "+ razn +" рублей");


    }
}