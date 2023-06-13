package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006("}, m28432d2 = {"Lco/bird/android/model/FlightSheetGlobalTag;", "Landroid/os/Parcelable;", "tagId", "", "modeOptions", "", "Lco/bird/android/model/RadarModeOption;", "currentMode", "modeConfirmedAt", "Lorg/joda/time/DateTime;", "heartbeatEnabled", "", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lorg/joda/time/DateTime;Z)V", "getCurrentMode", "()Ljava/lang/String;", "getHeartbeatEnabled", "()Z", "getModeConfirmedAt", "()Lorg/joda/time/DateTime;", "getModeOptions", "()Ljava/util/List;", "getTagId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FlightSheetGlobalTag implements Parcelable {
    public static final Parcelable.Creator<FlightSheetGlobalTag> CREATOR = new Creator();
    @JsonProperty("current_mode")
    @InterfaceC41208ft5("current_mode")
    private final String currentMode;
    @JsonProperty("heartbeat_enabled")
    @InterfaceC41208ft5("heartbeat_enabled")
    private final boolean heartbeatEnabled;
    @JsonProperty("mode_confirmed_at")
    @InterfaceC41208ft5("mode_confirmed_at")
    private final DateTime modeConfirmedAt;
    @JsonProperty("mode_options")
    @InterfaceC41208ft5("mode_options")
    private final List<RadarModeOption> modeOptions;
    @JsonProperty("tag_id")
    @InterfaceC41208ft5("tag_id")
    private final String tagId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<FlightSheetGlobalTag> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FlightSheetGlobalTag createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(RadarModeOption.CREATOR.createFromParcel(parcel));
            }
            return new FlightSheetGlobalTag(readString, arrayList, parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FlightSheetGlobalTag[] newArray(int i) {
            return new FlightSheetGlobalTag[i];
        }
    }

    public FlightSheetGlobalTag() {
        this(null, null, null, null, false, 31, null);
    }

    public static /* synthetic */ FlightSheetGlobalTag copy$default(FlightSheetGlobalTag flightSheetGlobalTag, String str, List list, String str2, DateTime dateTime, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightSheetGlobalTag.tagId;
        }
        List<RadarModeOption> list2 = list;
        if ((i & 2) != 0) {
            list2 = flightSheetGlobalTag.modeOptions;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            str2 = flightSheetGlobalTag.currentMode;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            dateTime = flightSheetGlobalTag.modeConfirmedAt;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 16) != 0) {
            z = flightSheetGlobalTag.heartbeatEnabled;
        }
        return flightSheetGlobalTag.copy(str, list3, str3, dateTime2, z);
    }

    public final String component1() {
        return this.tagId;
    }

    public final List<RadarModeOption> component2() {
        return this.modeOptions;
    }

    public final String component3() {
        return this.currentMode;
    }

    public final DateTime component4() {
        return this.modeConfirmedAt;
    }

    public final boolean component5() {
        return this.heartbeatEnabled;
    }

    public final FlightSheetGlobalTag copy(String tagId, List<RadarModeOption> modeOptions, String currentMode, DateTime modeConfirmedAt, boolean z) {
        Intrinsics.checkNotNullParameter(tagId, "tagId");
        Intrinsics.checkNotNullParameter(modeOptions, "modeOptions");
        Intrinsics.checkNotNullParameter(currentMode, "currentMode");
        Intrinsics.checkNotNullParameter(modeConfirmedAt, "modeConfirmedAt");
        return new FlightSheetGlobalTag(tagId, modeOptions, currentMode, modeConfirmedAt, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlightSheetGlobalTag) {
            FlightSheetGlobalTag flightSheetGlobalTag = (FlightSheetGlobalTag) obj;
            return Intrinsics.areEqual(this.tagId, flightSheetGlobalTag.tagId) && Intrinsics.areEqual(this.modeOptions, flightSheetGlobalTag.modeOptions) && Intrinsics.areEqual(this.currentMode, flightSheetGlobalTag.currentMode) && Intrinsics.areEqual(this.modeConfirmedAt, flightSheetGlobalTag.modeConfirmedAt) && this.heartbeatEnabled == flightSheetGlobalTag.heartbeatEnabled;
        }
        return false;
    }

    public final String getCurrentMode() {
        return this.currentMode;
    }

    public final boolean getHeartbeatEnabled() {
        return this.heartbeatEnabled;
    }

    public final DateTime getModeConfirmedAt() {
        return this.modeConfirmedAt;
    }

    public final List<RadarModeOption> getModeOptions() {
        return this.modeOptions;
    }

    public final String getTagId() {
        return this.tagId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.tagId.hashCode() * 31) + this.modeOptions.hashCode()) * 31) + this.currentMode.hashCode()) * 31) + this.modeConfirmedAt.hashCode()) * 31;
        boolean z = this.heartbeatEnabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.tagId;
        List<RadarModeOption> list = this.modeOptions;
        String str2 = this.currentMode;
        DateTime dateTime = this.modeConfirmedAt;
        boolean z = this.heartbeatEnabled;
        return "FlightSheetGlobalTag(tagId=" + str + ", modeOptions=" + list + ", currentMode=" + str2 + ", modeConfirmedAt=" + dateTime + ", heartbeatEnabled=" + z + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.tagId);
        List<RadarModeOption> list = this.modeOptions;
        out.writeInt(list.size());
        for (RadarModeOption radarModeOption : list) {
            radarModeOption.writeToParcel(out, i);
        }
        out.writeString(this.currentMode);
        out.writeSerializable(this.modeConfirmedAt);
        out.writeInt(this.heartbeatEnabled ? 1 : 0);
    }

    public FlightSheetGlobalTag(String tagId, List<RadarModeOption> modeOptions, String currentMode, DateTime modeConfirmedAt, boolean z) {
        Intrinsics.checkNotNullParameter(tagId, "tagId");
        Intrinsics.checkNotNullParameter(modeOptions, "modeOptions");
        Intrinsics.checkNotNullParameter(currentMode, "currentMode");
        Intrinsics.checkNotNullParameter(modeConfirmedAt, "modeConfirmedAt");
        this.tagId = tagId;
        this.modeOptions = modeOptions;
        this.currentMode = currentMode;
        this.modeConfirmedAt = modeConfirmedAt;
        this.heartbeatEnabled = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FlightSheetGlobalTag(String str, List list, String str2, DateTime dateTime, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r10, r1, r0, dateTime, (i & 16) != 0 ? false : z);
        String str3 = (i & 1) != 0 ? "" : str;
        List emptyList = (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
        String str4 = (i & 4) == 0 ? str2 : "";
        if ((i & 8) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
