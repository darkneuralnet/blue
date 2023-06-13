package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/model/IssuingCardPin;", "Lcom/stripe/android/core/model/StripeModel;", "pin", "", "(Ljava/lang/String;)V", "getPin", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class IssuingCardPin implements StripeModel {
    public static final int $stable = 0;
    public static final Parcelable.Creator<IssuingCardPin> CREATOR = new Creator();
    private final String pin;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<IssuingCardPin> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IssuingCardPin createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IssuingCardPin(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IssuingCardPin[] newArray(int i) {
            return new IssuingCardPin[i];
        }
    }

    public IssuingCardPin(String pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.pin = pin;
    }

    public static /* synthetic */ IssuingCardPin copy$default(IssuingCardPin issuingCardPin, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = issuingCardPin.pin;
        }
        return issuingCardPin.copy(str);
    }

    public final String component1() {
        return this.pin;
    }

    public final IssuingCardPin copy(String pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return new IssuingCardPin(pin);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IssuingCardPin) && Intrinsics.areEqual(this.pin, ((IssuingCardPin) obj).pin);
    }

    public final String getPin() {
        return this.pin;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return this.pin.hashCode();
    }

    public String toString() {
        String str = this.pin;
        return "IssuingCardPin(pin=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.pin);
    }
}
