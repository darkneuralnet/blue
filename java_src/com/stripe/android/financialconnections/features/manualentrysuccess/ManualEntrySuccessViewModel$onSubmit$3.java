package com.stripe.android.financialconnections.features.manualentrysuccess;

import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessState;", "Ldp;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "it", "invoke", "(Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessState;Ldp;)Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessState;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class ManualEntrySuccessViewModel$onSubmit$3 extends Lambda implements Function2<ManualEntrySuccessState, AbstractC19862dp<? extends FinancialConnectionsSession>, ManualEntrySuccessState> {
    public static final ManualEntrySuccessViewModel$onSubmit$3 INSTANCE = new ManualEntrySuccessViewModel$onSubmit$3();

    public ManualEntrySuccessViewModel$onSubmit$3() {
        super(2);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final ManualEntrySuccessState invoke2(ManualEntrySuccessState execute, AbstractC19862dp<FinancialConnectionsSession> it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return execute.copy(it);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ ManualEntrySuccessState invoke(ManualEntrySuccessState manualEntrySuccessState, AbstractC19862dp<? extends FinancialConnectionsSession> abstractC19862dp) {
        return invoke2(manualEntrySuccessState, (AbstractC19862dp<FinancialConnectionsSession>) abstractC19862dp);
    }
}
