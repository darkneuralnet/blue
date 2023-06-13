package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetReportBarChart;", "", "yAxis", "", "Lco/bird/android/model/wire/WireFleetReportChartAxis;", "lines", "Lco/bird/android/model/wire/WireFleetReportBarChartLine;", "values", "Lco/bird/android/model/wire/WireFleetReportBarChartValue;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getLines", "()Ljava/util/List;", "getValues", "getYAxis", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleetReportBarChart {
    @JsonProperty("lines")
    @InterfaceC41208ft5("lines")
    private final List<WireFleetReportBarChartLine> lines;
    @JsonProperty("values")
    @InterfaceC41208ft5("values")
    private final List<WireFleetReportBarChartValue> values;
    @JsonProperty("yaxis")
    @InterfaceC41208ft5("yaxis")
    private final List<WireFleetReportChartAxis> yAxis;

    public WireFleetReportBarChart(List<WireFleetReportChartAxis> yAxis, List<WireFleetReportBarChartLine> lines, List<WireFleetReportBarChartValue> values) {
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(values, "values");
        this.yAxis = yAxis;
        this.lines = lines;
        this.values = values;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireFleetReportBarChart copy$default(WireFleetReportBarChart wireFleetReportBarChart, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wireFleetReportBarChart.yAxis;
        }
        if ((i & 2) != 0) {
            list2 = wireFleetReportBarChart.lines;
        }
        if ((i & 4) != 0) {
            list3 = wireFleetReportBarChart.values;
        }
        return wireFleetReportBarChart.copy(list, list2, list3);
    }

    public final List<WireFleetReportChartAxis> component1() {
        return this.yAxis;
    }

    public final List<WireFleetReportBarChartLine> component2() {
        return this.lines;
    }

    public final List<WireFleetReportBarChartValue> component3() {
        return this.values;
    }

    public final WireFleetReportBarChart copy(List<WireFleetReportChartAxis> yAxis, List<WireFleetReportBarChartLine> lines, List<WireFleetReportBarChartValue> values) {
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(values, "values");
        return new WireFleetReportBarChart(yAxis, lines, values);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleetReportBarChart) {
            WireFleetReportBarChart wireFleetReportBarChart = (WireFleetReportBarChart) obj;
            return Intrinsics.areEqual(this.yAxis, wireFleetReportBarChart.yAxis) && Intrinsics.areEqual(this.lines, wireFleetReportBarChart.lines) && Intrinsics.areEqual(this.values, wireFleetReportBarChart.values);
        }
        return false;
    }

    public final List<WireFleetReportBarChartLine> getLines() {
        return this.lines;
    }

    public final List<WireFleetReportBarChartValue> getValues() {
        return this.values;
    }

    public final List<WireFleetReportChartAxis> getYAxis() {
        return this.yAxis;
    }

    public int hashCode() {
        return (((this.yAxis.hashCode() * 31) + this.lines.hashCode()) * 31) + this.values.hashCode();
    }

    public String toString() {
        List<WireFleetReportChartAxis> list = this.yAxis;
        List<WireFleetReportBarChartLine> list2 = this.lines;
        List<WireFleetReportBarChartValue> list3 = this.values;
        return "WireFleetReportBarChart(yAxis=" + list + ", lines=" + list2 + ", values=" + list3 + ")";
    }
}
