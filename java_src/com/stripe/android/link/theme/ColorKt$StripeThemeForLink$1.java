package com.stripe.android.link.theme;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ColorKt$StripeThemeForLink$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ColorKt$StripeThemeForLink$1(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
        super(2);
        this.$content = function2;
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
            C35528Qt0.m87816Z(-1574000156, i, -1, "com.stripe.android.link.theme.StripeThemeForLink.<anonymous> (Color.kt:86)");
        }
        this.$content.invoke(interfaceC32720Et0, Integer.valueOf(this.$$dirty & 14));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
