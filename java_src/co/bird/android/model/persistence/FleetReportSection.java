package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.FleetReportPanel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/persistence/FleetReportSection;", "", "id", "", "title", "", "panels", "", "Lco/bird/android/model/persistence/nestedstructures/FleetReportPanel;", "(JLjava/lang/String;Ljava/util/List;)V", "getId", "()J", "getPanels", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetReportSection {

    /* renamed from: id */
    private final long f66675id;
    private final List<FleetReportPanel> panels;
    private final String title;

    public FleetReportSection(long j, String title, List<FleetReportPanel> panels) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(panels, "panels");
        this.f66675id = j;
        this.title = title;
        this.panels = panels;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FleetReportSection copy$default(FleetReportSection fleetReportSection, long j, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = fleetReportSection.f66675id;
        }
        if ((i & 2) != 0) {
            str = fleetReportSection.title;
        }
        if ((i & 4) != 0) {
            list = fleetReportSection.panels;
        }
        return fleetReportSection.copy(j, str, list);
    }

    public final long component1() {
        return this.f66675id;
    }

    public final String component2() {
        return this.title;
    }

    public final List<FleetReportPanel> component3() {
        return this.panels;
    }

    public final FleetReportSection copy(long j, String title, List<FleetReportPanel> panels) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(panels, "panels");
        return new FleetReportSection(j, title, panels);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetReportSection) {
            FleetReportSection fleetReportSection = (FleetReportSection) obj;
            return this.f66675id == fleetReportSection.f66675id && Intrinsics.areEqual(this.title, fleetReportSection.title) && Intrinsics.areEqual(this.panels, fleetReportSection.panels);
        }
        return false;
    }

    public final long getId() {
        return this.f66675id;
    }

    public final List<FleetReportPanel> getPanels() {
        return this.panels;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f66675id) * 31) + this.title.hashCode()) * 31) + this.panels.hashCode();
    }

    public String toString() {
        long j = this.f66675id;
        String str = this.title;
        List<FleetReportPanel> list = this.panels;
        return "FleetReportSection(id=" + j + ", title=" + str + ", panels=" + list + ")";
    }

    public /* synthetic */ FleetReportSection(long j, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, list);
    }
}
