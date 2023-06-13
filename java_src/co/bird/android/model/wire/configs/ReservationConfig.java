package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003Jw\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0006HÆ\u0001J\u0013\u0010-\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0006HÖ\u0001J\t\u00100\u001a\u00020\bHÖ\u0001R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001d¨\u00061"}, m28432d2 = {"Lco/bird/android/model/wire/configs/ReservationConfig;", "", "enableRideReservation", "", "enableReserveIntroNewUsers", "maximumReservationDurationMinutes", "", "currency", "", "basePrice", "", "minutePrice", "enableReservePromoOnBadScan", "enableReservePromoOnCancelledRide", "enableReservePromoOnLowBatteryCancelledRide", "reservePromoOfferDuration", "reservePromoReservationDuration", "(ZZILjava/lang/String;JJZZZII)V", "getBasePrice", "()J", "getCurrency", "()Ljava/lang/String;", "getEnableReserveIntroNewUsers", "()Z", "getEnableReservePromoOnBadScan", "getEnableReservePromoOnCancelledRide", "getEnableReservePromoOnLowBatteryCancelledRide", "getEnableRideReservation", "getMaximumReservationDurationMinutes", "()I", "getMinutePrice", "getReservePromoOfferDuration", "getReservePromoReservationDuration", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ReservationConfig {
    @JsonProperty("base_price")
    @InterfaceC41208ft5("base_price")
    private final long basePrice;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("enable_reserve_intro_new_users")
    @InterfaceC41208ft5("enable_reserve_intro_new_users")
    private final boolean enableReserveIntroNewUsers;
    @JsonProperty("enable_reserve_promo_on_bad_scan")
    @InterfaceC41208ft5("enable_reserve_promo_on_bad_scan")
    private final boolean enableReservePromoOnBadScan;
    @JsonProperty("enable_reserve_promo_on_cancelled_ride")
    @InterfaceC41208ft5("enable_reserve_promo_on_cancelled_ride")
    private final boolean enableReservePromoOnCancelledRide;
    @JsonProperty("enable_reserve_promo_on_low_battery_cancelled_ride")
    @InterfaceC41208ft5("enable_reserve_promo_on_low_battery_cancelled_ride")
    private final boolean enableReservePromoOnLowBatteryCancelledRide;
    @JsonProperty("enable_ride_reservation")
    @InterfaceC41208ft5("enable_ride_reservation")
    private final boolean enableRideReservation;
    @JsonProperty("maximum_reservation_duration_minutes")
    @InterfaceC41208ft5("maximum_reservation_duration_minutes")
    private final int maximumReservationDurationMinutes;
    @JsonProperty("minute_price")
    @InterfaceC41208ft5("minute_price")
    private final long minutePrice;
    @JsonProperty("reserve_promo_offer_duration")
    @InterfaceC41208ft5("reserve_promo_offer_duration")
    private final int reservePromoOfferDuration;
    @JsonProperty("reserve_promo_reservation_duration")
    @InterfaceC41208ft5("reserve_promo_reservation_duration")
    private final int reservePromoReservationDuration;

    public ReservationConfig() {
        this(false, false, 0, null, 0L, 0L, false, false, false, 0, 0, 2047, null);
    }

    public final boolean component1() {
        return this.enableRideReservation;
    }

    public final int component10() {
        return this.reservePromoOfferDuration;
    }

    public final int component11() {
        return this.reservePromoReservationDuration;
    }

    public final boolean component2() {
        return this.enableReserveIntroNewUsers;
    }

    public final int component3() {
        return this.maximumReservationDurationMinutes;
    }

    public final String component4() {
        return this.currency;
    }

    public final long component5() {
        return this.basePrice;
    }

    public final long component6() {
        return this.minutePrice;
    }

    public final boolean component7() {
        return this.enableReservePromoOnBadScan;
    }

    public final boolean component8() {
        return this.enableReservePromoOnCancelledRide;
    }

    public final boolean component9() {
        return this.enableReservePromoOnLowBatteryCancelledRide;
    }

    public final ReservationConfig copy(boolean z, boolean z2, int i, String currency, long j, long j2, boolean z3, boolean z4, boolean z5, int i2, int i3) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new ReservationConfig(z, z2, i, currency, j, j2, z3, z4, z5, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReservationConfig) {
            ReservationConfig reservationConfig = (ReservationConfig) obj;
            return this.enableRideReservation == reservationConfig.enableRideReservation && this.enableReserveIntroNewUsers == reservationConfig.enableReserveIntroNewUsers && this.maximumReservationDurationMinutes == reservationConfig.maximumReservationDurationMinutes && Intrinsics.areEqual(this.currency, reservationConfig.currency) && this.basePrice == reservationConfig.basePrice && this.minutePrice == reservationConfig.minutePrice && this.enableReservePromoOnBadScan == reservationConfig.enableReservePromoOnBadScan && this.enableReservePromoOnCancelledRide == reservationConfig.enableReservePromoOnCancelledRide && this.enableReservePromoOnLowBatteryCancelledRide == reservationConfig.enableReservePromoOnLowBatteryCancelledRide && this.reservePromoOfferDuration == reservationConfig.reservePromoOfferDuration && this.reservePromoReservationDuration == reservationConfig.reservePromoReservationDuration;
        }
        return false;
    }

    public final long getBasePrice() {
        return this.basePrice;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final boolean getEnableReserveIntroNewUsers() {
        return this.enableReserveIntroNewUsers;
    }

    public final boolean getEnableReservePromoOnBadScan() {
        return this.enableReservePromoOnBadScan;
    }

    public final boolean getEnableReservePromoOnCancelledRide() {
        return this.enableReservePromoOnCancelledRide;
    }

    public final boolean getEnableReservePromoOnLowBatteryCancelledRide() {
        return this.enableReservePromoOnLowBatteryCancelledRide;
    }

    public final boolean getEnableRideReservation() {
        return this.enableRideReservation;
    }

    public final int getMaximumReservationDurationMinutes() {
        return this.maximumReservationDurationMinutes;
    }

    public final long getMinutePrice() {
        return this.minutePrice;
    }

    public final int getReservePromoOfferDuration() {
        return this.reservePromoOfferDuration;
    }

    public final int getReservePromoReservationDuration() {
        return this.reservePromoReservationDuration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    public int hashCode() {
        boolean z = this.enableRideReservation;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.enableReserveIntroNewUsers;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int hashCode = (((((((((i + i2) * 31) + Integer.hashCode(this.maximumReservationDurationMinutes)) * 31) + this.currency.hashCode()) * 31) + Long.hashCode(this.basePrice)) * 31) + Long.hashCode(this.minutePrice)) * 31;
        ?? r22 = this.enableReservePromoOnBadScan;
        int i3 = r22;
        if (r22 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode + i3) * 31;
        ?? r23 = this.enableReservePromoOnCancelledRide;
        int i5 = r23;
        if (r23 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z2 = this.enableReservePromoOnLowBatteryCancelledRide;
        return ((((i6 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Integer.hashCode(this.reservePromoOfferDuration)) * 31) + Integer.hashCode(this.reservePromoReservationDuration);
    }

    public String toString() {
        boolean z = this.enableRideReservation;
        boolean z2 = this.enableReserveIntroNewUsers;
        int i = this.maximumReservationDurationMinutes;
        String str = this.currency;
        long j = this.basePrice;
        long j2 = this.minutePrice;
        boolean z3 = this.enableReservePromoOnBadScan;
        boolean z4 = this.enableReservePromoOnCancelledRide;
        boolean z5 = this.enableReservePromoOnLowBatteryCancelledRide;
        int i2 = this.reservePromoOfferDuration;
        int i3 = this.reservePromoReservationDuration;
        return "ReservationConfig(enableRideReservation=" + z + ", enableReserveIntroNewUsers=" + z2 + ", maximumReservationDurationMinutes=" + i + ", currency=" + str + ", basePrice=" + j + ", minutePrice=" + j2 + ", enableReservePromoOnBadScan=" + z3 + ", enableReservePromoOnCancelledRide=" + z4 + ", enableReservePromoOnLowBatteryCancelledRide=" + z5 + ", reservePromoOfferDuration=" + i2 + ", reservePromoReservationDuration=" + i3 + ")";
    }

    public ReservationConfig(boolean z, boolean z2, int i, String currency, long j, long j2, boolean z3, boolean z4, boolean z5, int i2, int i3) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.enableRideReservation = z;
        this.enableReserveIntroNewUsers = z2;
        this.maximumReservationDurationMinutes = i;
        this.currency = currency;
        this.basePrice = j;
        this.minutePrice = j2;
        this.enableReservePromoOnBadScan = z3;
        this.enableReservePromoOnCancelledRide = z4;
        this.enableReservePromoOnLowBatteryCancelledRide = z5;
        this.reservePromoOfferDuration = i2;
        this.reservePromoReservationDuration = i3;
    }

    public /* synthetic */ ReservationConfig(boolean z, boolean z2, int i, String str, long j, long j2, boolean z3, boolean z4, boolean z5, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? false : z2, (i4 & 4) != 0 ? 30 : i, (i4 & 8) != 0 ? Source.USD : str, (i4 & 16) != 0 ? 100L : j, (i4 & 32) != 0 ? 15L : j2, (i4 & 64) != 0 ? false : z3, (i4 & 128) != 0 ? false : z4, (i4 & 256) == 0 ? z5 : false, (i4 & 512) != 0 ? 900 : i2, (i4 & 1024) == 0 ? i3 : STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS);
    }
}
