package com.stripe.android.financialconnections.p041ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.CompositionLocalKt$FinancialConnectionsPreview$2 */
/* loaded from: classes7.dex */
public final class CompositionLocalKt$FinancialConnectionsPreview$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> $content;
    final /* synthetic */ boolean $reducedBrandingOverride;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CompositionLocalKt$FinancialConnectionsPreview$2(boolean z, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i, int i2) {
        super(2);
        this.$reducedBrandingOverride = z;
        this.$content = function2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        CompositionLocalKt.FinancialConnectionsPreview(this.$reducedBrandingOverride, this.$content, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}