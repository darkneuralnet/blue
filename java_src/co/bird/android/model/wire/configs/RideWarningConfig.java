package co.bird.android.model.wire.configs;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0018J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006&"}, m28432d2 = {"Lco/bird/android/model/wire/configs/RideWarningConfig;", "Landroid/os/Parcelable;", "enableRideStateBanner", "", "enableRiderAnnotationPills", "pinTapWarningPresentationKind", "Lco/bird/android/model/wire/configs/WarningPresentationKind;", "foregroundFocusWarningPresentationKind", "endRideWarningPresentationKind", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/wire/configs/WarningPresentationKind;Lco/bird/android/model/wire/configs/WarningPresentationKind;Lco/bird/android/model/wire/configs/WarningPresentationKind;)V", "getEnableRideStateBanner", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnableRiderAnnotationPills", "getEndRideWarningPresentationKind", "()Lco/bird/android/model/wire/configs/WarningPresentationKind;", "getForegroundFocusWarningPresentationKind", "getPinTapWarningPresentationKind", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/wire/configs/WarningPresentationKind;Lco/bird/android/model/wire/configs/WarningPresentationKind;Lco/bird/android/model/wire/configs/WarningPresentationKind;)Lco/bird/android/model/wire/configs/RideWarningConfig;", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideWarningConfig implements Parcelable {
    public static final Parcelable.Creator<RideWarningConfig> CREATOR = new Creator();
    @JsonProperty("enable_ride_state_banner")
    @InterfaceC41208ft5("enable_ride_state_banner")
    private final Boolean enableRideStateBanner;
    @JsonProperty("enable_rider_annotation_pills")
    @InterfaceC41208ft5("enable_rider_annotation_pills")
    private final Boolean enableRiderAnnotationPills;
    @JsonProperty("end_ride_warning_presentation_kind")
    @InterfaceC41208ft5("end_ride_warning_presentation_kind")
    private final WarningPresentationKind endRideWarningPresentationKind;
    @JsonProperty("foreground_focus_warning_presentation_kind")
    @InterfaceC41208ft5("foreground_focus_warning_presentation_kind")
    private final WarningPresentationKind foregroundFocusWarningPresentationKind;
    @JsonProperty("pin_tap_warning_presentation_kind")
    @InterfaceC41208ft5("pin_tap_warning_presentation_kind")
    private final WarningPresentationKind pinTapWarningPresentationKind;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<RideWarningConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RideWarningConfig createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RideWarningConfig(valueOf, valueOf2, parcel.readInt() == 0 ? null : WarningPresentationKind.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : WarningPresentationKind.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? WarningPresentationKind.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RideWarningConfig[] newArray(int i) {
            return new RideWarningConfig[i];
        }
    }

    public RideWarningConfig() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ RideWarningConfig copy$default(RideWarningConfig rideWarningConfig, Boolean bool, Boolean bool2, WarningPresentationKind warningPresentationKind, WarningPresentationKind warningPresentationKind2, WarningPresentationKind warningPresentationKind3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = rideWarningConfig.enableRideStateBanner;
        }
        if ((i & 2) != 0) {
            bool2 = rideWarningConfig.enableRiderAnnotationPills;
        }
        Boolean bool3 = bool2;
        if ((i & 4) != 0) {
            warningPresentationKind = rideWarningConfig.pinTapWarningPresentationKind;
        }
        WarningPresentationKind warningPresentationKind4 = warningPresentationKind;
        if ((i & 8) != 0) {
            warningPresentationKind2 = rideWarningConfig.foregroundFocusWarningPresentationKind;
        }
        WarningPresentationKind warningPresentationKind5 = warningPresentationKind2;
        if ((i & 16) != 0) {
            warningPresentationKind3 = rideWarningConfig.endRideWarningPresentationKind;
        }
        return rideWarningConfig.copy(bool, bool3, warningPresentationKind4, warningPresentationKind5, warningPresentationKind3);
    }

    public final Boolean component1() {
        return this.enableRideStateBanner;
    }

    public final Boolean component2() {
        return this.enableRiderAnnotationPills;
    }

    public final WarningPresentationKind component3() {
        return this.pinTapWarningPresentationKind;
    }

    public final WarningPresentationKind component4() {
        return this.foregroundFocusWarningPresentationKind;
    }

    public final WarningPresentationKind component5() {
        return this.endRideWarningPresentationKind;
    }

    public final RideWarningConfig copy(Boolean bool, Boolean bool2, WarningPresentationKind warningPresentationKind, WarningPresentationKind warningPresentationKind2, WarningPresentationKind warningPresentationKind3) {
        return new RideWarningConfig(bool, bool2, warningPresentationKind, warningPresentationKind2, warningPresentationKind3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RideWarningConfig) {
            RideWarningConfig rideWarningConfig = (RideWarningConfig) obj;
            return Intrinsics.areEqual(this.enableRideStateBanner, rideWarningConfig.enableRideStateBanner) && Intrinsics.areEqual(this.enableRiderAnnotationPills, rideWarningConfig.enableRiderAnnotationPills) && this.pinTapWarningPresentationKind == rideWarningConfig.pinTapWarningPresentationKind && this.foregroundFocusWarningPresentationKind == rideWarningConfig.foregroundFocusWarningPresentationKind && this.endRideWarningPresentationKind == rideWarningConfig.endRideWarningPresentationKind;
        }
        return false;
    }

    public final Boolean getEnableRideStateBanner() {
        return this.enableRideStateBanner;
    }

    public final Boolean getEnableRiderAnnotationPills() {
        return this.enableRiderAnnotationPills;
    }

    public final WarningPresentationKind getEndRideWarningPresentationKind() {
        return this.endRideWarningPresentationKind;
    }

    public final WarningPresentationKind getForegroundFocusWarningPresentationKind() {
        return this.foregroundFocusWarningPresentationKind;
    }

    public final WarningPresentationKind getPinTapWarningPresentationKind() {
        return this.pinTapWarningPresentationKind;
    }

    public int hashCode() {
        Boolean bool = this.enableRideStateBanner;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.enableRiderAnnotationPills;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        WarningPresentationKind warningPresentationKind = this.pinTapWarningPresentationKind;
        int hashCode3 = (hashCode2 + (warningPresentationKind == null ? 0 : warningPresentationKind.hashCode())) * 31;
        WarningPresentationKind warningPresentationKind2 = this.foregroundFocusWarningPresentationKind;
        int hashCode4 = (hashCode3 + (warningPresentationKind2 == null ? 0 : warningPresentationKind2.hashCode())) * 31;
        WarningPresentationKind warningPresentationKind3 = this.endRideWarningPresentationKind;
        return hashCode4 + (warningPresentationKind3 != null ? warningPresentationKind3.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.enableRideStateBanner;
        Boolean bool2 = this.enableRiderAnnotationPills;
        WarningPresentationKind warningPresentationKind = this.pinTapWarningPresentationKind;
        WarningPresentationKind warningPresentationKind2 = this.foregroundFocusWarningPresentationKind;
        WarningPresentationKind warningPresentationKind3 = this.endRideWarningPresentationKind;
        return "RideWarningConfig(enableRideStateBanner=" + bool + ", enableRiderAnnotationPills=" + bool2 + ", pinTapWarningPresentationKind=" + warningPresentationKind + ", foregroundFocusWarningPresentationKind=" + warningPresentationKind2 + ", endRideWarningPresentationKind=" + warningPresentationKind3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        Boolean bool = this.enableRideStateBanner;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.enableRiderAnnotationPills;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        WarningPresentationKind warningPresentationKind = this.pinTapWarningPresentationKind;
        if (warningPresentationKind == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            warningPresentationKind.writeToParcel(out, i);
        }
        WarningPresentationKind warningPresentationKind2 = this.foregroundFocusWarningPresentationKind;
        if (warningPresentationKind2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            warningPresentationKind2.writeToParcel(out, i);
        }
        WarningPresentationKind warningPresentationKind3 = this.endRideWarningPresentationKind;
        if (warningPresentationKind3 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        warningPresentationKind3.writeToParcel(out, i);
    }

    public RideWarningConfig(Boolean bool, Boolean bool2, WarningPresentationKind warningPresentationKind, WarningPresentationKind warningPresentationKind2, WarningPresentationKind warningPresentationKind3) {
        this.enableRideStateBanner = bool;
        this.enableRiderAnnotationPills = bool2;
        this.pinTapWarningPresentationKind = warningPresentationKind;
        this.foregroundFocusWarningPresentationKind = warningPresentationKind2;
        this.endRideWarningPresentationKind = warningPresentationKind3;
    }

    public /* synthetic */ RideWarningConfig(Boolean bool, Boolean bool2, WarningPresentationKind warningPresentationKind, WarningPresentationKind warningPresentationKind2, WarningPresentationKind warningPresentationKind3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.TRUE : bool, (i & 2) != 0 ? Boolean.FALSE : bool2, (i & 4) != 0 ? null : warningPresentationKind, (i & 8) != 0 ? null : warningPresentationKind2, (i & 16) == 0 ? warningPresentationKind3 : null);
    }
}
