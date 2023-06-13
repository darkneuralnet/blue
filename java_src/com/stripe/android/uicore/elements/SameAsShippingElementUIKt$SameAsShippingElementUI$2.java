package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class SameAsShippingElementUIKt$SameAsShippingElementUI$2 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ InterfaceC48627sP5<Boolean> $checked$delegate;
    final /* synthetic */ SameAsShippingController $controller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SameAsShippingElementUIKt$SameAsShippingElementUI$2(SameAsShippingController sameAsShippingController, InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        super(1);
        this.$controller = sameAsShippingController;
        this.$checked$delegate = interfaceC48627sP5;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        boolean SameAsShippingElementUI$lambda$0;
        SameAsShippingController sameAsShippingController = this.$controller;
        SameAsShippingElementUI$lambda$0 = SameAsShippingElementUIKt.SameAsShippingElementUI$lambda$0(this.$checked$delegate);
        sameAsShippingController.onValueChange(!SameAsShippingElementUI$lambda$0);
    }
}
