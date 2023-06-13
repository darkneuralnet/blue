package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.google.android.gms.location.places.Place;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u000267B\u007f\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0081\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020*HÖ\u0001J\t\u00100\u001a\u00020\u0004HÖ\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020*HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00068"}, m28432d2 = {"Lcom/stripe/android/model/BankAccount;", "Lcom/stripe/android/core/model/StripeModel;", "Lcom/stripe/android/model/StripePaymentSource;", "id", "", "accountHolderName", "accountHolderType", "Lcom/stripe/android/model/BankAccount$Type;", "bankName", "countryCode", "currency", "fingerprint", "last4", "routingNumber", "status", "Lcom/stripe/android/model/BankAccount$Status;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/BankAccount$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/BankAccount$Status;)V", "getAccountHolderName", "()Ljava/lang/String;", "getAccountHolderType", "()Lcom/stripe/android/model/BankAccount$Type;", "getBankName", "getCountryCode", "getCurrency", "getFingerprint", "getId", "getLast4", "getRoutingNumber", "getStatus", "()Lcom/stripe/android/model/BankAccount$Status;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Status", "Type", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class BankAccount implements StripeModel, StripePaymentSource {
    public static final Parcelable.Creator<BankAccount> CREATOR = new Creator();
    private final String accountHolderName;
    private final Type accountHolderType;
    private final String bankName;
    private final String countryCode;
    private final String currency;
    private final String fingerprint;

    /* renamed from: id */
    private final String f75349id;
    private final String last4;
    private final String routingNumber;
    private final Status status;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<BankAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankAccount createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BankAccount(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankAccount[] newArray(int i) {
            return new BankAccount[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/model/BankAccount$Status;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_model_release", "()Ljava/lang/String;", "toString", "New", "Validated", "Verified", "VerificationFailed", "Errored", "Companion", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum Status {
        New("new"),
        Validated("validated"),
        Verified("verified"),
        VerificationFailed("verification_failed"),
        Errored("errored");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/BankAccount$Status$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/BankAccount$Status;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "fromCode$payments_model_release", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nBankAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BankAccount.kt\ncom/stripe/android/model/BankAccount$Status$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,131:1\n1282#2,2:132\n*S KotlinDebug\n*F\n+ 1 BankAccount.kt\ncom/stripe/android/model/BankAccount$Status$Companion\n*L\n126#1:132,2\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Status fromCode$payments_model_release(String str) {
                Status[] values;
                for (Status status : Status.values()) {
                    if (Intrinsics.areEqual(status.getCode$payments_model_release(), str)) {
                        return status;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        Status(String str) {
            this.code = str;
        }

        public final String getCode$payments_model_release() {
            return this.code;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/model/BankAccount$Type;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_model_release", "()Ljava/lang/String;", "toString", "Company", "Individual", "Companion", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum Type {
        Company("company"),
        Individual("individual");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/BankAccount$Type$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/BankAccount$Type;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "fromCode$payments_model_release", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nBankAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BankAccount.kt\ncom/stripe/android/model/BankAccount$Type$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,131:1\n1282#2,2:132\n*S KotlinDebug\n*F\n+ 1 BankAccount.kt\ncom/stripe/android/model/BankAccount$Type$Companion\n*L\n111#1:132,2\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Type fromCode$payments_model_release(String str) {
                Type[] values;
                for (Type type : Type.values()) {
                    if (Intrinsics.areEqual(type.getCode$payments_model_release(), str)) {
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

        public final String getCode$payments_model_release() {
            return this.code;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    public BankAccount() {
        this(null, null, null, null, null, null, null, null, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
    }

    public final String component1() {
        return getId();
    }

    public final Status component10() {
        return this.status;
    }

    public final String component2() {
        return this.accountHolderName;
    }

    public final Type component3() {
        return this.accountHolderType;
    }

    public final String component4() {
        return this.bankName;
    }

    public final String component5() {
        return this.countryCode;
    }

    public final String component6() {
        return this.currency;
    }

    public final String component7() {
        return this.fingerprint;
    }

    public final String component8() {
        return this.last4;
    }

    public final String component9() {
        return this.routingNumber;
    }

    public final BankAccount copy(String str, String str2, Type type, String str3, String str4, String str5, String str6, String str7, String str8, Status status) {
        return new BankAccount(str, str2, type, str3, str4, str5, str6, str7, str8, status);
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
        if (obj instanceof BankAccount) {
            BankAccount bankAccount = (BankAccount) obj;
            return Intrinsics.areEqual(getId(), bankAccount.getId()) && Intrinsics.areEqual(this.accountHolderName, bankAccount.accountHolderName) && this.accountHolderType == bankAccount.accountHolderType && Intrinsics.areEqual(this.bankName, bankAccount.bankName) && Intrinsics.areEqual(this.countryCode, bankAccount.countryCode) && Intrinsics.areEqual(this.currency, bankAccount.currency) && Intrinsics.areEqual(this.fingerprint, bankAccount.fingerprint) && Intrinsics.areEqual(this.last4, bankAccount.last4) && Intrinsics.areEqual(this.routingNumber, bankAccount.routingNumber) && this.status == bankAccount.status;
        }
        return false;
    }

    public final String getAccountHolderName() {
        return this.accountHolderName;
    }

    public final Type getAccountHolderType() {
        return this.accountHolderType;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getFingerprint() {
        return this.fingerprint;
    }

    @Override // com.stripe.android.model.StripePaymentSource
    public String getId() {
        return this.f75349id;
    }

    public final String getLast4() {
        return this.last4;
    }

    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    public final Status getStatus() {
        return this.status;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = (getId() == null ? 0 : getId().hashCode()) * 31;
        String str = this.accountHolderName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Type type = this.accountHolderType;
        int hashCode3 = (hashCode2 + (type == null ? 0 : type.hashCode())) * 31;
        String str2 = this.bankName;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryCode;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currency;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fingerprint;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.last4;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.routingNumber;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Status status = this.status;
        return hashCode9 + (status != null ? status.hashCode() : 0);
    }

    public String toString() {
        String id = getId();
        String str = this.accountHolderName;
        Type type = this.accountHolderType;
        String str2 = this.bankName;
        String str3 = this.countryCode;
        String str4 = this.currency;
        String str5 = this.fingerprint;
        String str6 = this.last4;
        String str7 = this.routingNumber;
        Status status = this.status;
        return "BankAccount(id=" + id + ", accountHolderName=" + str + ", accountHolderType=" + type + ", bankName=" + str2 + ", countryCode=" + str3 + ", currency=" + str4 + ", fingerprint=" + str5 + ", last4=" + str6 + ", routingNumber=" + str7 + ", status=" + status + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f75349id);
        out.writeString(this.accountHolderName);
        Type type = this.accountHolderType;
        if (type == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(type.name());
        }
        out.writeString(this.bankName);
        out.writeString(this.countryCode);
        out.writeString(this.currency);
        out.writeString(this.fingerprint);
        out.writeString(this.last4);
        out.writeString(this.routingNumber);
        Status status = this.status;
        if (status == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeString(status.name());
    }

    public BankAccount(String str, String str2, Type type, String str3, String str4, String str5, String str6, String str7, String str8, Status status) {
        this.f75349id = str;
        this.accountHolderName = str2;
        this.accountHolderType = type;
        this.bankName = str3;
        this.countryCode = str4;
        this.currency = str5;
        this.fingerprint = str6;
        this.last4 = str7;
        this.routingNumber = str8;
        this.status = status;
    }

    public /* synthetic */ BankAccount(String str, String str2, Type type, String str3, String str4, String str5, String str6, String str7, String str8, Status status, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : type, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) == 0 ? status : null);
    }
}
