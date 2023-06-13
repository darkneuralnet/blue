package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0001\\Bù\u0001\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dJ\u0010\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010=\u001a\u00020\u0012HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010E\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0088\u0002\u0010N\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0002\u0010OJ\t\u0010P\u001a\u00020\u0004HÖ\u0001J\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010THÖ\u0003J\t\u0010U\u001a\u00020\u0004HÖ\u0001J\t\u0010V\u001a\u00020\u0007HÖ\u0001J\u0019\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010/\u001a\u0004\b0\u0010.R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006]"}, m28432d2 = {"Lcom/stripe/android/model/Card;", "Lcom/stripe/android/core/model/StripeModel;", "Lcom/stripe/android/model/StripePaymentSource;", "expMonth", "", "expYear", "name", "", "addressLine1", "addressLine1Check", "addressLine2", "addressCity", "addressState", "addressZip", "addressZipCheck", "addressCountry", "last4", AccountRangeJsonParser.FIELD_BRAND, "Lcom/stripe/android/model/CardBrand;", "funding", "Lcom/stripe/android/model/CardFunding;", "fingerprint", "country", "currency", "customerId", "cvcCheck", "id", "tokenizationMethod", "Lcom/stripe/android/model/TokenizationMethod;", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/CardFunding;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/TokenizationMethod;)V", "getAddressCity", "()Ljava/lang/String;", "getAddressCountry", "getAddressLine1", "getAddressLine1Check", "getAddressLine2", "getAddressState", "getAddressZip", "getAddressZipCheck", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getCountry", "getCurrency", "getCustomerId", "getCvcCheck", "getExpMonth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExpYear", "getFingerprint", "getFunding", "()Lcom/stripe/android/model/CardFunding;", "getId", "getLast4", "getName", "getTokenizationMethod", "()Lcom/stripe/android/model/TokenizationMethod;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/CardFunding;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/TokenizationMethod;)Lcom/stripe/android/model/Card;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class Card implements StripeModel, StripePaymentSource {
    private final String addressCity;
    private final String addressCountry;
    private final String addressLine1;
    private final String addressLine1Check;
    private final String addressLine2;
    private final String addressState;
    private final String addressZip;
    private final String addressZipCheck;
    private final CardBrand brand;
    private final String country;
    private final String currency;
    private final String customerId;
    private final String cvcCheck;
    private final Integer expMonth;
    private final Integer expYear;
    private final String fingerprint;
    private final CardFunding funding;

    /* renamed from: id */
    private final String f75350id;
    private final String last4;
    private final String name;
    private final TokenizationMethod tokenizationMethod;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Card> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/Card$Companion;", "", "()V", "getCardBrand", "Lcom/stripe/android/model/CardBrand;", "brandName", "", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ CardBrand getCardBrand(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -993787207:
                        if (str.equals("Diners Club")) {
                            return CardBrand.DinersClub;
                        }
                        break;
                    case -298759312:
                        if (str.equals("American Express")) {
                            return CardBrand.AmericanExpress;
                        }
                        break;
                    case -231891079:
                        if (str.equals("UnionPay")) {
                            return CardBrand.UnionPay;
                        }
                        break;
                    case -46205774:
                        if (str.equals("MasterCard")) {
                            return CardBrand.MasterCard;
                        }
                        break;
                    case 73257:
                        if (str.equals("JCB")) {
                            return CardBrand.JCB;
                        }
                        break;
                    case 2666593:
                        if (str.equals("Visa")) {
                            return CardBrand.Visa;
                        }
                        break;
                    case 337828873:
                        if (str.equals("Discover")) {
                            return CardBrand.Discover;
                        }
                        break;
                }
            }
            return CardBrand.Unknown;
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
            return new Card(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), CardBrand.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CardFunding.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TokenizationMethod.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Card[] newArray(int i) {
            return new Card[i];
        }
    }

    public Card(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, CardBrand brand, CardFunding cardFunding, String str11, String str12, String str13, String str14, String str15, String str16, TokenizationMethod tokenizationMethod) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        this.expMonth = num;
        this.expYear = num2;
        this.name = str;
        this.addressLine1 = str2;
        this.addressLine1Check = str3;
        this.addressLine2 = str4;
        this.addressCity = str5;
        this.addressState = str6;
        this.addressZip = str7;
        this.addressZipCheck = str8;
        this.addressCountry = str9;
        this.last4 = str10;
        this.brand = brand;
        this.funding = cardFunding;
        this.fingerprint = str11;
        this.country = str12;
        this.currency = str13;
        this.customerId = str14;
        this.cvcCheck = str15;
        this.f75350id = str16;
        this.tokenizationMethod = tokenizationMethod;
    }

    public final Integer component1() {
        return this.expMonth;
    }

    public final String component10() {
        return this.addressZipCheck;
    }

    public final String component11() {
        return this.addressCountry;
    }

    public final String component12() {
        return this.last4;
    }

    public final CardBrand component13() {
        return this.brand;
    }

    public final CardFunding component14() {
        return this.funding;
    }

    public final String component15() {
        return this.fingerprint;
    }

    public final String component16() {
        return this.country;
    }

    public final String component17() {
        return this.currency;
    }

    public final String component18() {
        return this.customerId;
    }

    public final String component19() {
        return this.cvcCheck;
    }

    public final Integer component2() {
        return this.expYear;
    }

    public final String component20() {
        return getId();
    }

    public final TokenizationMethod component21() {
        return this.tokenizationMethod;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.addressLine1;
    }

    public final String component5() {
        return this.addressLine1Check;
    }

    public final String component6() {
        return this.addressLine2;
    }

    public final String component7() {
        return this.addressCity;
    }

    public final String component8() {
        return this.addressState;
    }

    public final String component9() {
        return this.addressZip;
    }

    public final Card copy(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, CardBrand brand, CardFunding cardFunding, String str11, String str12, String str13, String str14, String str15, String str16, TokenizationMethod tokenizationMethod) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        return new Card(num, num2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, brand, cardFunding, str11, str12, str13, str14, str15, str16, tokenizationMethod);
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
        if (obj instanceof Card) {
            Card card = (Card) obj;
            return Intrinsics.areEqual(this.expMonth, card.expMonth) && Intrinsics.areEqual(this.expYear, card.expYear) && Intrinsics.areEqual(this.name, card.name) && Intrinsics.areEqual(this.addressLine1, card.addressLine1) && Intrinsics.areEqual(this.addressLine1Check, card.addressLine1Check) && Intrinsics.areEqual(this.addressLine2, card.addressLine2) && Intrinsics.areEqual(this.addressCity, card.addressCity) && Intrinsics.areEqual(this.addressState, card.addressState) && Intrinsics.areEqual(this.addressZip, card.addressZip) && Intrinsics.areEqual(this.addressZipCheck, card.addressZipCheck) && Intrinsics.areEqual(this.addressCountry, card.addressCountry) && Intrinsics.areEqual(this.last4, card.last4) && this.brand == card.brand && this.funding == card.funding && Intrinsics.areEqual(this.fingerprint, card.fingerprint) && Intrinsics.areEqual(this.country, card.country) && Intrinsics.areEqual(this.currency, card.currency) && Intrinsics.areEqual(this.customerId, card.customerId) && Intrinsics.areEqual(this.cvcCheck, card.cvcCheck) && Intrinsics.areEqual(getId(), card.getId()) && this.tokenizationMethod == card.tokenizationMethod;
        }
        return false;
    }

    public final String getAddressCity() {
        return this.addressCity;
    }

    public final String getAddressCountry() {
        return this.addressCountry;
    }

    public final String getAddressLine1() {
        return this.addressLine1;
    }

    public final String getAddressLine1Check() {
        return this.addressLine1Check;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    public final String getAddressState() {
        return this.addressState;
    }

    public final String getAddressZip() {
        return this.addressZip;
    }

    public final String getAddressZipCheck() {
        return this.addressZipCheck;
    }

    public final CardBrand getBrand() {
        return this.brand;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getCvcCheck() {
        return this.cvcCheck;
    }

    public final Integer getExpMonth() {
        return this.expMonth;
    }

    public final Integer getExpYear() {
        return this.expYear;
    }

    public final String getFingerprint() {
        return this.fingerprint;
    }

    public final CardFunding getFunding() {
        return this.funding;
    }

    @Override // com.stripe.android.model.StripePaymentSource
    public String getId() {
        return this.f75350id;
    }

    public final String getLast4() {
        return this.last4;
    }

    public final String getName() {
        return this.name;
    }

    public final TokenizationMethod getTokenizationMethod() {
        return this.tokenizationMethod;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        Integer num = this.expMonth;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.expYear;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.addressLine1;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addressLine1Check;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.addressLine2;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.addressCity;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.addressState;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.addressZip;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.addressZipCheck;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressCountry;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.last4;
        int hashCode12 = (((hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31) + this.brand.hashCode()) * 31;
        CardFunding cardFunding = this.funding;
        int hashCode13 = (hashCode12 + (cardFunding == null ? 0 : cardFunding.hashCode())) * 31;
        String str11 = this.fingerprint;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.country;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.currency;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.customerId;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.cvcCheck;
        int hashCode18 = (((hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31) + (getId() == null ? 0 : getId().hashCode())) * 31;
        TokenizationMethod tokenizationMethod = this.tokenizationMethod;
        return hashCode18 + (tokenizationMethod != null ? tokenizationMethod.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.expMonth;
        Integer num2 = this.expYear;
        String str = this.name;
        String str2 = this.addressLine1;
        String str3 = this.addressLine1Check;
        String str4 = this.addressLine2;
        String str5 = this.addressCity;
        String str6 = this.addressState;
        String str7 = this.addressZip;
        String str8 = this.addressZipCheck;
        String str9 = this.addressCountry;
        String str10 = this.last4;
        CardBrand cardBrand = this.brand;
        CardFunding cardFunding = this.funding;
        String str11 = this.fingerprint;
        String str12 = this.country;
        String str13 = this.currency;
        String str14 = this.customerId;
        String str15 = this.cvcCheck;
        String id = getId();
        TokenizationMethod tokenizationMethod = this.tokenizationMethod;
        return "Card(expMonth=" + num + ", expYear=" + num2 + ", name=" + str + ", addressLine1=" + str2 + ", addressLine1Check=" + str3 + ", addressLine2=" + str4 + ", addressCity=" + str5 + ", addressState=" + str6 + ", addressZip=" + str7 + ", addressZipCheck=" + str8 + ", addressCountry=" + str9 + ", last4=" + str10 + ", brand=" + cardBrand + ", funding=" + cardFunding + ", fingerprint=" + str11 + ", country=" + str12 + ", currency=" + str13 + ", customerId=" + str14 + ", cvcCheck=" + str15 + ", id=" + id + ", tokenizationMethod=" + tokenizationMethod + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        Integer num = this.expMonth;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.expYear;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        out.writeString(this.name);
        out.writeString(this.addressLine1);
        out.writeString(this.addressLine1Check);
        out.writeString(this.addressLine2);
        out.writeString(this.addressCity);
        out.writeString(this.addressState);
        out.writeString(this.addressZip);
        out.writeString(this.addressZipCheck);
        out.writeString(this.addressCountry);
        out.writeString(this.last4);
        out.writeString(this.brand.name());
        CardFunding cardFunding = this.funding;
        if (cardFunding == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(cardFunding.name());
        }
        out.writeString(this.fingerprint);
        out.writeString(this.country);
        out.writeString(this.currency);
        out.writeString(this.customerId);
        out.writeString(this.cvcCheck);
        out.writeString(this.f75350id);
        TokenizationMethod tokenizationMethod = this.tokenizationMethod;
        if (tokenizationMethod == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeString(tokenizationMethod.name());
    }

    public /* synthetic */ Card(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, CardBrand cardBrand, CardFunding cardFunding, String str11, String str12, String str13, String str14, String str15, String str16, TokenizationMethod tokenizationMethod, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, cardBrand, (i & 8192) != 0 ? null : cardFunding, (i & 16384) != 0 ? null : str11, (32768 & i) != 0 ? null : str12, (65536 & i) != 0 ? null : str13, (131072 & i) != 0 ? null : str14, (262144 & i) != 0 ? null : str15, str16, (i & 1048576) != 0 ? null : tokenizationMethod);
    }
}
