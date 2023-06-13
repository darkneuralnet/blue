package com.amazonaws.services.p026s3.model.analytics;

import java.util.List;
/* renamed from: com.amazonaws.services.s3.model.analytics.AnalyticsNAryOperator */
/* loaded from: classes3.dex */
abstract class AnalyticsNAryOperator extends AnalyticsFilterPredicate {
    private final List<AnalyticsFilterPredicate> operands;

    public AnalyticsNAryOperator(List<AnalyticsFilterPredicate> list) {
        this.operands = list;
    }

    public List<AnalyticsFilterPredicate> getOperands() {
        return this.operands;
    }
}
