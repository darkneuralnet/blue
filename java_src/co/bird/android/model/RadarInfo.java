package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\u0006\u0010\u0014\u001a\u00020\u0011J\t\u0010\u0015\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/model/RadarInfo;", "Landroid/os/Parcelable;", "globalTag", "Lco/bird/android/model/FlightSheetGlobalTag;", "euTag", "Lco/bird/android/model/FlightSheetEUTag;", "(Lco/bird/android/model/FlightSheetGlobalTag;Lco/bird/android/model/FlightSheetEUTag;)V", "getEuTag", "()Lco/bird/android/model/FlightSheetEUTag;", "getGlobalTag", "()Lco/bird/android/model/FlightSheetGlobalTag;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hasValidTag", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RadarInfo implements Parcelable {
    public static final Parcelable.Creator<RadarInfo> CREATOR = new Creator();
    @JsonProperty("eu_tag")
    @InterfaceC41208ft5("eu_tag")
    private final FlightSheetEUTag euTag;
    @JsonProperty("global_tag")
    @InterfaceC41208ft5("global_tag")
    private final FlightSheetGlobalTag globalTag;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<RadarInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RadarInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RadarInfo(parcel.readInt() == 0 ? null : FlightSheetGlobalTag.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FlightSheetEUTag.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RadarInfo[] newArray(int i) {
            return new RadarInfo[i];
        }
    }

    public RadarInfo() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ RadarInfo copy$default(RadarInfo radarInfo, FlightSheetGlobalTag flightSheetGlobalTag, FlightSheetEUTag flightSheetEUTag, int i, Object obj) {
        if ((i & 1) != 0) {
            flightSheetGlobalTag = radarInfo.globalTag;
        }
        if ((i & 2) != 0) {
            flightSheetEUTag = radarInfo.euTag;
        }
        return radarInfo.copy(flightSheetGlobalTag, flightSheetEUTag);
    }

    public final FlightSheetGlobalTag component1() {
        return this.globalTag;
    }

    public final FlightSheetEUTag component2() {
        return this.euTag;
    }

    public final RadarInfo copy(FlightSheetGlobalTag flightSheetGlobalTag, FlightSheetEUTag flightSheetEUTag) {
        return new RadarInfo(flightSheetGlobalTag, flightSheetEUTag);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RadarInfo) {
            RadarInfo radarInfo = (RadarInfo) obj;
            return Intrinsics.areEqual(this.globalTag, radarInfo.globalTag) && Intrinsics.areEqual(this.euTag, radarInfo.euTag);
        }
        return false;
    }

    public final FlightSheetEUTag getEuTag() {
        return this.euTag;
    }

    public final FlightSheetGlobalTag getGlobalTag() {
        return this.globalTag;
    }

    public final boolean hasValidTag() {
        return (this.globalTag == null && this.euTag == null) ? false : true;
    }

    public int hashCode() {
        FlightSheetGlobalTag flightSheetGlobalTag = this.globalTag;
        int hashCode = (flightSheetGlobalTag == null ? 0 : flightSheetGlobalTag.hashCode()) * 31;
        FlightSheetEUTag flightSheetEUTag = this.euTag;
        return hashCode + (flightSheetEUTag != null ? flightSheetEUTag.hashCode() : 0);
    }

    public String toString() {
        FlightSheetGlobalTag flightSheetGlobalTag = this.globalTag;
        FlightSheetEUTag flightSheetEUTag = this.euTag;
        return "RadarInfo(globalTag=" + flightSheetGlobalTag + ", euTag=" + flightSheetEUTag + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        FlightSheetGlobalTag flightSheetGlobalTag = this.globalTag;
        if (flightSheetGlobalTag == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            flightSheetGlobalTag.writeToParcel(out, i);
        }
        FlightSheetEUTag flightSheetEUTag = this.euTag;
        if (flightSheetEUTag == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        flightSheetEUTag.writeToParcel(out, i);
    }

    public RadarInfo(FlightSheetGlobalTag flightSheetGlobalTag, FlightSheetEUTag flightSheetEUTag) {
        this.globalTag = flightSheetGlobalTag;
        this.euTag = flightSheetEUTag;
    }

    public /* synthetic */ RadarInfo(FlightSheetGlobalTag flightSheetGlobalTag, FlightSheetEUTag flightSheetEUTag, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : flightSheetGlobalTag, (i & 2) != 0 ? null : flightSheetEUTag);
    }
}
