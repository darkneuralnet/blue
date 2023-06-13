package com.stripe.android.financialconnections.features.success;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class SuccessViewModel$observeAsyncs$4 extends PropertyReference1Impl {
    public static final SuccessViewModel$observeAsyncs$4 INSTANCE = new SuccessViewModel$observeAsyncs$4();

    public SuccessViewModel$observeAsyncs$4() {
        super(SuccessState.class, "completeSession", "getCompleteSession()Lcom/airbnb/mvrx/Async;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((SuccessState) obj).getCompleteSession();
    }
}
