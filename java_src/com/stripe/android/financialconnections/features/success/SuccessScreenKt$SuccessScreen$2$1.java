package com.stripe.android.financialconnections.features.success;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class SuccessScreenKt$SuccessScreen$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public SuccessScreenKt$SuccessScreen$2$1(Object obj) {
        super(0, obj, SuccessViewModel.class, "onDoneClick", "onDoneClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SuccessViewModel) this.receiver).onDoneClick();
    }
}