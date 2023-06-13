package com.stripe.android.paymentsheet;

import com.stripe.android.uicore.image.StripeImageLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentMethodsUIKt$PaymentMethodUI$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $iconRes;
    final /* synthetic */ String $iconUrl;
    final /* synthetic */ StripeImageLoader $imageLoader;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ int $itemIndex;
    final /* synthetic */ float $minViewWidth;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function1<Integer, Unit> $onItemSelectedListener;
    final /* synthetic */ boolean $tintOnSelected;
    final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodsUIKt$PaymentMethodUI$2(float f, int i, String str, StripeImageLoader stripeImageLoader, String str2, boolean z, boolean z2, boolean z3, int i2, InterfaceC41563gV2 interfaceC41563gV2, Function1<? super Integer, Unit> function1, int i3, int i4, int i5) {
        super(2);
        this.$minViewWidth = f;
        this.$iconRes = i;
        this.$iconUrl = str;
        this.$imageLoader = stripeImageLoader;
        this.$title = str2;
        this.$isSelected = z;
        this.$isEnabled = z2;
        this.$tintOnSelected = z3;
        this.$itemIndex = i2;
        this.$modifier = interfaceC41563gV2;
        this.$onItemSelectedListener = function1;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$default = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PaymentMethodsUIKt.m116592PaymentMethodUIjFuDa88(this.$minViewWidth, this.$iconRes, this.$iconUrl, this.$imageLoader, this.$title, this.$isSelected, this.$isEnabled, this.$tintOnSelected, this.$itemIndex, this.$modifier, this.$onItemSelectedListener, interfaceC32720Et0, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
