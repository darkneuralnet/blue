package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Token;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002#$BC\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÂ\u0003JK\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006%"}, m28432d2 = {"Lcom/stripe/android/model/BankAccountTokenParams;", "Lcom/stripe/android/model/TokenParams;", "country", "", BankAccountTokenParams.PARAM_CURRENCY, "accountNumber", "accountHolderType", "Lcom/stripe/android/model/BankAccountTokenParams$Type;", "accountHolderName", "routingNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/BankAccountTokenParams$Type;Ljava/lang/String;Ljava/lang/String;)V", "typeDataParams", "", "", "getTypeDataParams", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Type", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nBankAccountTokenParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BankAccountTokenParams.kt\ncom/stripe/android/model/BankAccountTokenParams\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1789#2,2:93\n1791#2:96\n1#3:95\n*S KotlinDebug\n*F\n+ 1 BankAccountTokenParams.kt\ncom/stripe/android/model/BankAccountTokenParams\n*L\n77#1:93,2\n77#1:96\n*E\n"})
/* loaded from: classes7.dex */
public final class BankAccountTokenParams extends TokenParams {
    public static final int $stable = 0;
    @Deprecated
    private static final String PARAM_ACCOUNT_HOLDER_NAME = "account_holder_name";
    @Deprecated
    private static final String PARAM_ACCOUNT_HOLDER_TYPE = "account_holder_type";
    @Deprecated
    private static final String PARAM_ACCOUNT_NUMBER = "account_number";
    @Deprecated
    private static final String PARAM_COUNTRY = "country";
    @Deprecated
    private static final String PARAM_CURRENCY = "currency";
    @Deprecated
    private static final String PARAM_ROUTING_NUMBER = "routing_number";
    private final String accountHolderName;
    private final Type accountHolderType;
    private final String accountNumber;
    private final String country;
    private final String currency;
    private final String routingNumber;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BankAccountTokenParams> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/model/BankAccountTokenParams$Companion;", "", "()V", "PARAM_ACCOUNT_HOLDER_NAME", "", "PARAM_ACCOUNT_HOLDER_TYPE", "PARAM_ACCOUNT_NUMBER", "PARAM_COUNTRY", "PARAM_CURRENCY", "PARAM_ROUTING_NUMBER", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
    public static final class Creator implements Parcelable.Creator<BankAccountTokenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankAccountTokenParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BankAccountTokenParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankAccountTokenParams[] newArray(int i) {
            return new BankAccountTokenParams[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/model/BankAccountTokenParams$Type;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "Individual", "Company", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum Type {
        Individual("individual"),
        Company("company");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/BankAccountTokenParams$Type$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/BankAccountTokenParams$Type;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "fromCode$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nBankAccountTokenParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BankAccountTokenParams.kt\ncom/stripe/android/model/BankAccountTokenParams$Type$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,92:1\n1282#2,2:93\n*S KotlinDebug\n*F\n+ 1 BankAccountTokenParams.kt\ncom/stripe/android/model/BankAccountTokenParams$Type$Companion\n*L\n64#1:93,2\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Type fromCode$payments_core_release(String str) {
                Type[] values;
                for (Type type : Type.values()) {
                    if (Intrinsics.areEqual(type.getCode$payments_core_release(), str)) {
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

        public final String getCode$payments_core_release() {
            return this.code;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BankAccountTokenParams(String country, String currency, String accountNumber) {
        this(country, currency, accountNumber, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
    }

    private final String component1() {
        return this.country;
    }

    private final String component2() {
        return this.currency;
    }

    private final String component3() {
        return this.accountNumber;
    }

    private final Type component4() {
        return this.accountHolderType;
    }

    private final String component5() {
        return this.accountHolderName;
    }

    private final String component6() {
        return this.routingNumber;
    }

    public static /* synthetic */ BankAccountTokenParams copy$default(BankAccountTokenParams bankAccountTokenParams, String str, String str2, String str3, Type type, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bankAccountTokenParams.country;
        }
        if ((i & 2) != 0) {
            str2 = bankAccountTokenParams.currency;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = bankAccountTokenParams.accountNumber;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            type = bankAccountTokenParams.accountHolderType;
        }
        Type type2 = type;
        if ((i & 16) != 0) {
            str4 = bankAccountTokenParams.accountHolderName;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = bankAccountTokenParams.routingNumber;
        }
        return bankAccountTokenParams.copy(str, str6, str7, type2, str8, str5);
    }

    public final BankAccountTokenParams copy(String country, String currency, String accountNumber, Type type, String str, String str2) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new BankAccountTokenParams(country, currency, accountNumber, type, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BankAccountTokenParams) {
            BankAccountTokenParams bankAccountTokenParams = (BankAccountTokenParams) obj;
            return Intrinsics.areEqual(this.country, bankAccountTokenParams.country) && Intrinsics.areEqual(this.currency, bankAccountTokenParams.currency) && Intrinsics.areEqual(this.accountNumber, bankAccountTokenParams.accountNumber) && this.accountHolderType == bankAccountTokenParams.accountHolderType && Intrinsics.areEqual(this.accountHolderName, bankAccountTokenParams.accountHolderName) && Intrinsics.areEqual(this.routingNumber, bankAccountTokenParams.routingNumber);
        }
        return false;
    }

    @Override // com.stripe.android.model.TokenParams
    public Map<String, Object> getTypeDataParams() {
        String str;
        List<Pair> listOf;
        Map<String, Object> emptyMap;
        Map map;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = TuplesKt.m28425to("country", this.country);
        pairArr[1] = TuplesKt.m28425to(PARAM_CURRENCY, this.currency);
        pairArr[2] = TuplesKt.m28425to(PARAM_ACCOUNT_HOLDER_NAME, this.accountHolderName);
        Type type = this.accountHolderType;
        if (type != null) {
            str = type.getCode$payments_core_release();
        } else {
            str = null;
        }
        pairArr[3] = TuplesKt.m28425to(PARAM_ACCOUNT_HOLDER_TYPE, str);
        pairArr[4] = TuplesKt.m28425to(PARAM_ROUTING_NUMBER, this.routingNumber);
        pairArr[5] = TuplesKt.m28425to(PARAM_ACCOUNT_NUMBER, this.accountNumber);
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) pairArr);
        emptyMap = MapsKt__MapsKt.emptyMap();
        for (Pair pair : listOf) {
            String str2 = (String) pair.component1();
            String str3 = (String) pair.component2();
            if (str3 != null) {
                map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(str2, str3));
            } else {
                map = null;
            }
            if (map == null) {
                map = MapsKt__MapsKt.emptyMap();
            }
            emptyMap = MapsKt__MapsKt.plus(emptyMap, map);
        }
        return emptyMap;
    }

    public int hashCode() {
        int hashCode = ((((this.country.hashCode() * 31) + this.currency.hashCode()) * 31) + this.accountNumber.hashCode()) * 31;
        Type type = this.accountHolderType;
        int hashCode2 = (hashCode + (type == null ? 0 : type.hashCode())) * 31;
        String str = this.accountHolderName;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.routingNumber;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.country;
        String str2 = this.currency;
        String str3 = this.accountNumber;
        Type type = this.accountHolderType;
        String str4 = this.accountHolderName;
        String str5 = this.routingNumber;
        return "BankAccountTokenParams(country=" + str + ", currency=" + str2 + ", accountNumber=" + str3 + ", accountHolderType=" + type + ", accountHolderName=" + str4 + ", routingNumber=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.country);
        out.writeString(this.currency);
        out.writeString(this.accountNumber);
        Type type = this.accountHolderType;
        if (type == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(type.name());
        }
        out.writeString(this.accountHolderName);
        out.writeString(this.routingNumber);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BankAccountTokenParams(String country, String currency, String accountNumber, Type type) {
        this(country, currency, accountNumber, type, null, null, 48, null);
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BankAccountTokenParams(String country, String currency, String accountNumber, Type type, String str) {
        this(country, currency, accountNumber, type, str, null, 32, null);
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
    }

    public /* synthetic */ BankAccountTokenParams(String str, String str2, String str3, Type type, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : type, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BankAccountTokenParams(String country, String currency, String accountNumber, Type type, String str, String str2) {
        super(Token.Type.BankAccount, null, 2, null);
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.country = country;
        this.currency = currency;
        this.accountNumber = accountNumber;
        this.accountHolderType = type;
        this.accountHolderName = str;
        this.routingNumber = str2;
    }
}
