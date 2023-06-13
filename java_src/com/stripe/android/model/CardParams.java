package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.CardUtils;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.Token;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0001MBg\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\u0002\u0010\u000eB\u007f\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\u0002\u0010\u0013J\t\u00103\u001a\u00020\u0010HÆ\u0003J\u0017\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012HÂ\u0003J\u000e\u00106\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b7J\u000e\u00108\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b9J\u000e\u0010:\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b;J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b=J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0089\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0001J\t\u0010B\u001a\u00020\u0005HÖ\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u000101HÖ\u0003J\t\u0010F\u001a\u00020\u0005HÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001J\u0019\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u0011\u0010&\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b'\u0010\u001bR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR \u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010)¨\u0006N"}, m28432d2 = {"Lcom/stripe/android/model/CardParams;", "Lcom/stripe/android/model/TokenParams;", CardParams.PARAM_NUMBER, "", "expMonth", "", "expYear", CardParams.PARAM_CVC, "name", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Lcom/stripe/android/model/Address;", CardParams.PARAM_CURRENCY, CardParams.PARAM_METADATA, "", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/util/Map;)V", AccountRangeJsonParser.FIELD_BRAND, "Lcom/stripe/android/model/CardBrand;", "loggingTokens", "", "(Lcom/stripe/android/model/CardBrand;Ljava/util/Set;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/util/Map;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "setAddress", "(Lcom/stripe/android/model/Address;)V", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getCvc$payments_core_release", "setCvc$payments_core_release", "getExpMonth$payments_core_release", "()I", "setExpMonth$payments_core_release", "(I)V", "getExpYear$payments_core_release", "setExpYear$payments_core_release", "last4", "getLast4", "getMetadata", "()Ljava/util/Map;", "setMetadata", "(Ljava/util/Map;)V", "getName", "setName", "getNumber$payments_core_release", "setNumber$payments_core_release", "typeDataParams", "", "getTypeDataParams", "component1", "component10", "component2", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "component5", "component5$payments_core_release", "component6", "component6$payments_core_release", "component7", "component8", "component9", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCardParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardParams.kt\ncom/stripe/android/model/CardParams\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n1789#2,2:212\n1791#2:215\n1#3:214\n*S KotlinDebug\n*F\n+ 1 CardParams.kt\ncom/stripe/android/model/CardParams\n*L\n189#1:212,2\n189#1:215\n*E\n"})
/* loaded from: classes7.dex */
public final class CardParams extends TokenParams {
    @Deprecated
    private static final String PARAM_ADDRESS_CITY = "address_city";
    @Deprecated
    private static final String PARAM_ADDRESS_COUNTRY = "address_country";
    @Deprecated
    private static final String PARAM_ADDRESS_LINE1 = "address_line1";
    @Deprecated
    private static final String PARAM_ADDRESS_LINE2 = "address_line2";
    @Deprecated
    private static final String PARAM_ADDRESS_STATE = "address_state";
    @Deprecated
    private static final String PARAM_ADDRESS_ZIP = "address_zip";
    @Deprecated
    private static final String PARAM_CURRENCY = "currency";
    @Deprecated
    private static final String PARAM_CVC = "cvc";
    @Deprecated
    private static final String PARAM_EXP_MONTH = "exp_month";
    @Deprecated
    private static final String PARAM_EXP_YEAR = "exp_year";
    @Deprecated
    private static final String PARAM_METADATA = "metadata";
    @Deprecated
    private static final String PARAM_NAME = "name";
    @Deprecated
    private static final String PARAM_NUMBER = "number";
    private Address address;
    private final CardBrand brand;
    private String currency;
    private String cvc;
    private int expMonth;
    private int expYear;
    private final Set<String> loggingTokens;
    private Map<String, String> metadata;
    private String name;
    private String number;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CardParams> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/model/CardParams$Companion;", "", "()V", "PARAM_ADDRESS_CITY", "", "PARAM_ADDRESS_COUNTRY", "PARAM_ADDRESS_LINE1", "PARAM_ADDRESS_LINE2", "PARAM_ADDRESS_STATE", "PARAM_ADDRESS_ZIP", "PARAM_CURRENCY", "PARAM_CVC", "PARAM_EXP_MONTH", "PARAM_EXP_YEAR", "PARAM_METADATA", "PARAM_NAME", "PARAM_NUMBER", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
    public static final class Creator implements Parcelable.Creator<CardParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardParams createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CardBrand valueOf = CardBrand.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashSet.add(parcel.readString());
            }
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Address createFromParcel = parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt4 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt4);
                for (int i2 = 0; i2 != readInt4; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new CardParams(valueOf, linkedHashSet, readString, readInt2, readInt3, readString2, readString3, createFromParcel, readString4, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardParams[] newArray(int i) {
            return new CardParams[i];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardParams(String number, int i, int i2) {
        this(number, i, i2, (String) null, (String) null, (Address) null, (String) null, (Map) null, 248, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(number, "number");
    }

    private final Set<String> component2() {
        return this.loggingTokens;
    }

    public final CardBrand component1() {
        return this.brand;
    }

    public final Map<String, String> component10() {
        return this.metadata;
    }

    public final String component3$payments_core_release() {
        return this.number;
    }

    public final int component4$payments_core_release() {
        return this.expMonth;
    }

    public final int component5$payments_core_release() {
        return this.expYear;
    }

    public final String component6$payments_core_release() {
        return this.cvc;
    }

    public final String component7() {
        return this.name;
    }

    public final Address component8() {
        return this.address;
    }

    public final String component9() {
        return this.currency;
    }

    public final CardParams copy(CardBrand brand, Set<String> loggingTokens, String number, int i, int i2, String str, String str2, Address address, String str3, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(loggingTokens, "loggingTokens");
        Intrinsics.checkNotNullParameter(number, "number");
        return new CardParams(brand, loggingTokens, number, i, i2, str, str2, address, str3, map);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CardParams) {
            CardParams cardParams = (CardParams) obj;
            return this.brand == cardParams.brand && Intrinsics.areEqual(this.loggingTokens, cardParams.loggingTokens) && Intrinsics.areEqual(this.number, cardParams.number) && this.expMonth == cardParams.expMonth && this.expYear == cardParams.expYear && Intrinsics.areEqual(this.cvc, cardParams.cvc) && Intrinsics.areEqual(this.name, cardParams.name) && Intrinsics.areEqual(this.address, cardParams.address) && Intrinsics.areEqual(this.currency, cardParams.currency) && Intrinsics.areEqual(this.metadata, cardParams.metadata);
        }
        return false;
    }

    public final Address getAddress() {
        return this.address;
    }

    public final CardBrand getBrand() {
        return this.brand;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getCvc$payments_core_release() {
        return this.cvc;
    }

    public final int getExpMonth$payments_core_release() {
        return this.expMonth;
    }

    public final int getExpYear$payments_core_release() {
        return this.expYear;
    }

    public final String getLast4() {
        String takeLast;
        takeLast = StringsKt___StringsKt.takeLast(this.number, 4);
        return takeLast;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNumber$payments_core_release() {
        return this.number;
    }

    @Override // com.stripe.android.model.TokenParams
    public Map<String, Object> getTypeDataParams() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        List<Pair> listOf;
        Map<String, Object> emptyMap;
        Map map;
        Pair[] pairArr = new Pair[13];
        pairArr[0] = TuplesKt.m28425to(PARAM_NUMBER, this.number);
        pairArr[1] = TuplesKt.m28425to(PARAM_EXP_MONTH, Integer.valueOf(this.expMonth));
        pairArr[2] = TuplesKt.m28425to(PARAM_EXP_YEAR, Integer.valueOf(this.expYear));
        pairArr[3] = TuplesKt.m28425to(PARAM_CVC, this.cvc);
        pairArr[4] = TuplesKt.m28425to("name", this.name);
        pairArr[5] = TuplesKt.m28425to(PARAM_CURRENCY, this.currency);
        Address address = this.address;
        if (address != null) {
            str = address.getLine1();
        } else {
            str = null;
        }
        pairArr[6] = TuplesKt.m28425to(PARAM_ADDRESS_LINE1, str);
        Address address2 = this.address;
        if (address2 != null) {
            str2 = address2.getLine2();
        } else {
            str2 = null;
        }
        pairArr[7] = TuplesKt.m28425to(PARAM_ADDRESS_LINE2, str2);
        Address address3 = this.address;
        if (address3 != null) {
            str3 = address3.getCity();
        } else {
            str3 = null;
        }
        pairArr[8] = TuplesKt.m28425to(PARAM_ADDRESS_CITY, str3);
        Address address4 = this.address;
        if (address4 != null) {
            str4 = address4.getState();
        } else {
            str4 = null;
        }
        pairArr[9] = TuplesKt.m28425to(PARAM_ADDRESS_STATE, str4);
        Address address5 = this.address;
        if (address5 != null) {
            str5 = address5.getPostalCode();
        } else {
            str5 = null;
        }
        pairArr[10] = TuplesKt.m28425to(PARAM_ADDRESS_ZIP, str5);
        Address address6 = this.address;
        if (address6 != null) {
            str6 = address6.getCountry();
        } else {
            str6 = null;
        }
        pairArr[11] = TuplesKt.m28425to(PARAM_ADDRESS_COUNTRY, str6);
        pairArr[12] = TuplesKt.m28425to(PARAM_METADATA, this.metadata);
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) pairArr);
        emptyMap = MapsKt__MapsKt.emptyMap();
        for (Pair pair : listOf) {
            String str7 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 != null) {
                map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(str7, component2));
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
        int hashCode = ((((((((this.brand.hashCode() * 31) + this.loggingTokens.hashCode()) * 31) + this.number.hashCode()) * 31) + Integer.hashCode(this.expMonth)) * 31) + Integer.hashCode(this.expYear)) * 31;
        String str = this.cvc;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Address address = this.address;
        int hashCode4 = (hashCode3 + (address == null ? 0 : address.hashCode())) * 31;
        String str3 = this.currency;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.metadata;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final void setAddress(Address address) {
        this.address = address;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setCvc$payments_core_release(String str) {
        this.cvc = str;
    }

    public final void setExpMonth$payments_core_release(int i) {
        this.expMonth = i;
    }

    public final void setExpYear$payments_core_release(int i) {
        this.expYear = i;
    }

    public final void setMetadata(Map<String, String> map) {
        this.metadata = map;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNumber$payments_core_release(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.number = str;
    }

    public String toString() {
        CardBrand cardBrand = this.brand;
        Set<String> set = this.loggingTokens;
        String str = this.number;
        int i = this.expMonth;
        int i2 = this.expYear;
        String str2 = this.cvc;
        String str3 = this.name;
        Address address = this.address;
        String str4 = this.currency;
        Map<String, String> map = this.metadata;
        return "CardParams(brand=" + cardBrand + ", loggingTokens=" + set + ", number=" + str + ", expMonth=" + i + ", expYear=" + i2 + ", cvc=" + str2 + ", name=" + str3 + ", address=" + address + ", currency=" + str4 + ", metadata=" + map + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.brand.name());
        Set<String> set = this.loggingTokens;
        out.writeInt(set.size());
        for (String str : set) {
            out.writeString(str);
        }
        out.writeString(this.number);
        out.writeInt(this.expMonth);
        out.writeInt(this.expYear);
        out.writeString(this.cvc);
        out.writeString(this.name);
        Address address = this.address;
        if (address == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            address.writeToParcel(out, i);
        }
        out.writeString(this.currency);
        Map<String, String> map = this.metadata;
        if (map == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardParams(String number, int i, int i2, String str) {
        this(number, i, i2, str, (String) null, (Address) null, (String) null, (Map) null, 240, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(number, "number");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardParams(String number, int i, int i2, String str, String str2) {
        this(number, i, i2, str, str2, (Address) null, (String) null, (Map) null, 224, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(number, "number");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardParams(String number, int i, int i2, String str, String str2, Address address) {
        this(number, i, i2, str, str2, address, (String) null, (Map) null, 192, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(number, "number");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardParams(String number, int i, int i2, String str, String str2, Address address, String str3) {
        this(number, i, i2, str, str2, address, str3, (Map) null, 128, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(number, "number");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CardParams(CardBrand cardBrand, Set set, String str, int i, int i2, String str2, String str3, Address address, String str4, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(cardBrand, r4, str, i, i2, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : str3, (i3 & 128) != 0 ? null : address, (i3 & 256) != 0 ? null : str4, (i3 & 512) != 0 ? null : map);
        Set set2;
        Set emptySet;
        if ((i3 & 2) != 0) {
            emptySet = SetsKt__SetsKt.emptySet();
            set2 = emptySet;
        } else {
            set2 = set;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardParams(CardBrand brand, Set<String> loggingTokens, String number, int i, int i2, String str, String str2, Address address, String str3, Map<String, String> map) {
        super(Token.Type.Card, loggingTokens);
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(loggingTokens, "loggingTokens");
        Intrinsics.checkNotNullParameter(number, "number");
        this.brand = brand;
        this.loggingTokens = loggingTokens;
        this.number = number;
        this.expMonth = i;
        this.expYear = i2;
        this.cvc = str;
        this.name = str2;
        this.address = address;
        this.currency = str3;
        this.metadata = map;
    }

    public /* synthetic */ CardParams(String str, int i, int i2, String str2, String str3, Address address, String str4, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : address, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : map);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CardParams(String number, int i, int i2, String str, String str2, Address address, String str3, Map<String, String> map) {
        this(r2, r3, number, i, i2, str, str2, address, str3, map);
        Set emptySet;
        Intrinsics.checkNotNullParameter(number, "number");
        CardBrand possibleCardBrand = CardUtils.getPossibleCardBrand(number);
        emptySet = SetsKt__SetsKt.emptySet();
    }
}
