package com.amazonaws.services.p026s3.model.metrics;

import java.io.Serializable;
/* renamed from: com.amazonaws.services.s3.model.metrics.MetricsConfiguration */
/* loaded from: classes3.dex */
public class MetricsConfiguration implements Serializable {
    private MetricsFilter filter;

    /* renamed from: id */
    private String f68605id;

    public MetricsFilter getFilter() {
        return this.filter;
    }

    public String getId() {
        return this.f68605id;
    }

    public void setFilter(MetricsFilter metricsFilter) {
        this.filter = metricsFilter;
    }

    public void setId(String str) {
        this.f68605id = str;
    }

    public MetricsConfiguration withFilter(MetricsFilter metricsFilter) {
        setFilter(metricsFilter);
        return this;
    }

    public MetricsConfiguration withId(String str) {
        setId(str);
        return this;
    }
}
