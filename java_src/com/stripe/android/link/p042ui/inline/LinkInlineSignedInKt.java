package com.stripe.android.link.p042ui.inline;

import androidx.lifecycle.InterfaceC11718e;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.injection.LinkPaymentLauncherComponent;
import com.stripe.android.link.p042ui.inline.InlineSignupViewModel;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.FE0;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/link/LinkPaymentLauncher;", "linkPaymentLauncher", "Lkotlin/Function0;", "", "onLogout", "LgV2;", "modifier", "LinkInlineSignedIn", "(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLinkInlineSignedIn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkInlineSignedIn.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignedInKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,95:1\n81#2,11:96\n*S KotlinDebug\n*F\n+ 1 LinkInlineSignedIn.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignedInKt\n*L\n39#1:96,11\n*E\n"})
/* renamed from: com.stripe.android.link.ui.inline.LinkInlineSignedInKt */
/* loaded from: classes7.dex */
public final class LinkInlineSignedInKt {
    public static final void LinkInlineSignedIn(LinkPaymentLauncher linkPaymentLauncher, Function0<Unit> onLogout, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        FE0 fe0;
        Intrinsics.checkNotNullParameter(linkPaymentLauncher, "linkPaymentLauncher");
        Intrinsics.checkNotNullParameter(onLogout, "onLogout");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1535905571);
        if ((i2 & 4) != 0) {
            interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1535905571, i, -1, "com.stripe.android.link.ui.inline.LinkInlineSignedIn (LinkInlineSignedIn.kt:32)");
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
                StripeThemeKt.StripeTheme(null, null, null, C43575jt0.m29791b(mo89518u, -1660901673, true, new LinkInlineSignedInKt$LinkInlineSignedIn$1$1(interfaceC41563gV2, GM5.m105206a(inlineSignupViewModel.getAccountEmail(), "", null, mo89518u, 56, 2), inlineSignupViewModel, onLogout)), mo89518u, 3072, 7);
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new LinkInlineSignedInKt$LinkInlineSignedIn$2(linkPaymentLauncher, onLogout, interfaceC41563gV2, i, i2));
        }
    }
}
