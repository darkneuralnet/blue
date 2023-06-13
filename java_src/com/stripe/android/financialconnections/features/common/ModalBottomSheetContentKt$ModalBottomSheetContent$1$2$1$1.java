package com.stripe.android.financialconnections.features.common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ModalBottomSheetContentKt$ModalBottomSheetContent$1$2$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function0<Unit> $onConfirmModalClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetContentKt$ModalBottomSheetContent$1$2$1$1(Function0<Unit> function0) {
        super(0);
        this.$onConfirmModalClick = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onConfirmModalClick.invoke();
    }
}
