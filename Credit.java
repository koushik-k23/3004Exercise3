public class Credit implements PaymentStrategy{

    @Override
    public int pay(Pizza p, int val) {

        if(p.cost>val){
            System.out.println("Pizza successfully ordered! Please keep in mind that you owe more money than how much you have in the bank. You have a balance of:");
            System.out.println(val-p.cost);
        }
        else{
            System.out.println("Pizza successfully ordered! Your balance is:");
            System.out.println(val-p.cost);
        }
        return val-p.cost;
    }
}
