package com.stripe.android.financialconnections.features.accountpicker;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class AccountPickerViewModel$logErrors$1 extends PropertyReference1Impl {
    public static final AccountPickerViewModel$logErrors$1 INSTANCE = new AccountPickerViewModel$logErrors$1();

    public AccountPickerViewModel$logErrors$1() {
        super(AccountPickerState.class, "payload", "getPayload()Lcom/airbnb/mvrx/Async;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((AccountPickerState) obj).getPayload();
    }
}
