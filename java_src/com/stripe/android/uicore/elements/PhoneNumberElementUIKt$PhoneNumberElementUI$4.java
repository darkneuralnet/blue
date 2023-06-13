package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PhoneNumberElementUIKt$PhoneNumberElementUI$4 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ InterfaceC48627sP5<String> $placeholder$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberElementUIKt$PhoneNumberElementUI$4(InterfaceC48627sP5<String> interfaceC48627sP5) {
        super(2);
        this.$placeholder$delegate = interfaceC48627sP5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        String PhoneNumberElementUI_rvJmuoc$lambda$7;
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-842387328, i, -1, "com.stripe.android.uicore.elements.PhoneNumberElementUI.<anonymous> (PhoneNumberElementUI.kt:112)");
        }
        PhoneNumberElementUI_rvJmuoc$lambda$7 = PhoneNumberElementUIKt.PhoneNumberElementUI_rvJmuoc$lambda$7(this.$placeholder$delegate);
        C38909c26.m62000e(PhoneNumberElementUI_rvJmuoc$lambda$7, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et0, 0, 0, 65534);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
