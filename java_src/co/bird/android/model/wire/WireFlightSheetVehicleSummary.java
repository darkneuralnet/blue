package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdLocationSource;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.FlightSheetBadge;
import co.bird.android.model.constant.FlightSheetSummaryAction;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001a¢\u0006\u0002\u0010!J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0011HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u00105J\u0011\u0010E\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001aHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020 0\u001aHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\bHÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010O\u001a\u00020\u000fHÆ\u0003J\t\u0010P\u001a\u00020\u0011HÆ\u0003Jæ\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001aHÆ\u0001¢\u0006\u0002\u0010RJ\u0013\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010VHÖ\u0003J\t\u0010W\u001a\u00020\u0003HÖ\u0001J\t\u0010X\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0016\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010;R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010(R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010(¨\u0006Y"}, m28432d2 = {"Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;", "Lco/bird/android/model/wire/WireFlightSheetSection;", "idx", "", "title", "", "birdCode", RequestHeadersFactory.MODEL, "Lco/bird/android/model/constant/BirdModel;", "battery", "lastLocatedAt", "Lorg/joda/time/DateTime;", "lastLocatedSource", "Lco/bird/android/model/constant/BirdLocationSource;", "statusIcon", "Lco/bird/android/model/constant/ClientIcon;", "statusIconColor", "Lco/bird/android/model/wire/WireThemedColors;", "statusIconBackgroundColor", "statusTitle", "statusDescription", "marker", "Lco/bird/android/model/wire/WireMapMarker;", "ratingAverage", "", "campaigns", "", "Lco/bird/android/model/wire/WireFlightSheetCampaign;", "actions", "Lco/bird/android/model/constant/FlightSheetSummaryAction;", "markerLabel", "badges", "Lco/bird/android/model/constant/FlightSheetBadge;", "(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;ILorg/joda/time/DateTime;Lco/bird/android/model/constant/BirdLocationSource;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireMapMarker;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getActions", "()Ljava/util/List;", "getBadges", "getBattery", "()I", "getBirdCode", "()Ljava/lang/String;", "getCampaigns", "getIdx", "getLastLocatedAt", "()Lorg/joda/time/DateTime;", "getLastLocatedSource", "()Lco/bird/android/model/constant/BirdLocationSource;", "getMarker", "()Lco/bird/android/model/wire/WireMapMarker;", "getMarkerLabel", "getModel", "()Lco/bird/android/model/constant/BirdModel;", "getRatingAverage", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getStatusDescription", "getStatusIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getStatusIconBackgroundColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getStatusIconColor", "getStatusTitle", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;ILorg/joda/time/DateTime;Lco/bird/android/model/constant/BirdLocationSource;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireMapMarker;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFlightSheetVehicleSummary implements WireFlightSheetSection {
    @JsonProperty("actions")
    @InterfaceC41208ft5("actions")
    private final List<FlightSheetSummaryAction> actions;
    @JsonProperty("badges")
    @InterfaceC41208ft5("badges")
    private final List<FlightSheetBadge> badges;
    @JsonProperty("battery")
    @InterfaceC41208ft5("battery")
    private final int battery;
    @JsonProperty("bird_code")
    @InterfaceC41208ft5("bird_code")
    private final String birdCode;
    @JsonProperty("campaigns")
    @InterfaceC41208ft5("campaigns")
    private final List<WireFlightSheetCampaign> campaigns;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("last_located_at")
    @InterfaceC41208ft5("last_located_at")
    private final DateTime lastLocatedAt;
    @JsonProperty("last_located_source")
    @InterfaceC41208ft5("last_located_source")
    private final BirdLocationSource lastLocatedSource;
    @JsonProperty("marker")
    @InterfaceC41208ft5("marker")
    private final WireMapMarker marker;
    @JsonProperty("marker_label")
    @InterfaceC41208ft5("marker_label")
    private final String markerLabel;
    @JsonProperty(RequestHeadersFactory.MODEL)
    @InterfaceC41208ft5(RequestHeadersFactory.MODEL)
    private final BirdModel model;
    @JsonProperty("_rating_average")
    @InterfaceC41208ft5("_rating_average")
    private final Double ratingAverage;
    @JsonProperty("status_description")
    @InterfaceC41208ft5("status_description")
    private final String statusDescription;
    @JsonProperty("status_icon_value")
    @InterfaceC41208ft5("status_icon_value")
    private final ClientIcon statusIcon;
    @JsonProperty("status_icon_background_color")
    @InterfaceC41208ft5("status_icon_background_color")
    private final WireThemedColors statusIconBackgroundColor;
    @JsonProperty("status_icon_color")
    @InterfaceC41208ft5("status_icon_color")
    private final WireThemedColors statusIconColor;
    @JsonProperty("status_title")
    @InterfaceC41208ft5("status_title")
    private final String statusTitle;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireFlightSheetVehicleSummary() {
        this(0, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public final int component1() {
        return this.idx;
    }

    public final WireThemedColors component10() {
        return this.statusIconBackgroundColor;
    }

    public final String component11() {
        return this.statusTitle;
    }

    public final String component12() {
        return this.statusDescription;
    }

    public final WireMapMarker component13() {
        return this.marker;
    }

    public final Double component14() {
        return this.ratingAverage;
    }

    public final List<WireFlightSheetCampaign> component15() {
        return this.campaigns;
    }

    public final List<FlightSheetSummaryAction> component16() {
        return this.actions;
    }

    public final String component17() {
        return this.markerLabel;
    }

    public final List<FlightSheetBadge> component18() {
        return this.badges;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.birdCode;
    }

    public final BirdModel component4() {
        return this.model;
    }

    public final int component5() {
        return this.battery;
    }

    public final DateTime component6() {
        return this.lastLocatedAt;
    }

    public final BirdLocationSource component7() {
        return this.lastLocatedSource;
    }

    public final ClientIcon component8() {
        return this.statusIcon;
    }

    public final WireThemedColors component9() {
        return this.statusIconColor;
    }

    public final WireFlightSheetVehicleSummary copy(int i, String str, String birdCode, BirdModel model, int i2, DateTime dateTime, BirdLocationSource birdLocationSource, ClientIcon statusIcon, WireThemedColors statusIconColor, WireThemedColors statusIconBackgroundColor, String str2, String str3, WireMapMarker wireMapMarker, Double d, List<WireFlightSheetCampaign> list, List<? extends FlightSheetSummaryAction> actions, String str4, List<? extends FlightSheetBadge> badges) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
        Intrinsics.checkNotNullParameter(statusIconColor, "statusIconColor");
        Intrinsics.checkNotNullParameter(statusIconBackgroundColor, "statusIconBackgroundColor");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(badges, "badges");
        return new WireFlightSheetVehicleSummary(i, str, birdCode, model, i2, dateTime, birdLocationSource, statusIcon, statusIconColor, statusIconBackgroundColor, str2, str3, wireMapMarker, d, list, actions, str4, badges);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFlightSheetVehicleSummary) {
            WireFlightSheetVehicleSummary wireFlightSheetVehicleSummary = (WireFlightSheetVehicleSummary) obj;
            return this.idx == wireFlightSheetVehicleSummary.idx && Intrinsics.areEqual(this.title, wireFlightSheetVehicleSummary.title) && Intrinsics.areEqual(this.birdCode, wireFlightSheetVehicleSummary.birdCode) && this.model == wireFlightSheetVehicleSummary.model && this.battery == wireFlightSheetVehicleSummary.battery && Intrinsics.areEqual(this.lastLocatedAt, wireFlightSheetVehicleSummary.lastLocatedAt) && this.lastLocatedSource == wireFlightSheetVehicleSummary.lastLocatedSource && this.statusIcon == wireFlightSheetVehicleSummary.statusIcon && Intrinsics.areEqual(this.statusIconColor, wireFlightSheetVehicleSummary.statusIconColor) && Intrinsics.areEqual(this.statusIconBackgroundColor, wireFlightSheetVehicleSummary.statusIconBackgroundColor) && Intrinsics.areEqual(this.statusTitle, wireFlightSheetVehicleSummary.statusTitle) && Intrinsics.areEqual(this.statusDescription, wireFlightSheetVehicleSummary.statusDescription) && Intrinsics.areEqual(this.marker, wireFlightSheetVehicleSummary.marker) && Intrinsics.areEqual((Object) this.ratingAverage, (Object) wireFlightSheetVehicleSummary.ratingAverage) && Intrinsics.areEqual(this.campaigns, wireFlightSheetVehicleSummary.campaigns) && Intrinsics.areEqual(this.actions, wireFlightSheetVehicleSummary.actions) && Intrinsics.areEqual(this.markerLabel, wireFlightSheetVehicleSummary.markerLabel) && Intrinsics.areEqual(this.badges, wireFlightSheetVehicleSummary.badges);
        }
        return false;
    }

    public final List<FlightSheetSummaryAction> getActions() {
        return this.actions;
    }

    public final List<FlightSheetBadge> getBadges() {
        return this.badges;
    }

    public final int getBattery() {
        return this.battery;
    }

    public final String getBirdCode() {
        return this.birdCode;
    }

    public final List<WireFlightSheetCampaign> getCampaigns() {
        return this.campaigns;
    }

    @Override // co.bird.android.model.wire.WireFlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    public final DateTime getLastLocatedAt() {
        return this.lastLocatedAt;
    }

    public final BirdLocationSource getLastLocatedSource() {
        return this.lastLocatedSource;
    }

    public final WireMapMarker getMarker() {
        return this.marker;
    }

    public final String getMarkerLabel() {
        return this.markerLabel;
    }

    public final BirdModel getModel() {
        return this.model;
    }

    public final Double getRatingAverage() {
        return this.ratingAverage;
    }

    public final String getStatusDescription() {
        return this.statusDescription;
    }

    public final ClientIcon getStatusIcon() {
        return this.statusIcon;
    }

    public final WireThemedColors getStatusIconBackgroundColor() {
        return this.statusIconBackgroundColor;
    }

    public final WireThemedColors getStatusIconColor() {
        return this.statusIconColor;
    }

    public final String getStatusTitle() {
        return this.statusTitle;
    }

    @Override // co.bird.android.model.wire.WireFlightSheetSection
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.idx) * 31;
        String str = this.title;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.birdCode.hashCode()) * 31) + this.model.hashCode()) * 31) + Integer.hashCode(this.battery)) * 31;
        DateTime dateTime = this.lastLocatedAt;
        int hashCode3 = (hashCode2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        BirdLocationSource birdLocationSource = this.lastLocatedSource;
        int hashCode4 = (((((((hashCode3 + (birdLocationSource == null ? 0 : birdLocationSource.hashCode())) * 31) + this.statusIcon.hashCode()) * 31) + this.statusIconColor.hashCode()) * 31) + this.statusIconBackgroundColor.hashCode()) * 31;
        String str2 = this.statusTitle;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.statusDescription;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        WireMapMarker wireMapMarker = this.marker;
        int hashCode7 = (hashCode6 + (wireMapMarker == null ? 0 : wireMapMarker.hashCode())) * 31;
        Double d = this.ratingAverage;
        int hashCode8 = (hashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        List<WireFlightSheetCampaign> list = this.campaigns;
        int hashCode9 = (((hashCode8 + (list == null ? 0 : list.hashCode())) * 31) + this.actions.hashCode()) * 31;
        String str4 = this.markerLabel;
        return ((hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.badges.hashCode();
    }

    public String toString() {
        int i = this.idx;
        String str = this.title;
        String str2 = this.birdCode;
        BirdModel birdModel = this.model;
        int i2 = this.battery;
        DateTime dateTime = this.lastLocatedAt;
        BirdLocationSource birdLocationSource = this.lastLocatedSource;
        ClientIcon clientIcon = this.statusIcon;
        WireThemedColors wireThemedColors = this.statusIconColor;
        WireThemedColors wireThemedColors2 = this.statusIconBackgroundColor;
        String str3 = this.statusTitle;
        String str4 = this.statusDescription;
        WireMapMarker wireMapMarker = this.marker;
        Double d = this.ratingAverage;
        List<WireFlightSheetCampaign> list = this.campaigns;
        List<FlightSheetSummaryAction> list2 = this.actions;
        String str5 = this.markerLabel;
        List<FlightSheetBadge> list3 = this.badges;
        return "WireFlightSheetVehicleSummary(idx=" + i + ", title=" + str + ", birdCode=" + str2 + ", model=" + birdModel + ", battery=" + i2 + ", lastLocatedAt=" + dateTime + ", lastLocatedSource=" + birdLocationSource + ", statusIcon=" + clientIcon + ", statusIconColor=" + wireThemedColors + ", statusIconBackgroundColor=" + wireThemedColors2 + ", statusTitle=" + str3 + ", statusDescription=" + str4 + ", marker=" + wireMapMarker + ", ratingAverage=" + d + ", campaigns=" + list + ", actions=" + list2 + ", markerLabel=" + str5 + ", badges=" + list3 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WireFlightSheetVehicleSummary(int i, String str, String birdCode, BirdModel model, int i2, DateTime dateTime, BirdLocationSource birdLocationSource, ClientIcon statusIcon, WireThemedColors statusIconColor, WireThemedColors statusIconBackgroundColor, String str2, String str3, WireMapMarker wireMapMarker, Double d, List<WireFlightSheetCampaign> list, List<? extends FlightSheetSummaryAction> actions, String str4, List<? extends FlightSheetBadge> badges) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
        Intrinsics.checkNotNullParameter(statusIconColor, "statusIconColor");
        Intrinsics.checkNotNullParameter(statusIconBackgroundColor, "statusIconBackgroundColor");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(badges, "badges");
        this.idx = i;
        this.title = str;
        this.birdCode = birdCode;
        this.model = model;
        this.battery = i2;
        this.lastLocatedAt = dateTime;
        this.lastLocatedSource = birdLocationSource;
        this.statusIcon = statusIcon;
        this.statusIconColor = statusIconColor;
        this.statusIconBackgroundColor = statusIconBackgroundColor;
        this.statusTitle = str2;
        this.statusDescription = str3;
        this.marker = wireMapMarker;
        this.ratingAverage = d;
        this.campaigns = list;
        this.actions = actions;
        this.markerLabel = str4;
        this.badges = badges;
    }

    public /* synthetic */ WireFlightSheetVehicleSummary(int i, String str, String str2, BirdModel birdModel, int i2, DateTime dateTime, BirdLocationSource birdLocationSource, ClientIcon clientIcon, WireThemedColors wireThemedColors, WireThemedColors wireThemedColors2, String str3, String str4, WireMapMarker wireMapMarker, Double d, List list, List list2, String str5, List list3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? Integer.MAX_VALUE : i, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? BirdModel.M365 : birdModel, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : dateTime, (i3 & 64) != 0 ? null : birdLocationSource, (i3 & 128) != 0 ? ClientIcon.UNKNOWN : clientIcon, (i3 & 256) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors, (i3 & 512) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors2, (i3 & 1024) != 0 ? null : str3, (i3 & 2048) != 0 ? null : str4, (i3 & 4096) != 0 ? null : wireMapMarker, (i3 & 8192) != 0 ? null : d, (i3 & 16384) != 0 ? null : list, (i3 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i3 & 65536) != 0 ? null : str5, (i3 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3);
    }
}
