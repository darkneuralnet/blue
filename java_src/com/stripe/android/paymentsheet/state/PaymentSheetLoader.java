package com.stripe.android.paymentsheet.state;

import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.state.PaymentSheetState;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\tJ%\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;", "", "load", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;", "initializationMode", "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;", "paymentSheetConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.android.sdk.onetouch.core.Result.f74995h, "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface PaymentSheetLoader {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object load$default(PaymentSheetLoader paymentSheetLoader, PaymentSheet.InitializationMode initializationMode, PaymentSheet.Configuration configuration, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    configuration = null;
                }
                return paymentSheetLoader.load(initializationMode, configuration, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;", "", "()V", "Failure", "Success", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Failure;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Success;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class Result {
        public static final int $stable = 0;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Failure;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Failure extends Result {
            public static final int $stable = 8;
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }

        @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Success;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;", TransferTable.COLUMN_STATE, "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", "(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;)V", "getState", "()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Success extends Result {
            public static final int $stable = 8;
            private final PaymentSheetState.Full state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(PaymentSheetState.Full state) {
                super(null);
                Intrinsics.checkNotNullParameter(state, "state");
                this.state = state;
            }

            public static /* synthetic */ Success copy$default(Success success, PaymentSheetState.Full full, int i, Object obj) {
                if ((i & 1) != 0) {
                    full = success.state;
                }
                return success.copy(full);
            }

            public final PaymentSheetState.Full component1() {
                return this.state;
            }

            public final Success copy(PaymentSheetState.Full state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return new Success(state);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && Intrinsics.areEqual(this.state, ((Success) obj).state);
            }

            public final PaymentSheetState.Full getState() {
                return this.state;
            }

            public int hashCode() {
                return this.state.hashCode();
            }

            public String toString() {
                PaymentSheetState.Full full = this.state;
                return "Success(state=" + full + ")";
            }
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Result() {
        }
    }

    Object load(PaymentSheet.InitializationMode initializationMode, PaymentSheet.Configuration configuration, Continuation<? super Result> continuation);
}
