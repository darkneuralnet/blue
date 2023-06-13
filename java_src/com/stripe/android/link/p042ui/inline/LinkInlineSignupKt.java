package com.stripe.android.link.p042ui.inline;

import androidx.compose.p003ui.focus.C11309h;
import androidx.lifecycle.InterfaceC11718e;
import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.injection.LinkPaymentLauncherComponent;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.inline.InlineSignupViewModel;
import com.stripe.android.link.p042ui.signup.SignUpState;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.FE0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0001\u0010\u0002\u001aC\u0010\r\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\u00072\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aq\u0010\r\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u001c2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u001e¨\u0006\u001f"}, m28432d2 = {"", "Preview", "(LEt0;I)V", "Lcom/stripe/android/link/LinkPaymentLauncher;", "linkPaymentLauncher", "", "enabled", "Lkotlin/Function2;", "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;", "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;", "onStateChanged", "LgV2;", "modifier", "LinkInlineSignup", "(Lcom/stripe/android/link/LinkPaymentLauncher;ZLkotlin/jvm/functions/Function2;LgV2;LEt0;II)V", "", "merchantName", "Lcom/stripe/android/uicore/elements/TextFieldController;", "emailController", "Lcom/stripe/android/uicore/elements/PhoneNumberController;", "phoneNumberController", "nameController", "Lcom/stripe/android/link/ui/signup/SignUpState;", "signUpState", "expanded", "requiresNameCollection", "Lcom/stripe/android/link/ui/ErrorMessage;", "errorMessage", "Lkotlin/Function0;", "toggleExpanded", "(Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function0;LgV2;LEt0;III)V", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLinkInlineSignup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkInlineSignup.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignupKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,299:1\n81#2,11:300\n76#3:311\n1057#4,6:312\n76#5:318\n76#5:319\n*S KotlinDebug\n*F\n+ 1 LinkInlineSignup.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignupKt\n*L\n95#1:300,11\n106#1:311\n145#1:312,6\n99#1:318\n100#1:319\n*E\n"})
/* renamed from: com.stripe.android.link.ui.inline.LinkInlineSignupKt */
/* loaded from: classes7.dex */
public final class LinkInlineSignupKt {
    public static final void LinkInlineSignup(LinkPaymentLauncher linkPaymentLauncher, boolean z, Function2<? super LinkPaymentLauncher.Configuration, ? super InlineSignupViewState, Unit> onStateChanged, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        FE0 fe0;
        Intrinsics.checkNotNullParameter(linkPaymentLauncher, "linkPaymentLauncher");
        Intrinsics.checkNotNullParameter(onStateChanged, "onStateChanged");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1952201385);
        InterfaceC41563gV2 interfaceC41563gV22 = (i2 & 8) != 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1952201385, i, -1, "com.stripe.android.link.ui.inline.LinkInlineSignup (LinkInlineSignup.kt:87)");
        }
        LinkPaymentLauncherComponent component$link_release = linkPaymentLauncher.getComponent$link_release();
        if (component$link_release != null) {
            InlineSignupViewModel.Factory factory = new InlineSignupViewModel.Factory(component$link_release.getInjector());
            mo89518u.mo89638F(1729797275);
            InterfaceC37154Xr6 m18429a = C47155pv2.f104319a.m18429a(mo89518u, 6);
            if (m18429a != null) {
                if (m18429a instanceof InterfaceC11718e) {
                    fe0 = ((InterfaceC11718e) m18429a).getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(fe0, "{\n        viewModelStore…ModelCreationExtras\n    }");
                } else {
                    fe0 = FE0.C2209a.f9049b;
                }
                AbstractC35048Or6 m84734b = C35984Sr6.m84734b(InlineSignupViewModel.class, m18429a, null, factory, fe0, mo89518u, 36936, 0);
                mo89518u.mo89605Q();
                InlineSignupViewModel inlineSignupViewModel = (InlineSignupViewModel) m84734b;
                InterfaceC48627sP5 m105205b = GM5.m105205b(inlineSignupViewModel.getViewState(), null, mo89518u, 8, 1);
                InterfaceC48627sP5 m105205b2 = GM5.m105205b(inlineSignupViewModel.getErrorMessage(), null, mo89518u, 8, 1);
                Y91.m75533f(LinkInlineSignup$lambda$2$lambda$0(m105205b), new LinkInlineSignupKt$LinkInlineSignup$1$1(onStateChanged, component$link_release, m105205b, null), mo89518u, 64);
                Y91.m75533f(LinkInlineSignup$lambda$2$lambda$0(m105205b).getSignUpState$link_release(), new LinkInlineSignupKt$LinkInlineSignup$1$2((InterfaceC32037Bv1) mo89518u.mo89572c(C42399hu0.m35611h()), C44190kv2.f95207a.m28161b(mo89518u, C44190kv2.f95209c), m105205b, null), mo89518u, 64);
                String merchantName = LinkInlineSignup$lambda$2$lambda$0(m105205b).getMerchantName();
                SimpleTextFieldController emailController = inlineSignupViewModel.getEmailController();
                PhoneNumberController phoneController = inlineSignupViewModel.getPhoneController();
                SimpleTextFieldController nameController = inlineSignupViewModel.getNameController();
                SignUpState signUpState$link_release = LinkInlineSignup$lambda$2$lambda$0(m105205b).getSignUpState$link_release();
                boolean isExpanded$link_release = LinkInlineSignup$lambda$2$lambda$0(m105205b).isExpanded$link_release();
                boolean requiresNameCollection = inlineSignupViewModel.getRequiresNameCollection();
                ErrorMessage LinkInlineSignup$lambda$2$lambda$1 = LinkInlineSignup$lambda$2$lambda$1(m105205b2);
                LinkInlineSignupKt$LinkInlineSignup$1$3 linkInlineSignupKt$LinkInlineSignup$1$3 = new LinkInlineSignupKt$LinkInlineSignup$1$3(inlineSignupViewModel);
                int i3 = SimpleTextFieldController.$stable;
                LinkInlineSignup(merchantName, emailController, phoneController, nameController, signUpState$link_release, z, isExpanded$link_release, requiresNameCollection, LinkInlineSignup$lambda$2$lambda$1, linkInlineSignupKt$LinkInlineSignup$1$3, interfaceC41563gV22, mo89518u, (i3 << 9) | (i3 << 3) | (PhoneNumberController.$stable << 6) | ((i << 12) & ImageMetadata.JPEG_GPS_COORDINATES), (i >> 9) & 14, 0);
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new LinkInlineSignupKt$LinkInlineSignup$2(linkPaymentLauncher, z, onStateChanged, interfaceC41563gV22, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InlineSignupViewState LinkInlineSignup$lambda$2$lambda$0(InterfaceC48627sP5<InlineSignupViewState> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final ErrorMessage LinkInlineSignup$lambda$2$lambda$1(InterfaceC48627sP5<? extends ErrorMessage> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Preview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1596812407);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1596812407, i, -1, "com.stripe.android.link.ui.inline.Preview (LinkInlineSignup.kt:65)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$LinkInlineSignupKt.INSTANCE.m116558getLambda2$link_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new LinkInlineSignupKt$Preview$1(i));
        }
    }

    public static final void LinkInlineSignup(String merchantName, TextFieldController emailController, PhoneNumberController phoneNumberController, TextFieldController nameController, SignUpState signUpState, boolean z, boolean z2, boolean z3, ErrorMessage errorMessage, Function0<Unit> toggleExpanded, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(emailController, "emailController");
        Intrinsics.checkNotNullParameter(phoneNumberController, "phoneNumberController");
        Intrinsics.checkNotNullParameter(nameController, "nameController");
        Intrinsics.checkNotNullParameter(signUpState, "signUpState");
        Intrinsics.checkNotNullParameter(toggleExpanded, "toggleExpanded");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1019675561);
        InterfaceC41563gV2.C20912a c20912a = (i3 & 1024) != 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1019675561, i, i2, "com.stripe.android.link.ui.inline.LinkInlineSignup (LinkInlineSignup.kt:131)");
        }
        Object mo89635G = mo89518u.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C11309h();
            mo89518u.mo89503z(mo89635G);
        }
        C11309h c11309h = (C11309h) mo89635G;
        Y91.m75533f(Boolean.valueOf(z2), new LinkInlineSignupKt$LinkInlineSignup$3(z2, c11309h, null), mo89518u, ((i >> 18) & 14) | 64);
        W94[] w94Arr = new W94[1];
        U94<Float> m75931a = C37220Xz0.m75931a();
        C36986Wz0 c36986Wz0 = C36986Wz0.f42427a;
        int i4 = C36986Wz0.f42428b;
        w94Arr[0] = m75931a.m81907c(Float.valueOf(z ? c36986Wz0.m77587c(mo89518u, i4) : c36986Wz0.m77588b(mo89518u, i4)));
        C41806gu0.m37353a(w94Arr, C43575jt0.m29791b(mo89518u, -686933911, true, new LinkInlineSignupKt$LinkInlineSignup$4(c20912a, toggleExpanded, i, z2, z, merchantName, emailController, signUpState, c11309h, errorMessage, phoneNumberController, z3, nameController)), mo89518u, 56);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new LinkInlineSignupKt$LinkInlineSignup$5(merchantName, emailController, phoneNumberController, nameController, signUpState, z, z2, z3, errorMessage, toggleExpanded, c20912a, i, i2, i3));
    }
}
