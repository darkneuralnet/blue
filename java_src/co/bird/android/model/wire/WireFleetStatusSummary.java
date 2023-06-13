package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetStatusSummary;", "Landroid/os/Parcelable;", "fleetId", "", "title", "description", "chart", "Lco/bird/android/model/wire/WireFleetStatusChart;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireFleetStatusChart;)V", "getChart", "()Lco/bird/android/model/wire/WireFleetStatusChart;", "getDescription", "()Ljava/lang/String;", "getFleetId", "getTitle", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleetStatusSummary implements Parcelable {
    public static final Parcelable.Creator<WireFleetStatusSummary> CREATOR = new Creator();
    @JsonProperty("chart")
    @InterfaceC41208ft5("chart")
    private final WireFleetStatusChart chart;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("fleet_id")
    @InterfaceC41208ft5("fleet_id")
    private final String fleetId;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireFleetStatusSummary> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireFleetStatusSummary createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireFleetStatusSummary(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : WireFleetStatusChart.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireFleetStatusSummary[] newArray(int i) {
            return new WireFleetStatusSummary[i];
        }
    }

    public WireFleetStatusSummary() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ WireFleetStatusSummary copy$default(WireFleetStatusSummary wireFleetStatusSummary, String str, String str2, String str3, WireFleetStatusChart wireFleetStatusChart, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireFleetStatusSummary.fleetId;
        }
        if ((i & 2) != 0) {
            str2 = wireFleetStatusSummary.title;
        }
        if ((i & 4) != 0) {
            str3 = wireFleetStatusSummary.description;
        }
        if ((i & 8) != 0) {
            wireFleetStatusChart = wireFleetStatusSummary.chart;
        }
        return wireFleetStatusSummary.copy(str, str2, str3, wireFleetStatusChart);
    }

    public final String component1() {
        return this.fleetId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final WireFleetStatusChart component4() {
        return this.chart;
    }

    public final WireFleetStatusSummary copy(String fleetId, String title, String str, WireFleetStatusChart wireFleetStatusChart) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(title, "title");
        return new WireFleetStatusSummary(fleetId, title, str, wireFleetStatusChart);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleetStatusSummary) {
            WireFleetStatusSummary wireFleetStatusSummary = (WireFleetStatusSummary) obj;
            return Intrinsics.areEqual(this.fleetId, wireFleetStatusSummary.fleetId) && Intrinsics.areEqual(this.title, wireFleetStatusSummary.title) && Intrinsics.areEqual(this.description, wireFleetStatusSummary.description) && Intrinsics.areEqual(this.chart, wireFleetStatusSummary.chart);
        }
        return false;
    }

    public final WireFleetStatusChart getChart() {
        return this.chart;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFleetId() {
        return this.fleetId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((this.fleetId.hashCode() * 31) + this.title.hashCode()) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        WireFleetStatusChart wireFleetStatusChart = this.chart;
        return hashCode2 + (wireFleetStatusChart != null ? wireFleetStatusChart.hashCode() : 0);
    }

    public String toString() {
        String str = this.fleetId;
        String str2 = this.title;
        String str3 = this.description;
        WireFleetStatusChart wireFleetStatusChart = this.chart;
        return "WireFleetStatusSummary(fleetId=" + str + ", title=" + str2 + ", description=" + str3 + ", chart=" + wireFleetStatusChart + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.fleetId);
        out.writeString(this.title);
        out.writeString(this.description);
        WireFleetStatusChart wireFleetStatusChart = this.chart;
        if (wireFleetStatusChart == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        wireFleetStatusChart.writeToParcel(out, i);
    }

    public WireFleetStatusSummary(String fleetId, String title, String str, WireFleetStatusChart wireFleetStatusChart) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.fleetId = fleetId;
        this.title = title;
        this.description = str;
        this.chart = wireFleetStatusChart;
    }

    public /* synthetic */ WireFleetStatusSummary(String str, String str2, String str3, WireFleetStatusChart wireFleetStatusChart, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : wireFleetStatusChart);
    }
}
