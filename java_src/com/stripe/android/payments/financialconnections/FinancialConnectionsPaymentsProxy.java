package com.stripe.android.payments.financialconnections;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;", "", "present", "", "financialConnectionsSessionClientSecret", "", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface FinancialConnectionsPaymentsProxy {
    public static final Companion Companion = Companion.$$INSTANCE;

    void present(String str, String str2, String str3);

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ<\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\b\b\u0002\u0010\r\u001a\u00020\u000e¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy$Companion;", "", "()V", "create", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "onComplete", "Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;", "", "provider", "Lkotlin/Function0;", "isFinancialConnectionsAvailable", "Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;", "fragment", "Landroidx/fragment/app/Fragment;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FinancialConnectionsPaymentsProxy create$default(Companion companion, Fragment fragment, Function1 function1, Function0 function0, IsFinancialConnectionsAvailable isFinancialConnectionsAvailable, int i, Object obj) {
            if ((i & 4) != 0) {
                function0 = new FinancialConnectionsPaymentsProxy$Companion$create$1(fragment, function1);
            }
            if ((i & 8) != 0) {
                isFinancialConnectionsAvailable = new DefaultIsFinancialConnectionsAvailable();
            }
            return companion.create(fragment, function1, function0, isFinancialConnectionsAvailable);
        }

        public final FinancialConnectionsPaymentsProxy create(Fragment fragment, Function1<? super FinancialConnectionsSheetResult, Unit> onComplete, Function0<? extends FinancialConnectionsPaymentsProxy> provider, IsFinancialConnectionsAvailable isFinancialConnectionsAvailable) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(onComplete, "onComplete");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
            if (isFinancialConnectionsAvailable.invoke()) {
                return provider.invoke();
            }
            return new UnsupportedFinancialConnectionsPaymentsProxy();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FinancialConnectionsPaymentsProxy create$default(Companion companion, AppCompatActivity appCompatActivity, Function1 function1, Function0 function0, IsFinancialConnectionsAvailable isFinancialConnectionsAvailable, int i, Object obj) {
            if ((i & 4) != 0) {
                function0 = new FinancialConnectionsPaymentsProxy$Companion$create$2(appCompatActivity, function1);
            }
            if ((i & 8) != 0) {
                isFinancialConnectionsAvailable = new DefaultIsFinancialConnectionsAvailable();
            }
            return companion.create(appCompatActivity, function1, function0, isFinancialConnectionsAvailable);
        }

        public final FinancialConnectionsPaymentsProxy create(AppCompatActivity activity, Function1<? super FinancialConnectionsSheetResult, Unit> onComplete, Function0<? extends FinancialConnectionsPaymentsProxy> provider, IsFinancialConnectionsAvailable isFinancialConnectionsAvailable) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(onComplete, "onComplete");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
            if (isFinancialConnectionsAvailable.invoke()) {
                return provider.invoke();
            }
            return new UnsupportedFinancialConnectionsPaymentsProxy();
        }
    }
}
