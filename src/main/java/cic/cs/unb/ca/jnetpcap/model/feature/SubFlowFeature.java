package cic.cs.unb.ca.jnetpcap.model.feature;

/**
 *
 * @author ryuka
 */
public class SubFlowFeature {
    
    private long subflow_packets;
    private long subflow_bytes;

    public SubFlowFeature(long subflow_packets, long subflow_bytes) {
        this.subflow_packets = subflow_packets;
        this.subflow_bytes = subflow_bytes;
    }

    public long getSubflow_packets() {
        return subflow_packets;
    }

    public void setSubflow_packets(long subflow_packets) {
        this.subflow_packets = subflow_packets;
    }

    public long getSubflow_bytes() {
        return subflow_bytes;
    }

    public void setSubflow_bytes(long subflow_bytes) {
        this.subflow_bytes = subflow_bytes;
    }
    
    
}
