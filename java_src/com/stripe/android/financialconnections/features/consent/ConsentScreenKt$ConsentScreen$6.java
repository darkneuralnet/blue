package com.stripe.android.financialconnections.features.consent;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ConsentScreenKt$ConsentScreen$6 extends Lambda implements Function0<Unit> {
    final /* synthetic */ FinancialConnectionsSheetNativeViewModel $parentViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentScreenKt$ConsentScreen$6(FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel) {
        super(0);
        this.$parentViewModel = financialConnectionsSheetNativeViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$parentViewModel.onCloseNoConfirmationClick(FinancialConnectionsSessionManifest.Pane.CONSENT);
    }
}
