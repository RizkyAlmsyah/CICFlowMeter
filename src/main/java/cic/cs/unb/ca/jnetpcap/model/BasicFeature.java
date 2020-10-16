package cic.cs.unb.ca.jnetpcap.model;

/**
 *
 * @author ryuka
 */
public class BasicFeature {
    
    private String  flow_id;
    private String  src_ip;
    private long    src_port;
    private String  dst_ip;
    private long    dst_port;
    private long    protocol;
    private String  timestamp;
    private String  label;
    
    private ExtractFeature extractFeature;

    public BasicFeature() {
    }

    public String getFlow_id() {
        return flow_id;
    }

    public void setFlow_id(String flow_id) {
        this.flow_id = flow_id;
    }

    public String getSrc_ip() {
        return src_ip;
    }

    public void setSrc_ip(String src_ip) {
        this.src_ip = src_ip;
    }

    public long getSrc_port() {
        return src_port;
    }

    public void setSrc_port(long src_port) {
        this.src_port = src_port;
    }

    public String getDst_ip() {
        return dst_ip;
    }

    public void setDst_ip(String dst_ip) {
        this.dst_ip = dst_ip;
    }

    public long getDst_port() {
        return dst_port;
    }

    public void setDst_port(long dst_port) {
        this.dst_port = dst_port;
    }

    public long getProtocol() {
        return protocol;
    }

    public void setProtocol(long protocol) {
        this.protocol = protocol;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ExtractFeature getExtractFeature() {
        return extractFeature;
    }

    public void setExtractFeature(ExtractFeature extractFeature) {
        this.extractFeature = extractFeature;
    }
}
