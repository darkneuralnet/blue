package com.stripe.android.financialconnections.features.attachpayment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class AttachPaymentScreenKt$AttachPaymentScreen$2 extends FunctionReferenceImpl implements Function0<Unit> {
    public AttachPaymentScreenKt$AttachPaymentScreen$2(Object obj) {
        super(0, obj, AttachPaymentViewModel.class, "onSelectAnotherBank", "onSelectAnotherBank()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AttachPaymentViewModel) this.receiver).onSelectAnotherBank();
    }
}
