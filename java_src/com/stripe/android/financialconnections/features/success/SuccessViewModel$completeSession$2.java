package com.stripe.android.financialconnections.features.success;

import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/success/SuccessState;", "Ldp;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "it", "invoke", "(Lcom/stripe/android/financialconnections/features/success/SuccessState;Ldp;)Lcom/stripe/android/financialconnections/features/success/SuccessState;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class SuccessViewModel$completeSession$2 extends Lambda implements Function2<SuccessState, AbstractC19862dp<? extends FinancialConnectionsSession>, SuccessState> {
    public static final SuccessViewModel$completeSession$2 INSTANCE = new SuccessViewModel$completeSession$2();

    public SuccessViewModel$completeSession$2() {
        super(2);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final SuccessState invoke2(SuccessState execute, AbstractC19862dp<FinancialConnectionsSession> it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return SuccessState.copy$default(execute, null, it, 1, null);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ SuccessState invoke(SuccessState successState, AbstractC19862dp<? extends FinancialConnectionsSession> abstractC19862dp) {
        return invoke2(successState, (AbstractC19862dp<FinancialConnectionsSession>) abstractC19862dp);
    }
}
