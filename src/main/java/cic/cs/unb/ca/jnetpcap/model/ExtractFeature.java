package cic.cs.unb.ca.jnetpcap.model;

import cic.cs.unb.ca.jnetpcap.model.feature.FlagCountFeature;
import cic.cs.unb.ca.jnetpcap.model.feature.StatisticsPacket;
import cic.cs.unb.ca.jnetpcap.model.feature.AvgBulkFeature;
import cic.cs.unb.ca.jnetpcap.model.feature.SubFlowFeature;
import cic.cs.unb.ca.jnetpcap.model.feature.TotalPacketFeature;

/**
 *
 * @author ryuka
 */
public class ExtractFeature { 
    private long flow_duration;

    private TotalPacketFeature totalPacketFeature;
    
    private StatisticsPacket fwd_packet_length;
    private StatisticsPacket bwd_packet_length;

    private double flow_bytes_per_second;
    private double flow_pkts_per_second;
    
    private StatisticsPacket flow_IAT;
    
    private StatisticsPacket fwd_IAT;    
    private double fwd_IAT_total;
    
    private StatisticsPacket bwd_IAT;    
    private double bwd_IAT_total;

    private double fwd_PSH_flags;
    private double bwd_PSH_flags;
    private double fwd_URG_flags;
    private double bwd_URG_flags;
    private double fwd_header_length;
    private double bwd_header_length;
    private double fwd_packets_per_second;
    private double bwd_packets_per_second;
    
    private StatisticsPacket packet_lenght;
    private double packet_length_variance;

    public FlagCountFeature flagCount;
    
    private double download_upload_ratio;
    private double average_packet_size;
    private double fwd_segment_size_avg;
    private double bwd_segment_size_avg;
    
    private AvgBulkFeature fwd_bulk;
    private AvgBulkFeature bwd_bulk;

    private SubFlowFeature fwd_subflow;
    private SubFlowFeature bwd_subflow;

    private long fwd_win_bytes;
    private long bwd_win_bytes;
    private long fwd_act_data_pkts;
    private long fwd_seg_size_min;

    public StatisticsPacket ActivePacket;

    public StatisticsPacket IdlePacket;

    public long getFlow_duration() {
        return flow_duration;
    }

    public void setFlow_duration(long flow_duration) {
        this.flow_duration = flow_duration;
    }

    public TotalPacketFeature getTotalPacketFeature() {
        return totalPacketFeature;
    }

    public void setTotalPacketFeature(TotalPacketFeature totalPacketFeature) {
        this.totalPacketFeature = totalPacketFeature;
    }

    public StatisticsPacket getFwd_packet_length() {
        return fwd_packet_length;
    }

    public void setFwd_packet_length(StatisticsPacket fwd_packet_length) {
        this.fwd_packet_length = fwd_packet_length;
    }

    public StatisticsPacket getBwd_packet_length() {
        return bwd_packet_length;
    }

    public void setBwd_packet_length(StatisticsPacket bwd_packet_length) {
        this.bwd_packet_length = bwd_packet_length;
    }

    public double getFlow_bytes_per_second() {
        return flow_bytes_per_second;
    }

    public void setFlow_bytes_per_second(double flow_bytes_per_second) {
        this.flow_bytes_per_second = flow_bytes_per_second;
    }

    public double getFlow_pkts_per_second() {
        return flow_pkts_per_second;
    }

    public void setFlow_pkts_per_second(double flow_pkts_per_second) {
        this.flow_pkts_per_second = flow_pkts_per_second;
    }

    public StatisticsPacket getFlow_IAT() {
        return flow_IAT;
    }

    public void setFlow_IAT(StatisticsPacket flow_IAT) {
        this.flow_IAT = flow_IAT;
    }

    public StatisticsPacket getFwd_IAT() {
        return fwd_IAT;
    }

    public void setFwd_IAT(StatisticsPacket fwd_IAT) {
        this.fwd_IAT = fwd_IAT;
    }

    public double getFwd_IAT_total() {
        return fwd_IAT_total;
    }

    public void setFwd_IAT_total(double fwd_IAT_total) {
        this.fwd_IAT_total = fwd_IAT_total;
    }

    public StatisticsPacket getBwd_IAT() {
        return bwd_IAT;
    }

    public void setBwd_IAT(StatisticsPacket bwd_IAT) {
        this.bwd_IAT = bwd_IAT;
    }

    public double getBwd_IAT_total() {
        return bwd_IAT_total;
    }

    public void setBwd_IAT_total(double bwd_IAT_total) {
        this.bwd_IAT_total = bwd_IAT_total;
    }

    public double getFwd_PSH_flags() {
        return fwd_PSH_flags;
    }

    public void setFwd_PSH_flags(double fwd_PSH_flags) {
        this.fwd_PSH_flags = fwd_PSH_flags;
    }

    public double getBwd_PSH_flags() {
        return bwd_PSH_flags;
    }

    public void setBwd_PSH_flags(double bwd_PSH_flags) {
        this.bwd_PSH_flags = bwd_PSH_flags;
    }

