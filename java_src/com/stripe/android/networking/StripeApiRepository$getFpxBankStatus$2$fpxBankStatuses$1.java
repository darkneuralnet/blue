package com.stripe.android.networking;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeApiRepository$getFpxBankStatus$2$fpxBankStatuses$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ StripeApiRepository $this_runCatching;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$getFpxBankStatus$2$fpxBankStatuses$1(StripeApiRepository stripeApiRepository) {
        super(0);
        this.$this_runCatching = stripeApiRepository;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$this_runCatching.fireAnalyticsRequest(PaymentAnalyticsEvent.FpxBankStatusesRetrieve);
    }
}