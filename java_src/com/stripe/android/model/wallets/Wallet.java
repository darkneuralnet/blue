package com.stripe.android.model.wallets;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.Address;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0007\b\t\n\u000b\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/model/wallets/Wallet;", "Lcom/stripe/android/core/model/StripeModel;", "walletType", "Lcom/stripe/android/model/wallets/Wallet$Type;", "(Lcom/stripe/android/model/wallets/Wallet$Type;)V", "getWalletType$payments_core_release", "()Lcom/stripe/android/model/wallets/Wallet$Type;", "AmexExpressCheckoutWallet", "ApplePayWallet", "GooglePayWallet", "MasterpassWallet", "SamsungPayWallet", "Type", "VisaCheckoutWallet", "Lcom/stripe/android/model/wallets/Wallet$AmexExpressCheckoutWallet;", "Lcom/stripe/android/model/wallets/Wallet$ApplePayWallet;", "Lcom/stripe/android/model/wallets/Wallet$GooglePayWallet;", "Lcom/stripe/android/model/wallets/Wallet$MasterpassWallet;", "Lcom/stripe/android/model/wallets/Wallet$SamsungPayWallet;", "Lcom/stripe/android/model/wallets/Wallet$VisaCheckoutWallet;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class Wallet implements StripeModel {
    public static final int $stable = 0;
    private final Type walletType;

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/model/wallets/Wallet$AmexExpressCheckoutWallet;", "Lcom/stripe/android/model/wallets/Wallet;", "dynamicLast4", "", "(Ljava/lang/String;)V", "getDynamicLast4", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class AmexExpressCheckoutWallet extends Wallet {
        public static final int $stable = 0;
        public static final Parcelable.Creator<AmexExpressCheckoutWallet> CREATOR = new Creator();
        private final String dynamicLast4;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<AmexExpressCheckoutWallet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AmexExpressCheckoutWallet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AmexExpressCheckoutWallet(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AmexExpressCheckoutWallet[] newArray(int i) {
                return new AmexExpressCheckoutWallet[i];
            }
        }

        public AmexExpressCheckoutWallet(String str) {
            super(Type.AmexExpressCheckout, null);
            this.dynamicLast4 = str;
        }

        public static /* synthetic */ AmexExpressCheckoutWallet copy$default(AmexExpressCheckoutWallet amexExpressCheckoutWallet, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = amexExpressCheckoutWallet.dynamicLast4;
            }
            return amexExpressCheckoutWallet.copy(str);
        }

        public final String component1() {
            return this.dynamicLast4;
        }

        public final AmexExpressCheckoutWallet copy(String str) {
            return new AmexExpressCheckoutWallet(str);
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
            return (obj instanceof AmexExpressCheckoutWallet) && Intrinsics.areEqual(this.dynamicLast4, ((AmexExpressCheckoutWallet) obj).dynamicLast4);
        }

        public final String getDynamicLast4() {
            return this.dynamicLast4;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.dynamicLast4;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.dynamicLast4;
            return "AmexExpressCheckoutWallet(dynamicLast4=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.dynamicLast4);
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/model/wallets/Wallet$ApplePayWallet;", "Lcom/stripe/android/model/wallets/Wallet;", "dynamicLast4", "", "(Ljava/lang/String;)V", "getDynamicLast4", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ApplePayWallet extends Wallet {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ApplePayWallet> CREATOR = new Creator();
        private final String dynamicLast4;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<ApplePayWallet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApplePayWallet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApplePayWallet(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApplePayWallet[] newArray(int i) {
                return new ApplePayWallet[i];
            }
        }

        public ApplePayWallet(String str) {
            super(Type.ApplePay, null);
            this.dynamicLast4 = str;
        }

        public static /* synthetic */ ApplePayWallet copy$default(ApplePayWallet applePayWallet, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = applePayWallet.dynamicLast4;
            }
            return applePayWallet.copy(str);
        }

        public final String component1() {
            return this.dynamicLast4;
        }

        public final ApplePayWallet copy(String str) {
            return new ApplePayWallet(str);
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
            return (obj instanceof ApplePayWallet) && Intrinsics.areEqual(this.dynamicLast4, ((ApplePayWallet) obj).dynamicLast4);
        }

        public final String getDynamicLast4() {
            return this.dynamicLast4;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.dynamicLast4;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.dynamicLast4;
            return "ApplePayWallet(dynamicLast4=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.dynamicLast4);
        }
    }

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/model/wallets/Wallet$GooglePayWallet;", "Lcom/stripe/android/model/wallets/Wallet;", "Landroid/os/Parcelable;", "dynamicLast4", "", "(Ljava/lang/String;)V", "getDynamicLast4", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class GooglePayWallet extends Wallet implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<GooglePayWallet> CREATOR = new Creator();
        private final String dynamicLast4;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<GooglePayWallet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePayWallet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GooglePayWallet(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePayWallet[] newArray(int i) {
                return new GooglePayWallet[i];
            }
        }

        public GooglePayWallet(String str) {
            super(Type.GooglePay, null);
            this.dynamicLast4 = str;
        }

        public static /* synthetic */ GooglePayWallet copy$default(GooglePayWallet googlePayWallet, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = googlePayWallet.dynamicLast4;
            }
            return googlePayWallet.copy(str);
        }

        public final String component1() {
            return this.dynamicLast4;
        }

        public final GooglePayWallet copy(String str) {
            return new GooglePayWallet(str);
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
            return (obj instanceof GooglePayWallet) && Intrinsics.areEqual(this.dynamicLast4, ((GooglePayWallet) obj).dynamicLast4);
        }

        public final String getDynamicLast4() {
            return this.dynamicLast4;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.dynamicLast4;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.dynamicLast4;
            return "GooglePayWallet(dynamicLast4=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.dynamicLast4);
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/model/wallets/Wallet$MasterpassWallet;", "Lcom/stripe/android/model/wallets/Wallet;", "billingAddress", "Lcom/stripe/android/model/Address;", "email", "", "name", "shippingAddress", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;)V", "getBillingAddress", "()Lcom/stripe/android/model/Address;", "getEmail", "()Ljava/lang/String;", "getName", "getShippingAddress", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class MasterpassWallet extends Wallet {
        public static final int $stable = 0;
        public static final Parcelable.Creator<MasterpassWallet> CREATOR = new Creator();
        private final Address billingAddress;
        private final String email;
        private final String name;
        private final Address shippingAddress;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<MasterpassWallet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MasterpassWallet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MasterpassWallet(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MasterpassWallet[] newArray(int i) {
                return new MasterpassWallet[i];
            }
        }

        public MasterpassWallet(Address address, String str, String str2, Address address2) {
            super(Type.Masterpass, null);
            this.billingAddress = address;
            this.email = str;
            this.name = str2;
            this.shippingAddress = address2;
        }

        public static /* synthetic */ MasterpassWallet copy$default(MasterpassWallet masterpassWallet, Address address, String str, String str2, Address address2, int i, Object obj) {
            if ((i & 1) != 0) {
                address = masterpassWallet.billingAddress;
            }
            if ((i & 2) != 0) {
                str = masterpassWallet.email;
            }
            if ((i & 4) != 0) {
                str2 = masterpassWallet.name;
            }
            if ((i & 8) != 0) {
                address2 = masterpassWallet.shippingAddress;
            }
            return masterpassWallet.copy(address, str, str2, address2);
        }

        public final Address component1() {
            return this.billingAddress;
        }

        public final String component2() {
            return this.email;
        }

        public final String component3() {
            return this.name;
        }

        public final Address component4() {
            return this.shippingAddress;
        }

        public final MasterpassWallet copy(Address address, String str, String str2, Address address2) {
            return new MasterpassWallet(address, str, str2, address2);
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
            if (obj instanceof MasterpassWallet) {
                MasterpassWallet masterpassWallet = (MasterpassWallet) obj;
                return Intrinsics.areEqual(this.billingAddress, masterpassWallet.billingAddress) && Intrinsics.areEqual(this.email, masterpassWallet.email) && Intrinsics.areEqual(this.name, masterpassWallet.name) && Intrinsics.areEqual(this.shippingAddress, masterpassWallet.shippingAddress);
            }
            return false;
        }

        public final Address getBillingAddress() {
            return this.billingAddress;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public final Address getShippingAddress() {
            return this.shippingAddress;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            Address address = this.billingAddress;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Address address2 = this.shippingAddress;
            return hashCode3 + (address2 != null ? address2.hashCode() : 0);
        }

        public String toString() {
            Address address = this.billingAddress;
            String str = this.email;
            String str2 = this.name;
            Address address2 = this.shippingAddress;
            return "MasterpassWallet(billingAddress=" + address + ", email=" + str + ", name=" + str2 + ", shippingAddress=" + address2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            Address address = this.billingAddress;
            if (address == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                address.writeToParcel(out, i);
            }
            out.writeString(this.email);
            out.writeString(this.name);
            Address address2 = this.shippingAddress;
            if (address2 == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            address2.writeToParcel(out, i);
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/model/wallets/Wallet$SamsungPayWallet;", "Lcom/stripe/android/model/wallets/Wallet;", "dynamicLast4", "", "(Ljava/lang/String;)V", "getDynamicLast4", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class SamsungPayWallet extends Wallet {
        public static final int $stable = 0;
        public static final Parcelable.Creator<SamsungPayWallet> CREATOR = new Creator();
        private final String dynamicLast4;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<SamsungPayWallet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SamsungPayWallet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SamsungPayWallet(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SamsungPayWallet[] newArray(int i) {
                return new SamsungPayWallet[i];
            }
        }

        public SamsungPayWallet(String str) {
            super(Type.SamsungPay, null);
            this.dynamicLast4 = str;
        }

        public static /* synthetic */ SamsungPayWallet copy$default(SamsungPayWallet samsungPayWallet, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = samsungPayWallet.dynamicLast4;
            }
            return samsungPayWallet.copy(str);
        }

        public final String component1() {
            return this.dynamicLast4;
        }

        public final SamsungPayWallet copy(String str) {
            return new SamsungPayWallet(str);
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
            return (obj instanceof SamsungPayWallet) && Intrinsics.areEqual(this.dynamicLast4, ((SamsungPayWallet) obj).dynamicLast4);
        }

        public final String getDynamicLast4() {
            return this.dynamicLast4;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.dynamicLast4;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.dynamicLast4;
            return "SamsungPayWallet(dynamicLast4=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.dynamicLast4);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/model/wallets/Wallet$Type;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "AmexExpressCheckout", "ApplePay", "GooglePay", "Masterpass", "SamsungPay", "VisaCheckout", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum Type {
        AmexExpressCheckout("amex_express_checkout"),
        ApplePay("apple_pay"),
        GooglePay("google_pay"),
        Masterpass("master_pass"),
        SamsungPay("samsung_pay"),
        VisaCheckout("visa_checkout");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/wallets/Wallet$Type$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/wallets/Wallet$Type;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "fromCode$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nWallet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Wallet.kt\ncom/stripe/android/model/wallets/Wallet$Type$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,69:1\n1282#2,2:70\n*S KotlinDebug\n*F\n+ 1 Wallet.kt\ncom/stripe/android/model/wallets/Wallet$Type$Companion\n*L\n64#1:70,2\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Type fromCode$payments_core_release(String str) {
                Type[] values;
                for (Type type : Type.values()) {
                    if (Intrinsics.areEqual(type.getCode(), str)) {
                        return type;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        Type(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/model/wallets/Wallet$VisaCheckoutWallet;", "Lcom/stripe/android/model/wallets/Wallet;", "billingAddress", "Lcom/stripe/android/model/Address;", "email", "", "name", "shippingAddress", "dynamicLast4", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;)V", "getBillingAddress", "()Lcom/stripe/android/model/Address;", "getDynamicLast4", "()Ljava/lang/String;", "getEmail", "getName", "getShippingAddress", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class VisaCheckoutWallet extends Wallet {
        public static final int $stable = 0;
        public static final Parcelable.Creator<VisaCheckoutWallet> CREATOR = new Creator();
        private final Address billingAddress;
        private final String dynamicLast4;
        private final String email;
        private final String name;
        private final Address shippingAddress;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<VisaCheckoutWallet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VisaCheckoutWallet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VisaCheckoutWallet(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VisaCheckoutWallet[] newArray(int i) {
                return new VisaCheckoutWallet[i];
            }
        }

        public VisaCheckoutWallet(Address address, String str, String str2, Address address2, String str3) {
            super(Type.VisaCheckout, null);
            this.billingAddress = address;
            this.email = str;
            this.name = str2;
            this.shippingAddress = address2;
            this.dynamicLast4 = str3;
        }

        public static /* synthetic */ VisaCheckoutWallet copy$default(VisaCheckoutWallet visaCheckoutWallet, Address address, String str, String str2, Address address2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                address = visaCheckoutWallet.billingAddress;
            }
            if ((i & 2) != 0) {
                str = visaCheckoutWallet.email;
            }
            String str4 = str;
            if ((i & 4) != 0) {
                str2 = visaCheckoutWallet.name;
            }
            String str5 = str2;
            if ((i & 8) != 0) {
                address2 = visaCheckoutWallet.shippingAddress;
            }
            Address address3 = address2;
            if ((i & 16) != 0) {
                str3 = visaCheckoutWallet.dynamicLast4;
            }
            return visaCheckoutWallet.copy(address, str4, str5, address3, str3);
        }

        public final Address component1() {
            return this.billingAddress;
        }

        public final String component2() {
            return this.email;
        }

        public final String component3() {
            return this.name;
        }

        public final Address component4() {
            return this.shippingAddress;
        }

        public final String component5() {
            return this.dynamicLast4;
        }

        public final VisaCheckoutWallet copy(Address address, String str, String str2, Address address2, String str3) {
            return new VisaCheckoutWallet(address, str, str2, address2, str3);
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
            if (obj instanceof VisaCheckoutWallet) {
                VisaCheckoutWallet visaCheckoutWallet = (VisaCheckoutWallet) obj;
                return Intrinsics.areEqual(this.billingAddress, visaCheckoutWallet.billingAddress) && Intrinsics.areEqual(this.email, visaCheckoutWallet.email) && Intrinsics.areEqual(this.name, visaCheckoutWallet.name) && Intrinsics.areEqual(this.shippingAddress, visaCheckoutWallet.shippingAddress) && Intrinsics.areEqual(this.dynamicLast4, visaCheckoutWallet.dynamicLast4);
            }
            return false;
        }

        public final Address getBillingAddress() {
            return this.billingAddress;
        }

        public final String getDynamicLast4() {
            return this.dynamicLast4;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public final Address getShippingAddress() {
            return this.shippingAddress;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            Address address = this.billingAddress;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Address address2 = this.shippingAddress;
            int hashCode4 = (hashCode3 + (address2 == null ? 0 : address2.hashCode())) * 31;
            String str3 = this.dynamicLast4;
            return hashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            Address address = this.billingAddress;
            String str = this.email;
            String str2 = this.name;
            Address address2 = this.shippingAddress;
            String str3 = this.dynamicLast4;
            return "VisaCheckoutWallet(billingAddress=" + address + ", email=" + str + ", name=" + str2 + ", shippingAddress=" + address2 + ", dynamicLast4=" + str3 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            Address address = this.billingAddress;
            if (address == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                address.writeToParcel(out, i);
            }
            out.writeString(this.email);
            out.writeString(this.name);
            Address address2 = this.shippingAddress;
            if (address2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                address2.writeToParcel(out, i);
            }
            out.writeString(this.dynamicLast4);
        }
    }

    public /* synthetic */ Wallet(Type type, DefaultConstructorMarker defaultConstructorMarker) {
        this(type);
    }

    public final Type getWalletType$payments_core_release() {
        return this.walletType;
    }

    private Wallet(Type type) {
        this.walletType = type;
    }
}
