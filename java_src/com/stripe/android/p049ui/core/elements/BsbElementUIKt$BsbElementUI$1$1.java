package com.stripe.android.p049ui.core.elements;

import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.BsbElementUIKt$BsbElementUI$1$1 */
/* loaded from: classes7.dex */
public final class BsbElementUIKt$BsbElementUI$1$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ InterfaceC48627sP5<String> $bankName$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BsbElementUIKt$BsbElementUI$1$1(InterfaceC48627sP5<String> interfaceC48627sP5) {
        super(2);
        this.$bankName$delegate = interfaceC48627sP5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        String BsbElementUI$lambda$1;
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1564787790, i, -1, "com.stripe.android.ui.core.elements.BsbElementUI.<anonymous>.<anonymous> (BsbElementUI.kt:48)");
        }
        BsbElementUI$lambda$1 = BsbElementUIKt.BsbElementUI$lambda$1(this.$bankName$delegate);
        if (BsbElementUI$lambda$1 != null) {
            C38909c26.m62000e(BsbElementUI$lambda$1, null, StripeThemeKt.getStripeColors(TM2.f35372a, interfaceC32720Et0, TM2.f35373b).m116700getSubtitle0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et0, 0, 0, 65530);
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
