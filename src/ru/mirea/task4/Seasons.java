package ru.mirea.task4;
import java.io.IOException;
import java.util.Scanner;

public class Seasons {

    public enum Season{;
        int summer,
        autumn,
        winter,
        spring;
    }

    public static Seasons[] a;
    String fam;
    String name;

    public Seasons(String fam, String name){
        this.fam = fam;
        this.name = name;
    }

    public static Seasons[] CreateArray(){
        Seasons sdt;

        for (int j =0; j < 4; j++){
            String fam = "";
            String name = "";

            sdt = new Seasons(fam, name);

            a[j] = sdt;
            System.out.println();
        }
        return a;
    }

    public static void print(Seasons[] a) {

        a[0].fam = "Температура 45*";

        a[1].fam = "Температура -40*";

        a[2].fam = "Температура 20*";

        a[3].fam = "Температура 13*";

        a[0].name = "Лето — одно из четырёх времён года, между весной и осенью, характеризующееся наиболее высокой температурой окружающей среды.";

        a[1].name = "Зима — одно из четырёх времён года, между периодами годового цикла осенью и весной.";

        a[3].name = "Осень (родственно др.-прусск. assanis — «осень», гот. аsans — «жатва», этимологически — «время жатвы»; по толкованию Даля — от «осенять» — затенять: наступление сумрака)";

        a[2].name = "Весна — одно из четырёх времён года, переходный сезон между зимой и летом";

        for (int i = 0; i < a.length; i++)

        {

            System.out.println("-------------------------------------------------------------------");

            System.out.println(a[i].fam);

            System.out.println(a[i].name);

            System.out.println("-------------------------------------------------------------------");

        }



        System.out.println();

    }

    public static void main(String[] args) throws IOException {


        System.out.println("Ваше любимая пора года?(лето(1),зима(2),осень(3),весна(4))");

        Scanner str = new Scanner(System.in);
        int s = str.nextInt();

        if (s == 1)

        {

            System.out.print("Лето — одно из четырёх времён года, между весной и осенью, характеризующееся наиболее высокой температурой окружающей среды.");

            System.out.println("В день летнего солнцестояния дни самые длинные, а ночи самые короткие.");

        }

        else if (s == 2)

        {

            System.out.print("Зима — одно из четырёх времён года, между периодами годового цикла осенью и весной.Основной признак этого времени ");

            System.out.println("года — устойчивая низкая температура(ниже 0 градусов по Цельсию) во многих районах Земли, на поверхность земли выпадает и ложится снег.");

        }

        else if (s == 3)

        {

            System.out.print("Осень (родственно др.-прусск. assanis — «осень», гот. аsans — «жатва», этимологически — «время жатвы»; по толкованию Даля — от «осенять» — затенять: наступление сумрака)");

            System.out.println(" — одно из четырёх времен года, между летом и зимой.");

        }

        else if (s == 4)

        {

            System.out.print("Весна — одно из четырёх времён года, переходный сезон между зимой и летом");

            System.out.println(" . Существуют различные методы определения начал и окончания весны, отличающиеся в зависимости от местного климата, культур и обычаев. Когда в Северном полушарии весна, то в Южном полушарии осень и наоборот.");

        }

        else

        {

            System.out.println("Неправильная пора года выхожу!");

            System.in.read();

            System.exit(0);

        }



        System.out.println("1-лето");

        System.out.println("2-зима");

        System.out.println("3-весна");

        System.out.println("4-осень");

        Scanner foo = new Scanner(System.in);
        int mb = Integer.valueOf(foo.nextInt());

        TellAboutSeasons(mb);

        System.out.println("Введите лето или зима");

        Scanner see = new Scanner(System.in);
        int mb1 = see.nextInt();

        getDescription(mb1);

        Seasons[] a;

        a = Seasons.CreateArray();

        a: Seasons.print(a);

        System.in.read();

    }



    private static void getDescription(int s)

    {

        if (s == 1) System.out.println("Теплое время года");

        else

        if (s == 2) System.out.println("Холодное время года");

    }

    private static void TellAboutSeasons(int mb)

    {

        double sr = 0;


        switch (mb)

        {

            case 1:

                sr = 45; System.out.println("Я люблю лето " + sr + "*"); break;


            case 2:

                sr = 13; System.out.println("Я люблю осень " + sr + "*"); break;

            case 3:

                sr = -40; System.out.println("Я люблю зиму " + sr + "*"); break;
            case 4:

                sr = 20; System.out.println("Я люблю весну " + sr + "*"); break;

        }

    }

} 


