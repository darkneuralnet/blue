package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0018\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0018\u001a\u00020\bJ\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/model/ReservationPrice;", "", "currency", "", "basePrice", "", "minutePrice", "applyTax", "", "(Ljava/lang/String;JJZ)V", "getApplyTax", "()Z", "getBasePrice", "()J", "getCurrency", "()Ljava/lang/String;", "getMinutePrice", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "ignoreCurrency", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ReservationPrice {
    private final boolean applyTax;
    private final long basePrice;
    private final String currency;
    private final long minutePrice;

    public ReservationPrice(String currency, long j, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.currency = currency;
        this.basePrice = j;
        this.minutePrice = j2;
        this.applyTax = z;
    }

    public static /* synthetic */ ReservationPrice copy$default(ReservationPrice reservationPrice, String str, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reservationPrice.currency;
        }
        if ((i & 2) != 0) {
            j = reservationPrice.basePrice;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = reservationPrice.minutePrice;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            z = reservationPrice.applyTax;
        }
        return reservationPrice.copy(str, j3, j4, z);
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
        return this.applyTax;
    }

    public final ReservationPrice copy(String currency, long j, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new ReservationPrice(currency, j, j2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReservationPrice) {
            ReservationPrice reservationPrice = (ReservationPrice) obj;
            return Intrinsics.areEqual(this.currency, reservationPrice.currency) && this.basePrice == reservationPrice.basePrice && this.minutePrice == reservationPrice.minutePrice && this.applyTax == reservationPrice.applyTax;
        }
        return false;
    }

    public final boolean getApplyTax() {
        return this.applyTax;
    }

    public final long getBasePrice() {
        return this.basePrice;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final long getMinutePrice() {
        return this.minutePrice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.currency.hashCode() * 31) + Long.hashCode(this.basePrice)) * 31) + Long.hashCode(this.minutePrice)) * 31;
        boolean z = this.applyTax;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.currency;
        long j = this.basePrice;
        long j2 = this.minutePrice;
        boolean z = this.applyTax;
        return "ReservationPrice(currency=" + str + ", basePrice=" + j + ", minutePrice=" + j2 + ", applyTax=" + z + ")";
    }

    public final boolean equals(ReservationPrice reservationPrice, boolean z) {
        if (reservationPrice == null) {
            return false;
        }
        if (z) {
            return Intrinsics.areEqual(copy$default(this, "", 0L, 0L, false, 12, null), copy$default(reservationPrice, "", 0L, 0L, false, 12, null));
        }
        return Intrinsics.areEqual(copy$default(this, null, 0L, 0L, false, 13, null), copy$default(reservationPrice, null, 0L, 0L, false, 13, null));
    }

    public /* synthetic */ ReservationPrice(String str, long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2, (i & 8) != 0 ? false : z);
    }
}
