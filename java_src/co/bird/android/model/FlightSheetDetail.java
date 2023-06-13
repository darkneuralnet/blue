package co.bird.android.model;

import co.bird.android.model.constant.BirdLocationSource;
import co.bird.android.model.constant.BirdTaskKind;
import co.bird.android.model.constant.FlightSheetMessageIcon;
import co.bird.android.model.constant.Placement;
import co.bird.android.model.wire.WireBountyReason;
import co.bird.android.model.wire.WireMapMarker;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bF\b\u0086\b\u0018\u00002\u00020\u0001B«\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(¢\u0006\u0002\u0010)J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010T\u001a\u00020\u0018HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u001bHÆ\u0003J\t\u0010W\u001a\u00020\u001bHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\"HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010(HÆ\u0003J\t\u0010a\u001a\u00020\u0006HÆ\u0003J\t\u0010b\u001a\u00020\bHÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u000eHÆ\u0003J¯\u0002\u0010h\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(HÆ\u0001J\u0013\u0010i\u001a\u00020\u001b2\b\u0010j\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010k\u001a\u00020\u0018HÖ\u0001J\u0006\u0010l\u001a\u00020\u001bJ\t\u0010m\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u001a\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\u001c\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010-R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0018\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00101R\u0018\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00101R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010/R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0018\u0010 \u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00105R\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00101R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u00101R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u00101R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u00105R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u00101R\u0018\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u00101¨\u0006n"}, m28432d2 = {"Lco/bird/android/model/FlightSheetDetail;", "", "vehicleStateTitle", "", "vehicleStateDescription", "marker", "Lco/bird/android/model/wire/WireMapMarker;", "taskKind", "Lco/bird/android/model/constant/BirdTaskKind;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "serialNumber", "brandName", RequestHeadersFactory.MODEL, "lifecyclePlacement", "Lco/bird/android/model/constant/Placement;", "bountyReasons", "", "Lco/bird/android/model/wire/WireBountyReason;", "inaccessibleReasons", "Lco/bird/android/model/InaccessibleReason;", "trackedAt", "Lorg/joda/time/DateTime;", "gpsAt", "batteryLevel", "", "rideEndPhotoUrl", "bluetooth", "", "cellular", "lastEvent", "radarInfo", "Lco/bird/android/model/RadarInfo;", "lastLocatedAt", "lastLocatedSource", "Lco/bird/android/model/constant/BirdLocationSource;", "lastRide", "Lco/bird/android/model/OperatorRideHistoryItem;", "imei", "iccid", "vehicleStateIconOverride", "Lco/bird/android/model/constant/FlightSheetMessageIcon;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireMapMarker;Lco/bird/android/model/constant/BirdTaskKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/Placement;Ljava/util/List;Ljava/util/List;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILjava/lang/String;ZZLorg/joda/time/DateTime;Lco/bird/android/model/RadarInfo;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/BirdLocationSource;Lco/bird/android/model/OperatorRideHistoryItem;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/FlightSheetMessageIcon;)V", "getBatteryLevel", "()I", "getBluetooth", "()Z", "getBountyReasons", "()Ljava/util/List;", "getBrandName", "()Ljava/lang/String;", "getCellular", "getCode", "getGpsAt", "()Lorg/joda/time/DateTime;", "getIccid", "getImei", "getInaccessibleReasons", "getLastEvent", "getLastLocatedAt", "getLastLocatedSource", "()Lco/bird/android/model/constant/BirdLocationSource;", "getLastRide", "()Lco/bird/android/model/OperatorRideHistoryItem;", "getLifecyclePlacement", "()Lco/bird/android/model/constant/Placement;", "getMarker", "()Lco/bird/android/model/wire/WireMapMarker;", "getModel", "getRadarInfo", "()Lco/bird/android/model/RadarInfo;", "getRideEndPhotoUrl", "getSerialNumber", "getTaskKind", "()Lco/bird/android/model/constant/BirdTaskKind;", "getTrackedAt", "getVehicleStateDescription", "getVehicleStateIconOverride", "()Lco/bird/android/model/constant/FlightSheetMessageIcon;", "getVehicleStateTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "showLastRideSection", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FlightSheetDetail {
    @JsonProperty("battery_level")
    @InterfaceC41208ft5("battery_level")
    private final int batteryLevel;
    @JsonProperty("bluetooth")
    @InterfaceC41208ft5("bluetooth")
    private final boolean bluetooth;
    @JsonProperty("bounty_reasons")
    @InterfaceC41208ft5("bounty_reasons")
    private final List<WireBountyReason> bountyReasons;
    @JsonProperty("brand_name")
    @InterfaceC41208ft5("brand_name")
    private final String brandName;
    @JsonProperty("cellular")
    @InterfaceC41208ft5("cellular")
    private final boolean cellular;
    @JsonProperty(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    @InterfaceC41208ft5(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    private final String code;
    @JsonProperty("gps_at")
    @InterfaceC41208ft5("gps_at")
    private final DateTime gpsAt;
    @JsonProperty("iccid")
    @InterfaceC41208ft5("iccid")
    private final String iccid;
    @JsonProperty("imei")
    @InterfaceC41208ft5("imei")
    private final String imei;
    @JsonProperty("inaccessible_reasons")
    @InterfaceC41208ft5("inaccessible_reasons")
    private final List<InaccessibleReason> inaccessibleReasons;
    @JsonProperty("last_event")
    @InterfaceC41208ft5("last_event")
    private final DateTime lastEvent;
    @JsonProperty("last_located_at")
    @InterfaceC41208ft5("last_located_at")
    private final DateTime lastLocatedAt;
    @JsonProperty("last_located_source")
    @InterfaceC41208ft5("last_located_source")
    private final BirdLocationSource lastLocatedSource;
    @JsonProperty("last_ride")
    @InterfaceC41208ft5("last_ride")
    private final OperatorRideHistoryItem lastRide;
    @JsonProperty("lifecycle_placement")
    @InterfaceC41208ft5("lifecycle_placement")
    private final Placement lifecyclePlacement;
    @JsonProperty("marker")
    @JsonAlias({"map_marker"})
    @InterfaceC41208ft5(alternate = {"map_marker"}, value = "marker")
    private final WireMapMarker marker;
    @JsonProperty(RequestHeadersFactory.MODEL)
    @InterfaceC41208ft5(RequestHeadersFactory.MODEL)
    private final String model;
    @JsonProperty("radar_info")
    @InterfaceC41208ft5("radar_info")
    private final RadarInfo radarInfo;
    @JsonProperty("ride_end_photo_url")
    @InterfaceC41208ft5("ride_end_photo_url")
    private final String rideEndPhotoUrl;
    @JsonProperty("serial_number")
    @InterfaceC41208ft5("serial_number")
    private final String serialNumber;
    @JsonProperty("task_kind")
    @InterfaceC41208ft5("task_kind")
    private final BirdTaskKind taskKind;
    @JsonProperty("tracked_at")
    @InterfaceC41208ft5("tracked_at")
    private final DateTime trackedAt;
    @JsonProperty("vehicle_state_description")
    @InterfaceC41208ft5("vehicle_state_description")
    private final String vehicleStateDescription;
    @JsonProperty("vehicle_state_icon_override")
    @InterfaceC41208ft5("vehicle_state_icon_override")
    private final FlightSheetMessageIcon vehicleStateIconOverride;
    @JsonProperty("vehicle_state_title")
    @InterfaceC41208ft5("vehicle_state_title")
    private final String vehicleStateTitle;

    public FlightSheetDetail() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, null, null, null, null, 33554431, null);
    }

    public final String component1() {
        return this.vehicleStateTitle;
    }

    public final List<WireBountyReason> component10() {
        return this.bountyReasons;
    }

    public final List<InaccessibleReason> component11() {
        return this.inaccessibleReasons;
    }

    public final DateTime component12() {
        return this.trackedAt;
    }

    public final DateTime component13() {
        return this.gpsAt;
    }

    public final int component14() {
        return this.batteryLevel;
    }

    public final String component15() {
        return this.rideEndPhotoUrl;
    }

    public final boolean component16() {
        return this.bluetooth;
    }

    public final boolean component17() {
        return this.cellular;
    }

    public final DateTime component18() {
        return this.lastEvent;
    }

    public final RadarInfo component19() {
        return this.radarInfo;
    }

    public final String component2() {
        return this.vehicleStateDescription;
    }

    public final DateTime component20() {
        return this.lastLocatedAt;
    }

    public final BirdLocationSource component21() {
        return this.lastLocatedSource;
    }

    public final OperatorRideHistoryItem component22() {
        return this.lastRide;
    }

    public final String component23() {
        return this.imei;
    }

    public final String component24() {
        return this.iccid;
    }

    public final FlightSheetMessageIcon component25() {
        return this.vehicleStateIconOverride;
    }

    public final WireMapMarker component3() {
        return this.marker;
    }

    public final BirdTaskKind component4() {
        return this.taskKind;
    }

    public final String component5() {
        return this.code;
    }

    public final String component6() {
        return this.serialNumber;
    }

    public final String component7() {
        return this.brandName;
    }

    public final String component8() {
        return this.model;
    }

    public final Placement component9() {
        return this.lifecyclePlacement;
    }

    public final FlightSheetDetail copy(String str, String str2, WireMapMarker marker, BirdTaskKind taskKind, String code, String serialNumber, String str3, String str4, Placement placement, List<WireBountyReason> bountyReasons, List<? extends InaccessibleReason> inaccessibleReasons, DateTime dateTime, DateTime dateTime2, int i, String str5, boolean z, boolean z2, DateTime dateTime3, RadarInfo radarInfo, DateTime dateTime4, BirdLocationSource birdLocationSource, OperatorRideHistoryItem operatorRideHistoryItem, String str6, String str7, FlightSheetMessageIcon flightSheetMessageIcon) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        Intrinsics.checkNotNullParameter(taskKind, "taskKind");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        Intrinsics.checkNotNullParameter(bountyReasons, "bountyReasons");
        Intrinsics.checkNotNullParameter(inaccessibleReasons, "inaccessibleReasons");
        return new FlightSheetDetail(str, str2, marker, taskKind, code, serialNumber, str3, str4, placement, bountyReasons, inaccessibleReasons, dateTime, dateTime2, i, str5, z, z2, dateTime3, radarInfo, dateTime4, birdLocationSource, operatorRideHistoryItem, str6, str7, flightSheetMessageIcon);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlightSheetDetail) {
            FlightSheetDetail flightSheetDetail = (FlightSheetDetail) obj;
            return Intrinsics.areEqual(this.vehicleStateTitle, flightSheetDetail.vehicleStateTitle) && Intrinsics.areEqual(this.vehicleStateDescription, flightSheetDetail.vehicleStateDescription) && Intrinsics.areEqual(this.marker, flightSheetDetail.marker) && this.taskKind == flightSheetDetail.taskKind && Intrinsics.areEqual(this.code, flightSheetDetail.code) && Intrinsics.areEqual(this.serialNumber, flightSheetDetail.serialNumber) && Intrinsics.areEqual(this.brandName, flightSheetDetail.brandName) && Intrinsics.areEqual(this.model, flightSheetDetail.model) && this.lifecyclePlacement == flightSheetDetail.lifecyclePlacement && Intrinsics.areEqual(this.bountyReasons, flightSheetDetail.bountyReasons) && Intrinsics.areEqual(this.inaccessibleReasons, flightSheetDetail.inaccessibleReasons) && Intrinsics.areEqual(this.trackedAt, flightSheetDetail.trackedAt) && Intrinsics.areEqual(this.gpsAt, flightSheetDetail.gpsAt) && this.batteryLevel == flightSheetDetail.batteryLevel && Intrinsics.areEqual(this.rideEndPhotoUrl, flightSheetDetail.rideEndPhotoUrl) && this.bluetooth == flightSheetDetail.bluetooth && this.cellular == flightSheetDetail.cellular && Intrinsics.areEqual(this.lastEvent, flightSheetDetail.lastEvent) && Intrinsics.areEqual(this.radarInfo, flightSheetDetail.radarInfo) && Intrinsics.areEqual(this.lastLocatedAt, flightSheetDetail.lastLocatedAt) && this.lastLocatedSource == flightSheetDetail.lastLocatedSource && Intrinsics.areEqual(this.lastRide, flightSheetDetail.lastRide) && Intrinsics.areEqual(this.imei, flightSheetDetail.imei) && Intrinsics.areEqual(this.iccid, flightSheetDetail.iccid) && this.vehicleStateIconOverride == flightSheetDetail.vehicleStateIconOverride;
        }
        return false;
    }

    public final int getBatteryLevel() {
        return this.batteryLevel;
    }

    public final boolean getBluetooth() {
        return this.bluetooth;
    }

    public final List<WireBountyReason> getBountyReasons() {
        return this.bountyReasons;
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final boolean getCellular() {
        return this.cellular;
    }

    public final String getCode() {
        return this.code;
    }

    public final DateTime getGpsAt() {
        return this.gpsAt;
    }

    public final String getIccid() {
        return this.iccid;
    }

    public final String getImei() {
        return this.imei;
    }

    public final List<InaccessibleReason> getInaccessibleReasons() {
        return this.inaccessibleReasons;
    }

    public final DateTime getLastEvent() {
        return this.lastEvent;
    }

    public final DateTime getLastLocatedAt() {
        return this.lastLocatedAt;
    }

    public final BirdLocationSource getLastLocatedSource() {
        return this.lastLocatedSource;
    }

    public final OperatorRideHistoryItem getLastRide() {
        return this.lastRide;
    }

    public final Placement getLifecyclePlacement() {
        return this.lifecyclePlacement;
    }

    public final WireMapMarker getMarker() {
        return this.marker;
    }

    public final String getModel() {
        return this.model;
    }

    public final RadarInfo getRadarInfo() {
        return this.radarInfo;
    }

    public final String getRideEndPhotoUrl() {
        return this.rideEndPhotoUrl;
    }

    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public final BirdTaskKind getTaskKind() {
        return this.taskKind;
    }

    public final DateTime getTrackedAt() {
        return this.trackedAt;
    }

    public final String getVehicleStateDescription() {
        return this.vehicleStateDescription;
    }

    public final FlightSheetMessageIcon getVehicleStateIconOverride() {
        return this.vehicleStateIconOverride;
    }

    public final String getVehicleStateTitle() {
        return this.vehicleStateTitle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.vehicleStateTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.vehicleStateDescription;
        int hashCode2 = (((((((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.marker.hashCode()) * 31) + this.taskKind.hashCode()) * 31) + this.code.hashCode()) * 31) + this.serialNumber.hashCode()) * 31;
        String str3 = this.brandName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.model;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Placement placement = this.lifecyclePlacement;
        int hashCode5 = (((((hashCode4 + (placement == null ? 0 : placement.hashCode())) * 31) + this.bountyReasons.hashCode()) * 31) + this.inaccessibleReasons.hashCode()) * 31;
        DateTime dateTime = this.trackedAt;
        int hashCode6 = (hashCode5 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.gpsAt;
        int hashCode7 = (((hashCode6 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31) + Integer.hashCode(this.batteryLevel)) * 31;
        String str5 = this.rideEndPhotoUrl;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        boolean z = this.bluetooth;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode8 + i) * 31;
        boolean z2 = this.cellular;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        DateTime dateTime3 = this.lastEvent;
        int hashCode9 = (i3 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        RadarInfo radarInfo = this.radarInfo;
        int hashCode10 = (hashCode9 + (radarInfo == null ? 0 : radarInfo.hashCode())) * 31;
        DateTime dateTime4 = this.lastLocatedAt;
        int hashCode11 = (hashCode10 + (dateTime4 == null ? 0 : dateTime4.hashCode())) * 31;
        BirdLocationSource birdLocationSource = this.lastLocatedSource;
        int hashCode12 = (hashCode11 + (birdLocationSource == null ? 0 : birdLocationSource.hashCode())) * 31;
        OperatorRideHistoryItem operatorRideHistoryItem = this.lastRide;
        int hashCode13 = (hashCode12 + (operatorRideHistoryItem == null ? 0 : operatorRideHistoryItem.hashCode())) * 31;
        String str6 = this.imei;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.iccid;
        int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        FlightSheetMessageIcon flightSheetMessageIcon = this.vehicleStateIconOverride;
        return hashCode15 + (flightSheetMessageIcon != null ? flightSheetMessageIcon.hashCode() : 0);
    }

    public final boolean showLastRideSection() {
        return this.lastRide != null;
    }

    public String toString() {
        String str = this.vehicleStateTitle;
        String str2 = this.vehicleStateDescription;
        WireMapMarker wireMapMarker = this.marker;
        BirdTaskKind birdTaskKind = this.taskKind;
        String str3 = this.code;
        String str4 = this.serialNumber;
        String str5 = this.brandName;
        String str6 = this.model;
        Placement placement = this.lifecyclePlacement;
        List<WireBountyReason> list = this.bountyReasons;
        List<InaccessibleReason> list2 = this.inaccessibleReasons;
        DateTime dateTime = this.trackedAt;
        DateTime dateTime2 = this.gpsAt;
        int i = this.batteryLevel;
        String str7 = this.rideEndPhotoUrl;
        boolean z = this.bluetooth;
        boolean z2 = this.cellular;
        DateTime dateTime3 = this.lastEvent;
        RadarInfo radarInfo = this.radarInfo;
        DateTime dateTime4 = this.lastLocatedAt;
        BirdLocationSource birdLocationSource = this.lastLocatedSource;
        OperatorRideHistoryItem operatorRideHistoryItem = this.lastRide;
        String str8 = this.imei;
        String str9 = this.iccid;
        FlightSheetMessageIcon flightSheetMessageIcon = this.vehicleStateIconOverride;
        return "FlightSheetDetail(vehicleStateTitle=" + str + ", vehicleStateDescription=" + str2 + ", marker=" + wireMapMarker + ", taskKind=" + birdTaskKind + ", code=" + str3 + ", serialNumber=" + str4 + ", brandName=" + str5 + ", model=" + str6 + ", lifecyclePlacement=" + placement + ", bountyReasons=" + list + ", inaccessibleReasons=" + list2 + ", trackedAt=" + dateTime + ", gpsAt=" + dateTime2 + ", batteryLevel=" + i + ", rideEndPhotoUrl=" + str7 + ", bluetooth=" + z + ", cellular=" + z2 + ", lastEvent=" + dateTime3 + ", radarInfo=" + radarInfo + ", lastLocatedAt=" + dateTime4 + ", lastLocatedSource=" + birdLocationSource + ", lastRide=" + operatorRideHistoryItem + ", imei=" + str8 + ", iccid=" + str9 + ", vehicleStateIconOverride=" + flightSheetMessageIcon + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlightSheetDetail(String str, String str2, WireMapMarker marker, BirdTaskKind taskKind, String code, String serialNumber, String str3, String str4, Placement placement, List<WireBountyReason> bountyReasons, List<? extends InaccessibleReason> inaccessibleReasons, DateTime dateTime, DateTime dateTime2, int i, String str5, boolean z, boolean z2, DateTime dateTime3, RadarInfo radarInfo, DateTime dateTime4, BirdLocationSource birdLocationSource, OperatorRideHistoryItem operatorRideHistoryItem, String str6, String str7, FlightSheetMessageIcon flightSheetMessageIcon) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        Intrinsics.checkNotNullParameter(taskKind, "taskKind");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        Intrinsics.checkNotNullParameter(bountyReasons, "bountyReasons");
        Intrinsics.checkNotNullParameter(inaccessibleReasons, "inaccessibleReasons");
        this.vehicleStateTitle = str;
        this.vehicleStateDescription = str2;
        this.marker = marker;
        this.taskKind = taskKind;
        this.code = code;
        this.serialNumber = serialNumber;
        this.brandName = str3;
        this.model = str4;
        this.lifecyclePlacement = placement;
        this.bountyReasons = bountyReasons;
        this.inaccessibleReasons = inaccessibleReasons;
        this.trackedAt = dateTime;
        this.gpsAt = dateTime2;
        this.batteryLevel = i;
        this.rideEndPhotoUrl = str5;
        this.bluetooth = z;
        this.cellular = z2;
        this.lastEvent = dateTime3;
        this.radarInfo = radarInfo;
        this.lastLocatedAt = dateTime4;
        this.lastLocatedSource = birdLocationSource;
        this.lastRide = operatorRideHistoryItem;
        this.imei = str6;
        this.iccid = str7;
        this.vehicleStateIconOverride = flightSheetMessageIcon;
    }

    public /* synthetic */ FlightSheetDetail(String str, String str2, WireMapMarker wireMapMarker, BirdTaskKind birdTaskKind, String str3, String str4, String str5, String str6, Placement placement, List list, List list2, DateTime dateTime, DateTime dateTime2, int i, String str7, boolean z, boolean z2, DateTime dateTime3, RadarInfo radarInfo, DateTime dateTime4, BirdLocationSource birdLocationSource, OperatorRideHistoryItem operatorRideHistoryItem, String str8, String str9, FlightSheetMessageIcon flightSheetMessageIcon, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? new WireMapMarker(null, null, null, 7, null) : wireMapMarker, (i2 & 8) != 0 ? BirdTaskKind.UNKNOWN : birdTaskKind, (i2 & 16) != 0 ? "" : str3, (i2 & 32) == 0 ? str4 : "", (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? null : placement, (i2 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 1024) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i2 & 2048) != 0 ? null : dateTime, (i2 & 4096) != 0 ? null : dateTime2, (i2 & 8192) != 0 ? 0 : i, (i2 & 16384) != 0 ? null : str7, (i2 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? false : z, (i2 & 65536) == 0 ? z2 : false, (i2 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : dateTime3, (i2 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : radarInfo, (i2 & 524288) != 0 ? null : dateTime4, (i2 & 1048576) != 0 ? null : birdLocationSource, (i2 & 2097152) != 0 ? null : operatorRideHistoryItem, (i2 & 4194304) != 0 ? null : str8, (i2 & 8388608) != 0 ? null : str9, (i2 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : flightSheetMessageIcon);
    }
}
