public class Guest {
    
    private int funds;

    public Guest() {
        // Assume all guests have £50 of funds.
        this.funds = 50;
    }

    public boolean makePayment(int rate) {
        if(this.funds >= rate){
            this.funds -=rate;
            return true;
        }
        return false;
    }

    public int getFunds() {
        return funds;
    }
}
