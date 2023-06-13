package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetReportChartAxis;", "", "label", "", "value", "", "(Ljava/lang/String;D)V", "getLabel", "()Ljava/lang/String;", "getValue", "()D", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetReportChartAxis {
    @JsonProperty("label")
    @InterfaceC41208ft5("label")
    private final String label;
    @JsonProperty("value")
    @InterfaceC41208ft5("value")
    private final double value;

    public FleetReportChartAxis(String label, double d) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.label = label;
        this.value = d;
    }

    public static /* synthetic */ FleetReportChartAxis copy$default(FleetReportChartAxis fleetReportChartAxis, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fleetReportChartAxis.label;
        }
        if ((i & 2) != 0) {
            d = fleetReportChartAxis.value;
        }
        return fleetReportChartAxis.copy(str, d);
    }

    public final String component1() {
        return this.label;
    }

    public final double component2() {
        return this.value;
    }

    public final FleetReportChartAxis copy(String label, double d) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new FleetReportChartAxis(label, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetReportChartAxis) {
            FleetReportChartAxis fleetReportChartAxis = (FleetReportChartAxis) obj;
            return Intrinsics.areEqual(this.label, fleetReportChartAxis.label) && Double.compare(this.value, fleetReportChartAxis.value) == 0;
        }
        return false;
    }

    public final String getLabel() {
        return this.label;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + Double.hashCode(this.value);
    }

    public String toString() {
        String str = this.label;
        double d = this.value;
        return "FleetReportChartAxis(label=" + str + ", value=" + d + ")";
    }
}