package com.stripe.android.uicore.image;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p000.G52;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u008b\u0001\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u00102\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0018\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015*\u00020\u000eH\u0002¨\u0006\u0018"}, m28432d2 = {"", "url", "Lcom/stripe/android/uicore/image/StripeImageLoader;", "imageLoader", "contentDescription", "LgV2;", "modifier", "LBA0;", "contentScale", "Lsm0;", "colorFilter", "LnE3;", "debugPainter", "Lkotlin/Function1;", "Lh10;", "", "Lkotlin/ExtensionFunctionType;", "errorContent", "loadingContent", "StripeImage", "(Ljava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;LgV2;LBA0;Lsm0;LnE3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;LEt0;II)V", "Lkotlin/Pair;", "", "calculateBoxSize", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class StripeImageKt {
    public static final void StripeImage(String url, StripeImageLoader imageLoader, String str, InterfaceC41563gV2 interfaceC41563gV2, BA0 ba0, C48841sm0 c48841sm0, AbstractC45562nE3 abstractC45562nE3, Function3<? super InterfaceC41875h10, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, Function3<? super InterfaceC41875h10, ? super InterfaceC32720Et0, ? super Integer, Unit> function32, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(573160554);
        InterfaceC41563gV2.C20912a c20912a = (i2 & 8) != 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
        BA0 m114316b = (i2 & 16) != 0 ? BA0.f1929a.m114316b() : ba0;
        C48841sm0 c48841sm02 = (i2 & 32) != 0 ? null : c48841sm0;
        AbstractC45562nE3 abstractC45562nE32 = (i2 & 64) != 0 ? null : abstractC45562nE3;
        Function3<InterfaceC41875h10, InterfaceC32720Et0, Integer, Unit> m116753getLambda1$stripe_ui_core_release = (i2 & 128) != 0 ? ComposableSingletons$StripeImageKt.INSTANCE.m116753getLambda1$stripe_ui_core_release() : function3;
        Function3<InterfaceC41875h10, InterfaceC32720Et0, Integer, Unit> m116754getLambda2$stripe_ui_core_release = (i2 & 256) != 0 ? ComposableSingletons$StripeImageKt.INSTANCE.m116754getLambda2$stripe_ui_core_release() : function32;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(573160554, i, -1, "com.stripe.android.uicore.image.StripeImage (StripeImage.kt:42)");
        }
        C41282g10.m40327a(c20912a, null, false, C43575jt0.m29791b(mo89518u, 325645268, true, new StripeImageKt$StripeImage$1(url, i, m116753getLambda1$stripe_ui_core_release, m116754getLambda2$stripe_ui_core_release, str, c20912a, m114316b, c48841sm02, abstractC45562nE32, imageLoader)), mo89518u, ((i >> 9) & 14) | 3072, 6);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new StripeImageKt$StripeImage$2(url, imageLoader, str, c20912a, m114316b, c48841sm02, abstractC45562nE32, m116753getLambda1$stripe_ui_core_release, m116754getLambda2$stripe_ui_core_release, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Integer, Integer> calculateBoxSize(InterfaceC41875h10 interfaceC41875h10) {
        int i;
        int i2;
        int m28063n = C44228kz0.m28063n(interfaceC41875h10.mo35389b());
        G52.C2636a c2636a = G52.f10893b;
        if (m28063n > G52.m105829g(c2636a.m105825a()) && C44228kz0.m28063n(interfaceC41875h10.mo35389b()) < ((int) C43705k61.f93903c.m29296b())) {
            i = C44228kz0.m28063n(interfaceC41875h10.mo35389b());
        } else {
            i = -1;
        }
        if (C44228kz0.m28064m(interfaceC41875h10.mo35389b()) > G52.m105830f(c2636a.m105825a()) && C44228kz0.m28064m(interfaceC41875h10.mo35389b()) < ((int) C43705k61.f93903c.m29296b())) {
            i2 = C44228kz0.m28064m(interfaceC41875h10.mo35389b());
        } else {
            i2 = -1;
        }
        if (i == -1) {
            i = i2;
        }
        if (i2 == -1) {
            i2 = i;
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
