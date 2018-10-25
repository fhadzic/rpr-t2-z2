package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    private double pocetak;
    private double kraj;
    boolean daLiPripadaPocetak;
    boolean daLiPripadaKraj;


    public Interval(double pocetak, double kraj, boolean daLiPripadaPocetak, boolean daLiPripadaKraj) {

        if( pocetak > kraj ) throw IllegalArgumentException

        this.pocetak = pocetak;
        this.kraj = kraj;

    }

    public Interval() {

        this.pocetak = 0;
        this.kraj = 0;

    }

    public isNull(){
        if(pocetak == 0 && kraj == 0){
            return true;
        }
        return false;
    }

}
