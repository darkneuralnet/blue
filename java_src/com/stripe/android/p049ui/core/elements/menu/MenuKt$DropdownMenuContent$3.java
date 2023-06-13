package com.stripe.android.p049ui.core.elements.menu;

import androidx.compose.p003ui.graphics.C11333f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.menu.MenuKt$DropdownMenuContent$3 */
/* loaded from: classes7.dex */
public final class MenuKt$DropdownMenuContent$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1<InterfaceC52420yo2, Unit> $content;
    final /* synthetic */ KX2<Boolean> $expandedStates;
    final /* synthetic */ int $initialFirstVisibleItemIndex;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ EX2<C11333f> $transformOriginState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MenuKt$DropdownMenuContent$3(KX2<Boolean> kx2, EX2<C11333f> ex2, int i, InterfaceC41563gV2 interfaceC41563gV2, Function1<? super InterfaceC52420yo2, Unit> function1, int i2, int i3) {
        super(2);
        this.$expandedStates = kx2;
        this.$transformOriginState = ex2;
        this.$initialFirstVisibleItemIndex = i;
        this.$modifier = interfaceC41563gV2;
        this.$content = function1;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        MenuKt.DropdownMenuContent(this.$expandedStates, this.$transformOriginState, this.$initialFirstVisibleItemIndex, this.$modifier, this.$content, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
