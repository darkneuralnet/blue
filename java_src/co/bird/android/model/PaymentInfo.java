package co.bird.android.model;

import co.bird.android.model.constant.PaymentProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/PaymentInfo;", "", "paymentMethod", "Lco/bird/android/model/BirdPayment;", "paymentProvider", "Lco/bird/android/model/constant/PaymentProvider;", "(Lco/bird/android/model/BirdPayment;Lco/bird/android/model/constant/PaymentProvider;)V", "getPaymentMethod", "()Lco/bird/android/model/BirdPayment;", "getPaymentProvider", "()Lco/bird/android/model/constant/PaymentProvider;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PaymentInfo {
    private final BirdPayment paymentMethod;
    private final PaymentProvider paymentProvider;

    public PaymentInfo(BirdPayment birdPayment, PaymentProvider paymentProvider) {
        Intrinsics.checkNotNullParameter(paymentProvider, "paymentProvider");
        this.paymentMethod = birdPayment;
        this.paymentProvider = paymentProvider;
    }

    public static /* synthetic */ PaymentInfo copy$default(PaymentInfo paymentInfo, BirdPayment birdPayment, PaymentProvider paymentProvider, int i, Object obj) {
        if ((i & 1) != 0) {
            birdPayment = paymentInfo.paymentMethod;
        }
        if ((i & 2) != 0) {
            paymentProvider = paymentInfo.paymentProvider;
        }
        return paymentInfo.copy(birdPayment, paymentProvider);
    }

    public final BirdPayment component1() {
        return this.paymentMethod;
    }

    public final PaymentProvider component2() {
        return this.paymentProvider;
    }

    public final PaymentInfo copy(BirdPayment birdPayment, PaymentProvider paymentProvider) {
        Intrinsics.checkNotNullParameter(paymentProvider, "paymentProvider");
        return new PaymentInfo(birdPayment, paymentProvider);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentInfo) {
            PaymentInfo paymentInfo = (PaymentInfo) obj;
            return Intrinsics.areEqual(this.paymentMethod, paymentInfo.paymentMethod) && this.paymentProvider == paymentInfo.paymentProvider;
        }
        return false;
    }

    public final BirdPayment getPaymentMethod() {
        return this.paymentMethod;
    }

    public final PaymentProvider getPaymentProvider() {
        return this.paymentProvider;
    }

    public int hashCode() {
        BirdPayment birdPayment = this.paymentMethod;
        return ((birdPayment == null ? 0 : birdPayment.hashCode()) * 31) + this.paymentProvider.hashCode();
    }

    public String toString() {
        BirdPayment birdPayment = this.paymentMethod;
        PaymentProvider paymentProvider = this.paymentProvider;
        return "PaymentInfo(paymentMethod=" + birdPayment + ", paymentProvider=" + paymentProvider + ")";
    }
}
