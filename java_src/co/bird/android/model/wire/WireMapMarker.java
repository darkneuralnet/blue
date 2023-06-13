package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdBadgeType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/model/wire/WireMapMarker;", "Landroid/os/Parcelable;", "icon", "", "label", "badgeType", "Lco/bird/android/model/constant/BirdBadgeType;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdBadgeType;)V", "getBadgeType", "()Lco/bird/android/model/constant/BirdBadgeType;", "getIcon", "()Ljava/lang/String;", "getLabel", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireMapMarker implements Parcelable {
    public static final Parcelable.Creator<WireMapMarker> CREATOR = new Creator();
    @JsonProperty("badge_type")
    @InterfaceC41208ft5("badge_type")
    private final BirdBadgeType badgeType;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final String icon;
    @JsonProperty("label")
    @InterfaceC41208ft5("label")
    private final String label;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireMapMarker> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireMapMarker createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireMapMarker(parcel.readString(), parcel.readString(), BirdBadgeType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireMapMarker[] newArray(int i) {
            return new WireMapMarker[i];
        }
    }

    public WireMapMarker() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WireMapMarker copy$default(WireMapMarker wireMapMarker, String str, String str2, BirdBadgeType birdBadgeType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireMapMarker.icon;
        }
        if ((i & 2) != 0) {
            str2 = wireMapMarker.label;
        }
        if ((i & 4) != 0) {
            birdBadgeType = wireMapMarker.badgeType;
        }
        return wireMapMarker.copy(str, str2, birdBadgeType);
    }

    public final String component1() {
        return this.icon;
    }

    public final String component2() {
        return this.label;
    }

    public final BirdBadgeType component3() {
        return this.badgeType;
    }

    public final WireMapMarker copy(String icon, String label, BirdBadgeType badgeType) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(badgeType, "badgeType");
        return new WireMapMarker(icon, label, badgeType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireMapMarker) {
            WireMapMarker wireMapMarker = (WireMapMarker) obj;
            return Intrinsics.areEqual(this.icon, wireMapMarker.icon) && Intrinsics.areEqual(this.label, wireMapMarker.label) && this.badgeType == wireMapMarker.badgeType;
        }
        return false;
    }

    public final BirdBadgeType getBadgeType() {
        return this.badgeType;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (((this.icon.hashCode() * 31) + this.label.hashCode()) * 31) + this.badgeType.hashCode();
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.label;
        BirdBadgeType birdBadgeType = this.badgeType;
        return "WireMapMarker(icon=" + str + ", label=" + str2 + ", badgeType=" + birdBadgeType + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.icon);
        out.writeString(this.label);
        out.writeString(this.badgeType.name());
    }

    public WireMapMarker(String icon, String label, BirdBadgeType badgeType) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(badgeType, "badgeType");
        this.icon = icon;
        this.label = label;
        this.badgeType = badgeType;
    }

    public /* synthetic */ WireMapMarker(String str, String str2, BirdBadgeType birdBadgeType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? BirdBadgeType.UNKNOWN : birdBadgeType);
    }
}
