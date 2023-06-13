package com.stripe.android.financialconnections.p041ui;

import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$onCreate$3$1$1$1$showCloseDialog$1 */
/* loaded from: classes7.dex */
public final class C18927x5b0b97c8 extends Lambda implements Function1<FinancialConnectionsSheetNativeState, Boolean> {
    public static final C18927x5b0b97c8 INSTANCE = new C18927x5b0b97c8();

    public C18927x5b0b97c8() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(FinancialConnectionsSheetNativeState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.getShowCloseDialog());
    }
}
