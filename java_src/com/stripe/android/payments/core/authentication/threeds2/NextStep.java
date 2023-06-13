package com.stripe.android.payments.core.authentication.threeds2;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.transaction.InitChallengeArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", "", "()V", "Complete", "StartChallenge", "StartFallback", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$Complete;", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartChallenge;", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartFallback;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class NextStep {

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$Complete;", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V", "getResult", "()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Complete extends NextStep {
        public static final int $stable = 8;
        private final PaymentFlowResult.Unvalidated result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Complete(PaymentFlowResult.Unvalidated result) {
            super(null);
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }

        public static /* synthetic */ Complete copy$default(Complete complete, PaymentFlowResult.Unvalidated unvalidated, int i, Object obj) {
            if ((i & 1) != 0) {
                unvalidated = complete.result;
            }
            return complete.copy(unvalidated);
        }

        public final PaymentFlowResult.Unvalidated component1() {
            return this.result;
        }

        public final Complete copy(PaymentFlowResult.Unvalidated result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new Complete(result);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Complete) && Intrinsics.areEqual(this.result, ((Complete) obj).result);
        }

        public final PaymentFlowResult.Unvalidated getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            PaymentFlowResult.Unvalidated unvalidated = this.result;
            return "Complete(result=" + unvalidated + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartChallenge;", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", "args", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;", "(Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;)V", "getArgs", "()Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class StartChallenge extends NextStep {
        public static final int $stable = 8;
        private final InitChallengeArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartChallenge(InitChallengeArgs args) {
            super(null);
            Intrinsics.checkNotNullParameter(args, "args");
            this.args = args;
        }

        public static /* synthetic */ StartChallenge copy$default(StartChallenge startChallenge, InitChallengeArgs initChallengeArgs, int i, Object obj) {
            if ((i & 1) != 0) {
                initChallengeArgs = startChallenge.args;
            }
            return startChallenge.copy(initChallengeArgs);
        }

        public final InitChallengeArgs component1() {
            return this.args;
        }

        public final StartChallenge copy(InitChallengeArgs args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new StartChallenge(args);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartChallenge) && Intrinsics.areEqual(this.args, ((StartChallenge) obj).args);
        }

        public final InitChallengeArgs getArgs() {
            return this.args;
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        public String toString() {
            InitChallengeArgs initChallengeArgs = this.args;
            return "StartChallenge(args=" + initChallengeArgs + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartFallback;", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", "args", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V", "getArgs", "()Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class StartFallback extends NextStep {
        public static final int $stable = 8;
        private final PaymentBrowserAuthContract.Args args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartFallback(PaymentBrowserAuthContract.Args args) {
            super(null);
            Intrinsics.checkNotNullParameter(args, "args");
            this.args = args;
        }

        public static /* synthetic */ StartFallback copy$default(StartFallback startFallback, PaymentBrowserAuthContract.Args args, int i, Object obj) {
            if ((i & 1) != 0) {
                args = startFallback.args;
            }
            return startFallback.copy(args);
        }

        public final PaymentBrowserAuthContract.Args component1() {
            return this.args;
        }

        public final StartFallback copy(PaymentBrowserAuthContract.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new StartFallback(args);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartFallback) && Intrinsics.areEqual(this.args, ((StartFallback) obj).args);
        }

        public final PaymentBrowserAuthContract.Args getArgs() {
            return this.args;
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        public String toString() {
            PaymentBrowserAuthContract.Args args = this.args;
            return "StartFallback(args=" + args + ")";
        }
    }

    public /* synthetic */ NextStep(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NextStep() {
    }
}
