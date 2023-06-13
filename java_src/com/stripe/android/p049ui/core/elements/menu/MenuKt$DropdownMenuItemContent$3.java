package com.stripe.android.p049ui.core.elements.menu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.menu.MenuKt$DropdownMenuItemContent$3 */
/* loaded from: classes7.dex */
public final class MenuKt$DropdownMenuItemContent$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> $content;
    final /* synthetic */ PD3 $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC48104rX2 $interactionSource;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MenuKt$DropdownMenuItemContent$3(Function0<Unit> function0, InterfaceC41563gV2 interfaceC41563gV2, boolean z, PD3 pd3, InterfaceC48104rX2 interfaceC48104rX2, Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i, int i2) {
        super(2);
        this.$onClick = function0;
        this.$modifier = interfaceC41563gV2;
        this.$enabled = z;
        this.$contentPadding = pd3;
        this.$interactionSource = interfaceC48104rX2;
        this.$content = function3;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        MenuKt.DropdownMenuItemContent(this.$onClick, this.$modifier, this.$enabled, this.$contentPadding, this.$interactionSource, this.$content, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
