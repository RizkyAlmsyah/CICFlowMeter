package cic.cs.unb.ca.jnetpcap.model.feature;

/**
 *
 * @author ryuka
 */
public class TotalPacketFeature {

    private long forward;
    private double length_of_forward;
    private long backward;
    private double length_of_backward;

    public TotalPacketFeature(long forward, double length_of_forward, long backward, double length_of_backward) {
        this.forward = forward;
        this.length_of_forward = length_of_forward;
        this.backward = backward;
        this.length_of_backward = length_of_backward;
    }

    public long getForward() {
        return forward;
    }

    public void setForward(long forward) {
        this.forward = forward;
    }

    public double getLength_of_forward() {
        return length_of_forward;
    }

    public void setLength_of_forward(double length_of_forward) {
        this.length_of_forward = length_of_forward;
    }

    public long getBackward() {
        return backward;
    }

    public void setBackward(long backward) {
        this.backward = backward;
    }

    public double getLength_of_backward() {
        return length_of_backward;
    }

    public void setLength_of_backward(double length_of_backward) {
        this.length_of_backward = length_of_backward;
    }
}
