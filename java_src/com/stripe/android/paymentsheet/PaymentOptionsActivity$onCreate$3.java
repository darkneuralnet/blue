package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.p047ui.PaymentOptionsScreenKt;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PaymentOptionsActivity$onCreate$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ PaymentOptionsActivity this$0;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$onCreate$3$1 */
    /* loaded from: classes7.dex */
    public static final class C191451 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ PaymentOptionsActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191451(PaymentOptionsActivity paymentOptionsActivity) {
            super(2);
            this.this$0 = paymentOptionsActivity;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-553151295, i, -1, "com.stripe.android.paymentsheet.PaymentOptionsActivity.onCreate.<anonymous>.<anonymous> (PaymentOptionsActivity.kt:56)");
            }
            PaymentOptionsScreenKt.PaymentOptionsScreen(this.this$0.getViewModel(), null, interfaceC32720Et0, 8, 2);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsActivity$onCreate$3(PaymentOptionsActivity paymentOptionsActivity) {
        super(2);
        this.this$0 = paymentOptionsActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1495711407, i, -1, "com.stripe.android.paymentsheet.PaymentOptionsActivity.onCreate.<anonymous> (PaymentOptionsActivity.kt:55)");
        }
        StripeThemeKt.StripeTheme(null, null, null, C43575jt0.m29791b(interfaceC32720Et0, -553151295, true, new C191451(this.this$0)), interfaceC32720Et0, 3072, 7);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
