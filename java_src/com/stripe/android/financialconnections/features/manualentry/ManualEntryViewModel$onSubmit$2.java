package com.stripe.android.financialconnections.features.manualentry;

import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;", "Ldp;", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "it", "invoke", "(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ldp;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class ManualEntryViewModel$onSubmit$2 extends Lambda implements Function2<ManualEntryState, AbstractC19862dp<? extends LinkAccountSessionPaymentAccount>, ManualEntryState> {
    public static final ManualEntryViewModel$onSubmit$2 INSTANCE = new ManualEntryViewModel$onSubmit$2();

    public ManualEntryViewModel$onSubmit$2() {
        super(2);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final ManualEntryState invoke2(ManualEntryState execute, AbstractC19862dp<LinkAccountSessionPaymentAccount> it) {
        ManualEntryState copy;
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        copy = execute.copy((r18 & 1) != 0 ? execute.payload : null, (r18 & 2) != 0 ? execute.routing : null, (r18 & 4) != 0 ? execute.account : null, (r18 & 8) != 0 ? execute.accountConfirm : null, (r18 & 16) != 0 ? execute.routingError : null, (r18 & 32) != 0 ? execute.accountError : null, (r18 & 64) != 0 ? execute.accountConfirmError : null, (r18 & 128) != 0 ? execute.linkPaymentAccount : it);
        return copy;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ ManualEntryState invoke(ManualEntryState manualEntryState, AbstractC19862dp<? extends LinkAccountSessionPaymentAccount> abstractC19862dp) {
        return invoke2(manualEntryState, (AbstractC19862dp<LinkAccountSessionPaymentAccount>) abstractC19862dp);
    }
}
