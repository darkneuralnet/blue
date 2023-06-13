package com.stripe.android.financialconnections;

import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewEffect;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetViewModel$openAuthFlow$3 extends Lambda implements Function1<FinancialConnectionsSheetState, FinancialConnectionsSheetState> {
    final /* synthetic */ FinancialConnectionsSheetState.AuthFlowStatus $authFlowStatus;
    final /* synthetic */ FinancialConnectionsSessionManifest $manifest;
    final /* synthetic */ boolean $nativeAuthFlowEnabled;
    final /* synthetic */ SynchronizeSessionResponse $sync;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetViewModel$openAuthFlow$3(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, FinancialConnectionsSheetState.AuthFlowStatus authFlowStatus, boolean z, SynchronizeSessionResponse synchronizeSessionResponse) {
        super(1);
        this.$manifest = financialConnectionsSessionManifest;
        this.$authFlowStatus = authFlowStatus;
        this.$nativeAuthFlowEnabled = z;
        this.$sync = synchronizeSessionResponse;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FinancialConnectionsSheetState invoke(FinancialConnectionsSheetState setState) {
        FinancialConnectionsSheetViewEffect openAuthFlowWithUrl;
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest = this.$manifest;
        FinancialConnectionsSheetState.AuthFlowStatus authFlowStatus = this.$authFlowStatus;
        if (this.$nativeAuthFlowEnabled) {
            openAuthFlowWithUrl = new FinancialConnectionsSheetViewEffect.OpenNativeAuthFlow(setState.getInitialArgs().getConfiguration(), this.$sync);
        } else {
            openAuthFlowWithUrl = new FinancialConnectionsSheetViewEffect.OpenAuthFlowWithUrl(this.$manifest.getHostedAuthUrl());
        }
        return FinancialConnectionsSheetState.copy$default(setState, null, false, financialConnectionsSessionManifest, authFlowStatus, openAuthFlowWithUrl, 3, null);
    }
}
