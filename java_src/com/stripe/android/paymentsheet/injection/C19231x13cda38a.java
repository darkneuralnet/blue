package com.stripe.android.paymentsheet.injection;

import java.util.Set;
/* renamed from: com.stripe.android.paymentsheet.injection.PaymentSheetLauncherModule_Companion_ProvideProductUsageTokensFactory */
/* loaded from: classes7.dex */
public final class C19231x13cda38a implements InterfaceC48812sj1<Set<String>> {

    /* renamed from: com.stripe.android.paymentsheet.injection.PaymentSheetLauncherModule_Companion_ProvideProductUsageTokensFactory$InstanceHolder */
    /* loaded from: classes7.dex */
    public static final class InstanceHolder {
        private static final C19231x13cda38a INSTANCE = new C19231x13cda38a();

        private InstanceHolder() {
        }
    }

    public static C19231x13cda38a create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<String> provideProductUsageTokens() {
        return (Set) C51679xZ3.m5002e(PaymentSheetLauncherModule.Companion.provideProductUsageTokens());
    }

    @Override // p000.Y94
    public Set<String> get() {
        return provideProductUsageTokens();
    }
}
