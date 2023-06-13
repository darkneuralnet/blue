package com.stripe.android.financialconnections.p041ui.components;

import com.stripe.android.financialconnections.p041ui.components.FinancialConnectionsButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.components.ButtonKt$FinancialConnectionsButton$2 */
/* loaded from: classes7.dex */
public final class ButtonKt$FinancialConnectionsButton$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $loading;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ FinancialConnectionsButton.Size $size;
    final /* synthetic */ FinancialConnectionsButton.Type $type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonKt$FinancialConnectionsButton$2(Function0<Unit> function0, InterfaceC41563gV2 interfaceC41563gV2, FinancialConnectionsButton.Type type, FinancialConnectionsButton.Size size, boolean z, boolean z2, Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i, int i2) {
        super(2);
        this.$onClick = function0;
        this.$modifier = interfaceC41563gV2;
        this.$type = type;
        this.$size = size;
        this.$enabled = z;
        this.$loading = z2;
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
        ButtonKt.FinancialConnectionsButton(this.$onClick, this.$modifier, this.$type, this.$size, this.$enabled, this.$loading, this.$content, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
