package com.stripe.android.view;

import com.stripe.android.Stripe;
import com.stripe.android.core.networking.StripeClientUserAgentHeaderFactory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentAuthWebViewActivityViewModel$extraHeaders$2 extends Lambda implements Function0<Map<String, ? extends String>> {
    public static final PaymentAuthWebViewActivityViewModel$extraHeaders$2 INSTANCE = new PaymentAuthWebViewActivityViewModel$extraHeaders$2();

    public PaymentAuthWebViewActivityViewModel$extraHeaders$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends String> invoke() {
        return new StripeClientUserAgentHeaderFactory(null, 1, null).create(Stripe.Companion.getAppInfo());
    }
}
