package cic.cs.unb.ca.jnetpcap.model.feature;

/**
 *
 * @author ryuka
 */
public class FlagCountFeature {

    private int fin;
    private int syn;
    private int rst;
    private int psh;
    private int ack;
    private int ugr;
    private int cwr;
    private int ece;

    public FlagCountFeature(int fin, int syn, int rst, int psh, int ack, int ugr, int cwr, int ece) {
        this.fin = fin;
        this.syn = syn;
        this.rst = rst;
        this.psh = psh;
        this.ack = ack;
        this.ugr = ugr;
        this.cwr = cwr;
        this.ece = ece;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public int getSyn() {
        return syn;
    }

    public void setSyn(int syn) {
        this.syn = syn;
    }

    public int getRst() {
        return rst;
    }

    public void setRst(int rst) {
        this.rst = rst;
    }

    public int getPsh() {
        return psh;
    }

    public void setPsh(int psh) {
        this.psh = psh;
    }

    public int getAck() {
        return ack;
    }

    public void setAck(int ack) {
        this.ack = ack;
    }

    public int getUgr() {
        return ugr;
    }

    public void setUgr(int ugr) {
        this.ugr = ugr;
    }

    public int getCwr() {
        return cwr;
    }

    public void setCwr(int cwr) {
        this.cwr = cwr;
    }

    public int getEce() {
        return ece;
    }

    public void setEce(int ece) {
        this.ece = ece;
    }
}
