package com.stripe.android.link.p042ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0001\u0010\u0002\u001a9\u0010\u0001\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0001\u0010\u000b\"\u0017\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0017\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00038\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"", "LinkButton", "(LEt0;I)V", "", "email", "", "enabled", "Lkotlin/Function0;", "onClick", "LgV2;", "modifier", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V", "Lk61;", "LinkButtonVerticalPadding", "F", "LinkButtonHorizontalPadding", "Lbc5;", "LinkButtonShape", "Lbc5;", "LinkButtonEmailShape", LinkButtonViewKt.LinkButtonTestTag, "Ljava/lang/String;", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLinkButtonView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkButtonView.kt\ncom/stripe/android/link/ui/LinkButtonViewKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,166:1\n154#2:167\n154#2:168\n154#2:169\n154#2:170\n*S KotlinDebug\n*F\n+ 1 LinkButtonView.kt\ncom/stripe/android/link/ui/LinkButtonViewKt\n*L\n44#1:167\n45#1:168\n46#1:169\n47#1:170\n*E\n"})
/* renamed from: com.stripe.android.link.ui.LinkButtonViewKt */
/* loaded from: classes7.dex */
public final class LinkButtonViewKt {
    public static final String LinkButtonTestTag = "LinkButtonTestTag";
    private static final float LinkButtonVerticalPadding = C43705k61.m29303g(6);
    private static final float LinkButtonHorizontalPadding = C43705k61.m29303g(10);
    private static final C38649bc5 LinkButtonShape = C39242cc5.m61172d(C43705k61.m29303g(22));
    private static final C38649bc5 LinkButtonEmailShape = C39242cc5.m61172d(C43705k61.m29303g(16));

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LinkButton(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-625124130);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-625124130, i, -1, "com.stripe.android.link.ui.LinkButton (LinkButtonView.kt:53)");
            }
            LinkButton("example@stripe.com", true, LinkButtonViewKt$LinkButton$1.INSTANCE, null, mo89518u, 438, 8);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new LinkButtonViewKt$LinkButton$2(i));
    }

    public static final void LinkButton(String str, boolean z, Function0<Unit> onClick, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(882038224);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (mo89518u.mo89539n(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= mo89518u.mo89536o(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= mo89518u.mo89539n(onClick) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= mo89518u.mo89539n(interfaceC41563gV2) ? 2048 : 1024;
        }
        int i5 = i3;
        if ((i5 & 5851) == 1170 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (i4 != 0) {
                interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(882038224, i5, -1, "com.stripe.android.link.ui.LinkButton (LinkButtonView.kt:63)");
            }
            W94[] w94Arr = new W94[1];
            U94<Float> m75931a = C37220Xz0.m75931a();
            C36986Wz0 c36986Wz0 = C36986Wz0.f42427a;
            int i6 = C36986Wz0.f42428b;
            w94Arr[0] = m75931a.m81907c(Float.valueOf(z ? c36986Wz0.m77587c(mo89518u, i6) : c36986Wz0.m77588b(mo89518u, i6)));
            C41806gu0.m37353a(w94Arr, C43575jt0.m29791b(mo89518u, -84206960, true, new LinkButtonViewKt$LinkButton$3(onClick, interfaceC41563gV2, z, i5, str)), mo89518u, 56);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC41563gV2 interfaceC41563gV22 = interfaceC41563gV2;
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new LinkButtonViewKt$LinkButton$4(str, z, onClick, interfaceC41563gV22, i, i2));
    }
}
