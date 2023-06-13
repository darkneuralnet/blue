package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.view.DateUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB\u0015\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetails;", "Lcom/stripe/android/core/model/StripeModel;", "paymentDetails", "", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "(Ljava/util/List;)V", "getPaymentDetails", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "BankAccount", "BillingAddress", "Card", "PaymentDetails", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ConsumerPaymentDetails implements StripeModel {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ConsumerPaymentDetails> CREATOR = new Creator();
    private final List<PaymentDetails> paymentDetails;

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "id", "", "isDefault", "", "bankIconCode", "bankName", "last4", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankIconCode", "()Ljava/lang/String;", "getBankName", "getId", "()Z", "getLast4", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class BankAccount extends PaymentDetails {
        public static final int $stable = 0;
        public static final String type = "bank_account";
        private final String bankIconCode;
        private final String bankName;

        /* renamed from: id */
        private final String f75351id;
        private final boolean isDefault;
        private final String last4;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<BankAccount> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount$Companion;", "", "()V", "type", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
        public static final class Creator implements Parcelable.Creator<BankAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BankAccount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankAccount(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BankAccount[] newArray(int i) {
                return new BankAccount[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankAccount(String id, boolean z, String str, String bankName, String last4) {
            super(id, z, type, null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(bankName, "bankName");
            Intrinsics.checkNotNullParameter(last4, "last4");
            this.f75351id = id;
            this.isDefault = z;
            this.bankIconCode = str;
            this.bankName = bankName;
            this.last4 = last4;
        }

        public static /* synthetic */ BankAccount copy$default(BankAccount bankAccount, String str, boolean z, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bankAccount.getId();
            }
            if ((i & 2) != 0) {
                z = bankAccount.isDefault();
            }
            boolean z2 = z;
            if ((i & 4) != 0) {
                str2 = bankAccount.bankIconCode;
            }
            String str5 = str2;
            if ((i & 8) != 0) {
                str3 = bankAccount.bankName;
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                str4 = bankAccount.last4;
            }
            return bankAccount.copy(str, z2, str5, str6, str4);
        }

        public final String component1() {
            return getId();
        }

        public final boolean component2() {
            return isDefault();
        }

        public final String component3() {
            return this.bankIconCode;
        }

        public final String component4() {
            return this.bankName;
        }

        public final String component5() {
            return this.last4;
        }

        public final BankAccount copy(String id, boolean z, String str, String bankName, String last4) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(bankName, "bankName");
            Intrinsics.checkNotNullParameter(last4, "last4");
            return new BankAccount(id, z, str, bankName, last4);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BankAccount) {
                BankAccount bankAccount = (BankAccount) obj;
                return Intrinsics.areEqual(getId(), bankAccount.getId()) && isDefault() == bankAccount.isDefault() && Intrinsics.areEqual(this.bankIconCode, bankAccount.bankIconCode) && Intrinsics.areEqual(this.bankName, bankAccount.bankName) && Intrinsics.areEqual(this.last4, bankAccount.last4);
            }
            return false;
        }

        public final String getBankIconCode() {
            return this.bankIconCode;
        }

        public final String getBankName() {
            return this.bankName;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        public String getId() {
            return this.f75351id;
        }

        public final String getLast4() {
            return this.last4;
        }

        public int hashCode() {
            int hashCode = getId().hashCode() * 31;
            boolean isDefault = isDefault();
            int i = isDefault;
            if (isDefault) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            String str = this.bankIconCode;
            return ((((i2 + (str == null ? 0 : str.hashCode())) * 31) + this.bankName.hashCode()) * 31) + this.last4.hashCode();
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        public boolean isDefault() {
            return this.isDefault;
        }

        public String toString() {
            String id = getId();
            boolean isDefault = isDefault();
            String str = this.bankIconCode;
            String str2 = this.bankName;
            String str3 = this.last4;
            return "BankAccount(id=" + id + ", isDefault=" + isDefault + ", bankIconCode=" + str + ", bankName=" + str2 + ", last4=" + str3 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f75351id);
            out.writeInt(this.isDefault ? 1 : 0);
            out.writeString(this.bankIconCode);
            out.writeString(this.bankName);
            out.writeString(this.last4);
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;", "Landroid/os/Parcelable;", "countryCode", "Lcom/stripe/android/core/model/CountryCode;", "postalCode", "", "(Lcom/stripe/android/core/model/CountryCode;Ljava/lang/String;)V", "getCountryCode", "()Lcom/stripe/android/core/model/CountryCode;", "getPostalCode", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class BillingAddress implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<BillingAddress> CREATOR = new Creator();
        private final CountryCode countryCode;
        private final String postalCode;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<BillingAddress> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingAddress createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillingAddress((CountryCode) parcel.readParcelable(BillingAddress.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingAddress[] newArray(int i) {
                return new BillingAddress[i];
            }
        }

        public BillingAddress(CountryCode countryCode, String str) {
            this.countryCode = countryCode;
            this.postalCode = str;
        }

        public static /* synthetic */ BillingAddress copy$default(BillingAddress billingAddress, CountryCode countryCode, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                countryCode = billingAddress.countryCode;
            }
            if ((i & 2) != 0) {
                str = billingAddress.postalCode;
            }
            return billingAddress.copy(countryCode, str);
        }

        public final CountryCode component1() {
            return this.countryCode;
        }

        public final String component2() {
            return this.postalCode;
        }

        public final BillingAddress copy(CountryCode countryCode, String str) {
            return new BillingAddress(countryCode, str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BillingAddress) {
                BillingAddress billingAddress = (BillingAddress) obj;
                return Intrinsics.areEqual(this.countryCode, billingAddress.countryCode) && Intrinsics.areEqual(this.postalCode, billingAddress.postalCode);
            }
            return false;
        }

        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        public final String getPostalCode() {
            return this.postalCode;
        }

        public int hashCode() {
            CountryCode countryCode = this.countryCode;
            int hashCode = (countryCode == null ? 0 : countryCode.hashCode()) * 31;
            String str = this.postalCode;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            CountryCode countryCode = this.countryCode;
            String str = this.postalCode;
            return "BillingAddress(countryCode=" + countryCode + ", postalCode=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeParcelable(this.countryCode, i);
            out.writeString(this.postalCode);
        }
    }

    @Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 52\u00020\u0001:\u00015BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003J[\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\t\u0010*\u001a\u00020\u0007HÖ\u0001J\u0013\u0010+\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u0007HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b \u0010\u001c¨\u00066"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetails$Card;", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "id", "", "isDefault", "", "expiryYear", "", "expiryMonth", AccountRangeJsonParser.FIELD_BRAND, "Lcom/stripe/android/model/CardBrand;", "last4", "cvcCheck", "Lcom/stripe/android/model/CvcCheck;", "billingAddress", "Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;", "(Ljava/lang/String;ZIILcom/stripe/android/model/CardBrand;Ljava/lang/String;Lcom/stripe/android/model/CvcCheck;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;)V", "getBillingAddress", "()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getCvcCheck", "()Lcom/stripe/android/model/CvcCheck;", "getExpiryMonth", "()I", "getExpiryYear", "getId", "()Ljava/lang/String;", "()Z", "isExpired", "getLast4", "requiresCardDetailsRecollection", "getRequiresCardDetailsRecollection", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Card extends PaymentDetails {
        public static final String type = "card";
        private final BillingAddress billingAddress;
        private final CardBrand brand;
        private final CvcCheck cvcCheck;
        private final int expiryMonth;
        private final int expiryYear;

        /* renamed from: id */
        private final String f75352id;
        private final boolean isDefault;
        private final String last4;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Card> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetails$Card$Companion;", "", "()V", "type", "", "getAddressFromMap", "Lkotlin/Pair;", "cardPaymentMethodCreateParamsMap", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Pair<String, Object> getAddressFromMap(Map<String, ? extends Object> cardPaymentMethodCreateParamsMap) {
                Map map;
                Object obj;
                Map map2;
                Map mapOf;
                Intrinsics.checkNotNullParameter(cardPaymentMethodCreateParamsMap, "cardPaymentMethodCreateParamsMap");
                Object obj2 = cardPaymentMethodCreateParamsMap.get("billing_details");
                if (obj2 instanceof Map) {
                    map = (Map) obj2;
                } else {
                    map = null;
                }
                if (map != null) {
                    obj = map.get(PaymentMethod.BillingDetails.PARAM_ADDRESS);
                } else {
                    obj = null;
                }
                if (obj instanceof Map) {
                    map2 = (Map) obj;
                } else {
                    map2 = null;
                }
                if (map2 != null) {
                    mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("country_code", map2.get("country")), TuplesKt.m28425to("postal_code", map2.get("postal_code")));
                    return TuplesKt.m28425to("billing_address", mapOf);
                }
                return null;
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Card> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Card(parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), CardBrand.valueOf(parcel.readString()), parcel.readString(), CvcCheck.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : BillingAddress.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        public /* synthetic */ Card(String str, boolean z, int i, int i2, CardBrand cardBrand, String str2, CvcCheck cvcCheck, BillingAddress billingAddress, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, i, i2, cardBrand, str2, cvcCheck, (i3 & 128) != 0 ? null : billingAddress);
        }

        public final String component1() {
            return getId();
        }

        public final boolean component2() {
            return isDefault();
        }

        public final int component3() {
            return this.expiryYear;
        }

        public final int component4() {
            return this.expiryMonth;
        }

        public final CardBrand component5() {
            return this.brand;
        }

        public final String component6() {
            return this.last4;
        }

        public final CvcCheck component7() {
            return this.cvcCheck;
        }

        public final BillingAddress component8() {
            return this.billingAddress;
        }

        public final Card copy(String id, boolean z, int i, int i2, CardBrand brand, String last4, CvcCheck cvcCheck, BillingAddress billingAddress) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(brand, "brand");
            Intrinsics.checkNotNullParameter(last4, "last4");
            Intrinsics.checkNotNullParameter(cvcCheck, "cvcCheck");
            return new Card(id, z, i, i2, brand, last4, cvcCheck, billingAddress);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Card) {
                Card card = (Card) obj;
                return Intrinsics.areEqual(getId(), card.getId()) && isDefault() == card.isDefault() && this.expiryYear == card.expiryYear && this.expiryMonth == card.expiryMonth && this.brand == card.brand && Intrinsics.areEqual(this.last4, card.last4) && this.cvcCheck == card.cvcCheck && Intrinsics.areEqual(this.billingAddress, card.billingAddress);
            }
            return false;
        }

        public final BillingAddress getBillingAddress() {
            return this.billingAddress;
        }

        public final CardBrand getBrand() {
            return this.brand;
        }

        public final CvcCheck getCvcCheck() {
            return this.cvcCheck;
        }

        public final int getExpiryMonth() {
            return this.expiryMonth;
        }

        public final int getExpiryYear() {
            return this.expiryYear;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        public String getId() {
            return this.f75352id;
        }

        public final String getLast4() {
            return this.last4;
        }

        public final boolean getRequiresCardDetailsRecollection() {
            return isExpired() || this.cvcCheck.getRequiresRecollection();
        }

        public int hashCode() {
            int hashCode = getId().hashCode() * 31;
            boolean isDefault = isDefault();
            int i = isDefault;
            if (isDefault) {
                i = 1;
            }
            int hashCode2 = (((((((((((hashCode + i) * 31) + Integer.hashCode(this.expiryYear)) * 31) + Integer.hashCode(this.expiryMonth)) * 31) + this.brand.hashCode()) * 31) + this.last4.hashCode()) * 31) + this.cvcCheck.hashCode()) * 31;
            BillingAddress billingAddress = this.billingAddress;
            return hashCode2 + (billingAddress == null ? 0 : billingAddress.hashCode());
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        public boolean isDefault() {
            return this.isDefault;
        }

        public final boolean isExpired() {
            return !DateUtils.isExpiryDataValid(this.expiryMonth, this.expiryYear);
        }

        public String toString() {
            String id = getId();
            boolean isDefault = isDefault();
            int i = this.expiryYear;
            int i2 = this.expiryMonth;
            CardBrand cardBrand = this.brand;
            String str = this.last4;
            CvcCheck cvcCheck = this.cvcCheck;
            BillingAddress billingAddress = this.billingAddress;
            return "Card(id=" + id + ", isDefault=" + isDefault + ", expiryYear=" + i + ", expiryMonth=" + i2 + ", brand=" + cardBrand + ", last4=" + str + ", cvcCheck=" + cvcCheck + ", billingAddress=" + billingAddress + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f75352id);
            out.writeInt(this.isDefault ? 1 : 0);
            out.writeInt(this.expiryYear);
            out.writeInt(this.expiryMonth);
            out.writeString(this.brand.name());
            out.writeString(this.last4);
            out.writeString(this.cvcCheck.name());
            BillingAddress billingAddress = this.billingAddress;
            if (billingAddress == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            billingAddress.writeToParcel(out, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(String id, boolean z, int i, int i2, CardBrand brand, String last4, CvcCheck cvcCheck, BillingAddress billingAddress) {
            super(id, z, "card", null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(brand, "brand");
            Intrinsics.checkNotNullParameter(last4, "last4");
            Intrinsics.checkNotNullParameter(cvcCheck, "cvcCheck");
            this.f75352id = id;
            this.isDefault = z;
            this.expiryYear = i;
            this.expiryMonth = i2;
            this.brand = brand;
            this.last4 = last4;
            this.cvcCheck = cvcCheck;
            this.billingAddress = billingAddress;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ConsumerPaymentDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerPaymentDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(ConsumerPaymentDetails.class.getClassLoader()));
            }
            return new ConsumerPaymentDetails(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerPaymentDetails[] newArray(int i) {
            return new ConsumerPaymentDetails[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u001f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "Landroid/os/Parcelable;", "id", "", "isDefault", "", "type", "(Ljava/lang/String;ZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "()Z", "getType", "Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;", "Lcom/stripe/android/model/ConsumerPaymentDetails$Card;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class PaymentDetails implements Parcelable {
        public static final int $stable = 0;

        /* renamed from: id */
        private final String f75353id;
        private final boolean isDefault;
        private final String type;

        public /* synthetic */ PaymentDetails(String str, boolean z, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, str2);
        }

        public String getId() {
            return this.f75353id;
        }

        public String getType() {
            return this.type;
        }

        public boolean isDefault() {
            return this.isDefault;
        }

        private PaymentDetails(String str, boolean z, String str2) {
            this.f75353id = str;
            this.isDefault = z;
            this.type = str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConsumerPaymentDetails(List<? extends PaymentDetails> paymentDetails) {
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        this.paymentDetails = paymentDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConsumerPaymentDetails copy$default(ConsumerPaymentDetails consumerPaymentDetails, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = consumerPaymentDetails.paymentDetails;
        }
        return consumerPaymentDetails.copy(list);
    }

    public final List<PaymentDetails> component1() {
        return this.paymentDetails;
    }

    public final ConsumerPaymentDetails copy(List<? extends PaymentDetails> paymentDetails) {
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        return new ConsumerPaymentDetails(paymentDetails);
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
        return (obj instanceof ConsumerPaymentDetails) && Intrinsics.areEqual(this.paymentDetails, ((ConsumerPaymentDetails) obj).paymentDetails);
    }

    public final List<PaymentDetails> getPaymentDetails() {
        return this.paymentDetails;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return this.paymentDetails.hashCode();
    }

    public String toString() {
        List<PaymentDetails> list = this.paymentDetails;
        return "ConsumerPaymentDetails(paymentDetails=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        List<PaymentDetails> list = this.paymentDetails;
        out.writeInt(list.size());
        for (PaymentDetails paymentDetails : list) {
            out.writeParcelable(paymentDetails, i);
        }
    }
}
