package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireReleaseAssignmentMapBanner;
import co.bird.android.model.wire.WireZoneAssignmentGroup;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/api/response/ZoneAssignmentsResponse;", "", "groups", "", "Lco/bird/android/model/wire/WireZoneAssignmentGroup;", "mapBanner", "Lco/bird/android/model/wire/WireReleaseAssignmentMapBanner;", "(Ljava/util/List;Lco/bird/android/model/wire/WireReleaseAssignmentMapBanner;)V", "getGroups", "()Ljava/util/List;", "getMapBanner", "()Lco/bird/android/model/wire/WireReleaseAssignmentMapBanner;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZoneAssignmentsResponse {
    @JsonProperty("groups")
    @InterfaceC41208ft5("groups")
    private final List<WireZoneAssignmentGroup> groups;
    @JsonProperty("map_banner")
    @InterfaceC41208ft5("map_banner")
    private final WireReleaseAssignmentMapBanner mapBanner;

    public ZoneAssignmentsResponse() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZoneAssignmentsResponse copy$default(ZoneAssignmentsResponse zoneAssignmentsResponse, List list, WireReleaseAssignmentMapBanner wireReleaseAssignmentMapBanner, int i, Object obj) {
        if ((i & 1) != 0) {
            list = zoneAssignmentsResponse.groups;
        }
        if ((i & 2) != 0) {
            wireReleaseAssignmentMapBanner = zoneAssignmentsResponse.mapBanner;
        }
        return zoneAssignmentsResponse.copy(list, wireReleaseAssignmentMapBanner);
    }

    public final List<WireZoneAssignmentGroup> component1() {
        return this.groups;
    }

    public final WireReleaseAssignmentMapBanner component2() {
        return this.mapBanner;
    }

    public final ZoneAssignmentsResponse copy(List<WireZoneAssignmentGroup> groups, WireReleaseAssignmentMapBanner wireReleaseAssignmentMapBanner) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new ZoneAssignmentsResponse(groups, wireReleaseAssignmentMapBanner);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneAssignmentsResponse) {
            ZoneAssignmentsResponse zoneAssignmentsResponse = (ZoneAssignmentsResponse) obj;
            return Intrinsics.areEqual(this.groups, zoneAssignmentsResponse.groups) && Intrinsics.areEqual(this.mapBanner, zoneAssignmentsResponse.mapBanner);
        }
        return false;
    }

    public final List<WireZoneAssignmentGroup> getGroups() {
        return this.groups;
    }

    public final WireReleaseAssignmentMapBanner getMapBanner() {
        return this.mapBanner;
    }

    public int hashCode() {
        int hashCode = this.groups.hashCode() * 31;
        WireReleaseAssignmentMapBanner wireReleaseAssignmentMapBanner = this.mapBanner;
        return hashCode + (wireReleaseAssignmentMapBanner == null ? 0 : wireReleaseAssignmentMapBanner.hashCode());
    }

    public String toString() {
        List<WireZoneAssignmentGroup> list = this.groups;
        WireReleaseAssignmentMapBanner wireReleaseAssignmentMapBanner = this.mapBanner;
        return "ZoneAssignmentsResponse(groups=" + list + ", mapBanner=" + wireReleaseAssignmentMapBanner + ")";
    }

    public ZoneAssignmentsResponse(List<WireZoneAssignmentGroup> groups, WireReleaseAssignmentMapBanner wireReleaseAssignmentMapBanner) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.groups = groups;
        this.mapBanner = wireReleaseAssignmentMapBanner;
    }

    public /* synthetic */ ZoneAssignmentsResponse(List list, WireReleaseAssignmentMapBanner wireReleaseAssignmentMapBanner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : wireReleaseAssignmentMapBanner);
    }
}
