package com.stripe.android;

import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.LuxePostConfirmActionRepository;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\b'\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003:\u0001\u001eB\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0002H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00058F¢\u0006\f\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/StripeIntentResult;", "T", "Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/core/model/StripeModel;", "outcomeFromFlow", "", "(I)V", "failureMessage", "", "getFailureMessage", "()Ljava/lang/String;", "intent", "getIntent", "()Lcom/stripe/android/model/StripeIntent;", "luxePostConfirmActionRepository", "Lcom/stripe/android/model/LuxePostConfirmActionRepository;", "getLuxePostConfirmActionRepository$payments_core_release$annotations", "()V", "getLuxePostConfirmActionRepository$payments_core_release", "()Lcom/stripe/android/model/LuxePostConfirmActionRepository;", "setLuxePostConfirmActionRepository$payments_core_release", "(Lcom/stripe/android/model/LuxePostConfirmActionRepository;)V", "outcome", "getOutcome$annotations", "getOutcome", "()I", "determineOutcome", "stripeIntent", "isRequireActionSuccessState", "", "Outcome", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public abstract class StripeIntentResult<T extends StripeIntent> implements StripeModel {
    public static final int $stable = 8;
    private LuxePostConfirmActionRepository luxePostConfirmActionRepository = LuxePostConfirmActionRepository.Companion.getInstance();
    private final int outcomeFromFlow;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/StripeIntentResult$Outcome;", "", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Outcome {
        public static final int CANCELED = 3;
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int FAILED = 2;
        public static final int SUCCEEDED = 1;
        public static final int TIMEDOUT = 4;
        public static final int UNKNOWN = 0;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/StripeIntentResult$Outcome$Companion;", "", "()V", "CANCELED", "", "FAILED", "SUCCEEDED", "TIMEDOUT", "UNKNOWN", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int CANCELED = 3;
            public static final int FAILED = 2;
            public static final int SUCCEEDED = 1;
            public static final int TIMEDOUT = 4;
            public static final int UNKNOWN = 0;

            private Companion() {
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[StripeIntent.Status.values().length];
            try {
                iArr[StripeIntent.Status.RequiresAction.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Status.Canceled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.Status.RequiresPaymentMethod.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StripeIntent.Status.Succeeded.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StripeIntent.Status.RequiresCapture.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StripeIntent.Status.RequiresConfirmation.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StripeIntent.Status.Processing.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StripeIntent.NextActionType.values().length];
            try {
                iArr2[StripeIntent.NextActionType.RedirectToUrl.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[StripeIntent.NextActionType.UseStripeSdk.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[StripeIntent.NextActionType.AlipayRedirect.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[StripeIntent.NextActionType.WeChatPayRedirect.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[StripeIntent.NextActionType.CashAppRedirect.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[StripeIntent.NextActionType.BlikAuthorize.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[StripeIntent.NextActionType.DisplayOxxoDetails.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[StripeIntent.NextActionType.UpiAwaitNotification.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[StripeIntent.NextActionType.VerifyWithMicrodeposits.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public StripeIntentResult(int i) {
        this.outcomeFromFlow = i;
    }

    private final int determineOutcome(StripeIntent stripeIntent, int i) {
        return i != 0 ? i : getOutcome(stripeIntent);
    }

    /* renamed from: getLuxePostConfirmActionRepository$payments_core_release$annotations */
    public static /* synthetic */ void m45548x5720d789() {
    }

    public static /* synthetic */ void getOutcome$annotations() {
    }

    private final boolean isRequireActionSuccessState(StripeIntent stripeIntent) {
        int i;
        StripeIntent.NextActionType nextActionType = stripeIntent.getNextActionType();
        if (nextActionType == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$1[nextActionType.ordinal()];
        }
        switch (i) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return false;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
        }
    }

    public abstract String getFailureMessage();

    public abstract T getIntent();

    public final LuxePostConfirmActionRepository getLuxePostConfirmActionRepository$payments_core_release() {
        return this.luxePostConfirmActionRepository;
    }

    public final int getOutcome() {
        return determineOutcome(getIntent(), this.outcomeFromFlow);
    }

    public final void setLuxePostConfirmActionRepository$payments_core_release(LuxePostConfirmActionRepository luxePostConfirmActionRepository) {
        Intrinsics.checkNotNullParameter(luxePostConfirmActionRepository, "<set-?>");
        this.luxePostConfirmActionRepository = luxePostConfirmActionRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r6 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
        if (isRequireActionSuccessState(getIntent()) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int getOutcome(StripeIntent stripeIntent) {
        boolean z;
        PaymentMethod.Type type;
        Integer postAuthorizeIntentOutcome$payments_core_release = this.luxePostConfirmActionRepository.getPostAuthorizeIntentOutcome$payments_core_release(stripeIntent);
        if (postAuthorizeIntentOutcome$payments_core_release != null) {
            return postAuthorizeIntentOutcome$payments_core_release.intValue();
        }
        StripeIntent.Status status = stripeIntent.getStatus();
        switch (status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()]) {
            case 1:
                if (stripeIntent.getNextActionData() != null) {
                    break;
                }
                return 2;
            case 2:
                return 3;
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
                PaymentMethod paymentMethod = getIntent().getPaymentMethod();
                if (paymentMethod != null && (type = paymentMethod.type) != null && type.hasDelayedSettlement()) {
                    z = true;
                    break;
                } else {
                    z = false;
                    break;
                }
            default:
                return 0;
        }
    }
}
