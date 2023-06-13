package com.stripe.android.paymentsheet;

import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentMethodsUIKt$PaymentMethodsUI$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ StripeImageLoader $imageLoader;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function1<LpmRepository.SupportedPaymentMethod, Unit> $onItemSelectedListener;
    final /* synthetic */ List<LpmRepository.SupportedPaymentMethod> $paymentMethods;
    final /* synthetic */ int $selectedIndex;
    final /* synthetic */ C32209Co2 $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodsUIKt$PaymentMethodsUI$3(List<LpmRepository.SupportedPaymentMethod> list, int i, boolean z, Function1<? super LpmRepository.SupportedPaymentMethod, Unit> function1, StripeImageLoader stripeImageLoader, InterfaceC41563gV2 interfaceC41563gV2, C32209Co2 c32209Co2, int i2, int i3) {
        super(2);
        this.$paymentMethods = list;
        this.$selectedIndex = i;
        this.$isEnabled = z;
        this.$onItemSelectedListener = function1;
        this.$imageLoader = stripeImageLoader;
        this.$modifier = interfaceC41563gV2;
        this.$state = c32209Co2;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PaymentMethodsUIKt.PaymentMethodsUI(this.$paymentMethods, this.$selectedIndex, this.$isEnabled, this.$onItemSelectedListener, this.$imageLoader, this.$modifier, this.$state, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
