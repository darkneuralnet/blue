package com.stripe.android.core.networking;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/core/networking/StripeResponse;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class DefaultStripeNetworkClient$executeRequest$2 extends Lambda implements Function0<StripeResponse<String>> {
    final /* synthetic */ StripeRequest $request;
    final /* synthetic */ DefaultStripeNetworkClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStripeNetworkClient$executeRequest$2(DefaultStripeNetworkClient defaultStripeNetworkClient, StripeRequest stripeRequest) {
        super(0);
        this.this$0 = defaultStripeNetworkClient;
        this.$request = stripeRequest;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final StripeResponse<String> invoke() {
        StripeResponse<String> makeRequest;
        makeRequest = this.this$0.makeRequest(this.$request);
        return makeRequest;
    }
}
