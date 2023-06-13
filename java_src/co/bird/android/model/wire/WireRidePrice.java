package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010!\u001a\u00020\u000bHÖ\u0001J\u0018\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u00002\u0006\u0010$\u001a\u00020\bJ\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u000bHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000bHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, m28432d2 = {"Lco/bird/android/model/wire/WireRidePrice;", "Landroid/os/Parcelable;", "currency", "", "basePrice", "", "minutePrice", "salesTax", "", "minimumPrice", "includedMinutes", "", "overwriteString", "(Ljava/lang/String;JJZJILjava/lang/String;)V", "getBasePrice", "()J", "getCurrency", "()Ljava/lang/String;", "getIncludedMinutes", "()I", "getMinimumPrice", "getMinutePrice", "getOverwriteString", "getSalesTax", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "ignoreCurrency", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRidePrice implements Parcelable {
    public static final Parcelable.Creator<WireRidePrice> CREATOR = new Creator();
    @JsonProperty("base_price")
    @InterfaceC41208ft5("base_price")
    private final long basePrice;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("included_minutes")
    @InterfaceC41208ft5("included_minutes")
    private final int includedMinutes;
    @JsonProperty("minimum_ride_price")
    @InterfaceC41208ft5("minimum_ride_price")
    private final long minimumPrice;
    @JsonProperty("minute_price")
    @InterfaceC41208ft5("minute_price")
    private final long minutePrice;
    @JsonProperty("localized_dynamic_price_string")
    @InterfaceC41208ft5("localized_dynamic_price_string")
    private final String overwriteString;
    @JsonProperty("sales_tax")
    @InterfaceC41208ft5("sales_tax")
    private final boolean salesTax;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireRidePrice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireRidePrice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireRidePrice(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireRidePrice[] newArray(int i) {
            return new WireRidePrice[i];
        }
    }

    public WireRidePrice() {
        this(null, 0L, 0L, false, 0L, 0, null, 127, null);
    }

    public static /* synthetic */ WireRidePrice copy$default(WireRidePrice wireRidePrice, String str, long j, long j2, boolean z, long j3, int i, String str2, int i2, Object obj) {
        return wireRidePrice.copy((i2 & 1) != 0 ? wireRidePrice.currency : str, (i2 & 2) != 0 ? wireRidePrice.basePrice : j, (i2 & 4) != 0 ? wireRidePrice.minutePrice : j2, (i2 & 8) != 0 ? wireRidePrice.salesTax : z, (i2 & 16) != 0 ? wireRidePrice.minimumPrice : j3, (i2 & 32) != 0 ? wireRidePrice.includedMinutes : i, (i2 & 64) != 0 ? wireRidePrice.overwriteString : str2);
    }

    public final String component1() {
        return this.currency;
    }

    public final long component2() {
        return this.basePrice;
    }

    public final long component3() {
        return this.minutePrice;
    }

    public final boolean component4() {
        return this.salesTax;
    }

    public final long component5() {
        return this.minimumPrice;
    }

    public final int component6() {
        return this.includedMinutes;
    }

    public final String component7() {
        return this.overwriteString;
    }

    public final WireRidePrice copy(String currency, long j, long j2, boolean z, long j3, int i, String str) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new WireRidePrice(currency, j, j2, z, j3, i, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRidePrice) {
            WireRidePrice wireRidePrice = (WireRidePrice) obj;
            return Intrinsics.areEqual(this.currency, wireRidePrice.currency) && this.basePrice == wireRidePrice.basePrice && this.minutePrice == wireRidePrice.minutePrice && this.salesTax == wireRidePrice.salesTax && this.minimumPrice == wireRidePrice.minimumPrice && this.includedMinutes == wireRidePrice.includedMinutes && Intrinsics.areEqual(this.overwriteString, wireRidePrice.overwriteString);
        }
        return false;
    }

    public final long getBasePrice() {
        return this.basePrice;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final int getIncludedMinutes() {
        return this.includedMinutes;
    }

    public final long getMinimumPrice() {
        return this.minimumPrice;
    }

    public final long getMinutePrice() {
        return this.minutePrice;
    }

    public final String getOverwriteString() {
        return this.overwriteString;
    }

    public final boolean getSalesTax() {
        return this.salesTax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.currency.hashCode() * 31) + Long.hashCode(this.basePrice)) * 31) + Long.hashCode(this.minutePrice)) * 31;
        boolean z = this.salesTax;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((((hashCode + i) * 31) + Long.hashCode(this.minimumPrice)) * 31) + Integer.hashCode(this.includedMinutes)) * 31;
        String str = this.overwriteString;
        return hashCode2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.currency;
        long j = this.basePrice;
        long j2 = this.minutePrice;
        boolean z = this.salesTax;
        long j3 = this.minimumPrice;
        int i = this.includedMinutes;
        String str2 = this.overwriteString;
        return "WireRidePrice(currency=" + str + ", basePrice=" + j + ", minutePrice=" + j2 + ", salesTax=" + z + ", minimumPrice=" + j3 + ", includedMinutes=" + i + ", overwriteString=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.currency);
        out.writeLong(this.basePrice);
        out.writeLong(this.minutePrice);
        out.writeInt(this.salesTax ? 1 : 0);
        out.writeLong(this.minimumPrice);
        out.writeInt(this.includedMinutes);
        out.writeString(this.overwriteString);
    }

    public WireRidePrice(String currency, long j, long j2, boolean z, long j3, int i, String str) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.currency = currency;
        this.basePrice = j;
        this.minutePrice = j2;
        this.salesTax = z;
        this.minimumPrice = j3;
        this.includedMinutes = i;
        this.overwriteString = str;
    }

    public final boolean equals(WireRidePrice wireRidePrice, boolean z) {
        if (wireRidePrice == null) {
            return false;
        }
        if (z) {
            return Intrinsics.areEqual(copy$default(this, "", 0L, 0L, false, 0L, 0, null, 126, null), copy$default(wireRidePrice, "", 0L, 0L, false, 0L, 0, null, 126, null));
        }
        return Intrinsics.areEqual(this, wireRidePrice);
    }

    public /* synthetic */ WireRidePrice(String str, long j, long j2, boolean z, long j3, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Source.USD : str, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0L : j2, (i2 & 8) != 0 ? false : z, (i2 & 16) == 0 ? j3 : 0L, (i2 & 32) == 0 ? i : 0, (i2 & 64) != 0 ? null : str2);
    }
}
