package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.uicore.StripeThemeDefaults;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.C1577Df;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lkotlin/Function0;", "", "onClick", "EnterManuallyText", "(Lkotlin/jvm/functions/Function0;LEt0;I)V", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEnterManuallyText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterManuallyText.kt\ncom/stripe/android/paymentsheet/addresselement/EnterManuallyTextKt\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,31:1\n916#2:32\n36#3:33\n1057#4,6:34\n*S KotlinDebug\n*F\n+ 1 EnterManuallyText.kt\ncom/stripe/android/paymentsheet/addresselement/EnterManuallyTextKt\n*L\n16#1:32\n27#1:33\n27#1:34,6\n*E\n"})
/* loaded from: classes7.dex */
public final class EnterManuallyTextKt {
    public static final void EnterManuallyText(Function0<Unit> onClick, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        G26 m105921d;
        int i3;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-776723448);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(onClick)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-776723448, i2, -1, "com.stripe.android.paymentsheet.addresselement.EnterManuallyText (EnterManuallyText.kt:11)");
            }
            mo89518u.mo89638F(1060713600);
            C1577Df.C1578a c1578a = new C1577Df.C1578a(0, 1, null);
            c1578a.m110038i(C40946fS5.m41310c(C19159R.string.stripe_paymentsheet_enter_address_manually, mo89518u, 0));
            C1577Df m110035l = c1578a.m110035l();
            mo89518u.mo89605Q();
            TM2 tm2 = TM2.f35372a;
            int i4 = TM2.f35373b;
            m105921d = r15.m105921d((r42 & 1) != 0 ? r15.f10827a.m105168g() : tm2.m83731a(mo89518u, i4).m94900j(), (r42 & 2) != 0 ? r15.f10827a.m105164k() : StripeThemeDefaults.INSTANCE.getTypography().m116722getLargeFontSizeXSAIIZE(), (r42 & 4) != 0 ? r15.f10827a.m105161n() : null, (r42 & 8) != 0 ? r15.f10827a.m105163l() : null, (r42 & 16) != 0 ? r15.f10827a.m105162m() : null, (r42 & 32) != 0 ? r15.f10827a.m105166i() : null, (r42 & 64) != 0 ? r15.f10827a.m105165j() : null, (r42 & 128) != 0 ? r15.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r15.f10827a.m105170e() : null, (r42 & 512) != 0 ? r15.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r15.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r15.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r15.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r15.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r15.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r15.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r15.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? tm2.m83729c(mo89518u, i4).m104965c().f10828b.m110649m() : null);
            mo89518u.mo89638F(1157296644);
            boolean mo89539n = mo89518u.mo89539n(onClick);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new EnterManuallyTextKt$EnterManuallyText$2$1(onClick);
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            C39317ck0.m61011a(m110035l, null, m105921d, false, 0, 0, null, (Function1) mo89635G, mo89518u, 0, 122);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new EnterManuallyTextKt$EnterManuallyText$3(onClick, i));
        }
    }
}
