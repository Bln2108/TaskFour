public class Main {
    public static void main(String[] args) {

        BonusService service = new BonusService();
        long actual1 = service.calculate(1000, true);
        int expected1 = 30;
        System.out.println("ОР: " + actual1 + "  ФР: " + expected1);

    }
}
