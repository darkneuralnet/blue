package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.uicore.PrimaryButtonStyle;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/paymentsheet/ui/PrimaryButtonKt$LabelUI$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,254:1\n154#2:255\n*S KotlinDebug\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/paymentsheet/ui/PrimaryButtonKt$LabelUI$1\n*L\n250#1:255\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.PrimaryButtonKt$LabelUI$1 */
/* loaded from: classes7.dex */
public final class PrimaryButtonKt$LabelUI$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButtonKt$LabelUI$1(String str, int i) {
        super(2);
        this.$label = str;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(52319215, i, -1, "com.stripe.android.paymentsheet.ui.LabelUI.<anonymous> (PrimaryButton.kt:243)");
        }
        int m16678a = C47801r06.f106195b.m16678a();
        float f = 4;
        C38909c26.m62000e(this.$label, ND3.m94181l(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(f), C43705k61.m29303g(f), C43705k61.m29303g(f), C43705k61.m29303g(5)), 0L, 0L, null, null, null, 0L, null, C47801r06.m16685g(m16678a), 0L, 0, false, 0, null, StripeThemeKt.getComposeTextStyle(StripeTheme.INSTANCE.getPrimaryButtonStyle(), interfaceC32720Et0, PrimaryButtonStyle.$stable), interfaceC32720Et0, this.$$dirty & 14, 0, 32252);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
