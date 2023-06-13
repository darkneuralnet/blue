package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BY\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0002\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0006HÂ\u0003J\t\u0010 \u001a\u00020\u0006HÂ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J_\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0006HÆ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001J\u0013\u0010*\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020)HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016¨\u00065"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionData;", "Landroid/os/Parcelable;", "config", "Lcom/stripe/android/PaymentSessionConfig;", "(Lcom/stripe/android/PaymentSessionConfig;)V", "isShippingInfoRequired", "", "isShippingMethodRequired", "cartTotal", "", "shippingTotal", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "shippingMethod", "Lcom/stripe/android/model/ShippingMethod;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "useGooglePay", "(ZZJJLcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/model/ShippingMethod;Lcom/stripe/android/model/PaymentMethod;Z)V", "getCartTotal", "()J", "isPaymentReadyToCharge", "()Z", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "getShippingMethod", "()Lcom/stripe/android/model/ShippingMethod;", "getShippingTotal", "getUseGooglePay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSessionData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PaymentSessionData> CREATOR = new Creator();
    private final long cartTotal;
    private final boolean isShippingInfoRequired;
    private final boolean isShippingMethodRequired;
    private final PaymentMethod paymentMethod;
    private final ShippingInformation shippingInformation;
    private final ShippingMethod shippingMethod;
    private final long shippingTotal;
    private final boolean useGooglePay;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<PaymentSessionData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSessionData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentSessionData(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong(), parcel.readLong(), parcel.readInt() == 0 ? null : ShippingInformation.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ShippingMethod.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PaymentMethod.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSessionData[] newArray(int i) {
            return new PaymentSessionData[i];
        }
    }

    public PaymentSessionData(boolean z, boolean z2, long j, long j2, ShippingInformation shippingInformation, ShippingMethod shippingMethod, PaymentMethod paymentMethod, boolean z3) {
        this.isShippingInfoRequired = z;
        this.isShippingMethodRequired = z2;
        this.cartTotal = j;
        this.shippingTotal = j2;
        this.shippingInformation = shippingInformation;
        this.shippingMethod = shippingMethod;
        this.paymentMethod = paymentMethod;
        this.useGooglePay = z3;
    }

    private final boolean component1() {
        return this.isShippingInfoRequired;
    }

    private final boolean component2() {
        return this.isShippingMethodRequired;
    }

    public final long component3() {
        return this.cartTotal;
    }

    public final long component4() {
        return this.shippingTotal;
    }

    public final ShippingInformation component5() {
        return this.shippingInformation;
    }

    public final ShippingMethod component6() {
        return this.shippingMethod;
    }

    public final PaymentMethod component7() {
        return this.paymentMethod;
    }

    public final boolean component8() {
        return this.useGooglePay;
    }

    public final PaymentSessionData copy(boolean z, boolean z2, long j, long j2, ShippingInformation shippingInformation, ShippingMethod shippingMethod, PaymentMethod paymentMethod, boolean z3) {
        return new PaymentSessionData(z, z2, j, j2, shippingInformation, shippingMethod, paymentMethod, z3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentSessionData) {
            PaymentSessionData paymentSessionData = (PaymentSessionData) obj;
            return this.isShippingInfoRequired == paymentSessionData.isShippingInfoRequired && this.isShippingMethodRequired == paymentSessionData.isShippingMethodRequired && this.cartTotal == paymentSessionData.cartTotal && this.shippingTotal == paymentSessionData.shippingTotal && Intrinsics.areEqual(this.shippingInformation, paymentSessionData.shippingInformation) && Intrinsics.areEqual(this.shippingMethod, paymentSessionData.shippingMethod) && Intrinsics.areEqual(this.paymentMethod, paymentSessionData.paymentMethod) && this.useGooglePay == paymentSessionData.useGooglePay;
        }
        return false;
    }

    public final long getCartTotal() {
        return this.cartTotal;
    }

    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public final ShippingInformation getShippingInformation() {
        return this.shippingInformation;
    }

    public final ShippingMethod getShippingMethod() {
        return this.shippingMethod;
    }

    public final long getShippingTotal() {
        return this.shippingTotal;
    }

    public final boolean getUseGooglePay() {
        return this.useGooglePay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.isShippingInfoRequired;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.isShippingMethodRequired;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int hashCode = (((((i + i2) * 31) + Long.hashCode(this.cartTotal)) * 31) + Long.hashCode(this.shippingTotal)) * 31;
        ShippingInformation shippingInformation = this.shippingInformation;
        int hashCode2 = (hashCode + (shippingInformation == null ? 0 : shippingInformation.hashCode())) * 31;
        ShippingMethod shippingMethod = this.shippingMethod;
        int hashCode3 = (hashCode2 + (shippingMethod == null ? 0 : shippingMethod.hashCode())) * 31;
        PaymentMethod paymentMethod = this.paymentMethod;
        int hashCode4 = (hashCode3 + (paymentMethod != null ? paymentMethod.hashCode() : 0)) * 31;
        boolean z2 = this.useGooglePay;
        return hashCode4 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isPaymentReadyToCharge() {
        if ((this.paymentMethod == null && !this.useGooglePay) || ((this.isShippingInfoRequired && this.shippingInformation == null) || (this.isShippingMethodRequired && this.shippingMethod == null))) {
            return false;
        }
        return true;
    }

    public String toString() {
        boolean z = this.isShippingInfoRequired;
        boolean z2 = this.isShippingMethodRequired;
        long j = this.cartTotal;
        long j2 = this.shippingTotal;
        ShippingInformation shippingInformation = this.shippingInformation;
        ShippingMethod shippingMethod = this.shippingMethod;
        PaymentMethod paymentMethod = this.paymentMethod;
        boolean z3 = this.useGooglePay;
        return "PaymentSessionData(isShippingInfoRequired=" + z + ", isShippingMethodRequired=" + z2 + ", cartTotal=" + j + ", shippingTotal=" + j2 + ", shippingInformation=" + shippingInformation + ", shippingMethod=" + shippingMethod + ", paymentMethod=" + paymentMethod + ", useGooglePay=" + z3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.isShippingInfoRequired ? 1 : 0);
        out.writeInt(this.isShippingMethodRequired ? 1 : 0);
        out.writeLong(this.cartTotal);
        out.writeLong(this.shippingTotal);
        ShippingInformation shippingInformation = this.shippingInformation;
        if (shippingInformation == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shippingInformation.writeToParcel(out, i);
        }
        ShippingMethod shippingMethod = this.shippingMethod;
        if (shippingMethod == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shippingMethod.writeToParcel(out, i);
        }
        PaymentMethod paymentMethod = this.paymentMethod;
        if (paymentMethod == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            paymentMethod.writeToParcel(out, i);
        }
        out.writeInt(this.useGooglePay ? 1 : 0);
    }

    public /* synthetic */ PaymentSessionData(boolean z, boolean z2, long j, long j2, ShippingInformation shippingInformation, ShippingMethod shippingMethod, PaymentMethod paymentMethod, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? null : shippingInformation, (i & 32) != 0 ? null : shippingMethod, (i & 64) != 0 ? null : paymentMethod, (i & 128) != 0 ? false : z3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentSessionData(PaymentSessionConfig config) {
        this(config.isShippingInfoRequired(), config.isShippingMethodRequired(), 0L, 0L, null, null, null, false, 252, null);
        Intrinsics.checkNotNullParameter(config, "config");
    }
}
