package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.FleetReportChartType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetReportChart;", "", "type", "Lco/bird/android/model/constant/FleetReportChartType;", "barChart", "Lco/bird/android/model/wire/WireFleetReportBarChart;", "lineChart", "Lco/bird/android/model/wire/WireFleetReportLineChart;", "(Lco/bird/android/model/constant/FleetReportChartType;Lco/bird/android/model/wire/WireFleetReportBarChart;Lco/bird/android/model/wire/WireFleetReportLineChart;)V", "getBarChart", "()Lco/bird/android/model/wire/WireFleetReportBarChart;", "getLineChart", "()Lco/bird/android/model/wire/WireFleetReportLineChart;", "getType", "()Lco/bird/android/model/constant/FleetReportChartType;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleetReportChart {
    @JsonProperty("bar_chart")
    @InterfaceC41208ft5("bar_chart")
    private final WireFleetReportBarChart barChart;
    @JsonProperty("line_chart")
    @InterfaceC41208ft5("line_chart")
    private final WireFleetReportLineChart lineChart;
    @JsonProperty("type")
    @InterfaceC41208ft5("type")
    private final FleetReportChartType type;

    public WireFleetReportChart(FleetReportChartType type, WireFleetReportBarChart wireFleetReportBarChart, WireFleetReportLineChart wireFleetReportLineChart) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.barChart = wireFleetReportBarChart;
        this.lineChart = wireFleetReportLineChart;
    }

    public static /* synthetic */ WireFleetReportChart copy$default(WireFleetReportChart wireFleetReportChart, FleetReportChartType fleetReportChartType, WireFleetReportBarChart wireFleetReportBarChart, WireFleetReportLineChart wireFleetReportLineChart, int i, Object obj) {
        if ((i & 1) != 0) {
            fleetReportChartType = wireFleetReportChart.type;
        }
        if ((i & 2) != 0) {
            wireFleetReportBarChart = wireFleetReportChart.barChart;
        }
        if ((i & 4) != 0) {
            wireFleetReportLineChart = wireFleetReportChart.lineChart;
        }
        return wireFleetReportChart.copy(fleetReportChartType, wireFleetReportBarChart, wireFleetReportLineChart);
    }

    public final FleetReportChartType component1() {
        return this.type;
    }

    public final WireFleetReportBarChart component2() {
        return this.barChart;
    }

    public final WireFleetReportLineChart component3() {
        return this.lineChart;
    }

    public final WireFleetReportChart copy(FleetReportChartType type, WireFleetReportBarChart wireFleetReportBarChart, WireFleetReportLineChart wireFleetReportLineChart) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new WireFleetReportChart(type, wireFleetReportBarChart, wireFleetReportLineChart);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleetReportChart) {
            WireFleetReportChart wireFleetReportChart = (WireFleetReportChart) obj;
            return this.type == wireFleetReportChart.type && Intrinsics.areEqual(this.barChart, wireFleetReportChart.barChart) && Intrinsics.areEqual(this.lineChart, wireFleetReportChart.lineChart);
        }
        return false;
    }

    public final WireFleetReportBarChart getBarChart() {
        return this.barChart;
    }

    public final WireFleetReportLineChart getLineChart() {
        return this.lineChart;
    }

    public final FleetReportChartType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        WireFleetReportBarChart wireFleetReportBarChart = this.barChart;
        int hashCode2 = (hashCode + (wireFleetReportBarChart == null ? 0 : wireFleetReportBarChart.hashCode())) * 31;
        WireFleetReportLineChart wireFleetReportLineChart = this.lineChart;
        return hashCode2 + (wireFleetReportLineChart != null ? wireFleetReportLineChart.hashCode() : 0);
    }

    public String toString() {
        FleetReportChartType fleetReportChartType = this.type;
        WireFleetReportBarChart wireFleetReportBarChart = this.barChart;
        WireFleetReportLineChart wireFleetReportLineChart = this.lineChart;
        return "WireFleetReportChart(type=" + fleetReportChartType + ", barChart=" + wireFleetReportBarChart + ", lineChart=" + wireFleetReportLineChart + ")";
    }
}
