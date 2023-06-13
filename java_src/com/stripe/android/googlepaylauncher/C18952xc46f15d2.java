package com.stripe.android.googlepaylauncher;

import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel$Factory$fallbackInitialize$2 */
/* loaded from: classes7.dex */
public final class C18952xc46f15d2 extends Lambda implements Function0<String> {
    final /* synthetic */ GooglePayPaymentMethodLauncherViewModel.Factory.FallbackInjectionParams $arg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18952xc46f15d2(GooglePayPaymentMethodLauncherViewModel.Factory.FallbackInjectionParams fallbackInjectionParams) {
        super(0);
        this.$arg = fallbackInjectionParams;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return this.$arg.getStripeAccountId();
    }
}
