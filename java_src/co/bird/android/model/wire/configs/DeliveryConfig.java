package co.bird.android.model.wire.configs;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Source;
import com.stripe.android.paymentsheet.p047ui.PrimaryButtonAnimator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0011HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0016HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J\t\u0010;\u001a\u00020\fHÆ\u0003J\t\u0010<\u001a\u00020\fHÆ\u0003J\u0097\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001J\t\u0010>\u001a\u00020\fHÖ\u0001J\u0013\u0010?\u001a\u00020\u00052\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020\fHÖ\u0001J\t\u0010C\u001a\u00020\nHÖ\u0001J\u0019\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\fHÖ\u0001R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0014\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001b¨\u0006I"}, m28432d2 = {"Lco/bird/android/model/wire/configs/DeliveryConfig;", "Landroid/os/Parcelable;", "launchDate", "Lorg/joda/time/LocalDate;", "enabled", "", "weekdayPrice", "", "weekendPrice", "currency", "", "releaseWindowStartHour", "", "releaseWindowEndHour", "lockedRideEndHour", "forceRideEndHour", "releaseRadius", "", "deliveryMapV2", "enableDeliveryMenuItem", "cancellationFee", "activeRequestKind", "Lco/bird/android/model/wire/configs/DeliveryRequestKind;", "(Lorg/joda/time/LocalDate;ZJJLjava/lang/String;IIIIDZZJLco/bird/android/model/wire/configs/DeliveryRequestKind;)V", "getActiveRequestKind", "()Lco/bird/android/model/wire/configs/DeliveryRequestKind;", "getCancellationFee", "()J", "getCurrency", "()Ljava/lang/String;", "getDeliveryMapV2", "()Z", "getEnableDeliveryMenuItem", "getEnabled$annotations", "()V", "getEnabled", "getForceRideEndHour", "()I", "getLaunchDate", "()Lorg/joda/time/LocalDate;", "getLockedRideEndHour", "getReleaseRadius", "()D", "getReleaseWindowEndHour", "getReleaseWindowStartHour", "getWeekdayPrice", "getWeekendPrice", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryConfig implements Parcelable {
    public static final Parcelable.Creator<DeliveryConfig> CREATOR = new Creator();
    @JsonProperty("active_request_kind")
    @InterfaceC41208ft5("active_request_kind")
    private final DeliveryRequestKind activeRequestKind;
    @JsonProperty("cancellation_fee")
    @InterfaceC41208ft5("cancellation_fee")
    private final long cancellationFee;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("use_new_merged_delivery_screen")
    @InterfaceC41208ft5("use_new_merged_delivery_screen")
    private final boolean deliveryMapV2;
    @JsonProperty("enable_delivery_menu_item")
    @InterfaceC41208ft5("enable_delivery_menu_item")
    private final boolean enableDeliveryMenuItem;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("force_ride_end_hour")
    @InterfaceC41208ft5("force_ride_end_hour")
    private final int forceRideEndHour;
    @JsonProperty("delivery_launch_date")
    @InterfaceC41208ft5("delivery_launch_date")
    private final LocalDate launchDate;
    @JsonProperty("locked_ride_end_hour")
    @InterfaceC41208ft5("locked_ride_end_hour")
    private final int lockedRideEndHour;
    @JsonProperty("release_radius")
    @InterfaceC41208ft5("release_radius")
    private final double releaseRadius;
    @JsonProperty("release_window_end_hour")
    @InterfaceC41208ft5("release_window_end_hour")
    private final int releaseWindowEndHour;
    @JsonProperty("release_window_start_hour")
    @InterfaceC41208ft5("release_window_start_hour")
    private final int releaseWindowStartHour;
    @JsonProperty("weekday_price")
    @InterfaceC41208ft5("weekday_price")
    private final long weekdayPrice;
    @JsonProperty("weekend_price")
    @InterfaceC41208ft5("weekend_price")
    private final long weekendPrice;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<DeliveryConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeliveryConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeliveryConfig((LocalDate) parcel.readSerializable(), parcel.readInt() != 0, parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readDouble(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong(), DeliveryRequestKind.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeliveryConfig[] newArray(int i) {
            return new DeliveryConfig[i];
        }
    }

    public DeliveryConfig() {
        this(null, false, 0L, 0L, null, 0, 0, 0, 0, 0.0d, false, false, 0L, null, 16383, null);
    }

    @Deprecated(message = "Deprecated. Use presence of launchDate instead.")
    public static /* synthetic */ void getEnabled$annotations() {
    }

    public final LocalDate component1() {
        return this.launchDate;
    }

    public final double component10() {
        return this.releaseRadius;
    }

    public final boolean component11() {
        return this.deliveryMapV2;
    }

    public final boolean component12() {
        return this.enableDeliveryMenuItem;
    }

    public final long component13() {
        return this.cancellationFee;
    }

    public final DeliveryRequestKind component14() {
        return this.activeRequestKind;
    }

    public final boolean component2() {
        return this.enabled;
    }

    public final long component3() {
        return this.weekdayPrice;
    }

    public final long component4() {
        return this.weekendPrice;
    }

    public final String component5() {
        return this.currency;
    }

    public final int component6() {
        return this.releaseWindowStartHour;
    }

    public final int component7() {
        return this.releaseWindowEndHour;
    }

    public final int component8() {
        return this.lockedRideEndHour;
    }

    public final int component9() {
        return this.forceRideEndHour;
    }

    public final DeliveryConfig copy(LocalDate localDate, boolean z, long j, long j2, String currency, int i, int i2, int i3, int i4, double d, boolean z2, boolean z3, long j3, DeliveryRequestKind activeRequestKind) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(activeRequestKind, "activeRequestKind");
        return new DeliveryConfig(localDate, z, j, j2, currency, i, i2, i3, i4, d, z2, z3, j3, activeRequestKind);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeliveryConfig) {
            DeliveryConfig deliveryConfig = (DeliveryConfig) obj;
            return Intrinsics.areEqual(this.launchDate, deliveryConfig.launchDate) && this.enabled == deliveryConfig.enabled && this.weekdayPrice == deliveryConfig.weekdayPrice && this.weekendPrice == deliveryConfig.weekendPrice && Intrinsics.areEqual(this.currency, deliveryConfig.currency) && this.releaseWindowStartHour == deliveryConfig.releaseWindowStartHour && this.releaseWindowEndHour == deliveryConfig.releaseWindowEndHour && this.lockedRideEndHour == deliveryConfig.lockedRideEndHour && this.forceRideEndHour == deliveryConfig.forceRideEndHour && Double.compare(this.releaseRadius, deliveryConfig.releaseRadius) == 0 && this.deliveryMapV2 == deliveryConfig.deliveryMapV2 && this.enableDeliveryMenuItem == deliveryConfig.enableDeliveryMenuItem && this.cancellationFee == deliveryConfig.cancellationFee && this.activeRequestKind == deliveryConfig.activeRequestKind;
        }
        return false;
    }

    public final DeliveryRequestKind getActiveRequestKind() {
        return this.activeRequestKind;
    }

    public final long getCancellationFee() {
        return this.cancellationFee;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final boolean getDeliveryMapV2() {
        return this.deliveryMapV2;
    }

    public final boolean getEnableDeliveryMenuItem() {
        return this.enableDeliveryMenuItem;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getForceRideEndHour() {
        return this.forceRideEndHour;
    }

    public final LocalDate getLaunchDate() {
        return this.launchDate;
    }

    public final int getLockedRideEndHour() {
        return this.lockedRideEndHour;
    }

    public final double getReleaseRadius() {
        return this.releaseRadius;
    }

    public final int getReleaseWindowEndHour() {
        return this.releaseWindowEndHour;
    }

    public final int getReleaseWindowStartHour() {
        return this.releaseWindowStartHour;
    }

    public final long getWeekdayPrice() {
        return this.weekdayPrice;
    }

    public final long getWeekendPrice() {
        return this.weekendPrice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        LocalDate localDate = this.launchDate;
        int hashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        boolean z = this.enabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((((((((((((((((hashCode + i) * 31) + Long.hashCode(this.weekdayPrice)) * 31) + Long.hashCode(this.weekendPrice)) * 31) + this.currency.hashCode()) * 31) + Integer.hashCode(this.releaseWindowStartHour)) * 31) + Integer.hashCode(this.releaseWindowEndHour)) * 31) + Integer.hashCode(this.lockedRideEndHour)) * 31) + Integer.hashCode(this.forceRideEndHour)) * 31) + Double.hashCode(this.releaseRadius)) * 31;
        boolean z2 = this.deliveryMapV2;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z3 = this.enableDeliveryMenuItem;
        return ((((i3 + (z3 ? 1 : z3 ? 1 : 0)) * 31) + Long.hashCode(this.cancellationFee)) * 31) + this.activeRequestKind.hashCode();
    }

    public String toString() {
        LocalDate localDate = this.launchDate;
        boolean z = this.enabled;
        long j = this.weekdayPrice;
        long j2 = this.weekendPrice;
        String str = this.currency;
        int i = this.releaseWindowStartHour;
        int i2 = this.releaseWindowEndHour;
        int i3 = this.lockedRideEndHour;
        int i4 = this.forceRideEndHour;
        double d = this.releaseRadius;
        boolean z2 = this.deliveryMapV2;
        boolean z3 = this.enableDeliveryMenuItem;
        long j3 = this.cancellationFee;
        DeliveryRequestKind deliveryRequestKind = this.activeRequestKind;
        return "DeliveryConfig(launchDate=" + localDate + ", enabled=" + z + ", weekdayPrice=" + j + ", weekendPrice=" + j2 + ", currency=" + str + ", releaseWindowStartHour=" + i + ", releaseWindowEndHour=" + i2 + ", lockedRideEndHour=" + i3 + ", forceRideEndHour=" + i4 + ", releaseRadius=" + d + ", deliveryMapV2=" + z2 + ", enableDeliveryMenuItem=" + z3 + ", cancellationFee=" + j3 + ", activeRequestKind=" + deliveryRequestKind + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeSerializable(this.launchDate);
        out.writeInt(this.enabled ? 1 : 0);
        out.writeLong(this.weekdayPrice);
        out.writeLong(this.weekendPrice);
        out.writeString(this.currency);
        out.writeInt(this.releaseWindowStartHour);
        out.writeInt(this.releaseWindowEndHour);
        out.writeInt(this.lockedRideEndHour);
        out.writeInt(this.forceRideEndHour);
        out.writeDouble(this.releaseRadius);
        out.writeInt(this.deliveryMapV2 ? 1 : 0);
        out.writeInt(this.enableDeliveryMenuItem ? 1 : 0);
        out.writeLong(this.cancellationFee);
        out.writeString(this.activeRequestKind.name());
    }

    public DeliveryConfig(LocalDate localDate, boolean z, long j, long j2, String currency, int i, int i2, int i3, int i4, double d, boolean z2, boolean z3, long j3, DeliveryRequestKind activeRequestKind) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(activeRequestKind, "activeRequestKind");
        this.launchDate = localDate;
        this.enabled = z;
        this.weekdayPrice = j;
        this.weekendPrice = j2;
        this.currency = currency;
        this.releaseWindowStartHour = i;
        this.releaseWindowEndHour = i2;
        this.lockedRideEndHour = i3;
        this.forceRideEndHour = i4;
        this.releaseRadius = d;
        this.deliveryMapV2 = z2;
        this.enableDeliveryMenuItem = z3;
        this.cancellationFee = j3;
        this.activeRequestKind = activeRequestKind;
    }

    public /* synthetic */ DeliveryConfig(LocalDate localDate, boolean z, long j, long j2, String str, int i, int i2, int i3, int i4, double d, boolean z2, boolean z3, long j3, DeliveryRequestKind deliveryRequestKind, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : localDate, (i5 & 2) != 0 ? false : z, (i5 & 4) != 0 ? PrimaryButtonAnimator.HOLD_ANIMATION_ON_SLIDE_IN_COMPLETION : j, (i5 & 8) != 0 ? 2000L : j2, (i5 & 16) != 0 ? Source.USD : str, (i5 & 32) != 0 ? 4 : i, (i5 & 64) != 0 ? 7 : i2, (i5 & 128) != 0 ? 21 : i3, (i5 & 256) != 0 ? 22 : i4, (i5 & 512) != 0 ? 20.0d : d, (i5 & 1024) != 0 ? false : z2, (i5 & 2048) != 0 ? false : z3, (i5 & 4096) != 0 ? 0L : j3, (i5 & 8192) != 0 ? DeliveryRequestKind.BASIC : deliveryRequestKind);
    }
}
