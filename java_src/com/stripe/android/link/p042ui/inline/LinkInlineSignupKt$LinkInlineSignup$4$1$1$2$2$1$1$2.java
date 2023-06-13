package com.stripe.android.link.p042ui.inline;

import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.LinkTermsKt;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.PhoneNumberElementUIKt;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nLinkInlineSignup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkInlineSignup.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,299:1\n74#2,6:300\n80#2:332\n84#2:338\n75#3:306\n76#3,11:308\n89#3:337\n76#4:307\n460#5,13:319\n473#5,3:334\n154#6:333\n*S KotlinDebug\n*F\n+ 1 LinkInlineSignup.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2\n*L\n240#1:300,6\n240#1:332\n240#1:338\n240#1:306\n240#1:308,11\n240#1:337\n240#1:307\n240#1:319,13\n240#1:334,3\n271#1:333\n*E\n"})
/* renamed from: com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2 */
/* loaded from: classes7.dex */
public final class LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2 extends Lambda implements Function3<InterfaceC7907Te, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ TextFieldController $nameController;
    final /* synthetic */ PhoneNumberController $phoneNumberController;
    final /* synthetic */ boolean $requiresNameCollection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2(boolean z, PhoneNumberController phoneNumberController, boolean z2, int i, TextFieldController textFieldController, ErrorMessage errorMessage) {
        super(3);
        this.$enabled = z;
        this.$phoneNumberController = phoneNumberController;
        this.$requiresNameCollection = z2;
        this.$$dirty = i;
        this.$nameController = textFieldController;
        this.$errorMessage = errorMessage;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7907Te interfaceC7907Te, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC7907Te, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC7907Te AnimatedVisibility, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int m107002b;
        int i2;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1363287512, i, -1, "com.stripe.android.link.ui.inline.LinkInlineSignup.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkInlineSignup.kt:238)");
        }
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m114255n = BB5.m114255n(c20912a, 0.0f, 1, null);
        boolean z = this.$enabled;
        PhoneNumberController phoneNumberController = this.$phoneNumberController;
        boolean z2 = this.$requiresNameCollection;
        int i3 = this.$$dirty;
        TextFieldController textFieldController = this.$nameController;
        ErrorMessage errorMessage = this.$errorMessage;
        interfaceC32720Et0.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114255n);
        if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
            C52468yt0.m2335c();
        }
        interfaceC32720Et0.mo89557h();
        if (interfaceC32720Et0.mo89521t()) {
            interfaceC32720Et0.mo89617M(m113415a);
        } else {
            interfaceC32720Et0.mo89566e();
        }
        interfaceC32720Et0.mo89620L();
        InterfaceC32720Et0 m64192a = C38680bf6.m64192a(interfaceC32720Et0);
        C38680bf6.m64191b(m64192a, m91546a, c0757a.m113412d());
        C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
        C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
        C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
        interfaceC32720Et0.mo89530q();
        m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(2058660585);
        interfaceC32720Et0.mo89638F(-1163856341);
        C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
        interfaceC32720Et0.mo89638F(1091352818);
        boolean z3 = phoneNumberController.getInitialPhoneNumber().length() == 0;
        if (z2) {
            m107002b = FY1.f9619b.m107000d();
        } else {
            m107002b = FY1.f9619b.m107002b();
        }
        PhoneNumberElementUIKt.m116743PhoneNumberCollectionSectiona7tNSiQ(z, phoneNumberController, null, z3, m107002b, interfaceC32720Et0, ((i3 >> 15) & 14) | (PhoneNumberController.$stable << 3) | ((i3 >> 3) & 112), 4);
        interfaceC32720Et0.mo89638F(-1836348059);
        if (z2) {
            i2 = 8;
            TextFieldUIKt.m116751TextFieldSectionuGujYS0(textFieldController, FY1.f9619b.m107002b(), z, null, null, null, interfaceC32720Et0, ((i3 >> 9) & 896) | 8, 56);
        } else {
            i2 = 8;
        }
        interfaceC32720Et0.mo89605Q();
        C7489Se.m85173b(c35465Qm0, errorMessage != null, null, null, null, null, C43575jt0.m29791b(interfaceC32720Et0, -1042171622, true, new LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2$1$1(errorMessage)), interfaceC32720Et0, 1572870, 30);
        LinkTermsKt.m116553LinkTerms5stqomU(ND3.m94180m(c20912a, 0.0f, C43705k61.m29303g(i2), 0.0f, 0.0f, 13, null), C47801r06.f106195b.m16675d(), interfaceC32720Et0, 6, 0);
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89563f();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
