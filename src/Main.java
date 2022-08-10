public class Main {
    public static void main(String[] args) {
        Boss boss =new Boss(500,100,"хайп");
        System.out.println("здоровье " + boss.getHealth());
        System.out.println("урон " + boss.getDemage());
        System.out.println("атака " + boss.getTypeAtak());
    }
}