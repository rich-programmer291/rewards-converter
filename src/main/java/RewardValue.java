public class RewardValue {
    double cashValue;
    int miles;
    double rate = 0.0035;

    public RewardValue(double cV){
        cashValue = cV;
    }

    public RewardValue(int m){
        miles = m;
    }

    public int getMilesValue(){
        int newMiles = (int)(cashValue/rate);
        return newMiles;
    }

    public double getCashValue(){
        double cash = miles * rate;
        return cash;
    }

}
