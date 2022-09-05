public class Main {
    public static void main(String[] args) {
        int age = 20;
        if (age >= 18){
            System.out.println("Поздравляем с " + age + " (ти) летием");
        } else {
            System.out.println("Вам еще нет 18, нужно немного подождать");
        }
        int kidAge = 25;

        if (kidAge >= 7 && kidAge < 18){
            System.out.println("ребёнок ходит в садик");
        } else if (kidAge >= 18 && kidAge < 24){
            System.out.println("человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }

        int vagonCapacity = 102;
        int sitCapacity = 60;
        int people = 124;

        if (people <= sitCapacity) {
            System.out.printf(sitCapacity - people + " сидячих мест");
        } else if (people >= sitCapacity && people < vagonCapacity){
            System.out.println(vagonCapacity - people + " стоячих мест");
        } else if (people > vagonCapacity){
            System.out.println("Перегруз на " + (people - vagonCapacity) + " человек(а)");
        }

        int personAge = 24;
        if (personAge >= 2 && personAge <= 6){
            System.out.println("Нужно ходить в садик");
        } else if (personAge >= 7 && personAge <= 18){
            System.out.println("Нужно ходить в школу");
        } else if (personAge > 18 && personAge < 24){
            System.out.println("Нужно ходить в университет");
        } else if (personAge >= 24){
            System.out.println("Нужно ходить на работу ");
        }

        int manAge = 14;
        if (manAge < 5){
            System.out.println("Нельзя кататься на аттракционе");
        } else if (manAge > 5 && manAge < 14){
            System.out.println("Можно кататься только в сопровождении взрослого");
        } else if (manAge >= 14){
            System.out.println("Можно кататься без сопровождения взрослого");
        }

        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three){
            System.out.println(one);
        } else if (two > one && two > three){
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}