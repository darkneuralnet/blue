package com.stripe.android.financialconnections.features.manualentry;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class ManualEntryViewModel$observeAsyncs$3 extends PropertyReference1Impl {
    public static final ManualEntryViewModel$observeAsyncs$3 INSTANCE = new ManualEntryViewModel$observeAsyncs$3();

    public ManualEntryViewModel$observeAsyncs$3() {
        super(ManualEntryState.class, "linkPaymentAccount", "getLinkPaymentAccount()Lcom/airbnb/mvrx/Async;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((ManualEntryState) obj).getLinkPaymentAccount();
    }
}
