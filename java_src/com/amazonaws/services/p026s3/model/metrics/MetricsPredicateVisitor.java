package com.amazonaws.services.p026s3.model.metrics;
/* renamed from: com.amazonaws.services.s3.model.metrics.MetricsPredicateVisitor */
/* loaded from: classes3.dex */
public interface MetricsPredicateVisitor {
    void visit(MetricsAndOperator metricsAndOperator);

    void visit(MetricsPrefixPredicate metricsPrefixPredicate);

    void visit(MetricsTagPredicate metricsTagPredicate);
}
