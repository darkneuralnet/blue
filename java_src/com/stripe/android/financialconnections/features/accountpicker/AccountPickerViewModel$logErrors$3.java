package com.stripe.android.financialconnections.features.accountpicker;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class AccountPickerViewModel$logErrors$3 extends PropertyReference1Impl {
    public static final AccountPickerViewModel$logErrors$3 INSTANCE = new AccountPickerViewModel$logErrors$3();

    public AccountPickerViewModel$logErrors$3() {
        super(AccountPickerState.class, "selectAccounts", "getSelectAccounts()Lcom/airbnb/mvrx/Async;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((AccountPickerState) obj).getSelectAccounts();
    }
}
