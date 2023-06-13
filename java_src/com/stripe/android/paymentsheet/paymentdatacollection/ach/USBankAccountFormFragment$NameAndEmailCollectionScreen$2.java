package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class USBankAccountFormFragment$NameAndEmailCollectionScreen$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ USBankAccountFormScreenState.NameAndEmailCollection $screenState;
    final /* synthetic */ USBankAccountFormFragment $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$NameAndEmailCollectionScreen$2(USBankAccountFormFragment uSBankAccountFormFragment, USBankAccountFormScreenState.NameAndEmailCollection nameAndEmailCollection, int i) {
        super(2);
        this.$tmp0_rcvr = uSBankAccountFormFragment;
        this.$screenState = nameAndEmailCollection;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        this.$tmp0_rcvr.NameAndEmailCollectionScreen(this.$screenState, interfaceC32720Et0, this.$$changed | 1);
    }
}
