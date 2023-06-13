package com.stripe.android.link.p042ui.inline;

import androidx.compose.p003ui.focus.C11309h;
import com.stripe.android.link.C18975R;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.signup.SignUpScreenKt;
import com.stripe.android.link.p042ui.signup.SignUpState;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.TextFieldController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nLinkInlineSignup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkInlineSignup.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,299:1\n73#2,7:300\n80#2:333\n74#2,6:335\n80#2:367\n84#2:372\n84#2:416\n75#3:307\n76#3,11:309\n75#3:341\n76#3,11:343\n89#3:371\n75#3:380\n76#3,11:382\n89#3:410\n89#3:415\n76#4:308\n76#4:342\n76#4:381\n460#5,13:320\n460#5,13:354\n473#5,3:368\n460#5,13:393\n473#5,3:407\n473#5,3:412\n154#6:334\n154#6:373\n75#7,6:374\n81#7:406\n85#7:411\n*S KotlinDebug\n*F\n+ 1 LinkInlineSignup.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2\n*L\n208#1:300,7\n208#1:333\n213#1:335,6\n213#1:367\n213#1:372\n208#1:416\n208#1:307\n208#1:309,11\n213#1:341\n213#1:343,11\n213#1:371\n281#1:380\n281#1:382,11\n281#1:410\n208#1:415\n208#1:308\n213#1:342\n281#1:381\n208#1:320,13\n213#1:354,13\n213#1:368,3\n281#1:393,13\n281#1:407,3\n208#1:412,3\n216#1:334\n281#1:373\n281#1:374,6\n281#1:406\n281#1:411\n*E\n"})
/* renamed from: com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2 */
/* loaded from: classes7.dex */
public final class LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2 extends Lambda implements Function3<InterfaceC7907Te, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ TextFieldController $emailController;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ C11309h $focusRequester;
    final /* synthetic */ TextFieldController $nameController;
    final /* synthetic */ PhoneNumberController $phoneNumberController;
    final /* synthetic */ boolean $requiresNameCollection;
    final /* synthetic */ SignUpState $signUpState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2(boolean z, TextFieldController textFieldController, SignUpState signUpState, C11309h c11309h, int i, ErrorMessage errorMessage, PhoneNumberController phoneNumberController, boolean z2, TextFieldController textFieldController2) {
        super(3);
        this.$enabled = z;
        this.$emailController = textFieldController;
        this.$signUpState = signUpState;
        this.$focusRequester = c11309h;
        this.$$dirty = i;
        this.$errorMessage = errorMessage;
        this.$phoneNumberController = phoneNumberController;
        this.$requiresNameCollection = z2;
        this.$nameController = textFieldController2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7907Te interfaceC7907Te, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC7907Te, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC7907Te AnimatedVisibility, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(414278851, i, -1, "com.stripe.android.link.ui.inline.LinkInlineSignup.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkInlineSignup.kt:206)");
        }
        boolean z = this.$enabled;
        TextFieldController textFieldController = this.$emailController;
        SignUpState signUpState = this.$signUpState;
        C11309h c11309h = this.$focusRequester;
        int i2 = this.$$dirty;
        ErrorMessage errorMessage = this.$errorMessage;
        PhoneNumberController phoneNumberController = this.$phoneNumberController;
        boolean z2 = this.$requiresNameCollection;
        TextFieldController textFieldController2 = this.$nameController;
        interfaceC32720Et0.mo89638F(-483455358);
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        C25777lo c25777lo = C25777lo.f96729a;
        C25777lo.InterfaceC25789l m26802g = c25777lo.m26802g();
        InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
        InterfaceC51579xO2 m91546a = C34997Om0.m91546a(m26802g, c4361a.m99136j(), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(c20912a);
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
        interfaceC32720Et0.mo89638F(-897075443);
        TM2 tm2 = TM2.f35372a;
        int i3 = TM2.f35373b;
        L51.m97795a(null, C47063pm0.m18743m(StripeThemeKt.getStripeColors(tm2, interfaceC32720Et0, i3).m116696getComponentBorder0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 0.0f, interfaceC32720Et0, 0, 13);
        float f = 16;
        InterfaceC41563gV2 m94184i = ND3.m94184i(BB5.m114255n(c20912a, 0.0f, 1, null), C43705k61.m29303g(f));
        interfaceC32720Et0.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a2 = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
        Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m94184i);
        if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
            C52468yt0.m2335c();
        }
        interfaceC32720Et0.mo89557h();
        if (interfaceC32720Et0.mo89521t()) {
            interfaceC32720Et0.mo89617M(m113415a2);
        } else {
            interfaceC32720Et0.mo89566e();
        }
        interfaceC32720Et0.mo89620L();
        InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(interfaceC32720Et0);
        C38680bf6.m64191b(m64192a2, m91546a2, c0757a.m113412d());
        C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
        C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
        C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
        interfaceC32720Et0.mo89530q();
        m115273a2.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(2058660585);
        interfaceC32720Et0.mo89638F(-1163856341);
        interfaceC32720Et0.mo89638F(-47163305);
        SignUpScreenKt.EmailCollectionSection(z, textFieldController, signUpState, c11309h, interfaceC32720Et0, ((i2 >> 15) & 14) | 64 | ((i2 >> 6) & 896) | (C11309h.f52989c << 9), 0);
        SignUpState signUpState2 = SignUpState.InputtingPhoneOrName;
        C7489Se.m85173b(c35465Qm0, (signUpState == signUpState2 || errorMessage == null) ? false : true, null, null, null, null, C43575jt0.m29791b(interfaceC32720Et0, 115458687, true, new LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$1(errorMessage)), interfaceC32720Et0, 1572870, 30);
        C7489Se.m85173b(c35465Qm0, signUpState == signUpState2, null, null, null, null, C43575jt0.m29791b(interfaceC32720Et0, -1363287512, true, new LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2(z, phoneNumberController, z2, i2, textFieldController2, errorMessage)), interfaceC32720Et0, 1572870, 30);
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89563f();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        L51.m97795a(null, C47063pm0.m18743m(StripeThemeKt.getStripeColors(tm2, interfaceC32720Et0, i3).m116696getComponentBorder0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 0.0f, interfaceC32720Et0, 0, 13);
        InterfaceC41563gV2 m94184i2 = ND3.m94184i(c20912a, C43705k61.m29303g(f));
        interfaceC32720Et0.mo89638F(693286680);
        InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(c25777lo.m26803f(), c4361a.m99135k(), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm23 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq63 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
        Function0<InterfaceC32018Bt0> m113415a3 = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a3 = C31723Am2.m115273a(m94184i2);
        if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
            C52468yt0.m2335c();
        }
        interfaceC32720Et0.mo89557h();
        if (interfaceC32720Et0.mo89521t()) {
            interfaceC32720Et0.mo89617M(m113415a3);
        } else {
            interfaceC32720Et0.mo89566e();
        }
        interfaceC32720Et0.mo89620L();
        InterfaceC32720Et0 m64192a3 = C38680bf6.m64192a(interfaceC32720Et0);
        C38680bf6.m64191b(m64192a3, m74813a, c0757a.m113412d());
        C38680bf6.m64191b(m64192a3, interfaceC41273g013, c0757a.m113414b());
        C38680bf6.m64191b(m64192a3, enumC47065pm23, c0757a.m113413c());
        C38680bf6.m64191b(m64192a3, interfaceC33869Jq63, c0757a.m113410f());
        interfaceC32720Et0.mo89530q();
        m115273a3.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(2058660585);
        interfaceC32720Et0.mo89638F(-678309503);
        C38066ad5 c38066ad5 = C38066ad5.f50835a;
        interfaceC32720Et0.mo89638F(-1183653079);
        DP1.m110533b(C46748pE3.m19793d(C18975R.C18976drawable.ic_link_logo, interfaceC32720Et0, 0), C40946fS5.m41310c(C18975R.string.link, interfaceC32720Et0, 0), C41198fs5.m40620b(c20912a, false, LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$2$1.INSTANCE, 1, null), ThemeKt.getLinkColors(tm2, interfaceC32720Et0, i3).m116538getInlineLinkLogo0d7_KjU(), interfaceC32720Et0, 8, 0);
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89563f();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
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
