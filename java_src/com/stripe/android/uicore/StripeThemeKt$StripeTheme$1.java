package com.stripe.android.uicore;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeThemeKt$StripeTheme$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ StripeColors $colors;
    final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> $content;
    final /* synthetic */ StripeShapes $shapes;
    final /* synthetic */ StripeTypography $typography;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StripeThemeKt$StripeTheme$1(StripeColors stripeColors, StripeTypography stripeTypography, int i, StripeShapes stripeShapes, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2) {
        super(2);
        this.$colors = stripeColors;
        this.$typography = stripeTypography;
        this.$$dirty = i;
        this.$shapes = stripeShapes;
        this.$content = function2;
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
            C35528Qt0.m87816Z(-289952640, i, -1, "com.stripe.android.uicore.StripeTheme.<anonymous> (StripeTheme.kt:324)");
        }
        UM2.m81596a(this.$colors.getMaterialColors(), StripeThemeKt.toComposeTypography(this.$typography, interfaceC32720Et0, (this.$$dirty >> 6) & 14), StripeThemeKt.toComposeShapes(this.$shapes, interfaceC32720Et0, (this.$$dirty >> 3) & 14).getMaterial(), this.$content, interfaceC32720Et0, this.$$dirty & 7168, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
