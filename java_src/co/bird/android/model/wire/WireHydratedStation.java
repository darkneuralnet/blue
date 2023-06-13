package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ServiceCenterRouteStation;
import co.bird.android.model.constant.ServiceCenterRouteStationStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0014JJ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/wire/WireHydratedStation;", "", "station", "Lco/bird/android/model/constant/ServiceCenterRouteStation;", "stationDisplay", "", "stationDescription", "status", "Lco/bird/android/model/constant/ServiceCenterRouteStationStatus;", "statusColor", "", "(Lco/bird/android/model/constant/ServiceCenterRouteStation;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ServiceCenterRouteStationStatus;Ljava/lang/Integer;)V", "getStation", "()Lco/bird/android/model/constant/ServiceCenterRouteStation;", "getStationDescription", "()Ljava/lang/String;", "getStationDisplay", "getStatus", "()Lco/bird/android/model/constant/ServiceCenterRouteStationStatus;", "getStatusColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lco/bird/android/model/constant/ServiceCenterRouteStation;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ServiceCenterRouteStationStatus;Ljava/lang/Integer;)Lco/bird/android/model/wire/WireHydratedStation;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireHydratedStation {
    @JsonProperty("station")
    @InterfaceC41208ft5("station")
    private final ServiceCenterRouteStation station;
    @JsonProperty("station_description")
    @InterfaceC41208ft5("station_description")
    private final String stationDescription;
    @JsonProperty("station_display")
    @InterfaceC41208ft5("station_display")
    private final String stationDisplay;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final ServiceCenterRouteStationStatus status;
    @JsonProperty("status_color")
    @InterfaceC41208ft5("status_color")
    private final Integer statusColor;

    public WireHydratedStation() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ WireHydratedStation copy$default(WireHydratedStation wireHydratedStation, ServiceCenterRouteStation serviceCenterRouteStation, String str, String str2, ServiceCenterRouteStationStatus serviceCenterRouteStationStatus, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            serviceCenterRouteStation = wireHydratedStation.station;
        }
        if ((i & 2) != 0) {
            str = wireHydratedStation.stationDisplay;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = wireHydratedStation.stationDescription;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            serviceCenterRouteStationStatus = wireHydratedStation.status;
        }
        ServiceCenterRouteStationStatus serviceCenterRouteStationStatus2 = serviceCenterRouteStationStatus;
        if ((i & 16) != 0) {
            num = wireHydratedStation.statusColor;
        }
        return wireHydratedStation.copy(serviceCenterRouteStation, str3, str4, serviceCenterRouteStationStatus2, num);
    }

    public final ServiceCenterRouteStation component1() {
        return this.station;
    }

    public final String component2() {
        return this.stationDisplay;
    }

    public final String component3() {
        return this.stationDescription;
    }

    public final ServiceCenterRouteStationStatus component4() {
        return this.status;
    }

    public final Integer component5() {
        return this.statusColor;
    }

    public final WireHydratedStation copy(ServiceCenterRouteStation serviceCenterRouteStation, String str, String str2, ServiceCenterRouteStationStatus serviceCenterRouteStationStatus, Integer num) {
        return new WireHydratedStation(serviceCenterRouteStation, str, str2, serviceCenterRouteStationStatus, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireHydratedStation) {
            WireHydratedStation wireHydratedStation = (WireHydratedStation) obj;
            return this.station == wireHydratedStation.station && Intrinsics.areEqual(this.stationDisplay, wireHydratedStation.stationDisplay) && Intrinsics.areEqual(this.stationDescription, wireHydratedStation.stationDescription) && this.status == wireHydratedStation.status && Intrinsics.areEqual(this.statusColor, wireHydratedStation.statusColor);
        }
        return false;
    }

    public final ServiceCenterRouteStation getStation() {
        return this.station;
    }

    public final String getStationDescription() {
        return this.stationDescription;
    }

    public final String getStationDisplay() {
        return this.stationDisplay;
    }

    public final ServiceCenterRouteStationStatus getStatus() {
        return this.status;
    }

    public final Integer getStatusColor() {
        return this.statusColor;
    }

    public int hashCode() {
        ServiceCenterRouteStation serviceCenterRouteStation = this.station;
        int hashCode = (serviceCenterRouteStation == null ? 0 : serviceCenterRouteStation.hashCode()) * 31;
        String str = this.stationDisplay;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.stationDescription;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ServiceCenterRouteStationStatus serviceCenterRouteStationStatus = this.status;
        int hashCode4 = (hashCode3 + (serviceCenterRouteStationStatus == null ? 0 : serviceCenterRouteStationStatus.hashCode())) * 31;
        Integer num = this.statusColor;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        ServiceCenterRouteStation serviceCenterRouteStation = this.station;
        String str = this.stationDisplay;
        String str2 = this.stationDescription;
        ServiceCenterRouteStationStatus serviceCenterRouteStationStatus = this.status;
        Integer num = this.statusColor;
        return "WireHydratedStation(station=" + serviceCenterRouteStation + ", stationDisplay=" + str + ", stationDescription=" + str2 + ", status=" + serviceCenterRouteStationStatus + ", statusColor=" + num + ")";
    }

    public WireHydratedStation(ServiceCenterRouteStation serviceCenterRouteStation, String str, String str2, ServiceCenterRouteStationStatus serviceCenterRouteStationStatus, Integer num) {
        this.station = serviceCenterRouteStation;
        this.stationDisplay = str;
        this.stationDescription = str2;
        this.status = serviceCenterRouteStationStatus;
        this.statusColor = num;
    }

    public /* synthetic */ WireHydratedStation(ServiceCenterRouteStation serviceCenterRouteStation, String str, String str2, ServiceCenterRouteStationStatus serviceCenterRouteStationStatus, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : serviceCenterRouteStation, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : serviceCenterRouteStationStatus, (i & 16) != 0 ? null : num);
    }
}
