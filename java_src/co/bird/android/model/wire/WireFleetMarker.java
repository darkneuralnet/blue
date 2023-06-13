package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.location.places.Place;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u001eJ|\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010/J\t\u00100\u001a\u00020\tHÖ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\tHÖ\u0001J\t\u00106\u001a\u00020\u000bHÖ\u0001J\u0019\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014¨\u0006<"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetMarker;", "Landroid/os/Parcelable;", "fleetIcon", "Lco/bird/android/model/constant/ClientIcon;", "standardPinColor", "Lco/bird/android/model/wire/WireThemedColors;", "backgroundPinColor", "iconColor", "prominence", "", "shape", "", "iconAnimation", "countdownUntil", "Lorg/joda/time/DateTime;", "opacity", "", "label", "(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;ILjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/String;)V", "getBackgroundPinColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getCountdownUntil", "()Lorg/joda/time/DateTime;", "getFleetIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconAnimation", "()Ljava/lang/String;", "getIconColor", "getLabel", "getOpacity", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getProminence", "()I", "getShape", "getStandardPinColor", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;ILjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/String;)Lco/bird/android/model/wire/WireFleetMarker;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleetMarker implements Parcelable {
    public static final Parcelable.Creator<WireFleetMarker> CREATOR = new Creator();
    @JsonProperty("background_pin_color")
    @InterfaceC41208ft5("background_pin_color")
    private final WireThemedColors backgroundPinColor;
    @JsonProperty("countdown_until")
    @InterfaceC41208ft5("countdown_until")
    private final DateTime countdownUntil;
    @JsonProperty("fleet_icon")
    @InterfaceC41208ft5("fleet_icon")
    private final ClientIcon fleetIcon;
    @JsonProperty("icon_animation")
    @InterfaceC41208ft5("icon_animation")
    private final String iconAnimation;
    @JsonProperty("icon_color")
    @InterfaceC41208ft5("icon_color")
    private final WireThemedColors iconColor;
    @JsonProperty("label")
    @InterfaceC41208ft5("label")
    private final String label;
    @JsonProperty("opacity")
    @InterfaceC41208ft5("opacity")
    private final Double opacity;
    @JsonProperty("prominence")
    @InterfaceC41208ft5("prominence")
    private final int prominence;
    @JsonProperty("shape")
    @InterfaceC41208ft5("shape")
    private final String shape;
    @JsonProperty("standard_pin_color")
    @InterfaceC41208ft5("standard_pin_color")
    private final WireThemedColors standardPinColor;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireFleetMarker> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireFleetMarker createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ClientIcon valueOf = ClientIcon.valueOf(parcel.readString());
            Parcelable.Creator<WireThemedColors> creator = WireThemedColors.CREATOR;
            return new WireFleetMarker(valueOf, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireFleetMarker[] newArray(int i) {
            return new WireFleetMarker[i];
        }
    }

    public WireFleetMarker() {
        this(null, null, null, null, 0, null, null, null, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
    }

    public final ClientIcon component1() {
        return this.fleetIcon;
    }

    public final String component10() {
        return this.label;
    }

    public final WireThemedColors component2() {
        return this.standardPinColor;
    }

    public final WireThemedColors component3() {
        return this.backgroundPinColor;
    }

    public final WireThemedColors component4() {
        return this.iconColor;
    }

    public final int component5() {
        return this.prominence;
    }

    public final String component6() {
        return this.shape;
    }

    public final String component7() {
        return this.iconAnimation;
    }

    public final DateTime component8() {
        return this.countdownUntil;
    }

    public final Double component9() {
        return this.opacity;
    }

    public final WireFleetMarker copy(ClientIcon fleetIcon, WireThemedColors standardPinColor, WireThemedColors backgroundPinColor, WireThemedColors iconColor, int i, String str, String str2, DateTime dateTime, Double d, String str3) {
        Intrinsics.checkNotNullParameter(fleetIcon, "fleetIcon");
        Intrinsics.checkNotNullParameter(standardPinColor, "standardPinColor");
        Intrinsics.checkNotNullParameter(backgroundPinColor, "backgroundPinColor");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        return new WireFleetMarker(fleetIcon, standardPinColor, backgroundPinColor, iconColor, i, str, str2, dateTime, d, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleetMarker) {
            WireFleetMarker wireFleetMarker = (WireFleetMarker) obj;
            return this.fleetIcon == wireFleetMarker.fleetIcon && Intrinsics.areEqual(this.standardPinColor, wireFleetMarker.standardPinColor) && Intrinsics.areEqual(this.backgroundPinColor, wireFleetMarker.backgroundPinColor) && Intrinsics.areEqual(this.iconColor, wireFleetMarker.iconColor) && this.prominence == wireFleetMarker.prominence && Intrinsics.areEqual(this.shape, wireFleetMarker.shape) && Intrinsics.areEqual(this.iconAnimation, wireFleetMarker.iconAnimation) && Intrinsics.areEqual(this.countdownUntil, wireFleetMarker.countdownUntil) && Intrinsics.areEqual((Object) this.opacity, (Object) wireFleetMarker.opacity) && Intrinsics.areEqual(this.label, wireFleetMarker.label);
        }
        return false;
    }

    public final WireThemedColors getBackgroundPinColor() {
        return this.backgroundPinColor;
    }

    public final DateTime getCountdownUntil() {
        return this.countdownUntil;
    }

    public final ClientIcon getFleetIcon() {
        return this.fleetIcon;
    }

    public final String getIconAnimation() {
        return this.iconAnimation;
    }

    public final WireThemedColors getIconColor() {
        return this.iconColor;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Double getOpacity() {
        return this.opacity;
    }

    public final int getProminence() {
        return this.prominence;
    }

    public final String getShape() {
        return this.shape;
    }

    public final WireThemedColors getStandardPinColor() {
        return this.standardPinColor;
    }

    public int hashCode() {
        int hashCode = ((((((((this.fleetIcon.hashCode() * 31) + this.standardPinColor.hashCode()) * 31) + this.backgroundPinColor.hashCode()) * 31) + this.iconColor.hashCode()) * 31) + Integer.hashCode(this.prominence)) * 31;
        String str = this.shape;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconAnimation;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DateTime dateTime = this.countdownUntil;
        int hashCode4 = (hashCode3 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Double d = this.opacity;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.label;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        ClientIcon clientIcon = this.fleetIcon;
        WireThemedColors wireThemedColors = this.standardPinColor;
        WireThemedColors wireThemedColors2 = this.backgroundPinColor;
        WireThemedColors wireThemedColors3 = this.iconColor;
        int i = this.prominence;
        String str = this.shape;
        String str2 = this.iconAnimation;
        DateTime dateTime = this.countdownUntil;
        Double d = this.opacity;
        String str3 = this.label;
        return "WireFleetMarker(fleetIcon=" + clientIcon + ", standardPinColor=" + wireThemedColors + ", backgroundPinColor=" + wireThemedColors2 + ", iconColor=" + wireThemedColors3 + ", prominence=" + i + ", shape=" + str + ", iconAnimation=" + str2 + ", countdownUntil=" + dateTime + ", opacity=" + d + ", label=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.fleetIcon.name());
        this.standardPinColor.writeToParcel(out, i);
        this.backgroundPinColor.writeToParcel(out, i);
        this.iconColor.writeToParcel(out, i);
        out.writeInt(this.prominence);
        out.writeString(this.shape);
        out.writeString(this.iconAnimation);
        out.writeSerializable(this.countdownUntil);
        Double d = this.opacity;
        if (d == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeDouble(d.doubleValue());
        }
        out.writeString(this.label);
    }

    public WireFleetMarker(ClientIcon fleetIcon, WireThemedColors standardPinColor, WireThemedColors backgroundPinColor, WireThemedColors iconColor, int i, String str, String str2, DateTime dateTime, Double d, String str3) {
        Intrinsics.checkNotNullParameter(fleetIcon, "fleetIcon");
        Intrinsics.checkNotNullParameter(standardPinColor, "standardPinColor");
        Intrinsics.checkNotNullParameter(backgroundPinColor, "backgroundPinColor");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        this.fleetIcon = fleetIcon;
        this.standardPinColor = standardPinColor;
        this.backgroundPinColor = backgroundPinColor;
        this.iconColor = iconColor;
        this.prominence = i;
        this.shape = str;
        this.iconAnimation = str2;
        this.countdownUntil = dateTime;
        this.opacity = d;
        this.label = str3;
    }

    public /* synthetic */ WireFleetMarker(ClientIcon clientIcon, WireThemedColors wireThemedColors, WireThemedColors wireThemedColors2, WireThemedColors wireThemedColors3, int i, String str, String str2, DateTime dateTime, Double d, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ClientIcon.UNKNOWN : clientIcon, (i2 & 2) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors, (i2 & 4) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors2, (i2 & 8) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors3, (i2 & 16) == 0 ? i : 0, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : dateTime, (i2 & 256) != 0 ? null : d, (i2 & 512) == 0 ? str3 : null);
    }
}
