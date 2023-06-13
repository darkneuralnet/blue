package com.stripe.android.p049ui.core.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$3$2$1$1 */
/* loaded from: classes7.dex */
public final class SimpleDialogElementUIKt$SimpleDialogElementUI$3$2$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function0<Unit> $onConfirmListener;
    final /* synthetic */ EX2<Boolean> $openDialog;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleDialogElementUIKt$SimpleDialogElementUI$3$2$1$1(EX2<Boolean> ex2, Function0<Unit> function0) {
        super(0);
        this.$openDialog = ex2;
        this.$onConfirmListener = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$openDialog.setValue(Boolean.FALSE);
        this.$onConfirmListener.invoke();
    }
}
