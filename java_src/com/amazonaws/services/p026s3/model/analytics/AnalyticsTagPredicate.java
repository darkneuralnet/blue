package com.amazonaws.services.p026s3.model.analytics;

import com.amazonaws.services.p026s3.model.Tag;
/* renamed from: com.amazonaws.services.s3.model.analytics.AnalyticsTagPredicate */
/* loaded from: classes3.dex */
public final class AnalyticsTagPredicate extends AnalyticsFilterPredicate {
    private final Tag tag;

    public AnalyticsTagPredicate(Tag tag) {
        this.tag = tag;
    }

    @Override // com.amazonaws.services.p026s3.model.analytics.AnalyticsFilterPredicate
    public void accept(AnalyticsPredicateVisitor analyticsPredicateVisitor) {
        analyticsPredicateVisitor.visit(this);
    }

    public Tag getTag() {
        return this.tag;
    }
}
