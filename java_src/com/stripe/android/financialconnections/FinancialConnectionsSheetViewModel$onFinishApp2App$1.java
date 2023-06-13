package com.stripe.android.financialconnections;

import android.net.Uri;
import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewEffect;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetViewModel$onFinishApp2App$1 extends Lambda implements Function1<FinancialConnectionsSheetState, FinancialConnectionsSheetState> {
    final /* synthetic */ Uri $receivedUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetViewModel$onFinishApp2App$1(Uri uri) {
        super(1);
        this.$receivedUrl = uri;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FinancialConnectionsSheetState invoke(FinancialConnectionsSheetState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        FinancialConnectionsSessionManifest manifest = setState.getManifest();
        Intrinsics.checkNotNull(manifest);
        String hostedAuthUrl = manifest.getHostedAuthUrl();
        String fragment = this.$receivedUrl.getFragment();
        return FinancialConnectionsSheetState.copy$default(setState, null, false, null, FinancialConnectionsSheetState.AuthFlowStatus.INTERMEDIATE_DEEPLINK, new FinancialConnectionsSheetViewEffect.OpenAuthFlowWithUrl(hostedAuthUrl + "&startPolling=true&" + fragment), 5, null);
    }
}
