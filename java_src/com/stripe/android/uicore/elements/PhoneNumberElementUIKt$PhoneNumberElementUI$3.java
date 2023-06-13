package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.C19423R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PhoneNumberElementUIKt$PhoneNumberElementUI$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ PhoneNumberController $controller;
    final /* synthetic */ InterfaceC48627sP5<Integer> $label$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberElementUIKt$PhoneNumberElementUI$3(PhoneNumberController phoneNumberController, InterfaceC48627sP5<Integer> interfaceC48627sP5) {
        super(2);
        this.$controller = phoneNumberController;
        this.$label$delegate = interfaceC48627sP5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int PhoneNumberElementUI_rvJmuoc$lambda$6;
        String m41310c;
        int PhoneNumberElementUI_rvJmuoc$lambda$62;
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1127523231, i, -1, "com.stripe.android.uicore.elements.PhoneNumberElementUI.<anonymous> (PhoneNumberElementUI.kt:100)");
        }
        if (this.$controller.getShowOptionalLabel()) {
            int i2 = C19423R.string.form_label_optional;
            PhoneNumberElementUI_rvJmuoc$lambda$62 = PhoneNumberElementUIKt.PhoneNumberElementUI_rvJmuoc$lambda$6(this.$label$delegate);
            m41310c = C40946fS5.m41309d(i2, new Object[]{C40946fS5.m41310c(PhoneNumberElementUI_rvJmuoc$lambda$62, interfaceC32720Et0, 0)}, interfaceC32720Et0, 64);
        } else {
            PhoneNumberElementUI_rvJmuoc$lambda$6 = PhoneNumberElementUIKt.PhoneNumberElementUI_rvJmuoc$lambda$6(this.$label$delegate);
            m41310c = C40946fS5.m41310c(PhoneNumberElementUI_rvJmuoc$lambda$6, interfaceC32720Et0, 0);
        }
        FormLabelKt.FormLabel(m41310c, null, false, interfaceC32720Et0, 0, 6);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
