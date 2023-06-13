package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PhoneNumberElementUIKt$PhoneNumberElementUI$9 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ PhoneNumberController $controller;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ int $imeAction;
    final /* synthetic */ boolean $requestFocusWhenShown;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberElementUIKt$PhoneNumberElementUI$9(boolean z, PhoneNumberController phoneNumberController, boolean z2, int i, int i2, int i3) {
        super(2);
        this.$enabled = z;
        this.$controller = phoneNumberController;
        this.$requestFocusWhenShown = z2;
        this.$imeAction = i;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PhoneNumberElementUIKt.m116744PhoneNumberElementUIrvJmuoc(this.$enabled, this.$controller, this.$requestFocusWhenShown, this.$imeAction, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
