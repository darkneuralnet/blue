package com.stripe.android.paymentsheet.addresselement;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X \u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;", "Landroid/os/Parcelable;", "()V", "resultCode", "", "getResultCode$paymentsheet_release", "()I", "Canceled", "Succeeded", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Canceled;", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class AddressLauncherResult implements Parcelable {
    public static final int $stable = 0;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Canceled;", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;", "()V", "resultCode", "", "getResultCode$paymentsheet_release", "()I", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Canceled extends AddressLauncherResult {
        public static final int $stable = 0;
        public static final Canceled INSTANCE = new Canceled();
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Canceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Canceled.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled[] newArray(int i) {
                return new Canceled[i];
            }
        }

        private Canceled() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.AddressLauncherResult
        public int getResultCode$paymentsheet_release() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\r\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\bHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V", "getAddress", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "resultCode", "", "getResultCode$paymentsheet_release", "()I", "component1", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Succeeded extends AddressLauncherResult {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Succeeded> CREATOR = new Creator();
        private final AddressDetails address;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Succeeded> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Succeeded createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Succeeded(AddressDetails.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Succeeded[] newArray(int i) {
                return new Succeeded[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Succeeded(AddressDetails address) {
            super(null);
            Intrinsics.checkNotNullParameter(address, "address");
            this.address = address;
        }

        public static /* synthetic */ Succeeded copy$default(Succeeded succeeded, AddressDetails addressDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                addressDetails = succeeded.address;
            }
            return succeeded.copy(addressDetails);
        }

        public final AddressDetails component1() {
            return this.address;
        }

        public final Succeeded copy(AddressDetails address) {
            Intrinsics.checkNotNullParameter(address, "address");
            return new Succeeded(address);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Succeeded) && Intrinsics.areEqual(this.address, ((Succeeded) obj).address);
        }

        public final AddressDetails getAddress() {
            return this.address;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.AddressLauncherResult
        public int getResultCode$paymentsheet_release() {
            return -1;
        }

        public int hashCode() {
            return this.address.hashCode();
        }

        public String toString() {
            AddressDetails addressDetails = this.address;
            return "Succeeded(address=" + addressDetails + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.address.writeToParcel(out, i);
        }
    }

    public /* synthetic */ AddressLauncherResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getResultCode$paymentsheet_release();

    private AddressLauncherResult() {
    }
}
