package com.stripe.android.financialconnections.features.partnerauth;

import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PartnerAuthScreenKt$PartnerAuthScreen$webAuthFlow$1 extends Lambda implements Function1<FinancialConnectionsSheetNativeState, AbstractC19862dp<? extends String>> {
    public static final PartnerAuthScreenKt$PartnerAuthScreen$webAuthFlow$1 INSTANCE = new PartnerAuthScreenKt$PartnerAuthScreen$webAuthFlow$1();

    public PartnerAuthScreenKt$PartnerAuthScreen$webAuthFlow$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AbstractC19862dp<String> invoke(FinancialConnectionsSheetNativeState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getWebAuthFlow();
    }
}
