package com.stripe.android.link.p042ui.paymentmethod;

import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.link.model.LinkAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodBodyKt$PaymentMethodBody$4 */
/* loaded from: classes7.dex */
public final class PaymentMethodBodyKt$PaymentMethodBody$4 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ NonFallbackInjector $injector;
    final /* synthetic */ LinkAccount $linkAccount;
    final /* synthetic */ boolean $loadFromArgs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodBodyKt$PaymentMethodBody$4(LinkAccount linkAccount, NonFallbackInjector nonFallbackInjector, boolean z, int i) {
        super(2);
        this.$linkAccount = linkAccount;
        this.$injector = nonFallbackInjector;
        this.$loadFromArgs = z;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PaymentMethodBodyKt.PaymentMethodBody(this.$linkAccount, this.$injector, this.$loadFromArgs, interfaceC32720Et0, this.$$changed | 1);
    }
}
