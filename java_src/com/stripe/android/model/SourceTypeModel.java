package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/SourceTypeModel;", "Lcom/stripe/android/core/model/StripeModel;", "()V", "Card", "SepaDebit", "Lcom/stripe/android/model/SourceTypeModel$Card;", "Lcom/stripe/android/model/SourceTypeModel$SepaDebit;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class SourceTypeModel implements StripeModel {
    public static final int $stable = 0;

    @Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001BB\u0093\u0001\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u009c\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00105J\t\u00106\u001a\u00020\u000bHÖ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020\u000bHÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001J\u0019\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006C"}, m28432d2 = {"Lcom/stripe/android/model/SourceTypeModel$Card;", "Lcom/stripe/android/model/SourceTypeModel;", "addressLine1Check", "", "addressZipCheck", AccountRangeJsonParser.FIELD_BRAND, "Lcom/stripe/android/model/CardBrand;", "country", "cvcCheck", "dynamicLast4", "expiryMonth", "", "expiryYear", "funding", "Lcom/stripe/android/model/CardFunding;", "last4", "threeDSecureStatus", "Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;", "tokenizationMethod", "Lcom/stripe/android/model/TokenizationMethod;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/CardFunding;Ljava/lang/String;Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;Lcom/stripe/android/model/TokenizationMethod;)V", "getAddressLine1Check", "()Ljava/lang/String;", "getAddressZipCheck", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getCountry", "getCvcCheck", "getDynamicLast4", "getExpiryMonth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExpiryYear", "getFunding", "()Lcom/stripe/android/model/CardFunding;", "getLast4", "getThreeDSecureStatus", "()Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;", "getTokenizationMethod", "()Lcom/stripe/android/model/TokenizationMethod;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/CardFunding;Ljava/lang/String;Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;Lcom/stripe/android/model/TokenizationMethod;)Lcom/stripe/android/model/SourceTypeModel$Card;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "ThreeDSecureStatus", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Card extends SourceTypeModel {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
        private final String addressLine1Check;
        private final String addressZipCheck;
        private final CardBrand brand;
        private final String country;
        private final String cvcCheck;
        private final String dynamicLast4;
        private final Integer expiryMonth;
        private final Integer expiryYear;
        private final CardFunding funding;
        private final String last4;
        private final ThreeDSecureStatus threeDSecureStatus;
        private final TokenizationMethod tokenizationMethod;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Card> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Card(parcel.readString(), parcel.readString(), CardBrand.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : CardFunding.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : ThreeDSecureStatus.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : TokenizationMethod.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "Required", "Optional", "NotSupported", "Recommended", "Unknown", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public enum ThreeDSecureStatus {
            Required("required"),
            Optional("optional"),
            NotSupported("not_supported"),
            Recommended("recommended"),
            Unknown("unknown");
            
            public static final Companion Companion = new Companion(null);
            private final String code;

            @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            @SourceDebugExtension({"SMAP\nSourceTypeModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourceTypeModel.kt\ncom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,51:1\n1282#2,2:52\n*S KotlinDebug\n*F\n+ 1 SourceTypeModel.kt\ncom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus$Companion\n*L\n35#1:52,2\n*E\n"})
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final ThreeDSecureStatus fromCode(String str) {
                    ThreeDSecureStatus[] values;
                    for (ThreeDSecureStatus threeDSecureStatus : ThreeDSecureStatus.values()) {
                        if (Intrinsics.areEqual(threeDSecureStatus.code, str)) {
                            return threeDSecureStatus;
                        }
                    }
                    return null;
                }

                private Companion() {
                }
            }

            ThreeDSecureStatus(String str) {
                this.code = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.code;
            }
        }

        public /* synthetic */ Card(String str, String str2, CardBrand cardBrand, String str3, String str4, String str5, Integer num, Integer num2, CardFunding cardFunding, String str6, ThreeDSecureStatus threeDSecureStatus, TokenizationMethod tokenizationMethod, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, cardBrand, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : cardFunding, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : threeDSecureStatus, (i & 2048) != 0 ? null : tokenizationMethod);
        }

        public final String component1() {
            return this.addressLine1Check;
        }

        public final String component10() {
            return this.last4;
        }

        public final ThreeDSecureStatus component11() {
            return this.threeDSecureStatus;
        }

        public final TokenizationMethod component12() {
            return this.tokenizationMethod;
        }

        public final String component2() {
            return this.addressZipCheck;
        }

        public final CardBrand component3() {
            return this.brand;
        }

        public final String component4() {
            return this.country;
        }

        public final String component5() {
            return this.cvcCheck;
        }

        public final String component6() {
            return this.dynamicLast4;
        }

        public final Integer component7() {
            return this.expiryMonth;
        }

        public final Integer component8() {
            return this.expiryYear;
        }

        public final CardFunding component9() {
            return this.funding;
        }

        public final Card copy(String str, String str2, CardBrand brand, String str3, String str4, String str5, Integer num, Integer num2, CardFunding cardFunding, String str6, ThreeDSecureStatus threeDSecureStatus, TokenizationMethod tokenizationMethod) {
            Intrinsics.checkNotNullParameter(brand, "brand");
            return new Card(str, str2, brand, str3, str4, str5, num, num2, cardFunding, str6, threeDSecureStatus, tokenizationMethod);
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
                return Intrinsics.areEqual(this.addressLine1Check, card.addressLine1Check) && Intrinsics.areEqual(this.addressZipCheck, card.addressZipCheck) && this.brand == card.brand && Intrinsics.areEqual(this.country, card.country) && Intrinsics.areEqual(this.cvcCheck, card.cvcCheck) && Intrinsics.areEqual(this.dynamicLast4, card.dynamicLast4) && Intrinsics.areEqual(this.expiryMonth, card.expiryMonth) && Intrinsics.areEqual(this.expiryYear, card.expiryYear) && this.funding == card.funding && Intrinsics.areEqual(this.last4, card.last4) && this.threeDSecureStatus == card.threeDSecureStatus && this.tokenizationMethod == card.tokenizationMethod;
            }
            return false;
        }

        public final String getAddressLine1Check() {
            return this.addressLine1Check;
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

        public final String getCvcCheck() {
            return this.cvcCheck;
        }

        public final String getDynamicLast4() {
            return this.dynamicLast4;
        }

        public final Integer getExpiryMonth() {
            return this.expiryMonth;
        }

        public final Integer getExpiryYear() {
            return this.expiryYear;
        }

        public final CardFunding getFunding() {
            return this.funding;
        }

        public final String getLast4() {
            return this.last4;
        }

        public final ThreeDSecureStatus getThreeDSecureStatus() {
            return this.threeDSecureStatus;
        }

        public final TokenizationMethod getTokenizationMethod() {
            return this.tokenizationMethod;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.addressLine1Check;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.addressZipCheck;
            int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.brand.hashCode()) * 31;
            String str3 = this.country;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cvcCheck;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.dynamicLast4;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.expiryMonth;
            int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryYear;
            int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            CardFunding cardFunding = this.funding;
            int hashCode8 = (hashCode7 + (cardFunding == null ? 0 : cardFunding.hashCode())) * 31;
            String str6 = this.last4;
            int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            ThreeDSecureStatus threeDSecureStatus = this.threeDSecureStatus;
            int hashCode10 = (hashCode9 + (threeDSecureStatus == null ? 0 : threeDSecureStatus.hashCode())) * 31;
            TokenizationMethod tokenizationMethod = this.tokenizationMethod;
            return hashCode10 + (tokenizationMethod != null ? tokenizationMethod.hashCode() : 0);
        }

        public String toString() {
            String str = this.addressLine1Check;
            String str2 = this.addressZipCheck;
            CardBrand cardBrand = this.brand;
            String str3 = this.country;
            String str4 = this.cvcCheck;
            String str5 = this.dynamicLast4;
            Integer num = this.expiryMonth;
            Integer num2 = this.expiryYear;
            CardFunding cardFunding = this.funding;
            String str6 = this.last4;
            ThreeDSecureStatus threeDSecureStatus = this.threeDSecureStatus;
            TokenizationMethod tokenizationMethod = this.tokenizationMethod;
            return "Card(addressLine1Check=" + str + ", addressZipCheck=" + str2 + ", brand=" + cardBrand + ", country=" + str3 + ", cvcCheck=" + str4 + ", dynamicLast4=" + str5 + ", expiryMonth=" + num + ", expiryYear=" + num2 + ", funding=" + cardFunding + ", last4=" + str6 + ", threeDSecureStatus=" + threeDSecureStatus + ", tokenizationMethod=" + tokenizationMethod + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.addressLine1Check);
            out.writeString(this.addressZipCheck);
            out.writeString(this.brand.name());
            out.writeString(this.country);
            out.writeString(this.cvcCheck);
            out.writeString(this.dynamicLast4);
            Integer num = this.expiryMonth;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.expiryYear;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            CardFunding cardFunding = this.funding;
            if (cardFunding == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(cardFunding.name());
            }
            out.writeString(this.last4);
            ThreeDSecureStatus threeDSecureStatus = this.threeDSecureStatus;
            if (threeDSecureStatus == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(threeDSecureStatus.name());
            }
            TokenizationMethod tokenizationMethod = this.tokenizationMethod;
            if (tokenizationMethod == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeString(tokenizationMethod.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(String str, String str2, CardBrand brand, String str3, String str4, String str5, Integer num, Integer num2, CardFunding cardFunding, String str6, ThreeDSecureStatus threeDSecureStatus, TokenizationMethod tokenizationMethod) {
            super(null);
            Intrinsics.checkNotNullParameter(brand, "brand");
            this.addressLine1Check = str;
            this.addressZipCheck = str2;
            this.brand = brand;
            this.country = str3;
            this.cvcCheck = str4;
            this.dynamicLast4 = str5;
            this.expiryMonth = num;
            this.expiryYear = num2;
            this.funding = cardFunding;
            this.last4 = str6;
            this.threeDSecureStatus = threeDSecureStatus;
            this.tokenizationMethod = tokenizationMethod;
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006("}, m28432d2 = {"Lcom/stripe/android/model/SourceTypeModel$SepaDebit;", "Lcom/stripe/android/model/SourceTypeModel;", "bankCode", "", "branchCode", "country", "fingerPrint", "last4", "mandateReference", "mandateUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankCode", "()Ljava/lang/String;", "getBranchCode", "getCountry", "getFingerPrint", "getLast4", "getMandateReference", "getMandateUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class SepaDebit extends SourceTypeModel {
        public static final int $stable = 0;
        public static final Parcelable.Creator<SepaDebit> CREATOR = new Creator();
        private final String bankCode;
        private final String branchCode;
        private final String country;
        private final String fingerPrint;
        private final String last4;
        private final String mandateReference;
        private final String mandateUrl;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<SepaDebit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SepaDebit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SepaDebit(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SepaDebit[] newArray(int i) {
                return new SepaDebit[i];
            }
        }

        public SepaDebit(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            super(null);
            this.bankCode = str;
            this.branchCode = str2;
            this.country = str3;
            this.fingerPrint = str4;
            this.last4 = str5;
            this.mandateReference = str6;
            this.mandateUrl = str7;
        }

        public static /* synthetic */ SepaDebit copy$default(SepaDebit sepaDebit, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sepaDebit.bankCode;
            }
            if ((i & 2) != 0) {
                str2 = sepaDebit.branchCode;
            }
            String str8 = str2;
            if ((i & 4) != 0) {
                str3 = sepaDebit.country;
            }
            String str9 = str3;
            if ((i & 8) != 0) {
                str4 = sepaDebit.fingerPrint;
            }
            String str10 = str4;
            if ((i & 16) != 0) {
                str5 = sepaDebit.last4;
            }
            String str11 = str5;
            if ((i & 32) != 0) {
                str6 = sepaDebit.mandateReference;
            }
            String str12 = str6;
            if ((i & 64) != 0) {
                str7 = sepaDebit.mandateUrl;
            }
            return sepaDebit.copy(str, str8, str9, str10, str11, str12, str7);
        }

        public final String component1() {
            return this.bankCode;
        }

        public final String component2() {
            return this.branchCode;
        }

        public final String component3() {
            return this.country;
        }

        public final String component4() {
            return this.fingerPrint;
        }

        public final String component5() {
            return this.last4;
        }

        public final String component6() {
            return this.mandateReference;
        }

        public final String component7() {
            return this.mandateUrl;
        }

        public final SepaDebit copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            return new SepaDebit(str, str2, str3, str4, str5, str6, str7);
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
            if (obj instanceof SepaDebit) {
                SepaDebit sepaDebit = (SepaDebit) obj;
                return Intrinsics.areEqual(this.bankCode, sepaDebit.bankCode) && Intrinsics.areEqual(this.branchCode, sepaDebit.branchCode) && Intrinsics.areEqual(this.country, sepaDebit.country) && Intrinsics.areEqual(this.fingerPrint, sepaDebit.fingerPrint) && Intrinsics.areEqual(this.last4, sepaDebit.last4) && Intrinsics.areEqual(this.mandateReference, sepaDebit.mandateReference) && Intrinsics.areEqual(this.mandateUrl, sepaDebit.mandateUrl);
            }
            return false;
        }

        public final String getBankCode() {
            return this.bankCode;
        }

        public final String getBranchCode() {
            return this.branchCode;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getFingerPrint() {
            return this.fingerPrint;
        }

        public final String getLast4() {
            return this.last4;
        }

        public final String getMandateReference() {
            return this.mandateReference;
        }

        public final String getMandateUrl() {
            return this.mandateUrl;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.bankCode;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.branchCode;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.country;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.fingerPrint;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.last4;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.mandateReference;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.mandateUrl;
            return hashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        public String toString() {
            String str = this.bankCode;
            String str2 = this.branchCode;
            String str3 = this.country;
            String str4 = this.fingerPrint;
            String str5 = this.last4;
            String str6 = this.mandateReference;
            String str7 = this.mandateUrl;
            return "SepaDebit(bankCode=" + str + ", branchCode=" + str2 + ", country=" + str3 + ", fingerPrint=" + str4 + ", last4=" + str5 + ", mandateReference=" + str6 + ", mandateUrl=" + str7 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.bankCode);
            out.writeString(this.branchCode);
            out.writeString(this.country);
            out.writeString(this.fingerPrint);
            out.writeString(this.last4);
            out.writeString(this.mandateReference);
            out.writeString(this.mandateUrl);
        }
    }

    public /* synthetic */ SourceTypeModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SourceTypeModel() {
    }
}
