package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class SameAsShippingElementUIKt$SameAsShippingElementUI$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ SameAsShippingController $controller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SameAsShippingElementUIKt$SameAsShippingElementUI$3(SameAsShippingController sameAsShippingController, int i) {
        super(2);
        this.$controller = sameAsShippingController;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        SameAsShippingElementUIKt.SameAsShippingElementUI(this.$controller, interfaceC32720Et0, this.$$changed | 1);
    }
}