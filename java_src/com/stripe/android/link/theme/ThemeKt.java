package com.stripe.android.link.theme;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u001d\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001d\u0010\f\u001a\u00020\u00078\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b\"\u001d\u0010\u000e\u001a\u00020\u00078\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u001d\u0010\u0010\u001a\u00020\u00078\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b\"\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u0019\u001a\u00020\u0013*\u00020\u00168AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001d\u001a\u00020\u001a*\u00020\u00168AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m28432d2 = {"", "darkTheme", "Lkotlin/Function0;", "", "content", "DefaultLinkTheme", "(ZLkotlin/jvm/functions/Function2;LEt0;II)V", "Lk61;", "MinimumTouchTargetSize", "F", "getMinimumTouchTargetSize", "()F", "AppBarHeight", "getAppBarHeight", "PrimaryButtonHeight", "getPrimaryButtonHeight", "HorizontalPadding", "getHorizontalPadding", "LU94;", "Lcom/stripe/android/link/theme/LinkColors;", "LocalColors", "LU94;", "LTM2;", "getLinkColors", "(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;", "linkColors", "Lcom/stripe/android/link/theme/LinkShapes;", "getLinkShapes", "(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;", "linkShapes", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Theme.kt\ncom/stripe/android/link/theme/ThemeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,44:1\n76#2:45\n154#3:46\n154#3:47\n154#3:48\n154#3:49\n*S KotlinDebug\n*F\n+ 1 Theme.kt\ncom/stripe/android/link/theme/ThemeKt\n*L\n38#1:45\n11#1:46\n12#1:47\n13#1:48\n14#1:49\n*E\n"})
/* loaded from: classes7.dex */
public final class ThemeKt {
    private static final float AppBarHeight;
    private static final float PrimaryButtonHeight;
    private static final float MinimumTouchTargetSize = C43705k61.m29303g(48);
    private static final float HorizontalPadding = C43705k61.m29303g(20);
    private static final U94<LinkColors> LocalColors = C41806gu0.m37350d(ThemeKt$LocalColors$1.INSTANCE);

    static {
        float f = 56;
        AppBarHeight = C43705k61.m29303g(f);
        PrimaryButtonHeight = C43705k61.m29303g(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
        if ((r10 & 1) != 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DefaultLinkTheme(boolean z, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-327817747);
        if ((i & 14) == 0) {
            if ((i2 & 1) == 0 && mo89518u.mo89536o(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89539n(content)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            mo89518u.mo89626J();
            if ((i & 1) != 0 && !mo89518u.mo89545l()) {
                mo89518u.mo89548k();
            } else {
                if ((i2 & 1) != 0) {
                    z = C51020wS0.m6823a(mo89518u, 0);
                    i3 &= -15;
                }
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-327817747, i3, -1, "com.stripe.android.link.theme.DefaultLinkTheme (Theme.kt:18)");
                }
                LinkColors colors = LinkThemeConfig.INSTANCE.colors(z);
                C41806gu0.m37353a(new W94[]{LocalColors.m81907c(colors)}, C43575jt0.m29791b(mo89518u, 1467984557, true, new ThemeKt$DefaultLinkTheme$1(colors, content, i3)), mo89518u, 56);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ThemeKt$DefaultLinkTheme$2(z, content, i, i2));
        }
    }

    public static final float getAppBarHeight() {
        return AppBarHeight;
    }

    public static final float getHorizontalPadding() {
        return HorizontalPadding;
    }

    @JvmName(name = "getLinkColors")
    public static final LinkColors getLinkColors(TM2 tm2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(tm2, "<this>");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1842304894, i, -1, "com.stripe.android.link.theme.<get-linkColors> (Theme.kt:37)");
        }
        LinkColors linkColors = (LinkColors) interfaceC32720Et0.mo89572c(LocalColors);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        return linkColors;
    }

    @JvmName(name = "getLinkShapes")
    public static final LinkShapes getLinkShapes(TM2 tm2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(tm2, "<this>");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-174507836, i, -1, "com.stripe.android.link.theme.<get-linkShapes> (Theme.kt:42)");
        }
        LinkShapes linkShapes = LinkShapes.INSTANCE;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        return linkShapes;
    }

    public static final float getMinimumTouchTargetSize() {
        return MinimumTouchTargetSize;
    }

    public static final float getPrimaryButtonHeight() {
        return PrimaryButtonHeight;
    }
}
