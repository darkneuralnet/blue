package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPhoneNumberElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneNumberElementUI.kt\ncom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$5\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,146:1\n154#2:147\n*S KotlinDebug\n*F\n+ 1 PhoneNumberElementUI.kt\ncom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$5\n*L\n120#1:147\n*E\n"})
/* loaded from: classes7.dex */
public final class PhoneNumberElementUIKt$PhoneNumberElementUI$5 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ PhoneNumberController $controller;
    final /* synthetic */ boolean $enabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberElementUIKt$PhoneNumberElementUI$5(PhoneNumberController phoneNumberController, boolean z, int i) {
        super(2);
        this.$controller = phoneNumberController;
        this.$enabled = z;
        this.$$dirty = i;
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
            C35528Qt0.m87816Z(-557251425, i, -1, "com.stripe.android.uicore.elements.PhoneNumberElementUI.<anonymous> (PhoneNumberElementUI.kt:115)");
        }
        DropdownFieldUIKt.DropDown(this.$controller.getCountryDropdownController(), this.$enabled, ND3.m94180m(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(16), 0.0f, C43705k61.m29303g(8), 0.0f, 10, null), interfaceC32720Et0, ((this.$$dirty << 3) & 112) | 392, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
