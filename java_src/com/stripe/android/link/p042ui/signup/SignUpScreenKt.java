package com.stripe.android.link.p042ui.signup;

import androidx.compose.p003ui.focus.C11309h;
import androidx.compose.p003ui.focus.C11312i;
import androidx.lifecycle.InterfaceC11718e;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.link.p042ui.CommonKt;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.signup.SignUpViewModel;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.FE0;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a_\u0010\u0005\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0015H\u0001¢\u0006\u0004\b\u0005\u0010\u0017\u001a1\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m28432d2 = {"", "SignUpBodyPreview", "(LEt0;I)V", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "injector", "SignUpBody", "(Lcom/stripe/android/core/injection/NonFallbackInjector;LEt0;I)V", "", "merchantName", "Lcom/stripe/android/uicore/elements/TextFieldController;", "emailController", "Lcom/stripe/android/uicore/elements/PhoneNumberController;", "phoneNumberController", "nameController", "Lcom/stripe/android/link/ui/signup/SignUpState;", "signUpState", "", "isReadyToSignUp", "requiresNameCollection", "Lcom/stripe/android/link/ui/ErrorMessage;", "errorMessage", "Lkotlin/Function0;", "onSignUpClick", "(Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function0;LEt0;I)V", "enabled", "Landroidx/compose/ui/focus/h;", "focusRequester", "EmailCollectionSection", "(ZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;Landroidx/compose/ui/focus/h;LEt0;II)V", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSignUpScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,240:1\n81#2,11:241\n1057#3,6:252\n154#4:258\n154#4:291\n154#4:292\n154#4:293\n154#4:294\n154#4:295\n154#4:296\n68#5,5:259\n73#5:290\n77#5:301\n75#6:264\n76#6,11:266\n89#6:300\n76#7:265\n460#8,13:277\n473#8,3:297\n76#9:302\n76#9:303\n76#9:304\n*S KotlinDebug\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt\n*L\n75#1:241,11\n202#1:252,6\n207#1:258\n224#1:291\n226#1:292\n227#1:293\n228#1:294\n229#1:295\n235#1:296\n204#1:259,5\n204#1:290\n204#1:301\n204#1:264\n204#1:266,11\n204#1:300\n204#1:265\n204#1:277,13\n204#1:297,3\n79#1:302\n80#1:303\n81#1:304\n*E\n"})
/* renamed from: com.stripe.android.link.ui.signup.SignUpScreenKt */
/* loaded from: classes7.dex */
public final class SignUpScreenKt {
    public static final void EmailCollectionSection(boolean z, TextFieldController emailController, SignUpState signUpState, C11309h c11309h, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        C11309h c11309h2;
        int m107002b;
        boolean z2;
        Intrinsics.checkNotNullParameter(emailController, "emailController");
        Intrinsics.checkNotNullParameter(signUpState, "signUpState");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-457230736);
        if ((i2 & 8) != 0) {
            Object mo89635G = mo89518u.mo89635G();
            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new C11309h();
                mo89518u.mo89503z(mo89635G);
            }
            c11309h2 = (C11309h) mo89635G;
        } else {
            c11309h2 = c11309h;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-457230736, i, -1, "com.stripe.android.link.ui.signup.EmailCollectionSection (SignUpScreen.kt:197)");
        }
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        float f = 0;
        InterfaceC41563gV2 m94184i = ND3.m94184i(BB5.m114255n(c20912a, 0.0f, 1, null), C43705k61.m29303g(f));
        InterfaceC4360K9 m99140f = InterfaceC4360K9.f19170a.m99140f();
        mo89518u.mo89638F(733328855);
        InterfaceC51579xO2 m44729h = C39504d10.m44729h(m99140f, false, mo89518u, 6);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94184i);
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
            C52468yt0.m2335c();
        }
        mo89518u.mo89557h();
        if (mo89518u.mo89521t()) {
            mo89518u.mo89617M(m113415a);
        } else {
            mo89518u.mo89566e();
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a, m44729h, c0757a.m113412d());
        C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
        C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
        C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
        mo89518u.mo89530q();
        m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-2137368960);
        C40689f10 c40689f10 = C40689f10.f79291a;
        mo89518u.mo89638F(788195702);
        if (signUpState == SignUpState.InputtingPhoneOrName) {
            m107002b = FY1.f9619b.m107000d();
        } else {
            m107002b = FY1.f9619b.m107002b();
        }
        int i3 = m107002b;
        if (z && signUpState != SignUpState.VerifyingEmail) {
            z2 = true;
        } else {
            z2 = false;
        }
        TextFieldUIKt.m116751TextFieldSectionuGujYS0(emailController, i3, z2, C11312i.m68775a(c20912a, c11309h2), null, null, mo89518u, 8, 48);
        if (signUpState == SignUpState.VerifyingEmail) {
            float f2 = 8;
            K74.m99208b(C41198fs5.m40620b(ND3.m94181l(BB5.m114246w(c20912a, C43705k61.m29303g(32)), C43705k61.m29303g(f), C43705k61.m29303g(f2), C43705k61.m29303g(16), C43705k61.m29303g(f2)), false, SignUpScreenKt$EmailCollectionSection$2$1.INSTANCE, 1, null), ThemeKt.getLinkColors(TM2.f35372a, mo89518u, TM2.f35373b).m116540getProgressIndicator0d7_KjU(), C43705k61.m29303g(2), mo89518u, 384, 0);
        }
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new SignUpScreenKt$EmailCollectionSection$3(z, emailController, signUpState, c11309h2, i, i2));
        }
    }

    public static final void SignUpBody(NonFallbackInjector injector, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        FE0 fe0;
        Intrinsics.checkNotNullParameter(injector, "injector");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1830597978);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1830597978, i, -1, "com.stripe.android.link.ui.signup.SignUpBody (SignUpScreen.kt:71)");
        }
        SignUpViewModel.Factory factory = new SignUpViewModel.Factory(injector);
        mo89518u.mo89638F(1729797275);
        InterfaceC37154Xr6 m18429a = C47155pv2.f104319a.m18429a(mo89518u, 6);
        if (m18429a != null) {
            if (m18429a instanceof InterfaceC11718e) {
                fe0 = ((InterfaceC11718e) m18429a).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(fe0, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                fe0 = FE0.C2209a.f9049b;
            }
            AbstractC35048Or6 m84734b = C35984Sr6.m84734b(SignUpViewModel.class, m18429a, null, factory, fe0, mo89518u, 36936, 0);
            mo89518u.mo89605Q();
            SignUpViewModel signUpViewModel = (SignUpViewModel) m84734b;
            InterfaceC48627sP5 m105205b = GM5.m105205b(signUpViewModel.getSignUpState(), null, mo89518u, 8, 1);
            InterfaceC48627sP5 m105205b2 = GM5.m105205b(signUpViewModel.isReadyToSignUp(), null, mo89518u, 8, 1);
            InterfaceC48627sP5 m105205b3 = GM5.m105205b(signUpViewModel.getErrorMessage(), null, mo89518u, 8, 1);
            String merchantName = signUpViewModel.getMerchantName();
            SimpleTextFieldController emailController = signUpViewModel.getEmailController();
            PhoneNumberController phoneController = signUpViewModel.getPhoneController();
            SimpleTextFieldController nameController = signUpViewModel.getNameController();
            SignUpState SignUpBody$lambda$0 = SignUpBody$lambda$0(m105205b);
            boolean SignUpBody$lambda$1 = SignUpBody$lambda$1(m105205b2);
            boolean requiresNameCollection = signUpViewModel.getRequiresNameCollection();
            ErrorMessage SignUpBody$lambda$2 = SignUpBody$lambda$2(m105205b3);
            SignUpScreenKt$SignUpBody$1 signUpScreenKt$SignUpBody$1 = new SignUpScreenKt$SignUpBody$1(signUpViewModel);
            int i2 = SimpleTextFieldController.$stable;
            SignUpBody(merchantName, emailController, phoneController, nameController, SignUpBody$lambda$0, SignUpBody$lambda$1, requiresNameCollection, SignUpBody$lambda$2, signUpScreenKt$SignUpBody$1, mo89518u, (i2 << 9) | (i2 << 3) | (PhoneNumberController.$stable << 6));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
                return;
            }
            mo89512w.mo20405a(new SignUpScreenKt$SignUpBody$2(injector, i));
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    private static final SignUpState SignUpBody$lambda$0(InterfaceC48627sP5<? extends SignUpState> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final boolean SignUpBody$lambda$1(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    private static final ErrorMessage SignUpBody$lambda$2(InterfaceC48627sP5<? extends ErrorMessage> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SignUpBodyPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-361366453);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-361366453, i, -1, "com.stripe.android.link.ui.signup.SignUpBodyPreview (SignUpScreen.kt:52)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$SignUpScreenKt.INSTANCE.m116565getLambda2$link_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new SignUpScreenKt$SignUpBodyPreview$1(i));
        }
    }

    public static final void SignUpBody(String merchantName, TextFieldController emailController, PhoneNumberController phoneNumberController, TextFieldController nameController, SignUpState signUpState, boolean z, boolean z2, ErrorMessage errorMessage, Function0<Unit> onSignUpClick, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(emailController, "emailController");
        Intrinsics.checkNotNullParameter(phoneNumberController, "phoneNumberController");
        Intrinsics.checkNotNullParameter(nameController, "nameController");
        Intrinsics.checkNotNullParameter(signUpState, "signUpState");
        Intrinsics.checkNotNullParameter(onSignUpClick, "onSignUpClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(855099747);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(855099747, i, -1, "com.stripe.android.link.ui.signup.SignUpBody (SignUpScreen.kt:97)");
        }
        CommonKt.ScrollableTopLevelColumn(C43575jt0.m29791b(mo89518u, 484846906, true, new SignUpScreenKt$SignUpBody$3(merchantName, signUpState, errorMessage, emailController, i, z, onSignUpClick, C44190kv2.f95207a.m28161b(mo89518u, C44190kv2.f95209c), phoneNumberController, z2, nameController)), mo89518u, 6);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new SignUpScreenKt$SignUpBody$4(merchantName, emailController, phoneNumberController, nameController, signUpState, z, z2, errorMessage, onSignUpClick, i));
    }
}
