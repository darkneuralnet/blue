package com.stripe.android.financialconnections.p041ui;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$onCreate$3$1$1$1$firstPane$1 */
/* loaded from: classes7.dex */
public final class C18925x9518909d extends Lambda implements Function1<FinancialConnectionsSheetNativeState, FinancialConnectionsSessionManifest.Pane> {
    public static final C18925x9518909d INSTANCE = new C18925x9518909d();

    public C18925x9518909d() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FinancialConnectionsSessionManifest.Pane invoke(FinancialConnectionsSheetNativeState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getInitialPane();
    }
}
