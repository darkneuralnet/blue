package com.stripe.android.paymentsheet.p047ui;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p003ui.platform.C11411h;
import com.stripe.android.uicore.StripeThemeDefaults;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.StripeTypography;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"", "error", "LgV2;", "modifier", "", "ErrorMessage", "(Ljava/lang/String;LgV2;LEt0;II)V", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nErrorMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorMessage.kt\ncom/stripe/android/paymentsheet/ui/ErrorMessageKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,47:1\n76#2:48\n76#2:49\n36#3:50\n36#3:57\n1057#4,6:51\n1057#4,3:58\n1060#4,3:63\n174#5:61\n88#6:62\n*S KotlinDebug\n*F\n+ 1 ErrorMessage.kt\ncom/stripe/android/paymentsheet/ui/ErrorMessageKt\n*L\n22#1:48\n23#1:49\n26#1:50\n32#1:57\n26#1:51,6\n32#1:58,3\n32#1:63,3\n35#1:61\n35#1:62\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.ErrorMessageKt */
/* loaded from: classes7.dex */
public final class ErrorMessageKt {
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ErrorMessage(String error, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        InterfaceC41563gV2.C20912a c20912a;
        boolean mo89539n;
        Object mo89635G;
        Integer fontFamily;
        boolean mo89539n2;
        Object mo89635G2;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(228805126);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(error)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            i6 = i3;
            if ((i6 & 91) != 18 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
                interfaceC32720Et02 = mo89518u;
            } else {
                if (i7 == 0) {
                    c20912a = InterfaceC41563gV2.f82354b0;
                } else {
                    c20912a = obj;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(228805126, i6, -1, "com.stripe.android.paymentsheet.ui.ErrorMessage (ErrorMessage.kt:17)");
                }
                Context context = (Context) mo89518u.mo89572c(C11411h.m68324g());
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                TM2 tm2 = TM2.f35372a;
                int i8 = TM2.f35373b;
                StripeTypography stripeTypography = StripeThemeKt.getStripeTypography(tm2, mo89518u, i8);
                int i9 = StripeTypography.$stable;
                mo89518u.mo89638F(1157296644);
                mo89539n = mo89518u.mo89539n(stripeTypography);
                mo89635G = mo89518u.mo89635G();
                if (!mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    fontFamily = stripeTypography.getFontFamily();
                    if (fontFamily != null || (r2 = C49785uM4.m10395h(context, fontFamily.intValue())) == null) {
                        Typeface typeface = Typeface.DEFAULT;
                    }
                    mo89635G = typeface;
                    mo89518u.mo89503z(mo89635G);
                }
                mo89518u.mo89605Q();
                Typeface typeface2 = (Typeface) mo89635G;
                mo89518u.mo89638F(1157296644);
                mo89539n2 = mo89518u.mo89539n(stripeTypography);
                mo89635G2 = mo89518u.mo89635G();
                if (!mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G2 = M26.m95978b(interfaceC41273g01.mo3399s0(C43705k61.m29303g(C43705k61.m29303g(M26.m95972h(StripeThemeDefaults.INSTANCE.getTypography().m116724getSmallFontSizeXSAIIZE())) * stripeTypography.getFontSizeMultiplier())));
                    mo89518u.mo89503z(mo89635G2);
                }
                mo89518u.mo89605Q();
                long m95969k = ((M26) mo89635G2).m95969k();
                long m94906d = tm2.m83731a(mo89518u, i8).m94906d();
                Intrinsics.checkNotNullExpressionValue(typeface2, "typeface");
                interfaceC32720Et02 = mo89518u;
                C38909c26.m62000e(error, c20912a, m94906d, m95969k, null, null, C9434Xd.m76752a(typeface2), 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et02, (i6 & 14) | (i6 & 112), 0, 65456);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                obj = c20912a;
            }
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w == null) {
                mo89512w.mo20405a(new ErrorMessageKt$ErrorMessage$1(error, obj, i, i2));
                return;
            }
            return;
        }
        obj = interfaceC41563gV2;
        i6 = i3;
        if ((i6 & 91) != 18) {
        }
        if (i7 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        Context context2 = (Context) mo89518u.mo89572c(C11411h.m68324g());
        InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        TM2 tm22 = TM2.f35372a;
        int i82 = TM2.f35373b;
        StripeTypography stripeTypography2 = StripeThemeKt.getStripeTypography(tm22, mo89518u, i82);
        int i92 = StripeTypography.$stable;
        mo89518u.mo89638F(1157296644);
        mo89539n = mo89518u.mo89539n(stripeTypography2);
        mo89635G = mo89518u.mo89635G();
        if (!mo89539n) {
        }
        fontFamily = stripeTypography2.getFontFamily();
        if (fontFamily != null) {
        }
        Typeface typeface3 = Typeface.DEFAULT;
        mo89635G = typeface3;
        mo89518u.mo89503z(mo89635G);
        mo89518u.mo89605Q();
        Typeface typeface22 = (Typeface) mo89635G;
        mo89518u.mo89638F(1157296644);
        mo89539n2 = mo89518u.mo89539n(stripeTypography2);
        mo89635G2 = mo89518u.mo89635G();
        if (!mo89539n2) {
        }
        mo89635G2 = M26.m95978b(interfaceC41273g012.mo3399s0(C43705k61.m29303g(C43705k61.m29303g(M26.m95972h(StripeThemeDefaults.INSTANCE.getTypography().m116724getSmallFontSizeXSAIIZE())) * stripeTypography2.getFontSizeMultiplier())));
        mo89518u.mo89503z(mo89635G2);
        mo89518u.mo89605Q();
        long m95969k2 = ((M26) mo89635G2).m95969k();
        long m94906d2 = tm22.m83731a(mo89518u, i82).m94906d();
        Intrinsics.checkNotNullExpressionValue(typeface22, "typeface");
        interfaceC32720Et02 = mo89518u;
        C38909c26.m62000e(error, c20912a, m94906d2, m95969k2, null, null, C9434Xd.m76752a(typeface22), 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et02, (i6 & 14) | (i6 & 112), 0, 65456);
        if (C35528Qt0.m87827O()) {
        }
        obj = c20912a;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w == null) {
        }
    }
}
