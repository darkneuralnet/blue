package com.stripe.android.paymentsheet;

import com.stripe.android.uicore.image.StripeImageLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentMethodsUIKt$PaymentMethodIconUi$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ int $iconRes;
    final /* synthetic */ String $iconUrl;
    final /* synthetic */ StripeImageLoader $imageLoader;
    final /* synthetic */ boolean $tintOnSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsUIKt$PaymentMethodIconUi$1(int i, String str, StripeImageLoader stripeImageLoader, boolean z, long j, int i2) {
        super(2);
        this.$iconRes = i;
        this.$iconUrl = str;
        this.$imageLoader = stripeImageLoader;
        this.$tintOnSelected = z;
        this.$color = j;
        this.$$changed = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PaymentMethodsUIKt.m116591PaymentMethodIconUiqFjXxE8(this.$iconRes, this.$iconUrl, this.$imageLoader, this.$tintOnSelected, this.$color, interfaceC32720Et0, this.$$changed | 1);
    }
}
