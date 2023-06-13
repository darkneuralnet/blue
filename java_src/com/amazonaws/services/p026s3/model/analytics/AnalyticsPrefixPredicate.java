package com.amazonaws.services.p026s3.model.analytics;
/* renamed from: com.amazonaws.services.s3.model.analytics.AnalyticsPrefixPredicate */
/* loaded from: classes3.dex */
public final class AnalyticsPrefixPredicate extends AnalyticsFilterPredicate {
    private final String prefix;

    public AnalyticsPrefixPredicate(String str) {
        this.prefix = str;
    }

    @Override // com.amazonaws.services.p026s3.model.analytics.AnalyticsFilterPredicate
    public void accept(AnalyticsPredicateVisitor analyticsPredicateVisitor) {
        analyticsPredicateVisitor.visit(this);
    }

    public String getPrefix() {
        return this.prefix;
    }
}
