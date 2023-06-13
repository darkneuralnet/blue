package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.Facet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/persistence/FleetListSection;", "", "title", "", "fleetId", "list", "facets", "", "Lco/bird/android/model/persistence/nestedstructures/Facet;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getFacets", "()Ljava/util/List;", "getFleetId", "()Ljava/lang/String;", "getList", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetListSection {
    private final List<Facet> facets;
    private final String fleetId;
    private final String list;
    private final String title;

    public FleetListSection(String title, String fleetId, String list, List<Facet> facets) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(facets, "facets");
        this.title = title;
        this.fleetId = fleetId;
        this.list = list;
        this.facets = facets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FleetListSection copy$default(FleetListSection fleetListSection, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fleetListSection.title;
        }
        if ((i & 2) != 0) {
            str2 = fleetListSection.fleetId;
        }
        if ((i & 4) != 0) {
            str3 = fleetListSection.list;
        }
        if ((i & 8) != 0) {
            list = fleetListSection.facets;
        }
        return fleetListSection.copy(str, str2, str3, list);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.fleetId;
    }

    public final String component3() {
        return this.list;
    }

    public final List<Facet> component4() {
        return this.facets;
    }

    public final FleetListSection copy(String title, String fleetId, String list, List<Facet> facets) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(facets, "facets");
        return new FleetListSection(title, fleetId, list, facets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetListSection) {
            FleetListSection fleetListSection = (FleetListSection) obj;
            return Intrinsics.areEqual(this.title, fleetListSection.title) && Intrinsics.areEqual(this.fleetId, fleetListSection.fleetId) && Intrinsics.areEqual(this.list, fleetListSection.list) && Intrinsics.areEqual(this.facets, fleetListSection.facets);
        }
        return false;
    }

    public final List<Facet> getFacets() {
        return this.facets;
    }

    public final String getFleetId() {
        return this.fleetId;
    }

    public final String getList() {
        return this.list;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.fleetId.hashCode()) * 31) + this.list.hashCode()) * 31) + this.facets.hashCode();
    }

    public String toString() {
        String str = this.title;
        String str2 = this.fleetId;
        String str3 = this.list;
        List<Facet> list = this.facets;
        return "FleetListSection(title=" + str + ", fleetId=" + str2 + ", list=" + str3 + ", facets=" + list + ")";
    }
}
