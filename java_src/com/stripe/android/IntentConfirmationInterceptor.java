package com.stripe.android;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011J7\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\fJ7\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/IntentConfirmationInterceptor;", "", "intercept", "Lcom/stripe/android/IntentConfirmationInterceptor$NextStep;", "clientSecret", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", NamedConstantsKt.SHIPPING_VALUES, "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "setupForFutureUsage", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "NextStep", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public interface IntentConfirmationInterceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/IntentConfirmationInterceptor$Companion;", "", "()V", "createIntentCallback", "Lcom/stripe/android/AbsCreateIntentCallback;", "getCreateIntentCallback", "()Lcom/stripe/android/AbsCreateIntentCallback;", "setCreateIntentCallback", "(Lcom/stripe/android/AbsCreateIntentCallback;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static AbsCreateIntentCallback createIntentCallback;

        private Companion() {
        }

        public final AbsCreateIntentCallback getCreateIntentCallback() {
            return createIntentCallback;
        }

        public final void setCreateIntentCallback(AbsCreateIntentCallback absCreateIntentCallback) {
            createIntentCallback = absCreateIntentCallback;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/IntentConfirmationInterceptor$NextStep;", "", "Complete", "Confirm", "Fail", "HandleNextAction", "Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Complete;", "Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;", "Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Fail;", "Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$HandleNextAction;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public interface NextStep {

        @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Complete;", "Lcom/stripe/android/IntentConfirmationInterceptor$NextStep;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "(Lcom/stripe/android/model/StripeIntent;)V", "getStripeIntent", "()Lcom/stripe/android/model/StripeIntent;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Complete implements NextStep {
            public static final int $stable = 8;
            private final StripeIntent stripeIntent;

            public Complete(StripeIntent stripeIntent) {
                Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
                this.stripeIntent = stripeIntent;
            }

            public static /* synthetic */ Complete copy$default(Complete complete, StripeIntent stripeIntent, int i, Object obj) {
                if ((i & 1) != 0) {
                    stripeIntent = complete.stripeIntent;
                }
                return complete.copy(stripeIntent);
            }

            public final StripeIntent component1() {
                return this.stripeIntent;
            }

            public final Complete copy(StripeIntent stripeIntent) {
                Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
                return new Complete(stripeIntent);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Complete) && Intrinsics.areEqual(this.stripeIntent, ((Complete) obj).stripeIntent);
            }

            public final StripeIntent getStripeIntent() {
                return this.stripeIntent;
            }

            public int hashCode() {
                return this.stripeIntent.hashCode();
            }

            public String toString() {
                StripeIntent stripeIntent = this.stripeIntent;
                return "Complete(stripeIntent=" + stripeIntent + ")";
            }
        }

        @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;", "Lcom/stripe/android/IntentConfirmationInterceptor$NextStep;", "confirmParams", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "(Lcom/stripe/android/model/ConfirmStripeIntentParams;)V", "getConfirmParams", "()Lcom/stripe/android/model/ConfirmStripeIntentParams;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Confirm implements NextStep {
            public static final int $stable = 8;
            private final ConfirmStripeIntentParams confirmParams;

            public Confirm(ConfirmStripeIntentParams confirmParams) {
                Intrinsics.checkNotNullParameter(confirmParams, "confirmParams");
                this.confirmParams = confirmParams;
            }

            public static /* synthetic */ Confirm copy$default(Confirm confirm, ConfirmStripeIntentParams confirmStripeIntentParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    confirmStripeIntentParams = confirm.confirmParams;
                }
                return confirm.copy(confirmStripeIntentParams);
            }

            public final ConfirmStripeIntentParams component1() {
                return this.confirmParams;
            }

            public final Confirm copy(ConfirmStripeIntentParams confirmParams) {
                Intrinsics.checkNotNullParameter(confirmParams, "confirmParams");
                return new Confirm(confirmParams);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Confirm) && Intrinsics.areEqual(this.confirmParams, ((Confirm) obj).confirmParams);
            }

            public final ConfirmStripeIntentParams getConfirmParams() {
                return this.confirmParams;
            }

            public int hashCode() {
                return this.confirmParams.hashCode();
            }

            public String toString() {
                ConfirmStripeIntentParams confirmStripeIntentParams = this.confirmParams;
                return "Confirm(confirmParams=" + confirmStripeIntentParams + ")";
            }
        }

        @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Fail;", "Lcom/stripe/android/IntentConfirmationInterceptor$NextStep;", "cause", "", "message", "", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Fail implements NextStep {
            public static final int $stable = 8;
            private final Throwable cause;
            private final String message;

            public Fail(Throwable cause, String message) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                Intrinsics.checkNotNullParameter(message, "message");
                this.cause = cause;
                this.message = message;
            }

            public static /* synthetic */ Fail copy$default(Fail fail, Throwable th, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = fail.cause;
                }
                if ((i & 2) != 0) {
                    str = fail.message;
                }
                return fail.copy(th, str);
            }

            public final Throwable component1() {
                return this.cause;
            }

            public final String component2() {
                return this.message;
            }

            public final Fail copy(Throwable cause, String message) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                Intrinsics.checkNotNullParameter(message, "message");
                return new Fail(cause, message);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Fail) {
                    Fail fail = (Fail) obj;
                    return Intrinsics.areEqual(this.cause, fail.cause) && Intrinsics.areEqual(this.message, fail.message);
                }
                return false;
            }

            public final Throwable getCause() {
                return this.cause;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return (this.cause.hashCode() * 31) + this.message.hashCode();
            }

            public String toString() {
                Throwable th = this.cause;
                String str = this.message;
                return "Fail(cause=" + th + ", message=" + str + ")";
            }
        }

        @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$HandleNextAction;", "Lcom/stripe/android/IntentConfirmationInterceptor$NextStep;", "clientSecret", "", "(Ljava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class HandleNextAction implements NextStep {
            public static final int $stable = 0;
            private final String clientSecret;

            public HandleNextAction(String clientSecret) {
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                this.clientSecret = clientSecret;
            }

            public static /* synthetic */ HandleNextAction copy$default(HandleNextAction handleNextAction, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = handleNextAction.clientSecret;
                }
                return handleNextAction.copy(str);
            }

            public final String component1() {
                return this.clientSecret;
            }

            public final HandleNextAction copy(String clientSecret) {
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                return new HandleNextAction(clientSecret);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HandleNextAction) && Intrinsics.areEqual(this.clientSecret, ((HandleNextAction) obj).clientSecret);
            }

            public final String getClientSecret() {
                return this.clientSecret;
            }

            public int hashCode() {
                return this.clientSecret.hashCode();
            }

            public String toString() {
                String str = this.clientSecret;
                return "HandleNextAction(clientSecret=" + str + ")";
            }
        }
    }

    Object intercept(String str, PaymentMethod paymentMethod, ConfirmPaymentIntentParams.Shipping shipping, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, Continuation<? super NextStep> continuation);

    Object intercept(String str, PaymentMethodCreateParams paymentMethodCreateParams, ConfirmPaymentIntentParams.Shipping shipping, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, Continuation<? super NextStep> continuation);
}
