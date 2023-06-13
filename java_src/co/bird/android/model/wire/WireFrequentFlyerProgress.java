package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ProgressType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006("}, m28432d2 = {"Lco/bird/android/model/wire/WireFrequentFlyerProgress;", "Landroid/os/Parcelable;", "title", "", "subtitle", "color", "", "currentRides", "totalRides", "progressType", "Lco/bird/android/model/constant/ProgressType;", "(Ljava/lang/String;Ljava/lang/String;IIILco/bird/android/model/constant/ProgressType;)V", "getColor", "()I", "getCurrentRides", "getProgressType", "()Lco/bird/android/model/constant/ProgressType;", "getSubtitle", "()Ljava/lang/String;", "getTitle", "getTotalRides", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFrequentFlyerProgress implements Parcelable {
    public static final Parcelable.Creator<WireFrequentFlyerProgress> CREATOR = new Creator();
    @JsonProperty("color")
    @InterfaceC41208ft5("color")
    private final int color;
    @JsonProperty("current_rides")
    @InterfaceC41208ft5("current_rides")
    private final int currentRides;
    @JsonProperty("progress_type")
    @InterfaceC41208ft5("progress_type")
    private final ProgressType progressType;
    @JsonProperty("subtitle")
    @InterfaceC41208ft5("subtitle")
    private final String subtitle;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("total_rides")
    @InterfaceC41208ft5("total_rides")
    private final int totalRides;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireFrequentFlyerProgress> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireFrequentFlyerProgress createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireFrequentFlyerProgress(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), ProgressType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireFrequentFlyerProgress[] newArray(int i) {
            return new WireFrequentFlyerProgress[i];
        }
    }

    public WireFrequentFlyerProgress(String title, String subtitle, int i, int i2, int i3, ProgressType progressType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(progressType, "progressType");
        this.title = title;
        this.subtitle = subtitle;
        this.color = i;
        this.currentRides = i2;
        this.totalRides = i3;
        this.progressType = progressType;
    }

    public static /* synthetic */ WireFrequentFlyerProgress copy$default(WireFrequentFlyerProgress wireFrequentFlyerProgress, String str, String str2, int i, int i2, int i3, ProgressType progressType, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = wireFrequentFlyerProgress.title;
        }
        if ((i4 & 2) != 0) {
            str2 = wireFrequentFlyerProgress.subtitle;
        }
        String str3 = str2;
        if ((i4 & 4) != 0) {
            i = wireFrequentFlyerProgress.color;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = wireFrequentFlyerProgress.currentRides;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = wireFrequentFlyerProgress.totalRides;
        }
        int i7 = i3;
        if ((i4 & 32) != 0) {
            progressType = wireFrequentFlyerProgress.progressType;
        }
        return wireFrequentFlyerProgress.copy(str, str3, i5, i6, i7, progressType);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final int component3() {
        return this.color;
    }

    public final int component4() {
        return this.currentRides;
    }

    public final int component5() {
        return this.totalRides;
    }

    public final ProgressType component6() {
        return this.progressType;
    }

    public final WireFrequentFlyerProgress copy(String title, String subtitle, int i, int i2, int i3, ProgressType progressType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(progressType, "progressType");
        return new WireFrequentFlyerProgress(title, subtitle, i, i2, i3, progressType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFrequentFlyerProgress) {
            WireFrequentFlyerProgress wireFrequentFlyerProgress = (WireFrequentFlyerProgress) obj;
            return Intrinsics.areEqual(this.title, wireFrequentFlyerProgress.title) && Intrinsics.areEqual(this.subtitle, wireFrequentFlyerProgress.subtitle) && this.color == wireFrequentFlyerProgress.color && this.currentRides == wireFrequentFlyerProgress.currentRides && this.totalRides == wireFrequentFlyerProgress.totalRides && this.progressType == wireFrequentFlyerProgress.progressType;
        }
        return false;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getCurrentRides() {
        return this.currentRides;
    }

    public final ProgressType getProgressType() {
        return this.progressType;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTotalRides() {
        return this.totalRides;
    }

    public int hashCode() {
        return (((((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + Integer.hashCode(this.color)) * 31) + Integer.hashCode(this.currentRides)) * 31) + Integer.hashCode(this.totalRides)) * 31) + this.progressType.hashCode();
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        int i = this.color;
        int i2 = this.currentRides;
        int i3 = this.totalRides;
        ProgressType progressType = this.progressType;
        return "WireFrequentFlyerProgress(title=" + str + ", subtitle=" + str2 + ", color=" + i + ", currentRides=" + i2 + ", totalRides=" + i3 + ", progressType=" + progressType + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.title);
        out.writeString(this.subtitle);
        out.writeInt(this.color);
        out.writeInt(this.currentRides);
        out.writeInt(this.totalRides);
        out.writeString(this.progressType.name());
    }

    public /* synthetic */ WireFrequentFlyerProgress(String str, String str2, int i, int i2, int i3, ProgressType progressType, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3, progressType);
    }
}
