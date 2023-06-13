package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdBadgeType;
import co.bird.android.model.constant.ChargerBirdBadgeType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006'"}, m28432d2 = {"Lco/bird/android/model/wire/WireBirdLabel;", "Landroid/os/Parcelable;", "name", "", "color", "", "marker", "badgeType", "Lco/bird/android/model/constant/BirdBadgeType;", "chargerBadgeType", "Lco/bird/android/model/constant/ChargerBirdBadgeType;", "(Ljava/lang/String;ILjava/lang/String;Lco/bird/android/model/constant/BirdBadgeType;Lco/bird/android/model/constant/ChargerBirdBadgeType;)V", "getBadgeType", "()Lco/bird/android/model/constant/BirdBadgeType;", "getChargerBadgeType", "()Lco/bird/android/model/constant/ChargerBirdBadgeType;", "getColor", "()I", "getMarker", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBirdLabel implements Parcelable {
    public static final Parcelable.Creator<WireBirdLabel> CREATOR = new Creator();
    @JsonProperty("badge_type")
    @InterfaceC41208ft5("badge_type")
    private final BirdBadgeType badgeType;
    @JsonProperty("bird_badge_type")
    @InterfaceC41208ft5("bird_badge_type")
    private final ChargerBirdBadgeType chargerBadgeType;
    @JsonProperty("color")
    @InterfaceC41208ft5("color")
    private final int color;
    @JsonProperty("marker")
    @InterfaceC41208ft5("marker")
    private final String marker;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireBirdLabel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireBirdLabel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireBirdLabel(parcel.readString(), parcel.readInt(), parcel.readString(), BirdBadgeType.valueOf(parcel.readString()), ChargerBirdBadgeType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireBirdLabel[] newArray(int i) {
            return new WireBirdLabel[i];
        }
    }

    public WireBirdLabel() {
        this(null, 0, null, null, null, 31, null);
    }

    public static /* synthetic */ WireBirdLabel copy$default(WireBirdLabel wireBirdLabel, String str, int i, String str2, BirdBadgeType birdBadgeType, ChargerBirdBadgeType chargerBirdBadgeType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = wireBirdLabel.name;
        }
        if ((i2 & 2) != 0) {
            i = wireBirdLabel.color;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = wireBirdLabel.marker;
        }
        String str3 = str2;
        if ((i2 & 8) != 0) {
            birdBadgeType = wireBirdLabel.badgeType;
        }
        BirdBadgeType birdBadgeType2 = birdBadgeType;
        if ((i2 & 16) != 0) {
            chargerBirdBadgeType = wireBirdLabel.chargerBadgeType;
        }
        return wireBirdLabel.copy(str, i3, str3, birdBadgeType2, chargerBirdBadgeType);
    }

    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.color;
    }

    public final String component3() {
        return this.marker;
    }

    public final BirdBadgeType component4() {
        return this.badgeType;
    }

    public final ChargerBirdBadgeType component5() {
        return this.chargerBadgeType;
    }

    public final WireBirdLabel copy(String name, int i, String str, BirdBadgeType badgeType, ChargerBirdBadgeType chargerBadgeType) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(badgeType, "badgeType");
        Intrinsics.checkNotNullParameter(chargerBadgeType, "chargerBadgeType");
        return new WireBirdLabel(name, i, str, badgeType, chargerBadgeType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBirdLabel) {
            WireBirdLabel wireBirdLabel = (WireBirdLabel) obj;
            return Intrinsics.areEqual(this.name, wireBirdLabel.name) && this.color == wireBirdLabel.color && Intrinsics.areEqual(this.marker, wireBirdLabel.marker) && this.badgeType == wireBirdLabel.badgeType && this.chargerBadgeType == wireBirdLabel.chargerBadgeType;
        }
        return false;
    }

    public final BirdBadgeType getBadgeType() {
        return this.badgeType;
    }

    public final ChargerBirdBadgeType getChargerBadgeType() {
        return this.chargerBadgeType;
    }

    public final int getColor() {
        return this.color;
    }

    public final String getMarker() {
        return this.marker;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + Integer.hashCode(this.color)) * 31;
        String str = this.marker;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.badgeType.hashCode()) * 31) + this.chargerBadgeType.hashCode();
    }

    public String toString() {
        String str = this.name;
        int i = this.color;
        String str2 = this.marker;
        BirdBadgeType birdBadgeType = this.badgeType;
        ChargerBirdBadgeType chargerBirdBadgeType = this.chargerBadgeType;
        return "WireBirdLabel(name=" + str + ", color=" + i + ", marker=" + str2 + ", badgeType=" + birdBadgeType + ", chargerBadgeType=" + chargerBirdBadgeType + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.name);
        out.writeInt(this.color);
        out.writeString(this.marker);
        out.writeString(this.badgeType.name());
        out.writeString(this.chargerBadgeType.name());
    }

    public WireBirdLabel(String name, int i, String str, BirdBadgeType badgeType, ChargerBirdBadgeType chargerBadgeType) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(badgeType, "badgeType");
        Intrinsics.checkNotNullParameter(chargerBadgeType, "chargerBadgeType");
        this.name = name;
        this.color = i;
        this.marker = str;
        this.badgeType = badgeType;
        this.chargerBadgeType = chargerBadgeType;
    }

    public /* synthetic */ WireBirdLabel(String str, int i, String str2, BirdBadgeType birdBadgeType, ChargerBirdBadgeType chargerBirdBadgeType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "READY" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? BirdBadgeType.UNKNOWN : birdBadgeType, (i2 & 16) != 0 ? ChargerBirdBadgeType.UNKNOWN : chargerBirdBadgeType);
    }
}
