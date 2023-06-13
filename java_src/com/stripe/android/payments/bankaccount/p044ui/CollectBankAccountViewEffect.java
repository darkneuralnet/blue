package com.stripe.android.payments.bankaccount.p044ui;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;", "", "()V", "FinishWithResult", "OpenConnectionsFlow", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewEffect */
/* loaded from: classes7.dex */
public abstract class CollectBankAccountViewEffect {

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;", "(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;)V", "getResult", "()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewEffect$FinishWithResult */
    /* loaded from: classes7.dex */
    public static final class FinishWithResult extends CollectBankAccountViewEffect {
        public static final int $stable = 0;
        private final CollectBankAccountResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FinishWithResult(CollectBankAccountResult result) {
            super(null);
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }

        public static /* synthetic */ FinishWithResult copy$default(FinishWithResult finishWithResult, CollectBankAccountResult collectBankAccountResult, int i, Object obj) {
            if ((i & 1) != 0) {
                collectBankAccountResult = finishWithResult.result;
            }
            return finishWithResult.copy(collectBankAccountResult);
        }

        public final CollectBankAccountResult component1() {
            return this.result;
        }

        public final FinishWithResult copy(CollectBankAccountResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new FinishWithResult(result);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FinishWithResult) && Intrinsics.areEqual(this.result, ((FinishWithResult) obj).result);
        }

        public final CollectBankAccountResult getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            CollectBankAccountResult collectBankAccountResult = this.result;
            return "FinishWithResult(result=" + collectBankAccountResult + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;", "publishableKey", "", "financialConnectionsSessionSecret", NamedConstantsKt.STRIPE_ACCOUNT_ID, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFinancialConnectionsSessionSecret", "()Ljava/lang/String;", "getPublishableKey", "getStripeAccountId", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewEffect$OpenConnectionsFlow */
    /* loaded from: classes7.dex */
    public static final class OpenConnectionsFlow extends CollectBankAccountViewEffect {
        public static final int $stable = 0;
        private final String financialConnectionsSessionSecret;
        private final String publishableKey;
        private final String stripeAccountId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenConnectionsFlow(String publishableKey, String financialConnectionsSessionSecret, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(financialConnectionsSessionSecret, "financialConnectionsSessionSecret");
            this.publishableKey = publishableKey;
            this.financialConnectionsSessionSecret = financialConnectionsSessionSecret;
            this.stripeAccountId = str;
        }

        public static /* synthetic */ OpenConnectionsFlow copy$default(OpenConnectionsFlow openConnectionsFlow, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openConnectionsFlow.publishableKey;
            }
            if ((i & 2) != 0) {
                str2 = openConnectionsFlow.financialConnectionsSessionSecret;
            }
            if ((i & 4) != 0) {
                str3 = openConnectionsFlow.stripeAccountId;
            }
            return openConnectionsFlow.copy(str, str2, str3);
        }

        public final String component1() {
            return this.publishableKey;
        }

        public final String component2() {
            return this.financialConnectionsSessionSecret;
        }

        public final String component3() {
            return this.stripeAccountId;
        }

        public final OpenConnectionsFlow copy(String publishableKey, String financialConnectionsSessionSecret, String str) {
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(financialConnectionsSessionSecret, "financialConnectionsSessionSecret");
            return new OpenConnectionsFlow(publishableKey, financialConnectionsSessionSecret, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OpenConnectionsFlow) {
                OpenConnectionsFlow openConnectionsFlow = (OpenConnectionsFlow) obj;
                return Intrinsics.areEqual(this.publishableKey, openConnectionsFlow.publishableKey) && Intrinsics.areEqual(this.financialConnectionsSessionSecret, openConnectionsFlow.financialConnectionsSessionSecret) && Intrinsics.areEqual(this.stripeAccountId, openConnectionsFlow.stripeAccountId);
            }
            return false;
        }

        public final String getFinancialConnectionsSessionSecret() {
            return this.financialConnectionsSessionSecret;
        }

        public final String getPublishableKey() {
            return this.publishableKey;
        }

        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }

        public int hashCode() {
            int hashCode = ((this.publishableKey.hashCode() * 31) + this.financialConnectionsSessionSecret.hashCode()) * 31;
            String str = this.stripeAccountId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.publishableKey;
            String str2 = this.financialConnectionsSessionSecret;
            String str3 = this.stripeAccountId;
            return "OpenConnectionsFlow(publishableKey=" + str + ", financialConnectionsSessionSecret=" + str2 + ", stripeAccountId=" + str3 + ")";
        }
    }

    public /* synthetic */ CollectBankAccountViewEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CollectBankAccountViewEffect() {
    }
}
