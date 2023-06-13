package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetStatusContent;", "", "chart", "Lco/bird/android/model/wire/WireFleetStatusChart;", "states", "", "Lco/bird/android/model/wire/WireFleetState;", "rating", "Lco/bird/android/model/wire/WireFleetRating;", "(Lco/bird/android/model/wire/WireFleetStatusChart;Ljava/util/List;Lco/bird/android/model/wire/WireFleetRating;)V", "getChart", "()Lco/bird/android/model/wire/WireFleetStatusChart;", "getRating", "()Lco/bird/android/model/wire/WireFleetRating;", "getStates", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleetStatusContent {
    @JsonProperty("chart")
    @InterfaceC41208ft5("chart")
    private final WireFleetStatusChart chart;
    @JsonProperty("rating")
    @InterfaceC41208ft5("rating")
    private final WireFleetRating rating;
    @JsonProperty("states")
    @InterfaceC41208ft5("states")
    private final List<WireFleetState> states;

    public WireFleetStatusContent() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireFleetStatusContent copy$default(WireFleetStatusContent wireFleetStatusContent, WireFleetStatusChart wireFleetStatusChart, List list, WireFleetRating wireFleetRating, int i, Object obj) {
        if ((i & 1) != 0) {
            wireFleetStatusChart = wireFleetStatusContent.chart;
        }
        if ((i & 2) != 0) {
            list = wireFleetStatusContent.states;
        }
        if ((i & 4) != 0) {
            wireFleetRating = wireFleetStatusContent.rating;
        }
        return wireFleetStatusContent.copy(wireFleetStatusChart, list, wireFleetRating);
    }

    public final WireFleetStatusChart component1() {
        return this.chart;
    }

    public final List<WireFleetState> component2() {
        return this.states;
    }

    public final WireFleetRating component3() {
        return this.rating;
    }

    public final WireFleetStatusContent copy(WireFleetStatusChart wireFleetStatusChart, List<WireFleetState> states, WireFleetRating wireFleetRating) {
        Intrinsics.checkNotNullParameter(states, "states");
        return new WireFleetStatusContent(wireFleetStatusChart, states, wireFleetRating);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleetStatusContent) {
            WireFleetStatusContent wireFleetStatusContent = (WireFleetStatusContent) obj;
            return Intrinsics.areEqual(this.chart, wireFleetStatusContent.chart) && Intrinsics.areEqual(this.states, wireFleetStatusContent.states) && Intrinsics.areEqual(this.rating, wireFleetStatusContent.rating);
        }
        return false;
    }

    public final WireFleetStatusChart getChart() {
        return this.chart;
    }

    public final WireFleetRating getRating() {
        return this.rating;
    }

    public final List<WireFleetState> getStates() {
        return this.states;
    }

    public int hashCode() {
        WireFleetStatusChart wireFleetStatusChart = this.chart;
        int hashCode = (((wireFleetStatusChart == null ? 0 : wireFleetStatusChart.hashCode()) * 31) + this.states.hashCode()) * 31;
        WireFleetRating wireFleetRating = this.rating;
        return hashCode + (wireFleetRating != null ? wireFleetRating.hashCode() : 0);
    }

    public String toString() {
        WireFleetStatusChart wireFleetStatusChart = this.chart;
        List<WireFleetState> list = this.states;
        WireFleetRating wireFleetRating = this.rating;
        return "WireFleetStatusContent(chart=" + wireFleetStatusChart + ", states=" + list + ", rating=" + wireFleetRating + ")";
    }

    public WireFleetStatusContent(WireFleetStatusChart wireFleetStatusChart, List<WireFleetState> states, WireFleetRating wireFleetRating) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.chart = wireFleetStatusChart;
        this.states = states;
        this.rating = wireFleetRating;
    }

    public /* synthetic */ WireFleetStatusContent(WireFleetStatusChart wireFleetStatusChart, List list, WireFleetRating wireFleetRating, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireFleetStatusChart, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : wireFleetRating);
    }
}
