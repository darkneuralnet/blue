package com.stripe.android.financialconnections.features.manualentrysuccess;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class ManualEntrySuccessViewModel$logErrors$1 extends PropertyReference1Impl {
    public static final ManualEntrySuccessViewModel$logErrors$1 INSTANCE = new ManualEntrySuccessViewModel$logErrors$1();

    public ManualEntrySuccessViewModel$logErrors$1() {
        super(ManualEntrySuccessState.class, "completeSession", "getCompleteSession()Lcom/airbnb/mvrx/Async;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((ManualEntrySuccessState) obj).getCompleteSession();
    }
}
