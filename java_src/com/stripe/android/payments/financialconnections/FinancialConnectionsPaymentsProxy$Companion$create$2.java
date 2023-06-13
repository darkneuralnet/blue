package com.stripe.android.payments.financialconnections;

import androidx.appcompat.app.AppCompatActivity;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/payments/financialconnections/DefaultFinancialConnectionsPaymentsProxy;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FinancialConnectionsPaymentsProxy$Companion$create$2 extends Lambda implements Function0<DefaultFinancialConnectionsPaymentsProxy> {
    final /* synthetic */ AppCompatActivity $activity;
    final /* synthetic */ Function1<FinancialConnectionsSheetResult, Unit> $onComplete;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FinancialConnectionsPaymentsProxy$Companion$create$2(AppCompatActivity appCompatActivity, Function1<? super FinancialConnectionsSheetResult, Unit> function1) {
        super(0);
        this.$activity = appCompatActivity;
        this.$onComplete = function1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final DefaultFinancialConnectionsPaymentsProxy invoke() {
        return new DefaultFinancialConnectionsPaymentsProxy(FinancialConnectionsSheet.Companion.create(this.$activity, new C19130xaf778c3e(this.$onComplete)));
    }
}
