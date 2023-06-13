package com.stripe.android.financialconnections.features.manualentry;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class ManualEntryViewModel$observeInputs$5 extends PropertyReference1Impl {
    public static final ManualEntryViewModel$observeInputs$5 INSTANCE = new ManualEntryViewModel$observeInputs$5();

    public ManualEntryViewModel$observeInputs$5() {
        super(ManualEntryState.class, "routing", "getRouting()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((ManualEntryState) obj).getRouting();
    }
}
