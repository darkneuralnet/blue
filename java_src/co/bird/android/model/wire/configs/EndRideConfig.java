package co.bird.android.model.wire.configs;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJV\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000f¨\u0006)"}, m28432d2 = {"Lco/bird/android/model/wire/configs/EndRideConfig;", "Landroid/os/Parcelable;", "photoBannerBodyOverride", "", "photoConfirmationBannerBodyOverride", "waitForForegroundAreasSeconds", "", "waitForForegroundConfigSeconds", "waitForForegroundLocationSeconds", "waitForForegroundParkingNestsSeconds", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "getPhotoBannerBodyOverride", "()Ljava/lang/String;", "getPhotoConfirmationBannerBodyOverride", "getWaitForForegroundAreasSeconds", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getWaitForForegroundConfigSeconds", "getWaitForForegroundLocationSeconds", "getWaitForForegroundParkingNestsSeconds", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lco/bird/android/model/wire/configs/EndRideConfig;", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class EndRideConfig implements Parcelable {
    public static final Parcelable.Creator<EndRideConfig> CREATOR = new Creator();
    @JsonProperty("photo_banner_body_override")
    @InterfaceC41208ft5("photo_banner_body_override")
    private final String photoBannerBodyOverride;
    @JsonProperty("photo_confirmation_banner_body_override")
    @InterfaceC41208ft5("photo_confirmation_banner_body_override")
    private final String photoConfirmationBannerBodyOverride;
    @JsonProperty("wait_for_foreground_areas_seconds")
    @InterfaceC41208ft5("wait_for_foreground_areas_seconds")
    private final Float waitForForegroundAreasSeconds;
    @JsonProperty("wait_for_foreground_config_seconds")
    @InterfaceC41208ft5("wait_for_foreground_config_seconds")
    private final Float waitForForegroundConfigSeconds;
    @JsonProperty("wait_for_foreground_location_seconds")
    @InterfaceC41208ft5("wait_for_foreground_location_seconds")
    private final Float waitForForegroundLocationSeconds;
    @JsonProperty("wait_for_foreground_parking_nests_seconds")
    @InterfaceC41208ft5("wait_for_foreground_parking_nests_seconds")
    private final Float waitForForegroundParkingNestsSeconds;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<EndRideConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EndRideConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EndRideConfig(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EndRideConfig[] newArray(int i) {
            return new EndRideConfig[i];
        }
    }

    public EndRideConfig() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ EndRideConfig copy$default(EndRideConfig endRideConfig, String str, String str2, Float f, Float f2, Float f3, Float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = endRideConfig.photoBannerBodyOverride;
        }
        if ((i & 2) != 0) {
            str2 = endRideConfig.photoConfirmationBannerBodyOverride;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            f = endRideConfig.waitForForegroundAreasSeconds;
        }
        Float f5 = f;
        if ((i & 8) != 0) {
            f2 = endRideConfig.waitForForegroundConfigSeconds;
        }
        Float f6 = f2;
        if ((i & 16) != 0) {
            f3 = endRideConfig.waitForForegroundLocationSeconds;
        }
        Float f7 = f3;
        if ((i & 32) != 0) {
            f4 = endRideConfig.waitForForegroundParkingNestsSeconds;
        }
        return endRideConfig.copy(str, str3, f5, f6, f7, f4);
    }

    public final String component1() {
        return this.photoBannerBodyOverride;
    }

    public final String component2() {
        return this.photoConfirmationBannerBodyOverride;
    }

    public final Float component3() {
        return this.waitForForegroundAreasSeconds;
    }

    public final Float component4() {
        return this.waitForForegroundConfigSeconds;
    }

    public final Float component5() {
        return this.waitForForegroundLocationSeconds;
    }

    public final Float component6() {
        return this.waitForForegroundParkingNestsSeconds;
    }

    public final EndRideConfig copy(String str, String str2, Float f, Float f2, Float f3, Float f4) {
        return new EndRideConfig(str, str2, f, f2, f3, f4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EndRideConfig) {
            EndRideConfig endRideConfig = (EndRideConfig) obj;
            return Intrinsics.areEqual(this.photoBannerBodyOverride, endRideConfig.photoBannerBodyOverride) && Intrinsics.areEqual(this.photoConfirmationBannerBodyOverride, endRideConfig.photoConfirmationBannerBodyOverride) && Intrinsics.areEqual((Object) this.waitForForegroundAreasSeconds, (Object) endRideConfig.waitForForegroundAreasSeconds) && Intrinsics.areEqual((Object) this.waitForForegroundConfigSeconds, (Object) endRideConfig.waitForForegroundConfigSeconds) && Intrinsics.areEqual((Object) this.waitForForegroundLocationSeconds, (Object) endRideConfig.waitForForegroundLocationSeconds) && Intrinsics.areEqual((Object) this.waitForForegroundParkingNestsSeconds, (Object) endRideConfig.waitForForegroundParkingNestsSeconds);
        }
        return false;
    }

    public final String getPhotoBannerBodyOverride() {
        return this.photoBannerBodyOverride;
    }

    public final String getPhotoConfirmationBannerBodyOverride() {
        return this.photoConfirmationBannerBodyOverride;
    }

    public final Float getWaitForForegroundAreasSeconds() {
        return this.waitForForegroundAreasSeconds;
    }

    public final Float getWaitForForegroundConfigSeconds() {
        return this.waitForForegroundConfigSeconds;
    }

    public final Float getWaitForForegroundLocationSeconds() {
        return this.waitForForegroundLocationSeconds;
    }

    public final Float getWaitForForegroundParkingNestsSeconds() {
        return this.waitForForegroundParkingNestsSeconds;
    }

    public int hashCode() {
        String str = this.photoBannerBodyOverride;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.photoConfirmationBannerBodyOverride;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.waitForForegroundAreasSeconds;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.waitForForegroundConfigSeconds;
        int hashCode4 = (hashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.waitForForegroundLocationSeconds;
        int hashCode5 = (hashCode4 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.waitForForegroundParkingNestsSeconds;
        return hashCode5 + (f4 != null ? f4.hashCode() : 0);
    }

    public String toString() {
        String str = this.photoBannerBodyOverride;
        String str2 = this.photoConfirmationBannerBodyOverride;
        Float f = this.waitForForegroundAreasSeconds;
        Float f2 = this.waitForForegroundConfigSeconds;
        Float f3 = this.waitForForegroundLocationSeconds;
        Float f4 = this.waitForForegroundParkingNestsSeconds;
        return "EndRideConfig(photoBannerBodyOverride=" + str + ", photoConfirmationBannerBodyOverride=" + str2 + ", waitForForegroundAreasSeconds=" + f + ", waitForForegroundConfigSeconds=" + f2 + ", waitForForegroundLocationSeconds=" + f3 + ", waitForForegroundParkingNestsSeconds=" + f4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.photoBannerBodyOverride);
        out.writeString(this.photoConfirmationBannerBodyOverride);
        Float f = this.waitForForegroundAreasSeconds;
        if (f == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeFloat(f.floatValue());
        }
        Float f2 = this.waitForForegroundConfigSeconds;
        if (f2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeFloat(f2.floatValue());
        }
        Float f3 = this.waitForForegroundLocationSeconds;
        if (f3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeFloat(f3.floatValue());
        }
        Float f4 = this.waitForForegroundParkingNestsSeconds;
        if (f4 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeFloat(f4.floatValue());
    }

    public EndRideConfig(String str, String str2, Float f, Float f2, Float f3, Float f4) {
        this.photoBannerBodyOverride = str;
        this.photoConfirmationBannerBodyOverride = str2;
        this.waitForForegroundAreasSeconds = f;
        this.waitForForegroundConfigSeconds = f2;
        this.waitForForegroundLocationSeconds = f3;
        this.waitForForegroundParkingNestsSeconds = f4;
    }

    public /* synthetic */ EndRideConfig(String str, String str2, Float f, Float f2, Float f3, Float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : f2, (i & 16) != 0 ? null : f3, (i & 32) != 0 ? null : f4);
    }
}
