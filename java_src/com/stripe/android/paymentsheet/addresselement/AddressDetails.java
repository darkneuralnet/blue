package com.stripe.android.paymentsheet.addresselement;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\fJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0007\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "Landroid/os/Parcelable;", "name", "", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Lcom/stripe/android/paymentsheet/PaymentSheet$Address;", "phoneNumber", "isCheckboxSelected", "", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Address;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAddress", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getName", "()Ljava/lang/String;", "getPhoneNumber", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Address;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AddressDetails implements Parcelable {
    public static final int $stable = 0;
    public static final String KEY = "AddressDetails";
    private final PaymentSheet.Address address;
    private final Boolean isCheckboxSelected;
    private final String name;
    private final String phoneNumber;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AddressDetails> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressDetails$Companion;", "", "()V", "KEY", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<AddressDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            Boolean bool = null;
            PaymentSheet.Address createFromParcel = parcel.readInt() == 0 ? null : PaymentSheet.Address.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AddressDetails(readString, createFromParcel, readString2, bool);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressDetails[] newArray(int i) {
            return new AddressDetails[i];
        }
    }

    public AddressDetails() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ AddressDetails copy$default(AddressDetails addressDetails, String str, PaymentSheet.Address address, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressDetails.name;
        }
        if ((i & 2) != 0) {
            address = addressDetails.address;
        }
        if ((i & 4) != 0) {
            str2 = addressDetails.phoneNumber;
        }
        if ((i & 8) != 0) {
            bool = addressDetails.isCheckboxSelected;
        }
        return addressDetails.copy(str, address, str2, bool);
    }

    public final String component1() {
        return this.name;
    }

    public final PaymentSheet.Address component2() {
        return this.address;
    }

    public final String component3() {
        return this.phoneNumber;
    }

    public final Boolean component4() {
        return this.isCheckboxSelected;
    }

    public final AddressDetails copy(String str, PaymentSheet.Address address, String str2, Boolean bool) {
        return new AddressDetails(str, address, str2, bool);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddressDetails) {
            AddressDetails addressDetails = (AddressDetails) obj;
            return Intrinsics.areEqual(this.name, addressDetails.name) && Intrinsics.areEqual(this.address, addressDetails.address) && Intrinsics.areEqual(this.phoneNumber, addressDetails.phoneNumber) && Intrinsics.areEqual(this.isCheckboxSelected, addressDetails.isCheckboxSelected);
        }
        return false;
    }

    public final PaymentSheet.Address getAddress() {
        return this.address;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PaymentSheet.Address address = this.address;
        int hashCode2 = (hashCode + (address == null ? 0 : address.hashCode())) * 31;
        String str2 = this.phoneNumber;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isCheckboxSelected;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isCheckboxSelected() {
        return this.isCheckboxSelected;
    }

    public String toString() {
        String str = this.name;
        PaymentSheet.Address address = this.address;
        String str2 = this.phoneNumber;
        Boolean bool = this.isCheckboxSelected;
        return "AddressDetails(name=" + str + ", address=" + address + ", phoneNumber=" + str2 + ", isCheckboxSelected=" + bool + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.name);
        PaymentSheet.Address address = this.address;
        if (address == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            address.writeToParcel(out, i);
        }
        out.writeString(this.phoneNumber);
        Boolean bool = this.isCheckboxSelected;
        if (bool == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public AddressDetails(String str, PaymentSheet.Address address, String str2, Boolean bool) {
        this.name = str;
        this.address = address;
        this.phoneNumber = str2;
        this.isCheckboxSelected = bool;
    }

    public /* synthetic */ AddressDetails(String str, PaymentSheet.Address address, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : address, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool);
    }
}
