package com.stripe.android.link.p042ui.paymentmethod;

import com.stripe.android.link.p042ui.PrimaryButtonState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.link.ui.paymentmethod.ComposableSingletons$PaymentMethodBodyKt$lambda-2$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$PaymentMethodBodyKt$lambda2$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    public static final ComposableSingletons$PaymentMethodBodyKt$lambda2$1 INSTANCE = new ComposableSingletons$PaymentMethodBodyKt$lambda2$1();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.paymentmethod.ComposableSingletons$PaymentMethodBodyKt$lambda-2$1$1 */
    /* loaded from: classes7.dex */
    public static final class C190281 extends Lambda implements Function1<SupportedPaymentMethod, Unit> {
        public static final C190281 INSTANCE = new C190281();

        public C190281() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(SupportedPaymentMethod it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SupportedPaymentMethod supportedPaymentMethod) {
            invoke2(supportedPaymentMethod);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.paymentmethod.ComposableSingletons$PaymentMethodBodyKt$lambda-2$1$2 */
    /* loaded from: classes7.dex */
    public static final class C190292 extends Lambda implements Function0<Unit> {
        public static final C190292 INSTANCE = new C190292();

        public C190292() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.paymentmethod.ComposableSingletons$PaymentMethodBodyKt$lambda-2$1$3 */
    /* loaded from: classes7.dex */
    public static final class C190303 extends Lambda implements Function0<Unit> {
        public static final C190303 INSTANCE = new C190303();

        public C190303() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public ComposableSingletons$PaymentMethodBodyKt$lambda2$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        List list;
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1731456532, i, -1, "com.stripe.android.link.ui.paymentmethod.ComposableSingletons$PaymentMethodBodyKt.lambda-2.<anonymous> (PaymentMethodBody.kt:61)");
        }
        list = ArraysKt___ArraysKt.toList(SupportedPaymentMethod.values());
        PaymentMethodBodyKt.PaymentMethodBody(list, SupportedPaymentMethod.Card, "Pay $10.99", PrimaryButtonState.Enabled, "Cancel", null, C190281.INSTANCE, C190292.INSTANCE, C190303.INSTANCE, ComposableSingletons$PaymentMethodBodyKt.INSTANCE.m116559getLambda1$link_release(), interfaceC32720Et0, 920350136);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
