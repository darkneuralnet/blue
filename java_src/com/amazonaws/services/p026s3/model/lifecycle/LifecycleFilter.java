package com.amazonaws.services.p026s3.model.lifecycle;

import java.io.Serializable;
/* renamed from: com.amazonaws.services.s3.model.lifecycle.LifecycleFilter */
/* loaded from: classes3.dex */
public class LifecycleFilter implements Serializable {
    private LifecycleFilterPredicate predicate;

    public LifecycleFilter() {
    }

    public LifecycleFilterPredicate getPredicate() {
        return this.predicate;
    }

    public void setPredicate(LifecycleFilterPredicate lifecycleFilterPredicate) {
        this.predicate = lifecycleFilterPredicate;
    }

    public LifecycleFilter withPredicate(LifecycleFilterPredicate lifecycleFilterPredicate) {
        setPredicate(lifecycleFilterPredicate);
        return this;
    }

    public LifecycleFilter(LifecycleFilterPredicate lifecycleFilterPredicate) {
        this.predicate = lifecycleFilterPredicate;
    }
}
