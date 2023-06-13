package com.stripe.android.financialconnections.features.manualentry;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ManualEntryViewModel$onAccountEntered$1 extends Lambda implements Function1<ManualEntryState, ManualEntryState> {
    final /* synthetic */ String $filteredInput;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualEntryViewModel$onAccountEntered$1(String str) {
        super(1);
        this.$filteredInput = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ManualEntryState invoke(ManualEntryState setState) {
        ManualEntryState copy;
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        copy = setState.copy((r18 & 1) != 0 ? setState.payload : null, (r18 & 2) != 0 ? setState.routing : null, (r18 & 4) != 0 ? setState.account : this.$filteredInput, (r18 & 8) != 0 ? setState.accountConfirm : null, (r18 & 16) != 0 ? setState.routingError : null, (r18 & 32) != 0 ? setState.accountError : null, (r18 & 64) != 0 ? setState.accountConfirmError : null, (r18 & 128) != 0 ? setState.linkPaymentAccount : null);
        return copy;
    }
}
