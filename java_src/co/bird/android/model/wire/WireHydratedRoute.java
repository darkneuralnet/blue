package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ServiceCenterRoute;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/wire/WireHydratedRoute;", "", "route", "Lco/bird/android/model/constant/ServiceCenterRoute;", "routeDisplay", "", "stations", "", "Lco/bird/android/model/wire/WireHydratedStation;", "(Lco/bird/android/model/constant/ServiceCenterRoute;Ljava/lang/String;Ljava/util/List;)V", "getRoute", "()Lco/bird/android/model/constant/ServiceCenterRoute;", "getRouteDisplay", "()Ljava/lang/String;", "getStations", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireHydratedRoute {
    @JsonProperty("route")
    @InterfaceC41208ft5("route")
    private final ServiceCenterRoute route;
    @JsonProperty("route_display")
    @InterfaceC41208ft5("route_display")
    private final String routeDisplay;
    @JsonProperty("stations")
    @InterfaceC41208ft5("stations")
    private final List<WireHydratedStation> stations;

    public WireHydratedRoute() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireHydratedRoute copy$default(WireHydratedRoute wireHydratedRoute, ServiceCenterRoute serviceCenterRoute, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            serviceCenterRoute = wireHydratedRoute.route;
        }
        if ((i & 2) != 0) {
            str = wireHydratedRoute.routeDisplay;
        }
        if ((i & 4) != 0) {
            list = wireHydratedRoute.stations;
        }
        return wireHydratedRoute.copy(serviceCenterRoute, str, list);
    }

    public final ServiceCenterRoute component1() {
        return this.route;
    }

    public final String component2() {
        return this.routeDisplay;
    }

    public final List<WireHydratedStation> component3() {
        return this.stations;
    }

    public final WireHydratedRoute copy(ServiceCenterRoute serviceCenterRoute, String str, List<WireHydratedStation> stations) {
        Intrinsics.checkNotNullParameter(stations, "stations");
        return new WireHydratedRoute(serviceCenterRoute, str, stations);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireHydratedRoute) {
            WireHydratedRoute wireHydratedRoute = (WireHydratedRoute) obj;
            return this.route == wireHydratedRoute.route && Intrinsics.areEqual(this.routeDisplay, wireHydratedRoute.routeDisplay) && Intrinsics.areEqual(this.stations, wireHydratedRoute.stations);
        }
        return false;
    }

    public final ServiceCenterRoute getRoute() {
        return this.route;
    }

    public final String getRouteDisplay() {
        return this.routeDisplay;
    }

    public final List<WireHydratedStation> getStations() {
        return this.stations;
    }

    public int hashCode() {
        ServiceCenterRoute serviceCenterRoute = this.route;
        int hashCode = (serviceCenterRoute == null ? 0 : serviceCenterRoute.hashCode()) * 31;
        String str = this.routeDisplay;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.stations.hashCode();
    }

    public String toString() {
        ServiceCenterRoute serviceCenterRoute = this.route;
        String str = this.routeDisplay;
        List<WireHydratedStation> list = this.stations;
        return "WireHydratedRoute(route=" + serviceCenterRoute + ", routeDisplay=" + str + ", stations=" + list + ")";
    }

    public WireHydratedRoute(ServiceCenterRoute serviceCenterRoute, String str, List<WireHydratedStation> stations) {
        Intrinsics.checkNotNullParameter(stations, "stations");
        this.route = serviceCenterRoute;
        this.routeDisplay = str;
        this.stations = stations;
    }

    public /* synthetic */ WireHydratedRoute(ServiceCenterRoute serviceCenterRoute, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : serviceCenterRoute, (i & 2) != 0 ? null : str, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
