package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006$"}, m28432d2 = {"Lco/bird/android/model/CashpayResponse;", "Landroid/os/Parcelable;", "minAmount", "", "maxAmount", "currency", "", "barcode", "locationsUrl", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBarcode", "()Ljava/lang/String;", "getCurrency", "getLocationsUrl", "getMaxAmount", "()J", "getMinAmount", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CashpayResponse implements Parcelable {
    public static final Parcelable.Creator<CashpayResponse> CREATOR = new Creator();
    @JsonProperty("barcode")
    @InterfaceC41208ft5("barcode")
    private final String barcode;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("locations_url")
    @InterfaceC41208ft5("locations_url")
    private final String locationsUrl;
    @JsonProperty("max_amount")
    @InterfaceC41208ft5("max_amount")
    private final long maxAmount;
    @JsonProperty("min_amount")
    @InterfaceC41208ft5("min_amount")
    private final long minAmount;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<CashpayResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CashpayResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashpayResponse(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CashpayResponse[] newArray(int i) {
            return new CashpayResponse[i];
        }
    }

    public CashpayResponse() {
        this(0L, 0L, null, null, null, 31, null);
    }

    public final long component1() {
        return this.minAmount;
    }

    public final long component2() {
        return this.maxAmount;
    }

    public final String component3() {
        return this.currency;
    }

    public final String component4() {
        return this.barcode;
    }

    public final String component5() {
        return this.locationsUrl;
    }

    public final CashpayResponse copy(long j, long j2, String currency, String barcode, String locationsUrl) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        Intrinsics.checkNotNullParameter(locationsUrl, "locationsUrl");
        return new CashpayResponse(j, j2, currency, barcode, locationsUrl);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CashpayResponse) {
            CashpayResponse cashpayResponse = (CashpayResponse) obj;
            return this.minAmount == cashpayResponse.minAmount && this.maxAmount == cashpayResponse.maxAmount && Intrinsics.areEqual(this.currency, cashpayResponse.currency) && Intrinsics.areEqual(this.barcode, cashpayResponse.barcode) && Intrinsics.areEqual(this.locationsUrl, cashpayResponse.locationsUrl);
        }
        return false;
    }

    public final String getBarcode() {
        return this.barcode;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getLocationsUrl() {
        return this.locationsUrl;
    }

    public final long getMaxAmount() {
        return this.maxAmount;
    }

    public final long getMinAmount() {
        return this.minAmount;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.minAmount) * 31) + Long.hashCode(this.maxAmount)) * 31) + this.currency.hashCode()) * 31) + this.barcode.hashCode()) * 31) + this.locationsUrl.hashCode();
    }

    public String toString() {
        long j = this.minAmount;
        long j2 = this.maxAmount;
        String str = this.currency;
        String str2 = this.barcode;
        String str3 = this.locationsUrl;
        return "CashpayResponse(minAmount=" + j + ", maxAmount=" + j2 + ", currency=" + str + ", barcode=" + str2 + ", locationsUrl=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeLong(this.minAmount);
        out.writeLong(this.maxAmount);
        out.writeString(this.currency);
        out.writeString(this.barcode);
        out.writeString(this.locationsUrl);
    }

    public CashpayResponse(long j, long j2, String currency, String barcode, String locationsUrl) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        Intrinsics.checkNotNullParameter(locationsUrl, "locationsUrl");
        this.minAmount = j;
        this.maxAmount = j2;
        this.currency = currency;
        this.barcode = barcode;
        this.locationsUrl = locationsUrl;
    }

    public /* synthetic */ CashpayResponse(long j, long j2, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) == 0 ? j2 : 0L, (i & 4) != 0 ? Source.USD : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3);
    }
}
