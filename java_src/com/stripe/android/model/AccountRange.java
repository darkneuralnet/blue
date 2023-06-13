package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B+\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\tHÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, m28432d2 = {"Lcom/stripe/android/model/AccountRange;", "Lcom/stripe/android/core/model/StripeModel;", "binRange", "Lcom/stripe/android/model/BinRange;", "panLength", "", "brandInfo", "Lcom/stripe/android/model/AccountRange$BrandInfo;", "country", "", "(Lcom/stripe/android/model/BinRange;ILcom/stripe/android/model/AccountRange$BrandInfo;Ljava/lang/String;)V", "getBinRange", "()Lcom/stripe/android/model/BinRange;", AccountRangeJsonParser.FIELD_BRAND, "Lcom/stripe/android/model/CardBrand;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getBrandInfo", "()Lcom/stripe/android/model/AccountRange$BrandInfo;", "getCountry", "()Ljava/lang/String;", "getPanLength", "()I", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "BrandInfo", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AccountRange implements StripeModel {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AccountRange> CREATOR = new Creator();
    private final BinRange binRange;
    private final BrandInfo brandInfo;
    private final String country;
    private final int panLength;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/model/AccountRange$BrandInfo;", "", "brandName", "", AccountRangeJsonParser.FIELD_BRAND, "Lcom/stripe/android/model/CardBrand;", "(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/model/CardBrand;)V", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getBrandName", "()Ljava/lang/String;", "Visa", "Mastercard", "AmericanExpress", "JCB", "DinersClub", "Discover", "UnionPay", "CartesBancaires", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum BrandInfo {
        Visa("VISA", CardBrand.Visa),
        Mastercard("MASTERCARD", CardBrand.MasterCard),
        AmericanExpress("AMERICAN_EXPRESS", CardBrand.AmericanExpress),
        JCB("JCB", CardBrand.JCB),
        DinersClub("DINERS_CLUB", CardBrand.DinersClub),
        Discover("DISCOVER", CardBrand.Discover),
        UnionPay("UNIONPAY", CardBrand.UnionPay),
        CartesBancaires("CARTES_BANCAIRES", CardBrand.CartesBancaires);
        
        private final CardBrand brand;
        private final String brandName;

        BrandInfo(String str, CardBrand cardBrand) {
            this.brandName = str;
            this.brand = cardBrand;
        }

        public final CardBrand getBrand() {
            return this.brand;
        }

        public final String getBrandName() {
            return this.brandName;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<AccountRange> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountRange createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountRange(BinRange.CREATOR.createFromParcel(parcel), parcel.readInt(), BrandInfo.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountRange[] newArray(int i) {
            return new AccountRange[i];
        }
    }

    public AccountRange(BinRange binRange, int i, BrandInfo brandInfo, String str) {
        Intrinsics.checkNotNullParameter(binRange, "binRange");
        Intrinsics.checkNotNullParameter(brandInfo, "brandInfo");
        this.binRange = binRange;
        this.panLength = i;
        this.brandInfo = brandInfo;
        this.country = str;
    }

    public static /* synthetic */ AccountRange copy$default(AccountRange accountRange, BinRange binRange, int i, BrandInfo brandInfo, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            binRange = accountRange.binRange;
        }
        if ((i2 & 2) != 0) {
            i = accountRange.panLength;
        }
        if ((i2 & 4) != 0) {
            brandInfo = accountRange.brandInfo;
        }
        if ((i2 & 8) != 0) {
            str = accountRange.country;
        }
        return accountRange.copy(binRange, i, brandInfo, str);
    }

    public final BinRange component1() {
        return this.binRange;
    }

    public final int component2() {
        return this.panLength;
    }

    public final BrandInfo component3() {
        return this.brandInfo;
    }

    public final String component4() {
        return this.country;
    }

    public final AccountRange copy(BinRange binRange, int i, BrandInfo brandInfo, String str) {
        Intrinsics.checkNotNullParameter(binRange, "binRange");
        Intrinsics.checkNotNullParameter(brandInfo, "brandInfo");
        return new AccountRange(binRange, i, brandInfo, str);
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
        if (obj instanceof AccountRange) {
            AccountRange accountRange = (AccountRange) obj;
            return Intrinsics.areEqual(this.binRange, accountRange.binRange) && this.panLength == accountRange.panLength && this.brandInfo == accountRange.brandInfo && Intrinsics.areEqual(this.country, accountRange.country);
        }
        return false;
    }

    public final BinRange getBinRange() {
        return this.binRange;
    }

    public final CardBrand getBrand() {
        return this.brandInfo.getBrand();
    }

    public final BrandInfo getBrandInfo() {
        return this.brandInfo;
    }

    public final String getCountry() {
        return this.country;
    }

    public final int getPanLength() {
        return this.panLength;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = ((((this.binRange.hashCode() * 31) + Integer.hashCode(this.panLength)) * 31) + this.brandInfo.hashCode()) * 31;
        String str = this.country;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        BinRange binRange = this.binRange;
        int i = this.panLength;
        BrandInfo brandInfo = this.brandInfo;
        String str = this.country;
        return "AccountRange(binRange=" + binRange + ", panLength=" + i + ", brandInfo=" + brandInfo + ", country=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.binRange.writeToParcel(out, i);
        out.writeInt(this.panLength);
        out.writeString(this.brandInfo.name());
        out.writeString(this.country);
    }

    public /* synthetic */ AccountRange(BinRange binRange, int i, BrandInfo brandInfo, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(binRange, i, brandInfo, (i2 & 8) != 0 ? null : str);
    }
}
