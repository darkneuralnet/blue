package com.stripe.android.googlepaylauncher;

import com.stripe.android.googlepaylauncher.StripeGooglePayViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LOr6;", "T", "", "invoke", "()Ljava/lang/String;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class StripeGooglePayViewModel$Factory$create$1 extends Lambda implements Function0<String> {
    final /* synthetic */ StripeGooglePayViewModel.Factory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeGooglePayViewModel$Factory$create$1(StripeGooglePayViewModel.Factory factory) {
        super(0);
        this.this$0 = factory;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String str;
        str = this.this$0.publishableKey;
        return str;
    }
}
