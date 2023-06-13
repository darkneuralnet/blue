package com.stripe.android.p049ui.core.elements;

import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/MandateTextElement;", "element", "", "MandateTextUI", "(Lcom/stripe/android/ui/core/elements/MandateTextElement;LEt0;I)V", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMandateTextUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MandateTextUI.kt\ncom/stripe/android/ui/core/elements/MandateTextUIKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,28:1\n154#2:29\n*S KotlinDebug\n*F\n+ 1 MandateTextUI.kt\ncom/stripe/android/ui/core/elements/MandateTextUIKt\n*L\n24#1:29\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.MandateTextUIKt */
/* loaded from: classes7.dex */
public final class MandateTextUIKt {
    public static final void MandateTextUI(MandateTextElement element, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(element, "element");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1140239160);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1140239160, i, -1, "com.stripe.android.ui.core.elements.MandateTextUI (MandateTextUI.kt:15)");
        }
        int stringResId = element.getStringResId();
        Object[] objArr = new Object[1];
        String merchantName = element.getMerchantName();
        if (merchantName == null) {
            merchantName = "";
        }
        objArr[0] = merchantName;
        String m41309d = C40946fS5.m41309d(stringResId, objArr, mo89518u, 64);
        TM2 tm2 = TM2.f35372a;
        int i2 = TM2.f35373b;
        G26 m104964d = tm2.m83729c(mo89518u, i2).m104964d();
        C38909c26.m62000e(m41309d, C41198fs5.m40621a(ND3.m94182k(InterfaceC41563gV2.f82354b0, 0.0f, C43705k61.m29303g(8), 1, null), true, MandateTextUIKt$MandateTextUI$1.INSTANCE), StripeThemeKt.getStripeColors(tm2, mo89518u, i2).m116700getSubtitle0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, m104964d, mo89518u, 0, 0, 32760);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new MandateTextUIKt$MandateTextUI$2(element, i));
        }
    }
}
