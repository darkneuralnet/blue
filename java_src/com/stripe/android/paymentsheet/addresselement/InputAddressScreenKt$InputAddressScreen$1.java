package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.paymentsheet.p047ui.AddressOptionsAppBarKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InputAddressScreenKt$InputAddressScreen$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ InterfaceC32037Bv1 $focusManager;
    final /* synthetic */ Function0<Unit> $onCloseClick;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.addresselement.InputAddressScreenKt$InputAddressScreen$1$1 */
    /* loaded from: classes7.dex */
    public static final class C191861 extends Lambda implements Function0<Unit> {
        final /* synthetic */ InterfaceC32037Bv1 $focusManager;
        final /* synthetic */ Function0<Unit> $onCloseClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191861(InterfaceC32037Bv1 interfaceC32037Bv1, Function0<Unit> function0) {
            super(0);
            this.$focusManager = interfaceC32037Bv1;
            this.$onCloseClick = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            InterfaceC32037Bv1.m113331e(this.$focusManager, false, 1, null);
            this.$onCloseClick.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputAddressScreenKt$InputAddressScreen$1(InterfaceC32037Bv1 interfaceC32037Bv1, Function0<Unit> function0) {
        super(2);
        this.$focusManager = interfaceC32037Bv1;
        this.$onCloseClick = function0;
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
            C35528Qt0.m87816Z(-833687647, i, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous> (InputAddressScreen.kt:44)");
        }
        AddressOptionsAppBarKt.AddressOptionsAppBar(true, new C191861(this.$focusManager, this.$onCloseClick), interfaceC32720Et0, 6);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
