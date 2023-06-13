package com.stripe.android.link.p042ui.signup;

import com.stripe.android.link.p042ui.LinkTermsKt;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.PhoneNumberElementUIKt;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nSignUpScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,240:1\n154#2:241\n*S KotlinDebug\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$1\n*L\n170#1:241\n*E\n"})
/* renamed from: com.stripe.android.link.ui.signup.SignUpScreenKt$SignUpBody$3$3$1$1 */
/* loaded from: classes7.dex */
public final class SignUpScreenKt$SignUpBody$3$3$1$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ TextFieldController $nameController;
    final /* synthetic */ PhoneNumberController $phoneNumberController;
    final /* synthetic */ boolean $requiresNameCollection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpScreenKt$SignUpBody$3$3$1$1(PhoneNumberController phoneNumberController, boolean z, int i, TextFieldController textFieldController) {
        super(2);
        this.$phoneNumberController = phoneNumberController;
        this.$requiresNameCollection = z;
        this.$$dirty = i;
        this.$nameController = textFieldController;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int m107002b;
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1543024705, i, -1, "com.stripe.android.link.ui.signup.SignUpBody.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SignUpScreen.kt:146)");
        }
        PhoneNumberController phoneNumberController = this.$phoneNumberController;
        boolean z = phoneNumberController.getInitialPhoneNumber().length() == 0;
        if (this.$requiresNameCollection) {
            m107002b = FY1.f9619b.m107000d();
        } else {
            m107002b = FY1.f9619b.m107002b();
        }
        PhoneNumberElementUIKt.m116743PhoneNumberCollectionSectiona7tNSiQ(true, phoneNumberController, null, z, m107002b, interfaceC32720Et0, (PhoneNumberController.$stable << 3) | 6 | ((this.$$dirty >> 3) & 112), 4);
        interfaceC32720Et0.mo89638F(90412377);
        if (this.$requiresNameCollection) {
            TextFieldUIKt.m116751TextFieldSectionuGujYS0(this.$nameController, FY1.f9619b.m107002b(), true, null, null, null, interfaceC32720Et0, 392, 56);
        }
        interfaceC32720Et0.mo89605Q();
        LinkTermsKt.m116553LinkTerms5stqomU(ND3.m94180m(BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), 0.0f, C43705k61.m29303g(8), 0.0f, C43705k61.m29303g(16), 5, null), C47801r06.f106195b.m16678a(), interfaceC32720Et0, 6, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
