package com.stripe.android.paymentsheet.addresselement;

import android.content.Context;
import androidx.compose.p003ui.platform.C11411h;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m28432d2 = {"", "isEnabled", "", Entry.TYPE_TEXT, "Lkotlin/Function0;", "", "onButtonClick", "AddressElementPrimaryButton", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;I)V", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddressElementPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressElementPrimaryButton.kt\ncom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,84:1\n76#2:85\n174#3:86\n*S KotlinDebug\n*F\n+ 1 AddressElementPrimaryButton.kt\ncom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt\n*L\n37#1:85\n41#1:86\n*E\n"})
/* loaded from: classes7.dex */
public final class AddressElementPrimaryButtonKt {
    public static final void AddressElementPrimaryButton(boolean z, String text, Function0<Unit> onButtonClick, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        AbstractC44199kw1 m28152a;
        float m77588b;
        InterfaceC32720Et0 interfaceC32720Et02;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-776211579);
        if ((i & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(text)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89539n(onButtonClick)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-776211579, i6, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementPrimaryButton (AddressElementPrimaryButton.kt:29)");
            }
            Context context = (Context) mo89518u.mo89572c(C11411h.m68324g());
            StripeTheme stripeTheme = StripeTheme.INSTANCE;
            long m8179b = C50619vm0.m8179b(StripeThemeKt.getBackgroundColor(stripeTheme.getPrimaryButtonStyle(), context));
            long m8179b2 = C50619vm0.m8179b(StripeThemeKt.getOnBackgroundColor(stripeTheme.getPrimaryButtonStyle(), context));
            C20064eZ m41178a = C20466fZ.m41178a(C43705k61.m29303g(stripeTheme.getPrimaryButtonStyle().getShape().getBorderStrokeWidth()), C50619vm0.m8179b(StripeThemeKt.getBorderStrokeColor(stripeTheme.getPrimaryButtonStyle(), context)));
            C38649bc5 m61175a = C39242cc5.m61175a(stripeTheme.getPrimaryButtonStyle().getShape().getCornerRadius());
            Integer fontFamily = stripeTheme.getPrimaryButtonStyle().getTypography().getFontFamily();
            if (fontFamily != null) {
                m28152a = C44792lw1.m26659b(C47757qw1.m16775b(fontFamily.intValue(), null, 0, 0, 14, null));
            } else {
                m28152a = AbstractC44199kw1.f95230c.m28152a();
            }
            G26 g26 = new G26(0L, stripeTheme.getPrimaryButtonStyle().getTypography().m116683getFontSizeXSAIIZE(), null, null, null, m28152a, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262109, null);
            W94[] w94Arr = new W94[1];
            U94<Float> m75931a = C37220Xz0.m75931a();
            C36986Wz0 c36986Wz0 = C36986Wz0.f42427a;
            int i7 = C36986Wz0.f42428b;
            if (z) {
                m77588b = c36986Wz0.m77587c(mo89518u, i7);
            } else {
                m77588b = c36986Wz0.m77588b(mo89518u, i7);
            }
            w94Arr[0] = m75931a.m81907c(Float.valueOf(m77588b));
            interfaceC32720Et02 = mo89518u;
            C41806gu0.m37353a(w94Arr, C43575jt0.m29791b(interfaceC32720Et02, -833091899, true, new AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1(onButtonClick, z, m61175a, m41178a, m8179b, i6, text, m8179b2, g26)), interfaceC32720Et02, 56);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AddressElementPrimaryButtonKt$AddressElementPrimaryButton$2(z, text, onButtonClick, i));
        }
    }
}
