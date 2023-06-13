package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.FleetStatusChart;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/persistence/FleetStatusSummary;", "", "fleetId", "", "title", "description", "chart", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;)V", "getChart", "()Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;", "getDescription", "()Ljava/lang/String;", "getFleetId", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetStatusSummary {
    private final FleetStatusChart chart;
    private final String description;
    private final String fleetId;
    private final String title;

    public FleetStatusSummary(String fleetId, String title, String str, FleetStatusChart fleetStatusChart) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.fleetId = fleetId;
        this.title = title;
        this.description = str;
        this.chart = fleetStatusChart;
    }

    public static /* synthetic */ FleetStatusSummary copy$default(FleetStatusSummary fleetStatusSummary, String str, String str2, String str3, FleetStatusChart fleetStatusChart, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fleetStatusSummary.fleetId;
        }
        if ((i & 2) != 0) {
            str2 = fleetStatusSummary.title;
        }
        if ((i & 4) != 0) {
            str3 = fleetStatusSummary.description;
        }
        if ((i & 8) != 0) {
            fleetStatusChart = fleetStatusSummary.chart;
        }
        return fleetStatusSummary.copy(str, str2, str3, fleetStatusChart);
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

    public final FleetStatusChart component4() {
        return this.chart;
    }

    public final FleetStatusSummary copy(String fleetId, String title, String str, FleetStatusChart fleetStatusChart) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(title, "title");
        return new FleetStatusSummary(fleetId, title, str, fleetStatusChart);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetStatusSummary) {
            FleetStatusSummary fleetStatusSummary = (FleetStatusSummary) obj;
            return Intrinsics.areEqual(this.fleetId, fleetStatusSummary.fleetId) && Intrinsics.areEqual(this.title, fleetStatusSummary.title) && Intrinsics.areEqual(this.description, fleetStatusSummary.description) && Intrinsics.areEqual(this.chart, fleetStatusSummary.chart);
        }
        return false;
    }

    public final FleetStatusChart getChart() {
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
        FleetStatusChart fleetStatusChart = this.chart;
        return hashCode2 + (fleetStatusChart != null ? fleetStatusChart.hashCode() : 0);
    }

    public String toString() {
        String str = this.fleetId;
        String str2 = this.title;
        String str3 = this.description;
        FleetStatusChart fleetStatusChart = this.chart;
        return "FleetStatusSummary(fleetId=" + str + ", title=" + str2 + ", description=" + str3 + ", chart=" + fleetStatusChart + ")";
    }

    public /* synthetic */ FleetStatusSummary(String str, String str2, String str3, FleetStatusChart fleetStatusChart, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : fleetStatusChart);
    }
}
