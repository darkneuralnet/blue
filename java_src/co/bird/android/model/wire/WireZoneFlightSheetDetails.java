package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/wire/WireZoneFlightSheetDetails;", "", "zoneSummary", "Lco/bird/android/model/wire/WireZoneSummary;", "zoneStatus", "Lco/bird/android/model/wire/WireZoneStatus;", "detailSections", "", "Lco/bird/android/model/wire/WireZoneDetails;", "(Lco/bird/android/model/wire/WireZoneSummary;Lco/bird/android/model/wire/WireZoneStatus;Ljava/util/List;)V", "getDetailSections", "()Ljava/util/List;", "getZoneStatus", "()Lco/bird/android/model/wire/WireZoneStatus;", "getZoneSummary", "()Lco/bird/android/model/wire/WireZoneSummary;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireZoneFlightSheetDetails {
    @JsonProperty("detail_sections")
    @InterfaceC41208ft5("detail_sections")
    private final List<WireZoneDetails> detailSections;
    @JsonProperty("zone_status")
    @InterfaceC41208ft5("zone_status")
    private final WireZoneStatus zoneStatus;
    @JsonProperty("zone_summary")
    @InterfaceC41208ft5("zone_summary")
    private final WireZoneSummary zoneSummary;

    public WireZoneFlightSheetDetails() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireZoneFlightSheetDetails copy$default(WireZoneFlightSheetDetails wireZoneFlightSheetDetails, WireZoneSummary wireZoneSummary, WireZoneStatus wireZoneStatus, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            wireZoneSummary = wireZoneFlightSheetDetails.zoneSummary;
        }
        if ((i & 2) != 0) {
            wireZoneStatus = wireZoneFlightSheetDetails.zoneStatus;
        }
        if ((i & 4) != 0) {
            list = wireZoneFlightSheetDetails.detailSections;
        }
        return wireZoneFlightSheetDetails.copy(wireZoneSummary, wireZoneStatus, list);
    }

    public final WireZoneSummary component1() {
        return this.zoneSummary;
    }

    public final WireZoneStatus component2() {
        return this.zoneStatus;
    }

    public final List<WireZoneDetails> component3() {
        return this.detailSections;
    }

    public final WireZoneFlightSheetDetails copy(WireZoneSummary zoneSummary, WireZoneStatus zoneStatus, List<WireZoneDetails> detailSections) {
        Intrinsics.checkNotNullParameter(zoneSummary, "zoneSummary");
        Intrinsics.checkNotNullParameter(zoneStatus, "zoneStatus");
        Intrinsics.checkNotNullParameter(detailSections, "detailSections");
        return new WireZoneFlightSheetDetails(zoneSummary, zoneStatus, detailSections);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireZoneFlightSheetDetails) {
            WireZoneFlightSheetDetails wireZoneFlightSheetDetails = (WireZoneFlightSheetDetails) obj;
            return Intrinsics.areEqual(this.zoneSummary, wireZoneFlightSheetDetails.zoneSummary) && Intrinsics.areEqual(this.zoneStatus, wireZoneFlightSheetDetails.zoneStatus) && Intrinsics.areEqual(this.detailSections, wireZoneFlightSheetDetails.detailSections);
        }
        return false;
    }

    public final List<WireZoneDetails> getDetailSections() {
        return this.detailSections;
    }

    public final WireZoneStatus getZoneStatus() {
        return this.zoneStatus;
    }

    public final WireZoneSummary getZoneSummary() {
        return this.zoneSummary;
    }

    public int hashCode() {
        return (((this.zoneSummary.hashCode() * 31) + this.zoneStatus.hashCode()) * 31) + this.detailSections.hashCode();
    }

    public String toString() {
        WireZoneSummary wireZoneSummary = this.zoneSummary;
        WireZoneStatus wireZoneStatus = this.zoneStatus;
        List<WireZoneDetails> list = this.detailSections;
        return "WireZoneFlightSheetDetails(zoneSummary=" + wireZoneSummary + ", zoneStatus=" + wireZoneStatus + ", detailSections=" + list + ")";
    }

    public WireZoneFlightSheetDetails(WireZoneSummary zoneSummary, WireZoneStatus zoneStatus, List<WireZoneDetails> detailSections) {
        Intrinsics.checkNotNullParameter(zoneSummary, "zoneSummary");
        Intrinsics.checkNotNullParameter(zoneStatus, "zoneStatus");
        Intrinsics.checkNotNullParameter(detailSections, "detailSections");
        this.zoneSummary = zoneSummary;
        this.zoneStatus = zoneStatus;
        this.detailSections = detailSections;
    }

    public /* synthetic */ WireZoneFlightSheetDetails(WireZoneSummary wireZoneSummary, WireZoneStatus wireZoneStatus, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new WireZoneSummary(0, null, 3, null) : wireZoneSummary, (i & 2) != 0 ? new WireZoneStatus(0, null, null, null, null, null, 63, null) : wireZoneStatus, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
