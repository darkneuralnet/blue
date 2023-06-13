package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ServiceCenterRoute;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/model/wire/WireRoute;", "", "route", "Lco/bird/android/model/constant/ServiceCenterRoute;", "routeDisplay", "", "disabled", "", "disabledMessage", "(Lco/bird/android/model/constant/ServiceCenterRoute;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getDisabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisabledMessage", "()Ljava/lang/String;", "getRoute", "()Lco/bird/android/model/constant/ServiceCenterRoute;", "getRouteDisplay", "component1", "component2", "component3", "component4", "copy", "(Lco/bird/android/model/constant/ServiceCenterRoute;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lco/bird/android/model/wire/WireRoute;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRoute {
    @JsonProperty("disabled")
    @InterfaceC41208ft5("disabled")
    private final Boolean disabled;
    @JsonProperty("disabled_message")
    @InterfaceC41208ft5("disabled_message")
    private final String disabledMessage;
    @JsonProperty("route")
    @InterfaceC41208ft5("route")
    private final ServiceCenterRoute route;
    @JsonProperty("route_display")
    @InterfaceC41208ft5("route_display")
    private final String routeDisplay;

    public WireRoute() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ WireRoute copy$default(WireRoute wireRoute, ServiceCenterRoute serviceCenterRoute, String str, Boolean bool, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            serviceCenterRoute = wireRoute.route;
        }
        if ((i & 2) != 0) {
            str = wireRoute.routeDisplay;
        }
        if ((i & 4) != 0) {
            bool = wireRoute.disabled;
        }
        if ((i & 8) != 0) {
            str2 = wireRoute.disabledMessage;
        }
        return wireRoute.copy(serviceCenterRoute, str, bool, str2);
    }

    public final ServiceCenterRoute component1() {
        return this.route;
    }

    public final String component2() {
        return this.routeDisplay;
    }

    public final Boolean component3() {
        return this.disabled;
    }

    public final String component4() {
        return this.disabledMessage;
    }

    public final WireRoute copy(ServiceCenterRoute serviceCenterRoute, String str, Boolean bool, String str2) {
        return new WireRoute(serviceCenterRoute, str, bool, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRoute) {
            WireRoute wireRoute = (WireRoute) obj;
            return this.route == wireRoute.route && Intrinsics.areEqual(this.routeDisplay, wireRoute.routeDisplay) && Intrinsics.areEqual(this.disabled, wireRoute.disabled) && Intrinsics.areEqual(this.disabledMessage, wireRoute.disabledMessage);
        }
        return false;
    }

    public final Boolean getDisabled() {
        return this.disabled;
    }

    public final String getDisabledMessage() {
        return this.disabledMessage;
    }

    public final ServiceCenterRoute getRoute() {
        return this.route;
    }

    public final String getRouteDisplay() {
        return this.routeDisplay;
    }

    public int hashCode() {
        ServiceCenterRoute serviceCenterRoute = this.route;
        int hashCode = (serviceCenterRoute == null ? 0 : serviceCenterRoute.hashCode()) * 31;
        String str = this.routeDisplay;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.disabled;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.disabledMessage;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        ServiceCenterRoute serviceCenterRoute = this.route;
        String str = this.routeDisplay;
        Boolean bool = this.disabled;
        String str2 = this.disabledMessage;
        return "WireRoute(route=" + serviceCenterRoute + ", routeDisplay=" + str + ", disabled=" + bool + ", disabledMessage=" + str2 + ")";
    }

    public WireRoute(ServiceCenterRoute serviceCenterRoute, String str, Boolean bool, String str2) {
        this.route = serviceCenterRoute;
        this.routeDisplay = str;
        this.disabled = bool;
        this.disabledMessage = str2;
    }

    public /* synthetic */ WireRoute(ServiceCenterRoute serviceCenterRoute, String str, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : serviceCenterRoute, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2);
    }
}
