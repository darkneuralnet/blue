package com.amazonaws.services.p026s3.model.metrics;

import java.util.List;
/* renamed from: com.amazonaws.services.s3.model.metrics.MetricsAndOperator */
/* loaded from: classes3.dex */
public final class MetricsAndOperator extends MetricsNAryOperator {
    public MetricsAndOperator(List<MetricsFilterPredicate> list) {
        super(list);
    }

    @Override // com.amazonaws.services.p026s3.model.metrics.MetricsFilterPredicate
    public void accept(MetricsPredicateVisitor metricsPredicateVisitor) {
        metricsPredicateVisitor.visit(this);
    }

    @Override // com.amazonaws.services.p026s3.model.metrics.MetricsNAryOperator
    public /* bridge */ /* synthetic */ List getOperands() {
        return super.getOperands();
    }
}
