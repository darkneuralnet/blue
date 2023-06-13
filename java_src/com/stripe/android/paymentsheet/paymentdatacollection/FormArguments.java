package com.stripe.android.paymentsheet.paymentdatacollection;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.p049ui.core.Amount;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\r\u0010 \u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003Je\u0010(\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0013\u0010+\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020*HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001e¨\u00065"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "Landroid/os/Parcelable;", "paymentMethodCode", "", "Lcom/stripe/android/model/PaymentMethodCode;", "showCheckbox", "", "showCheckboxControlledFields", "merchantName", "amount", "Lcom/stripe/android/ui/core/Amount;", "billingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "shippingDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "initialPaymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "(Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/ui/core/Amount;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lcom/stripe/android/model/PaymentMethodCreateParams;)V", "getAmount", "()Lcom/stripe/android/ui/core/Amount;", "getBillingDetails", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "getInitialPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "getMerchantName", "()Ljava/lang/String;", "getPaymentMethodCode", "getShippingDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "getShowCheckbox", "()Z", "getShowCheckboxControlledFields", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FormArguments implements Parcelable {
    public static final Parcelable.Creator<FormArguments> CREATOR = new Creator();
    private final Amount amount;
    private final PaymentSheet.BillingDetails billingDetails;
    private final PaymentMethodCreateParams initialPaymentMethodCreateParams;
    private final String merchantName;
    private final String paymentMethodCode;
    private final AddressDetails shippingDetails;
    private final boolean showCheckbox;
    private final boolean showCheckboxControlledFields;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<FormArguments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormArguments createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FormArguments(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (Amount) parcel.readParcelable(FormArguments.class.getClassLoader()), parcel.readInt() == 0 ? null : PaymentSheet.BillingDetails.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AddressDetails.CREATOR.createFromParcel(parcel) : null, (PaymentMethodCreateParams) parcel.readParcelable(FormArguments.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormArguments[] newArray(int i) {
            return new FormArguments[i];
        }
    }

    public FormArguments(String paymentMethodCode, boolean z, boolean z2, String merchantName, Amount amount, PaymentSheet.BillingDetails billingDetails, AddressDetails addressDetails, PaymentMethodCreateParams paymentMethodCreateParams) {
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        this.paymentMethodCode = paymentMethodCode;
        this.showCheckbox = z;
        this.showCheckboxControlledFields = z2;
        this.merchantName = merchantName;
        this.amount = amount;
        this.billingDetails = billingDetails;
        this.shippingDetails = addressDetails;
        this.initialPaymentMethodCreateParams = paymentMethodCreateParams;
    }

    public final String component1() {
        return this.paymentMethodCode;
    }

    public final boolean component2() {
        return this.showCheckbox;
    }

    public final boolean component3() {
        return this.showCheckboxControlledFields;
    }

    public final String component4() {
        return this.merchantName;
    }

    public final Amount component5() {
        return this.amount;
    }

    public final PaymentSheet.BillingDetails component6() {
        return this.billingDetails;
    }

    public final AddressDetails component7() {
        return this.shippingDetails;
    }

    public final PaymentMethodCreateParams component8() {
        return this.initialPaymentMethodCreateParams;
    }

    public final FormArguments copy(String paymentMethodCode, boolean z, boolean z2, String merchantName, Amount amount, PaymentSheet.BillingDetails billingDetails, AddressDetails addressDetails, PaymentMethodCreateParams paymentMethodCreateParams) {
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        return new FormArguments(paymentMethodCode, z, z2, merchantName, amount, billingDetails, addressDetails, paymentMethodCreateParams);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FormArguments) {
            FormArguments formArguments = (FormArguments) obj;
            return Intrinsics.areEqual(this.paymentMethodCode, formArguments.paymentMethodCode) && this.showCheckbox == formArguments.showCheckbox && this.showCheckboxControlledFields == formArguments.showCheckboxControlledFields && Intrinsics.areEqual(this.merchantName, formArguments.merchantName) && Intrinsics.areEqual(this.amount, formArguments.amount) && Intrinsics.areEqual(this.billingDetails, formArguments.billingDetails) && Intrinsics.areEqual(this.shippingDetails, formArguments.shippingDetails) && Intrinsics.areEqual(this.initialPaymentMethodCreateParams, formArguments.initialPaymentMethodCreateParams);
        }
        return false;
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public final PaymentSheet.BillingDetails getBillingDetails() {
        return this.billingDetails;
    }

    public final PaymentMethodCreateParams getInitialPaymentMethodCreateParams() {
        return this.initialPaymentMethodCreateParams;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    public final AddressDetails getShippingDetails() {
        return this.shippingDetails;
    }

    public final boolean getShowCheckbox() {
        return this.showCheckbox;
    }

    public final boolean getShowCheckboxControlledFields() {
        return this.showCheckboxControlledFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.paymentMethodCode.hashCode() * 31;
        boolean z = this.showCheckbox;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.showCheckboxControlledFields;
        int hashCode2 = (((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.merchantName.hashCode()) * 31;
        Amount amount = this.amount;
        int hashCode3 = (hashCode2 + (amount == null ? 0 : amount.hashCode())) * 31;
        PaymentSheet.BillingDetails billingDetails = this.billingDetails;
        int hashCode4 = (hashCode3 + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
        AddressDetails addressDetails = this.shippingDetails;
        int hashCode5 = (hashCode4 + (addressDetails == null ? 0 : addressDetails.hashCode())) * 31;
        PaymentMethodCreateParams paymentMethodCreateParams = this.initialPaymentMethodCreateParams;
        return hashCode5 + (paymentMethodCreateParams != null ? paymentMethodCreateParams.hashCode() : 0);
    }

    public String toString() {
        String str = this.paymentMethodCode;
        boolean z = this.showCheckbox;
        boolean z2 = this.showCheckboxControlledFields;
        String str2 = this.merchantName;
        Amount amount = this.amount;
        PaymentSheet.BillingDetails billingDetails = this.billingDetails;
        AddressDetails addressDetails = this.shippingDetails;
        PaymentMethodCreateParams paymentMethodCreateParams = this.initialPaymentMethodCreateParams;
        return "FormArguments(paymentMethodCode=" + str + ", showCheckbox=" + z + ", showCheckboxControlledFields=" + z2 + ", merchantName=" + str2 + ", amount=" + amount + ", billingDetails=" + billingDetails + ", shippingDetails=" + addressDetails + ", initialPaymentMethodCreateParams=" + paymentMethodCreateParams + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.paymentMethodCode);
        out.writeInt(this.showCheckbox ? 1 : 0);
        out.writeInt(this.showCheckboxControlledFields ? 1 : 0);
        out.writeString(this.merchantName);
        out.writeParcelable(this.amount, i);
        PaymentSheet.BillingDetails billingDetails = this.billingDetails;
        if (billingDetails == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            billingDetails.writeToParcel(out, i);
        }
        AddressDetails addressDetails = this.shippingDetails;
        if (addressDetails == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            addressDetails.writeToParcel(out, i);
        }
        out.writeParcelable(this.initialPaymentMethodCreateParams, i);
    }

    public /* synthetic */ FormArguments(String str, boolean z, boolean z2, String str2, Amount amount, PaymentSheet.BillingDetails billingDetails, AddressDetails addressDetails, PaymentMethodCreateParams paymentMethodCreateParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2, str2, (i & 16) != 0 ? null : amount, (i & 32) != 0 ? null : billingDetails, (i & 64) != 0 ? null : addressDetails, (i & 128) != 0 ? null : paymentMethodCreateParams);
    }
}
