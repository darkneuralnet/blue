package com.amazonaws.services.p026s3.model.lifecycle;
/* renamed from: com.amazonaws.services.s3.model.lifecycle.LifecyclePrefixPredicate */
/* loaded from: classes3.dex */
public final class LifecyclePrefixPredicate extends LifecycleFilterPredicate {
    private final String prefix;

    public LifecyclePrefixPredicate(String str) {
        this.prefix = str;
    }

    @Override // com.amazonaws.services.p026s3.model.lifecycle.LifecycleFilterPredicate
    public void accept(LifecyclePredicateVisitor lifecyclePredicateVisitor) {
        lifecyclePredicateVisitor.visit(this);
    }

    public String getPrefix() {
        return this.prefix;
    }
}
