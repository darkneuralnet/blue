package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetStatusContent;", "", "chart", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;", "states", "", "Lco/bird/android/model/persistence/nestedstructures/FleetState;", "rating", "Lco/bird/android/model/persistence/nestedstructures/FleetRating;", "(Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/FleetRating;)V", "getChart", "()Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;", "getRating", "()Lco/bird/android/model/persistence/nestedstructures/FleetRating;", "getStates", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetStatusContent {
    @JsonProperty("chart")
    @InterfaceC41208ft5("chart")
    private final FleetStatusChart chart;
    @JsonProperty("rating")
    @InterfaceC41208ft5("rating")
    private final FleetRating rating;
    @JsonProperty("states")
    @InterfaceC41208ft5("states")
    private final List<FleetState> states;

    public FleetStatusContent() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FleetStatusContent copy$default(FleetStatusContent fleetStatusContent, FleetStatusChart fleetStatusChart, List list, FleetRating fleetRating, int i, Object obj) {
        if ((i & 1) != 0) {
            fleetStatusChart = fleetStatusContent.chart;
        }
        if ((i & 2) != 0) {
            list = fleetStatusContent.states;
        }
        if ((i & 4) != 0) {
            fleetRating = fleetStatusContent.rating;
        }
        return fleetStatusContent.copy(fleetStatusChart, list, fleetRating);
    }

    public final FleetStatusChart component1() {
        return this.chart;
    }

    public final List<FleetState> component2() {
        return this.states;
    }

    public final FleetRating component3() {
        return this.rating;
    }

    public final FleetStatusContent copy(FleetStatusChart fleetStatusChart, List<FleetState> states, FleetRating fleetRating) {
        Intrinsics.checkNotNullParameter(states, "states");
        return new FleetStatusContent(fleetStatusChart, states, fleetRating);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetStatusContent) {
            FleetStatusContent fleetStatusContent = (FleetStatusContent) obj;
            return Intrinsics.areEqual(this.chart, fleetStatusContent.chart) && Intrinsics.areEqual(this.states, fleetStatusContent.states) && Intrinsics.areEqual(this.rating, fleetStatusContent.rating);
        }
        return false;
    }

    public final FleetStatusChart getChart() {
        return this.chart;
    }

    public final FleetRating getRating() {
        return this.rating;
    }

    public final List<FleetState> getStates() {
        return this.states;
    }

    public int hashCode() {
        FleetStatusChart fleetStatusChart = this.chart;
        int hashCode = (((fleetStatusChart == null ? 0 : fleetStatusChart.hashCode()) * 31) + this.states.hashCode()) * 31;
        FleetRating fleetRating = this.rating;
        return hashCode + (fleetRating != null ? fleetRating.hashCode() : 0);
    }

    public String toString() {
        FleetStatusChart fleetStatusChart = this.chart;
        List<FleetState> list = this.states;
        FleetRating fleetRating = this.rating;
        return "FleetStatusContent(chart=" + fleetStatusChart + ", states=" + list + ", rating=" + fleetRating + ")";
    }

    public FleetStatusContent(FleetStatusChart fleetStatusChart, List<FleetState> states, FleetRating fleetRating) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.chart = fleetStatusChart;
        this.states = states;
        this.rating = fleetRating;
    }

    public /* synthetic */ FleetStatusContent(FleetStatusChart fleetStatusChart, List list, FleetRating fleetRating, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fleetStatusChart, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : fleetRating);
    }
}
