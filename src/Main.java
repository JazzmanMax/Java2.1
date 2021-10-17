public class Main {
    public static void main(String[] args) {
        int ticketCost = 2500;
        int spent = 20;
        int milesBonus = 1;
        int miles;

        miles = ticketCost / spent * milesBonus;

        System.out.println("Количество начисленных миль за купленный билет - " + miles);
    }

}
