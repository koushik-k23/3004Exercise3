public class Debit implements PaymentStrategy {


    @Override
    public int pay(Pizza p, int val) {

        if(p.cost>val){
            System.out.println("You do not have enough money to pay for this pizza as you cannot go negative on a debit card. Hence, your order declined. Your Total Balance is:");
            System.out.println(val);
        }
        else{
            System.out.println("Pizza successfully ordered! Your balance is:");
            System.out.println(val-p.cost);
        }
        return val-p.cost;
    }
}
