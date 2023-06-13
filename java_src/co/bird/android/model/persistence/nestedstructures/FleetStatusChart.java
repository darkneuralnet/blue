package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ChartFillStrategy;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;", "", "title", "", "fromDegrees", "", "fillStrategy", "Lco/bird/android/model/constant/ChartFillStrategy;", "sections", "", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChartSection;", "(Ljava/lang/String;ILco/bird/android/model/constant/ChartFillStrategy;Ljava/util/List;)V", "getFillStrategy", "()Lco/bird/android/model/constant/ChartFillStrategy;", "getFromDegrees", "()I", "getSections", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetStatusChart {
    @JsonProperty("fill_strategy")
    @InterfaceC41208ft5("fill_strategy")
    private final ChartFillStrategy fillStrategy;
    @JsonProperty("from_degrees")
    @InterfaceC41208ft5("from_degrees")
    private final int fromDegrees;
    @JsonProperty("sections")
    @InterfaceC41208ft5("sections")
    private final List<FleetStatusChartSection> sections;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public FleetStatusChart() {
        this(null, 0, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FleetStatusChart copy$default(FleetStatusChart fleetStatusChart, String str, int i, ChartFillStrategy chartFillStrategy, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = fleetStatusChart.title;
        }
        if ((i2 & 2) != 0) {
            i = fleetStatusChart.fromDegrees;
        }
        if ((i2 & 4) != 0) {
            chartFillStrategy = fleetStatusChart.fillStrategy;
        }
        if ((i2 & 8) != 0) {
            list = fleetStatusChart.sections;
        }
        return fleetStatusChart.copy(str, i, chartFillStrategy, list);
    }

    public final String component1() {
        return this.title;
    }

    public final int component2() {
        return this.fromDegrees;
    }

    public final ChartFillStrategy component3() {
        return this.fillStrategy;
    }

    public final List<FleetStatusChartSection> component4() {
        return this.sections;
    }

    public final FleetStatusChart copy(String title, int i, ChartFillStrategy fillStrategy, List<FleetStatusChartSection> sections) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fillStrategy, "fillStrategy");
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new FleetStatusChart(title, i, fillStrategy, sections);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetStatusChart) {
            FleetStatusChart fleetStatusChart = (FleetStatusChart) obj;
            return Intrinsics.areEqual(this.title, fleetStatusChart.title) && this.fromDegrees == fleetStatusChart.fromDegrees && this.fillStrategy == fleetStatusChart.fillStrategy && Intrinsics.areEqual(this.sections, fleetStatusChart.sections);
        }
        return false;
    }

    public final ChartFillStrategy getFillStrategy() {
        return this.fillStrategy;
    }

    public final int getFromDegrees() {
        return this.fromDegrees;
    }

    public final List<FleetStatusChartSection> getSections() {
        return this.sections;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + Integer.hashCode(this.fromDegrees)) * 31) + this.fillStrategy.hashCode()) * 31) + this.sections.hashCode();
    }

    public String toString() {
        String str = this.title;
        int i = this.fromDegrees;
        ChartFillStrategy chartFillStrategy = this.fillStrategy;
        List<FleetStatusChartSection> list = this.sections;
        return "FleetStatusChart(title=" + str + ", fromDegrees=" + i + ", fillStrategy=" + chartFillStrategy + ", sections=" + list + ")";
    }

    public FleetStatusChart(String title, int i, ChartFillStrategy fillStrategy, List<FleetStatusChartSection> sections) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fillStrategy, "fillStrategy");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.title = title;
        this.fromDegrees = i;
        this.fillStrategy = fillStrategy;
        this.sections = sections;
    }

    public /* synthetic */ FleetStatusChart(String str, int i, ChartFillStrategy chartFillStrategy, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? ChartFillStrategy.FILL_CLOCKWISE : chartFillStrategy, (i2 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
