package com.stripe.android.financialconnections.features.institutionpicker;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class InstitutionPickerViewModel$logErrors$1 extends PropertyReference1Impl {
    public static final InstitutionPickerViewModel$logErrors$1 INSTANCE = new InstitutionPickerViewModel$logErrors$1();

    public InstitutionPickerViewModel$logErrors$1() {
        super(InstitutionPickerState.class, "payload", "getPayload()Lcom/airbnb/mvrx/Async;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((InstitutionPickerState) obj).getPayload();
    }
}
