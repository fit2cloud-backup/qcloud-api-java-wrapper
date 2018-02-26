package com.fit2cloud.qcloud.cvm.model;

/**
 * Created by linjinbo on 2018/2/2.
 */
public class MetricSet {
    private String namespace;//指标所在的名字空间, 如 qce/cvm
    private String metricName;//指标名称
    private String metricCname;//指标中文名称
    private String dimensions;//维度名称
    private int[] period;//支持的统计粒度，单个统计周期的时长，单位秒
    private String unit;//指标单位(null 表示无单位)
    private String unitCname;//指标单位中文名称(null 表示无单位)

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public String getMetricCname() {
        return metricCname;
    }

    public void setMetricCname(String metricCname) {
        this.metricCname = metricCname;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public int[] getPeriod() {
        return period;
    }

    public void setPeriod(int[] period) {
        this.period = period;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitCname() {
        return unitCname;
    }

    public void setUnitCname(String unitCname) {
        this.unitCname = unitCname;
    }

    @Override
    public String toString() {
        return "MetricSet{" +
                "namespace=" + namespace +
                ", metricName=" + metricName +
                ", metricCname=" + metricCname +
                ", dimensions=" + dimensions +
                ", period=" + period +
                ", unit=" + unit +
                ", unitCname=" + unitCname +
                '}';
    }
}
