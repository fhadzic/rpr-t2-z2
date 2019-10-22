package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    private double pocetak;
    private double kraj;
    boolean daLiPripadaPocetak;
    boolean daLiPripadaKraj;


    public Interval(double pocetak, double kraj, boolean daLiPripadaPocetak, boolean daLiPripadaKraj) {

        if( pocetak > kraj ) throw new IllegalArgumentException("");

        this.pocetak = pocetak;
        this.kraj = kraj;

    }

    public Interval() {

        this.pocetak = 0;
        this.kraj = 0;

    }

    public boolean isNull(){
        if(pocetak == 0 && kraj == 0){
            return true;
        }
        return false;
    }
// moje
    public boolean isIn(double v) {
        return false;
    }

    public Interval intersect(Interval interval) {
        return null;
    }

    public static Interval intersect(Interval i, Interval i2) {
        return null;
    }
}
