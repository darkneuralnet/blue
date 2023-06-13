package com.stripe.android.paymentsheet.model;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0013\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "", "errorMessage", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;)V", "getErrorMessage", "()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;", "FinishProcessing", "Reset", "StartProcessing", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$FinishProcessing;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$Reset;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$StartProcessing;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class PaymentSheetViewState {
    private final BaseSheetViewModel.UserErrorMessage errorMessage;

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$FinishProcessing;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "onComplete", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getOnComplete", "()Lkotlin/jvm/functions/Function0;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class FinishProcessing extends PaymentSheetViewState {
        public static final int $stable = 0;
        private final Function0<Unit> onComplete;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FinishProcessing(Function0<Unit> onComplete) {
            super(null, 1, null);
            Intrinsics.checkNotNullParameter(onComplete, "onComplete");
            this.onComplete = onComplete;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FinishProcessing copy$default(FinishProcessing finishProcessing, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                function0 = finishProcessing.onComplete;
            }
            return finishProcessing.copy(function0);
        }

        public final Function0<Unit> component1() {
            return this.onComplete;
        }

        public final FinishProcessing copy(Function0<Unit> onComplete) {
            Intrinsics.checkNotNullParameter(onComplete, "onComplete");
            return new FinishProcessing(onComplete);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FinishProcessing) && Intrinsics.areEqual(this.onComplete, ((FinishProcessing) obj).onComplete);
        }

        public final Function0<Unit> getOnComplete() {
            return this.onComplete;
        }

        public int hashCode() {
            return this.onComplete.hashCode();
        }

        public String toString() {
            Function0<Unit> function0 = this.onComplete;
            return "FinishProcessing(onComplete=" + function0 + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$Reset;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "message", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;)V", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Reset extends PaymentSheetViewState {
        public static final int $stable = 0;
        private final BaseSheetViewModel.UserErrorMessage message;

        public Reset() {
            this(null, 1, null);
        }

        private final BaseSheetViewModel.UserErrorMessage component1() {
            return this.message;
        }

        public static /* synthetic */ Reset copy$default(Reset reset, BaseSheetViewModel.UserErrorMessage userErrorMessage, int i, Object obj) {
            if ((i & 1) != 0) {
                userErrorMessage = reset.message;
            }
            return reset.copy(userErrorMessage);
        }

        public final Reset copy(BaseSheetViewModel.UserErrorMessage userErrorMessage) {
            return new Reset(userErrorMessage);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Reset) && Intrinsics.areEqual(this.message, ((Reset) obj).message);
        }

        public int hashCode() {
            BaseSheetViewModel.UserErrorMessage userErrorMessage = this.message;
            if (userErrorMessage == null) {
                return 0;
            }
            return userErrorMessage.hashCode();
        }

        public String toString() {
            BaseSheetViewModel.UserErrorMessage userErrorMessage = this.message;
            return "Reset(message=" + userErrorMessage + ")";
        }

        public /* synthetic */ Reset(BaseSheetViewModel.UserErrorMessage userErrorMessage, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : userErrorMessage);
        }

        public Reset(BaseSheetViewModel.UserErrorMessage userErrorMessage) {
            super(userErrorMessage, null);
            this.message = userErrorMessage;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$StartProcessing;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class StartProcessing extends PaymentSheetViewState {
        public static final int $stable = 0;
        public static final StartProcessing INSTANCE = new StartProcessing();

        private StartProcessing() {
            super(null, null);
        }
    }

    public /* synthetic */ PaymentSheetViewState(BaseSheetViewModel.UserErrorMessage userErrorMessage, DefaultConstructorMarker defaultConstructorMarker) {
        this(userErrorMessage);
    }

    public final BaseSheetViewModel.UserErrorMessage getErrorMessage() {
        return this.errorMessage;
    }

    private PaymentSheetViewState(BaseSheetViewModel.UserErrorMessage userErrorMessage) {
        this.errorMessage = userErrorMessage;
    }

    public /* synthetic */ PaymentSheetViewState(BaseSheetViewModel.UserErrorMessage userErrorMessage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : userErrorMessage, null);
    }
}
