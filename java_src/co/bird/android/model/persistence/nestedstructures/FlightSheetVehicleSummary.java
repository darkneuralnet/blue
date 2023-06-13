package co.bird.android.model.persistence.nestedstructures;

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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0018¢\u0006\u0002\u0010\u001fJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0011HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u00101J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0018HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010J\u001a\u00020\u000fHÆ\u0003J\t\u0010K\u001a\u00020\u0011HÆ\u0003JÚ\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0018HÆ\u0001¢\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020\u0003HÖ\u0001J\t\u0010S\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010&R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00107R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010&R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010&¨\u0006T"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetSection;", "idx", "", "title", "", "birdCode", RequestHeadersFactory.MODEL, "Lco/bird/android/model/constant/BirdModel;", "battery", "lastLocatedAt", "Lorg/joda/time/DateTime;", "lastLocatedSource", "Lco/bird/android/model/constant/BirdLocationSource;", "statusIcon", "Lco/bird/android/model/constant/ClientIcon;", "statusIconColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "statusIconBackgroundColor", "statusTitle", "statusDescription", "ratingAverage", "", "campaigns", "", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetCampaign;", "actions", "Lco/bird/android/model/constant/FlightSheetSummaryAction;", "markerLabel", "badges", "Lco/bird/android/model/constant/FlightSheetBadge;", "(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;ILorg/joda/time/DateTime;Lco/bird/android/model/constant/BirdLocationSource;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getActions", "()Ljava/util/List;", "getBadges", "getBattery", "()I", "getBirdCode", "()Ljava/lang/String;", "getCampaigns", "getIdx", "getLastLocatedAt", "()Lorg/joda/time/DateTime;", "getLastLocatedSource", "()Lco/bird/android/model/constant/BirdLocationSource;", "getMarkerLabel", "getModel", "()Lco/bird/android/model/constant/BirdModel;", "getRatingAverage", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getStatusDescription", "getStatusIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getStatusIconBackgroundColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getStatusIconColor", "getStatusTitle", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;ILorg/joda/time/DateTime;Lco/bird/android/model/constant/BirdLocationSource;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FlightSheetVehicleSummary implements FlightSheetSection {
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
    private final List<FlightSheetCampaign> campaigns;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("last_located_at")
    @InterfaceC41208ft5("last_located_at")
    private final DateTime lastLocatedAt;
    @JsonProperty("last_located_source")
    @InterfaceC41208ft5("last_located_source")
    private final BirdLocationSource lastLocatedSource;
    @JsonProperty("marker_label")
    @InterfaceC41208ft5("marker_label")
    private final String markerLabel;
    @JsonProperty(RequestHeadersFactory.MODEL)
    @InterfaceC41208ft5(RequestHeadersFactory.MODEL)
    private final BirdModel model;
    @JsonProperty("rating_average")
    @InterfaceC41208ft5("rating_average")
    private final Double ratingAverage;
    @JsonProperty("status_description")
    @InterfaceC41208ft5("status_description")
    private final String statusDescription;
    @JsonProperty("status_icon")
    @InterfaceC41208ft5("status_icon")
    private final ClientIcon statusIcon;
    @JsonProperty("status_icon_background_color")
    @InterfaceC41208ft5("status_icon_background_color")
    private final ThemedColors statusIconBackgroundColor;
    @JsonProperty("status_icon_color")
    @InterfaceC41208ft5("status_icon_color")
    private final ThemedColors statusIconColor;
    @JsonProperty("status_title")
    @InterfaceC41208ft5("status_title")
    private final String statusTitle;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public FlightSheetVehicleSummary(int i, String str, String birdCode, BirdModel model, int i2, DateTime dateTime, BirdLocationSource birdLocationSource, ClientIcon statusIcon, ThemedColors statusIconColor, ThemedColors statusIconBackgroundColor, String str2, String str3, Double d, List<FlightSheetCampaign> list, List<? extends FlightSheetSummaryAction> actions, String str4, List<? extends FlightSheetBadge> badges) {
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
        this.ratingAverage = d;
        this.campaigns = list;
        this.actions = actions;
        this.markerLabel = str4;
        this.badges = badges;
    }

    public final int component1() {
        return this.idx;
    }

    public final ThemedColors component10() {
        return this.statusIconBackgroundColor;
    }

    public final String component11() {
        return this.statusTitle;
    }

    public final String component12() {
        return this.statusDescription;
    }

    public final Double component13() {
        return this.ratingAverage;
    }

    public final List<FlightSheetCampaign> component14() {
        return this.campaigns;
    }

    public final List<FlightSheetSummaryAction> component15() {
        return this.actions;
    }

    public final String component16() {
        return this.markerLabel;
    }

    public final List<FlightSheetBadge> component17() {
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

    public final ThemedColors component9() {
        return this.statusIconColor;
    }

    public final FlightSheetVehicleSummary copy(int i, String str, String birdCode, BirdModel model, int i2, DateTime dateTime, BirdLocationSource birdLocationSource, ClientIcon statusIcon, ThemedColors statusIconColor, ThemedColors statusIconBackgroundColor, String str2, String str3, Double d, List<FlightSheetCampaign> list, List<? extends FlightSheetSummaryAction> actions, String str4, List<? extends FlightSheetBadge> badges) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
        Intrinsics.checkNotNullParameter(statusIconColor, "statusIconColor");
        Intrinsics.checkNotNullParameter(statusIconBackgroundColor, "statusIconBackgroundColor");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(badges, "badges");
        return new FlightSheetVehicleSummary(i, str, birdCode, model, i2, dateTime, birdLocationSource, statusIcon, statusIconColor, statusIconBackgroundColor, str2, str3, d, list, actions, str4, badges);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlightSheetVehicleSummary) {
            FlightSheetVehicleSummary flightSheetVehicleSummary = (FlightSheetVehicleSummary) obj;
            return this.idx == flightSheetVehicleSummary.idx && Intrinsics.areEqual(this.title, flightSheetVehicleSummary.title) && Intrinsics.areEqual(this.birdCode, flightSheetVehicleSummary.birdCode) && this.model == flightSheetVehicleSummary.model && this.battery == flightSheetVehicleSummary.battery && Intrinsics.areEqual(this.lastLocatedAt, flightSheetVehicleSummary.lastLocatedAt) && this.lastLocatedSource == flightSheetVehicleSummary.lastLocatedSource && this.statusIcon == flightSheetVehicleSummary.statusIcon && Intrinsics.areEqual(this.statusIconColor, flightSheetVehicleSummary.statusIconColor) && Intrinsics.areEqual(this.statusIconBackgroundColor, flightSheetVehicleSummary.statusIconBackgroundColor) && Intrinsics.areEqual(this.statusTitle, flightSheetVehicleSummary.statusTitle) && Intrinsics.areEqual(this.statusDescription, flightSheetVehicleSummary.statusDescription) && Intrinsics.areEqual((Object) this.ratingAverage, (Object) flightSheetVehicleSummary.ratingAverage) && Intrinsics.areEqual(this.campaigns, flightSheetVehicleSummary.campaigns) && Intrinsics.areEqual(this.actions, flightSheetVehicleSummary.actions) && Intrinsics.areEqual(this.markerLabel, flightSheetVehicleSummary.markerLabel) && Intrinsics.areEqual(this.badges, flightSheetVehicleSummary.badges);
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

    public final List<FlightSheetCampaign> getCampaigns() {
        return this.campaigns;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.FlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    public final DateTime getLastLocatedAt() {
        return this.lastLocatedAt;
    }

    public final BirdLocationSource getLastLocatedSource() {
        return this.lastLocatedSource;
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

    public final ThemedColors getStatusIconBackgroundColor() {
        return this.statusIconBackgroundColor;
    }

    public final ThemedColors getStatusIconColor() {
        return this.statusIconColor;
    }

    public final String getStatusTitle() {
        return this.statusTitle;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.FlightSheetSection
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
        Double d = this.ratingAverage;
        int hashCode7 = (hashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        List<FlightSheetCampaign> list = this.campaigns;
        int hashCode8 = (((hashCode7 + (list == null ? 0 : list.hashCode())) * 31) + this.actions.hashCode()) * 31;
        String str4 = this.markerLabel;
        return ((hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.badges.hashCode();
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
        ThemedColors themedColors = this.statusIconColor;
        ThemedColors themedColors2 = this.statusIconBackgroundColor;
        String str3 = this.statusTitle;
        String str4 = this.statusDescription;
        Double d = this.ratingAverage;
        List<FlightSheetCampaign> list = this.campaigns;
        List<FlightSheetSummaryAction> list2 = this.actions;
        String str5 = this.markerLabel;
        List<FlightSheetBadge> list3 = this.badges;
        return "FlightSheetVehicleSummary(idx=" + i + ", title=" + str + ", birdCode=" + str2 + ", model=" + birdModel + ", battery=" + i2 + ", lastLocatedAt=" + dateTime + ", lastLocatedSource=" + birdLocationSource + ", statusIcon=" + clientIcon + ", statusIconColor=" + themedColors + ", statusIconBackgroundColor=" + themedColors2 + ", statusTitle=" + str3 + ", statusDescription=" + str4 + ", ratingAverage=" + d + ", campaigns=" + list + ", actions=" + list2 + ", markerLabel=" + str5 + ", badges=" + list3 + ")";
    }

    public /* synthetic */ FlightSheetVehicleSummary(int i, String str, String str2, BirdModel birdModel, int i2, DateTime dateTime, BirdLocationSource birdLocationSource, ClientIcon clientIcon, ThemedColors themedColors, ThemedColors themedColors2, String str3, String str4, Double d, List list, List list2, String str5, List list3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? "" : str2, birdModel, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : dateTime, (i3 & 64) != 0 ? null : birdLocationSource, clientIcon, themedColors, themedColors2, (i3 & 1024) != 0 ? null : str3, (i3 & 2048) != 0 ? null : str4, (i3 & 4096) != 0 ? null : d, (i3 & 8192) != 0 ? null : list, list2, str5, list3);
    }
}
