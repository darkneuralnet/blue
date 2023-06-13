package com.amazonaws.services.p026s3.model.analytics;
/* renamed from: com.amazonaws.services.s3.model.analytics.AnalyticsPredicateVisitor */
/* loaded from: classes3.dex */
public interface AnalyticsPredicateVisitor {
    void visit(AnalyticsAndOperator analyticsAndOperator);

    void visit(AnalyticsPrefixPredicate analyticsPrefixPredicate);

    void visit(AnalyticsTagPredicate analyticsTagPredicate);
}
