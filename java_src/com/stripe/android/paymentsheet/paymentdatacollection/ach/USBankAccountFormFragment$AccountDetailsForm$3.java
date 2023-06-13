package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class USBankAccountFormFragment$AccountDetailsForm$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $bankName;
    final /* synthetic */ String $last4;
    final /* synthetic */ boolean $saveForFutureUsage;
    final /* synthetic */ USBankAccountFormFragment $tmp1_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$AccountDetailsForm$3(USBankAccountFormFragment uSBankAccountFormFragment, String str, String str2, boolean z, int i) {
        super(2);
        this.$tmp1_rcvr = uSBankAccountFormFragment;
        this.$bankName = str;
        this.$last4 = str2;
        this.$saveForFutureUsage = z;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        this.$tmp1_rcvr.AccountDetailsForm(this.$bankName, this.$last4, this.$saveForFutureUsage, interfaceC32720Et0, this.$$changed | 1);
    }
}
