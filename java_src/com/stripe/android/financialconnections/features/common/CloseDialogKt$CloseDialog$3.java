package com.stripe.android.financialconnections.features.common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class CloseDialogKt$CloseDialog$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $onConfirmClick;
    final /* synthetic */ Function0<Unit> $onDismissClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseDialogKt$CloseDialog$3(Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.$onConfirmClick = function0;
        this.$onDismissClick = function02;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        CloseDialogKt.CloseDialog(this.$onConfirmClick, this.$onDismissClick, interfaceC32720Et0, this.$$changed | 1);
    }
}