package com.stripe.android.p049ui.core.elements;

import com.stripe.android.p049ui.core.C19369R;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.text.EmbeddableImage;
import com.stripe.android.uicore.text.HtmlKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"", "AffirmElementUI", "(LEt0;I)V", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAffirmElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AffirmElementUI.kt\ncom/stripe/android/ui/core/elements/AffirmElementUIKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,31:1\n154#2:32\n*S KotlinDebug\n*F\n+ 1 AffirmElementUI.kt\ncom/stripe/android/ui/core/elements/AffirmElementUIKt\n*L\n28#1:32\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.AffirmElementUIKt */
/* loaded from: classes7.dex */
public final class AffirmElementUIKt {
    public static final void AffirmElementUI(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Map mapOf;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-172812001);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-172812001, i, -1, "com.stripe.android.ui.core.elements.AffirmElementUI (AffirmElementUI.kt:16)");
            }
            String m41310c = C40946fS5.m41310c(C19369R.string.affirm_buy_now_pay_later, mo89518u, 0);
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("affirm", new EmbeddableImage.Drawable(C19369R.C19370drawable.stripe_ic_affirm_logo, C19369R.string.stripe_paymentsheet_payment_method_affirm, null, 4, null)));
            TM2 tm2 = TM2.f35372a;
            int i2 = TM2.f35373b;
            HtmlKt.m116769Htmlm4MizFo(m41310c, ND3.m94182k(InterfaceC41563gV2.f82354b0, 0.0f, C43705k61.m29303g(8), 1, null), mapOf, StripeThemeKt.getStripeColors(tm2, mo89518u, i2).m116700getSubtitle0d7_KjU(), tm2.m83729c(mo89518u, i2).m104958j(), false, null, 0, null, mo89518u, ((0 | EmbeddableImage.Drawable.$stable) << 6) | 48, 480);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AffirmElementUIKt$AffirmElementUI$1(i));
        }
    }
}
