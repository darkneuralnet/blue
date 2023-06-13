package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.AreaIconType;
import co.bird.android.model.constant.RiderMapZoneKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B±\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\u0002\u0010!J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u0011\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÄ\u0002\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010ZJ\u0013\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010^\u001a\u00020\u0011HÖ\u0001J\t\u0010_\u001a\u00020\u0003HÖ\u0001R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010*R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00101\u001a\u0004\b4\u00100R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010*R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010*R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010*R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010*R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010*R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010:R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010*R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010*R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010*¨\u0006`"}, m28432d2 = {"Lco/bird/android/model/wire/WireRiderMapZone;", "", "id", "", "centerPoint", "Lco/bird/android/model/wire/WireLocation;", "label", "colors", "Lco/bird/android/model/wire/WireRiderMapZoneColors;", "zoomBehavior", "mapZoneKinds", "", "Lco/bird/android/model/constant/RiderMapZoneKind;", "notes", "title", "customTooltipTitle", "noParkingFineAmount", "", "noParkingFineCurrency", "noParkingFineAlertTitle", "noParkingFineAlertMessage", "riderBarInRideMessageTitle", "riderBarInRideMessageBody", "riderBarInRideMessageIconType", "Lco/bird/android/model/constant/AreaIconType;", "riderBarNotInRideMessageTitle", "riderBarNotInRideMessageBody", "riderBarNotInRideMessageIconType", "maxSpeed", "partnerId", "areasMerged", "fleetIds", "areaKeys", "(Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Lco/bird/android/model/wire/WireRiderMapZoneColors;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAreaKeys", "()Ljava/util/List;", "getAreasMerged", "getCenterPoint", "()Lco/bird/android/model/wire/WireLocation;", "getColors", "()Lco/bird/android/model/wire/WireRiderMapZoneColors;", "getCustomTooltipTitle", "()Ljava/lang/String;", "getFleetIds", "getId", "getLabel", "getMapZoneKinds", "getMaxSpeed", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNoParkingFineAlertMessage", "getNoParkingFineAlertTitle", "getNoParkingFineAmount", "getNoParkingFineCurrency", "getNotes", "getPartnerId", "getRiderBarInRideMessageBody", "getRiderBarInRideMessageIconType", "()Lco/bird/android/model/constant/AreaIconType;", "getRiderBarInRideMessageTitle", "getRiderBarNotInRideMessageBody", "getRiderBarNotInRideMessageIconType", "getRiderBarNotInRideMessageTitle", "getTitle", "getZoomBehavior", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Lco/bird/android/model/wire/WireRiderMapZoneColors;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lco/bird/android/model/wire/WireRiderMapZone;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRiderMapZone {
    @JsonProperty("area_keys")
    @InterfaceC41208ft5("area_keys")
    private final List<String> areaKeys;
    @JsonProperty("areas_merged")
    @InterfaceC41208ft5("areas_merged")
    private final List<String> areasMerged;
    @JsonProperty("center_point")
    @InterfaceC41208ft5("center_point")
    private final WireLocation centerPoint;
    @JsonProperty("colors")
    @InterfaceC41208ft5("colors")
    private final WireRiderMapZoneColors colors;
    @JsonProperty("custom_tooltip_title")
    @InterfaceC41208ft5("custom_tooltip_title")
    private final String customTooltipTitle;
    @JsonProperty("fleet_ids")
    @InterfaceC41208ft5("fleet_ids")
    private final List<String> fleetIds;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66760id;
    @JsonProperty("label")
    @InterfaceC41208ft5("label")
    private final String label;
    @JsonProperty("map_zone_kinds")
    @InterfaceC41208ft5("map_zone_kinds")
    private final List<RiderMapZoneKind> mapZoneKinds;
    @JsonProperty("max_speed")
    @InterfaceC41208ft5("max_speed")
    private final Integer maxSpeed;
    @JsonProperty("no_parking_fine_alert_message")
    @InterfaceC41208ft5("no_parking_fine_alert_message")
    private final String noParkingFineAlertMessage;
    @JsonProperty("no_parking_fine_alert_title")
    @InterfaceC41208ft5("no_parking_fine_alert_title")
    private final String noParkingFineAlertTitle;
    @JsonProperty("no_parking_fine_amount")
    @InterfaceC41208ft5("no_parking_fine_amount")
    private final Integer noParkingFineAmount;
    @JsonProperty("no_parking_fine_currency")
    @InterfaceC41208ft5("no_parking_fine_currency")
    private final String noParkingFineCurrency;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("partner_id")
    @InterfaceC41208ft5("partner_id")
    private final String partnerId;
    @JsonProperty("rider_bar_in_ride_message_body")
    @InterfaceC41208ft5("rider_bar_in_ride_message_body")
    private final String riderBarInRideMessageBody;
    @JsonProperty("rider_bar_in_ride_message_icon_type")
    @InterfaceC41208ft5("rider_bar_in_ride_message_icon_type")
    private final AreaIconType riderBarInRideMessageIconType;
    @JsonProperty("rider_bar_in_ride_message_title")
    @InterfaceC41208ft5("rider_bar_in_ride_message_title")
    private final String riderBarInRideMessageTitle;
    @JsonProperty("rider_bar_not_in_ride_message_body")
    @InterfaceC41208ft5("rider_bar_not_in_ride_message_body")
    private final String riderBarNotInRideMessageBody;
    @JsonProperty("rider_bar_not_in_ride_message_icon_type")
    @InterfaceC41208ft5("rider_bar_not_in_ride_message_icon_type")
    private final AreaIconType riderBarNotInRideMessageIconType;
    @JsonProperty("rider_bar_not_in_ride_message_title")
    @InterfaceC41208ft5("rider_bar_not_in_ride_message_title")
    private final String riderBarNotInRideMessageTitle;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("zoom_behavior")
    @InterfaceC41208ft5("zoom_behavior")
    private final String zoomBehavior;

    /* JADX WARN: Multi-variable type inference failed */
    public WireRiderMapZone(String id, WireLocation wireLocation, String str, WireRiderMapZoneColors wireRiderMapZoneColors, String str2, List<? extends RiderMapZoneKind> list, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, AreaIconType areaIconType, String str11, String str12, AreaIconType areaIconType2, Integer num2, String str13, List<String> list2, List<String> list3, List<String> list4) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f66760id = id;
        this.centerPoint = wireLocation;
        this.label = str;
        this.colors = wireRiderMapZoneColors;
        this.zoomBehavior = str2;
        this.mapZoneKinds = list;
        this.notes = str3;
        this.title = str4;
        this.customTooltipTitle = str5;
        this.noParkingFineAmount = num;
        this.noParkingFineCurrency = str6;
        this.noParkingFineAlertTitle = str7;
        this.noParkingFineAlertMessage = str8;
        this.riderBarInRideMessageTitle = str9;
        this.riderBarInRideMessageBody = str10;
        this.riderBarInRideMessageIconType = areaIconType;
        this.riderBarNotInRideMessageTitle = str11;
        this.riderBarNotInRideMessageBody = str12;
        this.riderBarNotInRideMessageIconType = areaIconType2;
        this.maxSpeed = num2;
        this.partnerId = str13;
        this.areasMerged = list2;
        this.fleetIds = list3;
        this.areaKeys = list4;
    }

    public final String component1() {
        return this.f66760id;
    }

    public final Integer component10() {
        return this.noParkingFineAmount;
    }

    public final String component11() {
        return this.noParkingFineCurrency;
    }

    public final String component12() {
        return this.noParkingFineAlertTitle;
    }

    public final String component13() {
        return this.noParkingFineAlertMessage;
    }

    public final String component14() {
        return this.riderBarInRideMessageTitle;
    }

    public final String component15() {
        return this.riderBarInRideMessageBody;
    }

    public final AreaIconType component16() {
        return this.riderBarInRideMessageIconType;
    }

    public final String component17() {
        return this.riderBarNotInRideMessageTitle;
    }

    public final String component18() {
        return this.riderBarNotInRideMessageBody;
    }

    public final AreaIconType component19() {
        return this.riderBarNotInRideMessageIconType;
    }

    public final WireLocation component2() {
        return this.centerPoint;
    }

    public final Integer component20() {
        return this.maxSpeed;
    }

    public final String component21() {
        return this.partnerId;
    }

    public final List<String> component22() {
        return this.areasMerged;
    }

    public final List<String> component23() {
        return this.fleetIds;
    }

    public final List<String> component24() {
        return this.areaKeys;
    }

    public final String component3() {
        return this.label;
    }

    public final WireRiderMapZoneColors component4() {
        return this.colors;
    }

    public final String component5() {
        return this.zoomBehavior;
    }

    public final List<RiderMapZoneKind> component6() {
        return this.mapZoneKinds;
    }

    public final String component7() {
        return this.notes;
    }

    public final String component8() {
        return this.title;
    }

    public final String component9() {
        return this.customTooltipTitle;
    }

    public final WireRiderMapZone copy(String id, WireLocation wireLocation, String str, WireRiderMapZoneColors wireRiderMapZoneColors, String str2, List<? extends RiderMapZoneKind> list, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, AreaIconType areaIconType, String str11, String str12, AreaIconType areaIconType2, Integer num2, String str13, List<String> list2, List<String> list3, List<String> list4) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new WireRiderMapZone(id, wireLocation, str, wireRiderMapZoneColors, str2, list, str3, str4, str5, num, str6, str7, str8, str9, str10, areaIconType, str11, str12, areaIconType2, num2, str13, list2, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRiderMapZone) {
            WireRiderMapZone wireRiderMapZone = (WireRiderMapZone) obj;
            return Intrinsics.areEqual(this.f66760id, wireRiderMapZone.f66760id) && Intrinsics.areEqual(this.centerPoint, wireRiderMapZone.centerPoint) && Intrinsics.areEqual(this.label, wireRiderMapZone.label) && Intrinsics.areEqual(this.colors, wireRiderMapZone.colors) && Intrinsics.areEqual(this.zoomBehavior, wireRiderMapZone.zoomBehavior) && Intrinsics.areEqual(this.mapZoneKinds, wireRiderMapZone.mapZoneKinds) && Intrinsics.areEqual(this.notes, wireRiderMapZone.notes) && Intrinsics.areEqual(this.title, wireRiderMapZone.title) && Intrinsics.areEqual(this.customTooltipTitle, wireRiderMapZone.customTooltipTitle) && Intrinsics.areEqual(this.noParkingFineAmount, wireRiderMapZone.noParkingFineAmount) && Intrinsics.areEqual(this.noParkingFineCurrency, wireRiderMapZone.noParkingFineCurrency) && Intrinsics.areEqual(this.noParkingFineAlertTitle, wireRiderMapZone.noParkingFineAlertTitle) && Intrinsics.areEqual(this.noParkingFineAlertMessage, wireRiderMapZone.noParkingFineAlertMessage) && Intrinsics.areEqual(this.riderBarInRideMessageTitle, wireRiderMapZone.riderBarInRideMessageTitle) && Intrinsics.areEqual(this.riderBarInRideMessageBody, wireRiderMapZone.riderBarInRideMessageBody) && this.riderBarInRideMessageIconType == wireRiderMapZone.riderBarInRideMessageIconType && Intrinsics.areEqual(this.riderBarNotInRideMessageTitle, wireRiderMapZone.riderBarNotInRideMessageTitle) && Intrinsics.areEqual(this.riderBarNotInRideMessageBody, wireRiderMapZone.riderBarNotInRideMessageBody) && this.riderBarNotInRideMessageIconType == wireRiderMapZone.riderBarNotInRideMessageIconType && Intrinsics.areEqual(this.maxSpeed, wireRiderMapZone.maxSpeed) && Intrinsics.areEqual(this.partnerId, wireRiderMapZone.partnerId) && Intrinsics.areEqual(this.areasMerged, wireRiderMapZone.areasMerged) && Intrinsics.areEqual(this.fleetIds, wireRiderMapZone.fleetIds) && Intrinsics.areEqual(this.areaKeys, wireRiderMapZone.areaKeys);
        }
        return false;
    }

    public final List<String> getAreaKeys() {
        return this.areaKeys;
    }

    public final List<String> getAreasMerged() {
        return this.areasMerged;
    }

    public final WireLocation getCenterPoint() {
        return this.centerPoint;
    }

    public final WireRiderMapZoneColors getColors() {
        return this.colors;
    }

    public final String getCustomTooltipTitle() {
        return this.customTooltipTitle;
    }

    public final List<String> getFleetIds() {
        return this.fleetIds;
    }

    public final String getId() {
        return this.f66760id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<RiderMapZoneKind> getMapZoneKinds() {
        return this.mapZoneKinds;
    }

    public final Integer getMaxSpeed() {
        return this.maxSpeed;
    }

    public final String getNoParkingFineAlertMessage() {
        return this.noParkingFineAlertMessage;
    }

    public final String getNoParkingFineAlertTitle() {
        return this.noParkingFineAlertTitle;
    }

    public final Integer getNoParkingFineAmount() {
        return this.noParkingFineAmount;
    }

    public final String getNoParkingFineCurrency() {
        return this.noParkingFineCurrency;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final String getRiderBarInRideMessageBody() {
        return this.riderBarInRideMessageBody;
    }

    public final AreaIconType getRiderBarInRideMessageIconType() {
        return this.riderBarInRideMessageIconType;
    }

    public final String getRiderBarInRideMessageTitle() {
        return this.riderBarInRideMessageTitle;
    }

    public final String getRiderBarNotInRideMessageBody() {
        return this.riderBarNotInRideMessageBody;
    }

    public final AreaIconType getRiderBarNotInRideMessageIconType() {
        return this.riderBarNotInRideMessageIconType;
    }

    public final String getRiderBarNotInRideMessageTitle() {
        return this.riderBarNotInRideMessageTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getZoomBehavior() {
        return this.zoomBehavior;
    }

    public int hashCode() {
        int hashCode = this.f66760id.hashCode() * 31;
        WireLocation wireLocation = this.centerPoint;
        int hashCode2 = (hashCode + (wireLocation == null ? 0 : wireLocation.hashCode())) * 31;
        String str = this.label;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        WireRiderMapZoneColors wireRiderMapZoneColors = this.colors;
        int hashCode4 = (hashCode3 + (wireRiderMapZoneColors == null ? 0 : wireRiderMapZoneColors.hashCode())) * 31;
        String str2 = this.zoomBehavior;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<RiderMapZoneKind> list = this.mapZoneKinds;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.notes;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.customTooltipTitle;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.noParkingFineAmount;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.noParkingFineCurrency;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.noParkingFineAlertTitle;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.noParkingFineAlertMessage;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.riderBarInRideMessageTitle;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.riderBarInRideMessageBody;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        AreaIconType areaIconType = this.riderBarInRideMessageIconType;
        int hashCode16 = (hashCode15 + (areaIconType == null ? 0 : areaIconType.hashCode())) * 31;
        String str11 = this.riderBarNotInRideMessageTitle;
        int hashCode17 = (hashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.riderBarNotInRideMessageBody;
        int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        AreaIconType areaIconType2 = this.riderBarNotInRideMessageIconType;
        int hashCode19 = (hashCode18 + (areaIconType2 == null ? 0 : areaIconType2.hashCode())) * 31;
        Integer num2 = this.maxSpeed;
        int hashCode20 = (hashCode19 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str13 = this.partnerId;
        int hashCode21 = (hashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31;
        List<String> list2 = this.areasMerged;
        int hashCode22 = (hashCode21 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.fleetIds;
        int hashCode23 = (hashCode22 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.areaKeys;
        return hashCode23 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66760id;
        WireLocation wireLocation = this.centerPoint;
        String str2 = this.label;
        WireRiderMapZoneColors wireRiderMapZoneColors = this.colors;
        String str3 = this.zoomBehavior;
        List<RiderMapZoneKind> list = this.mapZoneKinds;
        String str4 = this.notes;
        String str5 = this.title;
        String str6 = this.customTooltipTitle;
        Integer num = this.noParkingFineAmount;
        String str7 = this.noParkingFineCurrency;
        String str8 = this.noParkingFineAlertTitle;
        String str9 = this.noParkingFineAlertMessage;
        String str10 = this.riderBarInRideMessageTitle;
        String str11 = this.riderBarInRideMessageBody;
        AreaIconType areaIconType = this.riderBarInRideMessageIconType;
        String str12 = this.riderBarNotInRideMessageTitle;
        String str13 = this.riderBarNotInRideMessageBody;
        AreaIconType areaIconType2 = this.riderBarNotInRideMessageIconType;
        Integer num2 = this.maxSpeed;
        String str14 = this.partnerId;
        List<String> list2 = this.areasMerged;
        List<String> list3 = this.fleetIds;
        List<String> list4 = this.areaKeys;
        return "WireRiderMapZone(id=" + str + ", centerPoint=" + wireLocation + ", label=" + str2 + ", colors=" + wireRiderMapZoneColors + ", zoomBehavior=" + str3 + ", mapZoneKinds=" + list + ", notes=" + str4 + ", title=" + str5 + ", customTooltipTitle=" + str6 + ", noParkingFineAmount=" + num + ", noParkingFineCurrency=" + str7 + ", noParkingFineAlertTitle=" + str8 + ", noParkingFineAlertMessage=" + str9 + ", riderBarInRideMessageTitle=" + str10 + ", riderBarInRideMessageBody=" + str11 + ", riderBarInRideMessageIconType=" + areaIconType + ", riderBarNotInRideMessageTitle=" + str12 + ", riderBarNotInRideMessageBody=" + str13 + ", riderBarNotInRideMessageIconType=" + areaIconType2 + ", maxSpeed=" + num2 + ", partnerId=" + str14 + ", areasMerged=" + list2 + ", fleetIds=" + list3 + ", areaKeys=" + list4 + ")";
    }

    public /* synthetic */ WireRiderMapZone(String str, WireLocation wireLocation, String str2, WireRiderMapZoneColors wireRiderMapZoneColors, String str3, List list, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, AreaIconType areaIconType, String str12, String str13, AreaIconType areaIconType2, Integer num2, String str14, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, wireLocation, str2, wireRiderMapZoneColors, str3, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (32768 & i) != 0 ? null : areaIconType, (65536 & i) != 0 ? null : str12, (131072 & i) != 0 ? null : str13, (262144 & i) != 0 ? null : areaIconType2, (524288 & i) != 0 ? null : num2, (1048576 & i) != 0 ? null : str14, (2097152 & i) != 0 ? null : list2, (4194304 & i) != 0 ? null : list3, (i & 8388608) != 0 ? null : list4);
    }
}
