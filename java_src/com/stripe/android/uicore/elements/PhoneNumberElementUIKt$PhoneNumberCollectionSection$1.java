package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PhoneNumberElementUIKt$PhoneNumberCollectionSection$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ int $imeAction;
    final /* synthetic */ PhoneNumberController $phoneNumberController;
    final /* synthetic */ boolean $requestFocusWhenShown;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberElementUIKt$PhoneNumberCollectionSection$1(boolean z, PhoneNumberController phoneNumberController, boolean z2, int i, int i2) {
        super(2);
        this.$enabled = z;
        this.$phoneNumberController = phoneNumberController;
        this.$requestFocusWhenShown = z2;
        this.$imeAction = i;
        this.$$dirty = i2;
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
            C35528Qt0.m87816Z(354183778, i, -1, "com.stripe.android.uicore.elements.PhoneNumberCollectionSection.<anonymous> (PhoneNumberElementUI.kt:62)");
        }
        boolean z = this.$enabled;
        PhoneNumberController phoneNumberController = this.$phoneNumberController;
        boolean z2 = this.$requestFocusWhenShown;
        int i2 = this.$imeAction;
        int i3 = this.$$dirty;
        PhoneNumberElementUIKt.m116744PhoneNumberElementUIrvJmuoc(z, phoneNumberController, z2, i2, interfaceC32720Et0, (i3 & 14) | 64 | ((i3 >> 3) & 896) | ((i3 >> 3) & 7168), 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
