package com.stripe.android.financialconnections.p041ui.components;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.components.ScaffoldKt$FinancialConnectionsScaffold$1 */
/* loaded from: classes7.dex */
public final class ScaffoldKt$FinancialConnectionsScaffold$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function3<PD3, InterfaceC32720Et0, Integer, Unit> $content;
    final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> $topBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$FinancialConnectionsScaffold$1(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function3<? super PD3, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i) {
        super(2);
        this.$topBar = function2;
        this.$content = function3;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        ScaffoldKt.FinancialConnectionsScaffold(this.$topBar, this.$content, interfaceC32720Et0, this.$$changed | 1);
    }
}
