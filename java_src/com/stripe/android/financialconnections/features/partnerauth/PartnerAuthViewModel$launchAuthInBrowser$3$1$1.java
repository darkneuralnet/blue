package com.stripe.android.financialconnections.features.partnerauth;

import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PartnerAuthViewModel$launchAuthInBrowser$3$1$1 extends Lambda implements Function1<PartnerAuthState, PartnerAuthState> {
    final /* synthetic */ String $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerAuthViewModel$launchAuthInBrowser$3$1$1(String str) {
        super(1);
        this.$it = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PartnerAuthState invoke(PartnerAuthState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return PartnerAuthState.copy$default(setState, null, new PartnerAuthState.ViewEffect.OpenPartnerAuth(this.$it), null, 5, null);
    }
}
