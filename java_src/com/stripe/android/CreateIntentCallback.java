package com.stripe.android;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0007J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/CreateIntentCallback;", "Lcom/stripe/android/AbsCreateIntentCallback;", "onCreateIntent", "Lcom/stripe/android/CreateIntentCallback$Result;", "paymentMethodId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.android.sdk.onetouch.core.Result.f74995h, "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public interface CreateIntentCallback extends AbsCreateIntentCallback {
    Object onCreateIntent(String str, Continuation<? super Result> continuation);

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/CreateIntentCallback$Result;", "", "Failure", "Success", "Lcom/stripe/android/CreateIntentCallback$Result$Failure;", "Lcom/stripe/android/CreateIntentCallback$Result$Success;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public interface Result {

        @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/CreateIntentCallback$Result$Success;", "Lcom/stripe/android/CreateIntentCallback$Result;", "clientSecret", "", "(Ljava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Success implements Result {
            public static final int $stable = 0;
            private final String clientSecret;

            public Success(String clientSecret) {
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                this.clientSecret = clientSecret;
            }

            public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.clientSecret;
                }
                return success.copy(str);
            }

            public final String component1() {
                return this.clientSecret;
            }

            public final Success copy(String clientSecret) {
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                return new Success(clientSecret);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && Intrinsics.areEqual(this.clientSecret, ((Success) obj).clientSecret);
            }

            public final String getClientSecret() {
                return this.clientSecret;
            }

            public int hashCode() {
                return this.clientSecret.hashCode();
            }

            public String toString() {
                String str = this.clientSecret;
                return "Success(clientSecret=" + str + ")";
            }
        }

        @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00060\u0003j\u0002`\u0004HÀ\u0003¢\u0006\u0002\b\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b\u000fJ#\u0010\u0010\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/CreateIntentCallback$Result$Failure;", "Lcom/stripe/android/CreateIntentCallback$Result;", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "displayMessage", "", "(Ljava/lang/Exception;Ljava/lang/String;)V", "getCause$payments_core_release", "()Ljava/lang/Exception;", "getDisplayMessage$payments_core_release", "()Ljava/lang/String;", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Failure implements Result {
            public static final int $stable = 8;
            private final Exception cause;
            private final String displayMessage;

            public Failure(Exception cause, String str) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
                this.displayMessage = str;
            }

            public static /* synthetic */ Failure copy$default(Failure failure, Exception exc, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = failure.cause;
                }
                if ((i & 2) != 0) {
                    str = failure.displayMessage;
                }
                return failure.copy(exc, str);
            }

            public final Exception component1$payments_core_release() {
                return this.cause;
            }

            public final String component2$payments_core_release() {
                return this.displayMessage;
            }

            public final Failure copy(Exception cause, String str) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                return new Failure(cause, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Failure) {
                    Failure failure = (Failure) obj;
                    return Intrinsics.areEqual(this.cause, failure.cause) && Intrinsics.areEqual(this.displayMessage, failure.displayMessage);
                }
                return false;
            }

            public final Exception getCause$payments_core_release() {
                return this.cause;
            }

            public final String getDisplayMessage$payments_core_release() {
                return this.displayMessage;
            }

            public int hashCode() {
                int hashCode = this.cause.hashCode() * 31;
                String str = this.displayMessage;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                Exception exc = this.cause;
                String str = this.displayMessage;
                return "Failure(cause=" + exc + ", displayMessage=" + str + ")";
            }

            public /* synthetic */ Failure(Exception exc, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(exc, (i & 2) != 0 ? null : str);
            }
        }
    }
}
