package ru.mirea.task3;

public class Human {
    public static void main(String[] args){
        System.out.println("Голова:");
        Head hed = new Head("карие", "c горбинкой", "не большие", "блондин");
        hed.head("карие", "c горбинкой", "не большие", "коричнивые");
        System.out.println();

        System.out.println("Ноги:");
        Leg legs = new Leg("без плоскостопия", "варусные (имеетя деформация)", "92 сантиметра");
        legs.leg("без плоскостопия", "варусные (имеетя деформация)", "92 сантиметра");
        System.out.println();

        System.out.println("Руки:");
        Hand ruk = new Hand("средняя, с нормальным мышечным каркасом", "нормальной комплекции", "тренированные");
        ruk.ruka("средняя, с нормальным мышечным каркасом", "нормальной комплекции", "тренированные");
    }
}
