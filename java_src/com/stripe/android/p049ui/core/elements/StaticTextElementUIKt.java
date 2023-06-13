package com.stripe.android.p049ui.core.elements;

import com.stripe.android.uicore.elements.H6TextKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/StaticTextElement;", "element", "", "StaticTextElementUI", "(Lcom/stripe/android/ui/core/elements/StaticTextElement;LEt0;I)V", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStaticTextElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticTextElementUI.kt\ncom/stripe/android/ui/core/elements/StaticTextElementUIKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,24:1\n154#2:25\n*S KotlinDebug\n*F\n+ 1 StaticTextElementUI.kt\ncom/stripe/android/ui/core/elements/StaticTextElementUIKt\n*L\n20#1:25\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.StaticTextElementUIKt */
/* loaded from: classes7.dex */
public final class StaticTextElementUIKt {
    public static final void StaticTextElementUI(StaticTextElement element, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(element, "element");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(466172544);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(466172544, i, -1, "com.stripe.android.ui.core.elements.StaticTextElementUI (StaticTextElementUI.kt:13)");
        }
        H6TextKt.H6Text(C40946fS5.m41310c(element.getStringResId(), mo89518u, 0), C41198fs5.m40621a(ND3.m94182k(InterfaceC41563gV2.f82354b0, 0.0f, C43705k61.m29303g(8), 1, null), true, StaticTextElementUIKt$StaticTextElementUI$1.INSTANCE), mo89518u, 0, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new StaticTextElementUIKt$StaticTextElementUI$2(element, i));
        }
    }
}
