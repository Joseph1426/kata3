package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram histogram = new Histogram ();
        histogram.increment("gmail.com", 12);
        histogram.increment("ulpgc.es", 8);
        histogram.increment("ull.es",3);
        histogram.increment("hotmail.com", 1);
        new HistogramDisplay(histogram).execute();
    }
    
}