    public double getFwd_URG_flags() {
        return fwd_URG_flags;
    }

    public void setFwd_URG_flags(double fwd_URG_flags) {
        this.fwd_URG_flags = fwd_URG_flags;
    }

    public double getBwd_URG_flags() {
        return bwd_URG_flags;
    }

    public void setBwd_URG_flags(double bwd_URG_flags) {
        this.bwd_URG_flags = bwd_URG_flags;
    }

    public double getFwd_header_length() {
        return fwd_header_length;
    }

    public void setFwd_header_length(double fwd_header_length) {
        this.fwd_header_length = fwd_header_length;
    }

    public double getBwd_header_length() {
        return bwd_header_length;
    }

    public void setBwd_header_length(double bwd_header_length) {
        this.bwd_header_length = bwd_header_length;
    }

    public double getFwd_packets_per_second() {
        return fwd_packets_per_second;
    }

    public void setFwd_packets_per_second(double fwd_packets_per_second) {
        this.fwd_packets_per_second = fwd_packets_per_second;
    }

    public double getBwd_packets_per_second() {
        return bwd_packets_per_second;
    }

    public void setBwd_packets_per_second(double bwd_packets_per_second) {
        this.bwd_packets_per_second = bwd_packets_per_second;
    }

    public StatisticsPacket getPacket_lenght() {
        return packet_lenght;
    }

    public void setPacket_lenght(StatisticsPacket packet_lenght) {
        this.packet_lenght = packet_lenght;
    }

    public double getPacket_length_variance() {
        return packet_length_variance;
    }

    public void setPacket_length_variance(double packet_length_variance) {
        this.packet_length_variance = packet_length_variance;
    }

    public FlagCountFeature getFlagCount() {
        return flagCount;
    }

    public void setFlagCount(FlagCountFeature flagCount) {
        this.flagCount = flagCount;
    }

    public double getDownload_upload_ratio() {
        return download_upload_ratio;
    }

    public void setDownload_upload_ratio(double download_upload_ratio) {
        this.download_upload_ratio = download_upload_ratio;
    }

    public double getAverage_packet_size() {
        return average_packet_size;
    }

    public void setAverage_packet_size(double average_packet_size) {
        this.average_packet_size = average_packet_size;
    }

    public double getFwd_segment_size_avg() {
        return fwd_segment_size_avg;
    }

    public void setFwd_segment_size_avg(double fwd_segment_size_avg) {
        this.fwd_segment_size_avg = fwd_segment_size_avg;
    }

    public double getBwd_segment_size_avg() {
        return bwd_segment_size_avg;
    }

    public void setBwd_segment_size_avg(double bwd_segment_size_avg) {
        this.bwd_segment_size_avg = bwd_segment_size_avg;
    }

    public AvgBulkFeature getFwd_bulk() {
        return fwd_bulk;
    }

    public void setFwd_bulk(AvgBulkFeature fwd_bulk) {
        this.fwd_bulk = fwd_bulk;
    }

    public AvgBulkFeature getBwd_bulk() {
        return bwd_bulk;
    }

    public void setBwd_bulk(AvgBulkFeature bwd_bulk) {
        this.bwd_bulk = bwd_bulk;
    }

    public SubFlowFeature getFwd_subflow() {
        return fwd_subflow;
    }

    public void setFwd_subflow(SubFlowFeature fwd_subflow) {
        this.fwd_subflow = fwd_subflow;
    }

    public SubFlowFeature getBwd_subflow() {
        return bwd_subflow;
    }

    public void setBwd_subflow(SubFlowFeature bwd_subflow) {
        this.bwd_subflow = bwd_subflow;
    }

    public long getFwd_win_bytes() {
        return fwd_win_bytes;
    }

    public void setFwd_win_bytes(long fwd_win_bytes) {
        this.fwd_win_bytes = fwd_win_bytes;
    }

    public long getBwd_win_bytes() {
        return bwd_win_bytes;
    }

    public void setBwd_win_bytes(long bwd_win_bytes) {
        this.bwd_win_bytes = bwd_win_bytes;
    }

    public long getFwd_act_data_pkts() {
        return fwd_act_data_pkts;
    }

    public void setFwd_act_data_pkts(long fwd_act_data_pkts) {
        this.fwd_act_data_pkts = fwd_act_data_pkts;
    }

    public long getFwd_seg_size_min() {
        return fwd_seg_size_min;
    }

    public void setFwd_seg_size_min(long fwd_seg_size_min) {
        this.fwd_seg_size_min = fwd_seg_size_min;
    }

    public StatisticsPacket getActivePacket() {
        return ActivePacket;
    }

    public void setActivePacket(StatisticsPacket ActivePacket) {
        this.ActivePacket = ActivePacket;
    }

    public StatisticsPacket getIdlePacket() {
        return IdlePacket;
    }

    public void setIdlePacket(StatisticsPacket IdlePacket) {
        this.IdlePacket = IdlePacket;
    }
}
