package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class USBankAccountFormViewModel$registerFragment$1 extends FunctionReferenceImpl implements Function1<CollectBankAccountResult, Unit> {
    public USBankAccountFormViewModel$registerFragment$1(Object obj) {
        super(1, obj, USBankAccountFormViewModel.class, "handleCollectBankAccountResult", "handleCollectBankAccountResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CollectBankAccountResult collectBankAccountResult) {
        invoke2(collectBankAccountResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CollectBankAccountResult p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((USBankAccountFormViewModel) this.receiver).handleCollectBankAccountResult(p0);
    }
}
