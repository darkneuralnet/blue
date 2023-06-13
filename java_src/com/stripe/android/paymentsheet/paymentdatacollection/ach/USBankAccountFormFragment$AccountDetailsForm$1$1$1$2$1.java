package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class USBankAccountFormFragment$AccountDetailsForm$1$1$1$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ EX2<Boolean> $openDialog;
    final /* synthetic */ InterfaceC48627sP5<Boolean> $processing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$AccountDetailsForm$1$1$1$2$1(InterfaceC48627sP5<Boolean> interfaceC48627sP5, EX2<Boolean> ex2) {
        super(0);
        this.$processing = interfaceC48627sP5;
        this.$openDialog = ex2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$processing.getValue().booleanValue()) {
            return;
        }
        this.$openDialog.setValue(Boolean.TRUE);
    }
}
