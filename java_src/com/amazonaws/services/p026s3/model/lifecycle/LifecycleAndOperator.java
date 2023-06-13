package com.amazonaws.services.p026s3.model.lifecycle;

import java.util.List;
/* renamed from: com.amazonaws.services.s3.model.lifecycle.LifecycleAndOperator */
/* loaded from: classes3.dex */
public final class LifecycleAndOperator extends LifecycleNAryOperator {
    public LifecycleAndOperator(List<LifecycleFilterPredicate> list) {
        super(list);
    }

    @Override // com.amazonaws.services.p026s3.model.lifecycle.LifecycleFilterPredicate
    public void accept(LifecyclePredicateVisitor lifecyclePredicateVisitor) {
        lifecyclePredicateVisitor.visit(this);
    }

    @Override // com.amazonaws.services.p026s3.model.lifecycle.LifecycleNAryOperator
    public /* bridge */ /* synthetic */ List getOperands() {
        return super.getOperands();
    }
}
