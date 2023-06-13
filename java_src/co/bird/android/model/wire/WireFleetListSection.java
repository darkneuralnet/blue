package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetListSection;", "", "title", "", "vehicles", "", "Lco/bird/android/model/wire/WireFleetListVehicle;", "facets", "Lco/bird/android/model/wire/WireFacet;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getFacets", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "getVehicles", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleetListSection {
    @JsonProperty("facets")
    @InterfaceC41208ft5("facets")
    private final List<WireFacet> facets;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("vehicles")
    @InterfaceC41208ft5("vehicles")
    private final List<WireFleetListVehicle> vehicles;

    public WireFleetListSection() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireFleetListSection copy$default(WireFleetListSection wireFleetListSection, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireFleetListSection.title;
        }
        if ((i & 2) != 0) {
            list = wireFleetListSection.vehicles;
        }
        if ((i & 4) != 0) {
            list2 = wireFleetListSection.facets;
        }
        return wireFleetListSection.copy(str, list, list2);
    }

    public final String component1() {
        return this.title;
    }

    public final List<WireFleetListVehicle> component2() {
        return this.vehicles;
    }

    public final List<WireFacet> component3() {
        return this.facets;
    }

    public final WireFleetListSection copy(String title, List<WireFleetListVehicle> vehicles, List<WireFacet> facets) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(vehicles, "vehicles");
        Intrinsics.checkNotNullParameter(facets, "facets");
        return new WireFleetListSection(title, vehicles, facets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleetListSection) {
            WireFleetListSection wireFleetListSection = (WireFleetListSection) obj;
            return Intrinsics.areEqual(this.title, wireFleetListSection.title) && Intrinsics.areEqual(this.vehicles, wireFleetListSection.vehicles) && Intrinsics.areEqual(this.facets, wireFleetListSection.facets);
        }
        return false;
    }

    public final List<WireFacet> getFacets() {
        return this.facets;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<WireFleetListVehicle> getVehicles() {
        return this.vehicles;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.vehicles.hashCode()) * 31) + this.facets.hashCode();
    }

    public String toString() {
        String str = this.title;
        List<WireFleetListVehicle> list = this.vehicles;
        List<WireFacet> list2 = this.facets;
        return "WireFleetListSection(title=" + str + ", vehicles=" + list + ", facets=" + list2 + ")";
    }

    public WireFleetListSection(String title, List<WireFleetListVehicle> vehicles, List<WireFacet> facets) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(vehicles, "vehicles");
        Intrinsics.checkNotNullParameter(facets, "facets");
        this.title = title;
        this.vehicles = vehicles;
        this.facets = facets;
    }

    public /* synthetic */ WireFleetListSection(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
