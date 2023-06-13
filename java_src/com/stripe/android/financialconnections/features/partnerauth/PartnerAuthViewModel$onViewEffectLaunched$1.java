package com.stripe.android.financialconnections.features.partnerauth;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PartnerAuthViewModel$onViewEffectLaunched$1 extends Lambda implements Function1<PartnerAuthState, PartnerAuthState> {
    public static final PartnerAuthViewModel$onViewEffectLaunched$1 INSTANCE = new PartnerAuthViewModel$onViewEffectLaunched$1();

    public PartnerAuthViewModel$onViewEffectLaunched$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final PartnerAuthState invoke(PartnerAuthState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return PartnerAuthState.copy$default(setState, null, null, null, 5, null);
    }
}
