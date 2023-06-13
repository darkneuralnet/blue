package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "VerificationSuccessful", "VerificationDenied", "VerificationNotPerformed", "VerificationAttempted", "ChallengeAdditionalAuth", "ChallengeDecoupledAuth", "VerificationRejected", "InformationOnly", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public enum TransactionStatus {
    VerificationSuccessful("Y"),
    VerificationDenied("N"),
    VerificationNotPerformed("U"),
    VerificationAttempted("A"),
    ChallengeAdditionalAuth(Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE),
    ChallengeDecoupledAuth("D"),
    VerificationRejected("R"),
    InformationOnly("I");
    
    public static final Companion Companion = new Companion(null);
    private final String code;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TransactionStatus fromCode(String str) {
            TransactionStatus[] values;
            if (str == null) {
                return null;
            }
            for (TransactionStatus transactionStatus : TransactionStatus.values()) {
                if (Intrinsics.areEqual(transactionStatus.getCode(), str)) {
                    return transactionStatus;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    TransactionStatus(String str) {
        this.code = str;
    }

    public final String getCode() {
        return this.code;
    }
}
