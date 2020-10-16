package cic.cs.unb.ca.jnetpcap.model.feature;

/**
 *
 * @author ryuka
 */
public class StatisticsPacket {

    private double max;
    private double min;
    private double mean;
    private double std;

    public StatisticsPacket(double max, double min, double mean, double std) {
        this.max = max;
        this.min = min;
        this.mean = mean;
        this.std = std;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public double getStd() {
        return std;
    }

    public void setStd(double std) {
        this.std = std;
    }

}
