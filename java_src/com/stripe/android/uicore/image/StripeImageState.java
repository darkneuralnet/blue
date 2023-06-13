package com.stripe.android.uicore.image;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/uicore/image/StripeImageState;", "", "()V", "Error", "Loading", "Success", "Lcom/stripe/android/uicore/image/StripeImageState$Error;", "Lcom/stripe/android/uicore/image/StripeImageState$Loading;", "Lcom/stripe/android/uicore/image/StripeImageState$Success;", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
abstract class StripeImageState {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/uicore/image/StripeImageState$Error;", "Lcom/stripe/android/uicore/image/StripeImageState;", "()V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Error extends StripeImageState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/uicore/image/StripeImageState$Loading;", "Lcom/stripe/android/uicore/image/StripeImageState;", "()V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Loading extends StripeImageState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/uicore/image/StripeImageState$Success;", "Lcom/stripe/android/uicore/image/StripeImageState;", "LnE3;", "component1", "painter", "copy", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "LnE3;", "getPainter", "()LnE3;", "<init>", "(LnE3;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Success extends StripeImageState {
        public static final int $stable = 8;
        private final AbstractC45562nE3 painter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(AbstractC45562nE3 painter) {
            super(null);
            Intrinsics.checkNotNullParameter(painter, "painter");
            this.painter = painter;
        }

        public static /* synthetic */ Success copy$default(Success success, AbstractC45562nE3 abstractC45562nE3, int i, Object obj) {
            if ((i & 1) != 0) {
                abstractC45562nE3 = success.painter;
            }
            return success.copy(abstractC45562nE3);
        }

        public final AbstractC45562nE3 component1() {
            return this.painter;
        }

        public final Success copy(AbstractC45562nE3 painter) {
            Intrinsics.checkNotNullParameter(painter, "painter");
            return new Success(painter);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.painter, ((Success) obj).painter);
        }

        public final AbstractC45562nE3 getPainter() {
            return this.painter;
        }

        public int hashCode() {
            return this.painter.hashCode();
        }

        public String toString() {
            AbstractC45562nE3 abstractC45562nE3 = this.painter;
            return "Success(painter=" + abstractC45562nE3 + ")";
        }
    }

    public /* synthetic */ StripeImageState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private StripeImageState() {
    }
}
