package com.stripe.android.financialconnections.p040di;
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetSharedModule_ProvidesJson$financial_connections_releaseFactory */
/* loaded from: classes7.dex */
public final class C18655x886d97d2 implements InterfaceC48812sj1<AbstractC38706bi2> {

    /* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetSharedModule_ProvidesJson$financial_connections_releaseFactory$InstanceHolder */
    /* loaded from: classes7.dex */
    public static final class InstanceHolder {
        private static final C18655x886d97d2 INSTANCE = new C18655x886d97d2();

        private InstanceHolder() {
        }
    }

    public static C18655x886d97d2 create() {
        return InstanceHolder.INSTANCE;
    }

    public static AbstractC38706bi2 providesJson$financial_connections_release() {
        return (AbstractC38706bi2) C51679xZ3.m5002e(FinancialConnectionsSheetSharedModule.INSTANCE.providesJson$financial_connections_release());
    }

    @Override // p000.Y94
    public AbstractC38706bi2 get() {
        return providesJson$financial_connections_release();
    }
}
