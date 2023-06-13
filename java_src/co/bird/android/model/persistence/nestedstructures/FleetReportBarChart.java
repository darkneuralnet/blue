package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChart;", "Lco/bird/android/model/persistence/nestedstructures/FleetReportChart;", "yAxis", "", "Lco/bird/android/model/persistence/nestedstructures/FleetReportChartAxis;", "lines", "Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartLine;", "values", "Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartValue;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getLines", "()Ljava/util/List;", "getValues", "getYAxis", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetReportBarChart extends FleetReportChart {
    @JsonProperty("lines")
    @InterfaceC41208ft5("lines")
    private final List<FleetReportBarChartLine> lines;
    @JsonProperty("values")
    @InterfaceC41208ft5("values")
    private final List<FleetReportBarChartValue> values;
    @JsonProperty("yaxis")
    @InterfaceC41208ft5("yaxis")
    private final List<FleetReportChartAxis> yAxis;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FleetReportBarChart(List<FleetReportChartAxis> yAxis, List<FleetReportBarChartLine> lines, List<FleetReportBarChartValue> values) {
        super(null);
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(values, "values");
        this.yAxis = yAxis;
        this.lines = lines;
        this.values = values;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FleetReportBarChart copy$default(FleetReportBarChart fleetReportBarChart, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fleetReportBarChart.yAxis;
        }
        if ((i & 2) != 0) {
            list2 = fleetReportBarChart.lines;
        }
        if ((i & 4) != 0) {
            list3 = fleetReportBarChart.values;
        }
        return fleetReportBarChart.copy(list, list2, list3);
    }

    public final List<FleetReportChartAxis> component1() {
        return this.yAxis;
    }

    public final List<FleetReportBarChartLine> component2() {
        return this.lines;
    }

    public final List<FleetReportBarChartValue> component3() {
        return this.values;
    }

    public final FleetReportBarChart copy(List<FleetReportChartAxis> yAxis, List<FleetReportBarChartLine> lines, List<FleetReportBarChartValue> values) {
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(values, "values");
        return new FleetReportBarChart(yAxis, lines, values);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetReportBarChart) {
            FleetReportBarChart fleetReportBarChart = (FleetReportBarChart) obj;
            return Intrinsics.areEqual(this.yAxis, fleetReportBarChart.yAxis) && Intrinsics.areEqual(this.lines, fleetReportBarChart.lines) && Intrinsics.areEqual(this.values, fleetReportBarChart.values);
        }
        return false;
    }

    public final List<FleetReportBarChartLine> getLines() {
        return this.lines;
    }

    public final List<FleetReportBarChartValue> getValues() {
        return this.values;
    }

    public final List<FleetReportChartAxis> getYAxis() {
        return this.yAxis;
    }

    public int hashCode() {
        return (((this.yAxis.hashCode() * 31) + this.lines.hashCode()) * 31) + this.values.hashCode();
    }

    public String toString() {
        List<FleetReportChartAxis> list = this.yAxis;
        List<FleetReportBarChartLine> list2 = this.lines;
        List<FleetReportBarChartValue> list3 = this.values;
        return "FleetReportBarChart(yAxis=" + list + ", lines=" + list2 + ", values=" + list3 + ")";
    }
}
