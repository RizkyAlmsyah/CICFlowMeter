package cic.cs.unb.ca.jnetpcap.model.feature;

/**
 *
 * @author ryuka
 */
public class AvgBulkFeature {
    
    private long bytes_per_bulk;
    private long packet_per_bulk;
    private long bulk_rate;

    public AvgBulkFeature(long bytes_per_bulk, long packet_per_bulk, long bulk_rate) {
        this.bytes_per_bulk = bytes_per_bulk;
        this.packet_per_bulk = packet_per_bulk;
        this.bulk_rate = bulk_rate;
    }

    public long getBytes_per_bulk() {
        return bytes_per_bulk;
    }

    public void setBytes_per_bulk(long bytes_per_bulk) {
        this.bytes_per_bulk = bytes_per_bulk;
    }

    public long getPacket_per_bulk() {
        return packet_per_bulk;
    }

    public void setPacket_per_bulk(long packet_per_bulk) {
        this.packet_per_bulk = packet_per_bulk;
    }

    public long getBulk_rate() {
        return bulk_rate;
    }

    public void setBulk_rate(long bulk_rate) {
        this.bulk_rate = bulk_rate;
    }
}
