package com.amazonaws.services.p026s3.model.lifecycle;

import java.io.Serializable;
/* renamed from: com.amazonaws.services.s3.model.lifecycle.LifecycleFilterPredicate */
/* loaded from: classes3.dex */
public abstract class LifecycleFilterPredicate implements Serializable {
    public abstract void accept(LifecyclePredicateVisitor lifecyclePredicateVisitor);
}
