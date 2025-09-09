import java.util.ArrayList;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<MountainHare> hares = new ArrayList<>();
        hares.add(new MountainHare(4, 4.4, 120));
        hares.add(new MountainHare(7, 3.6, 150));
        hares.add(new MountainHare(1, 2.3, 100));

        System.out.println("В лесу лето!");
        // создайте объект "летний лес с зайцами"
        Forest forest = new Forest(hares);
        Forest.setSeason("лето");

        System.out.println("Список зайцев:");
        forest.printHares();

        System.out.println("В лесу зима!");
        // поменяйте время года на зиму
        Forest.setSeason("зима");

        System.out.println("Список зайцев:");
        // напечатайте список всех зайцев
        forest.printHares();
    }
}

class MountainHare {
    protected int age, jumpLength;
    protected double weight;
    protected static String color;

    public MountainHare(int age, double weight, int jumpLength) {
        this.age = age;
        this.jumpLength = jumpLength;
        this.weight = weight;
    }
    // добавьте переменные и конструктор

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}

class Forest {
    private ArrayList<MountainHare> hares;
    private static String season;

    public Forest(ArrayList<MountainHare> hares) {
        this.hares = hares;
    }

    // объявите недостающие переменные и добавьте конструктор

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков
    protected static void setSeason(String newSeason) {
        season = newSeason;
        MountainHare.color = season.equals("зима") ? "белый" : "серо-рыжий";
    }

    // добавьте метод printHares()
    protected void printHares() {
        for(MountainHare item : hares) {
            System.out.println(item);
        }
    }
}
