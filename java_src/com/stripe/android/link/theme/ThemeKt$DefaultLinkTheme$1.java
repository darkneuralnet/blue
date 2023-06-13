package com.stripe.android.link.theme;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ThemeKt$DefaultLinkTheme$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ LinkColors $colors;
    final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ThemeKt$DefaultLinkTheme$1(LinkColors linkColors, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
        super(2);
        this.$colors = linkColors;
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
            C35528Qt0.m87816Z(1467984557, i, -1, "com.stripe.android.link.theme.DefaultLinkTheme.<anonymous> (Theme.kt:24)");
        }
        UM2.m81596a(this.$colors.getMaterialColors(), TypeKt.getTypography(), TM2.f35372a.m83730b(interfaceC32720Et0, TM2.f35373b), this.$content, interfaceC32720Et0, ((this.$$dirty << 6) & 7168) | 48, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
