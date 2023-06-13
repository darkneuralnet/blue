package com.stripe.android.p049ui.core.elements.menu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.menu.MenuKt$DropdownMenuContent$2 */
/* loaded from: classes7.dex */
public final class MenuKt$DropdownMenuContent$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function1<InterfaceC52420yo2, Unit> $content;
    final /* synthetic */ int $initialFirstVisibleItemIndex;
    final /* synthetic */ InterfaceC41563gV2 $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MenuKt$DropdownMenuContent$2(int i, int i2, InterfaceC41563gV2 interfaceC41563gV2, Function1<? super InterfaceC52420yo2, Unit> function1) {
        super(2);
        this.$initialFirstVisibleItemIndex = i;
        this.$$dirty = i2;
        this.$modifier = interfaceC41563gV2;
        this.$content = function1;
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
            C35528Qt0.m87816Z(1322882799, i, -1, "com.stripe.android.ui.core.elements.menu.DropdownMenuContent.<anonymous> (Menu.kt:139)");
        }
        C41738gn2.m37481a(ND3.m94182k(this.$modifier, 0.0f, MenuKt.getDropdownMenuVerticalPadding(), 1, null), C32443Do2.m109920a(this.$initialFirstVisibleItemIndex, 0, interfaceC32720Et0, (this.$$dirty >> 6) & 14, 2), null, false, null, null, null, false, this.$content, interfaceC32720Et0, (this.$$dirty << 12) & 234881024, 252);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
