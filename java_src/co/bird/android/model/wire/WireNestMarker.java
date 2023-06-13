package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.NestIcon;
import co.bird.android.model.constant.NestProminence;
import co.bird.android.model.constant.NestViewState;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.location.places.Place;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u007f\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0007HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006:"}, m28432d2 = {"Lco/bird/android/model/wire/WireNestMarker;", "", "id", "", "location", "Lco/bird/android/model/wire/WireCoordinate;", "capacity", "", TransferTable.COLUMN_STATE, "Lco/bird/android/model/constant/NestViewState;", "icon", "Lco/bird/android/model/constant/NestIcon;", "secondaryIcon", "Lco/bird/android/model/constant/ClientIcon;", "secondaryIconColor", "Lco/bird/android/model/wire/WireThemedColors;", "secondaryIconBackgroundColor", "prominence", "Lco/bird/android/model/constant/NestProminence;", "availableSpaceDetails", "", "Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;", "(Ljava/lang/String;Lco/bird/android/model/wire/WireCoordinate;ILco/bird/android/model/constant/NestViewState;Lco/bird/android/model/constant/NestIcon;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/constant/NestProminence;Ljava/util/List;)V", "getAvailableSpaceDetails", "()Ljava/util/List;", "getCapacity", "()I", "getIcon", "()Lco/bird/android/model/constant/NestIcon;", "getId", "()Ljava/lang/String;", "getLocation", "()Lco/bird/android/model/wire/WireCoordinate;", "getProminence", "()Lco/bird/android/model/constant/NestProminence;", "getSecondaryIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getSecondaryIconBackgroundColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getSecondaryIconColor", "getState", "()Lco/bird/android/model/constant/NestViewState;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNestMarker {
    @JsonProperty("available_space_details")
    @InterfaceC41208ft5("available_space_details")
    private final List<WireNestAvailableSpaceDetail> availableSpaceDetails;
    @JsonProperty("capacity")
    @InterfaceC41208ft5("capacity")
    private final int capacity;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final NestIcon icon;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66740id;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireCoordinate location;
    @JsonProperty("prominence")
    @InterfaceC41208ft5("prominence")
    private final NestProminence prominence;
    @JsonProperty("secondary_icon")
    @InterfaceC41208ft5("secondary_icon")
    private final ClientIcon secondaryIcon;
    @JsonProperty("secondary_icon_background_color")
    @InterfaceC41208ft5("secondary_icon_background_color")
    private final WireThemedColors secondaryIconBackgroundColor;
    @JsonProperty("secondary_icon_color")
    @InterfaceC41208ft5("secondary_icon_color")
    private final WireThemedColors secondaryIconColor;
    @JsonProperty(TransferTable.COLUMN_STATE)
    @InterfaceC41208ft5(TransferTable.COLUMN_STATE)
    private final NestViewState state;

    public WireNestMarker() {
        this(null, null, 0, null, null, null, null, null, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
    }

    public final String component1() {
        return this.f66740id;
    }

    public final List<WireNestAvailableSpaceDetail> component10() {
        return this.availableSpaceDetails;
    }

    public final WireCoordinate component2() {
        return this.location;
    }

    public final int component3() {
        return this.capacity;
    }

    public final NestViewState component4() {
        return this.state;
    }

    public final NestIcon component5() {
        return this.icon;
    }

    public final ClientIcon component6() {
        return this.secondaryIcon;
    }

    public final WireThemedColors component7() {
        return this.secondaryIconColor;
    }

    public final WireThemedColors component8() {
        return this.secondaryIconBackgroundColor;
    }

    public final NestProminence component9() {
        return this.prominence;
    }

    public final WireNestMarker copy(String id, WireCoordinate location, int i, NestViewState nestViewState, NestIcon nestIcon, ClientIcon clientIcon, WireThemedColors wireThemedColors, WireThemedColors wireThemedColors2, NestProminence nestProminence, List<WireNestAvailableSpaceDetail> availableSpaceDetails) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(availableSpaceDetails, "availableSpaceDetails");
        return new WireNestMarker(id, location, i, nestViewState, nestIcon, clientIcon, wireThemedColors, wireThemedColors2, nestProminence, availableSpaceDetails);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireNestMarker) {
            WireNestMarker wireNestMarker = (WireNestMarker) obj;
            return Intrinsics.areEqual(this.f66740id, wireNestMarker.f66740id) && Intrinsics.areEqual(this.location, wireNestMarker.location) && this.capacity == wireNestMarker.capacity && this.state == wireNestMarker.state && this.icon == wireNestMarker.icon && this.secondaryIcon == wireNestMarker.secondaryIcon && Intrinsics.areEqual(this.secondaryIconColor, wireNestMarker.secondaryIconColor) && Intrinsics.areEqual(this.secondaryIconBackgroundColor, wireNestMarker.secondaryIconBackgroundColor) && this.prominence == wireNestMarker.prominence && Intrinsics.areEqual(this.availableSpaceDetails, wireNestMarker.availableSpaceDetails);
        }
        return false;
    }

    public final List<WireNestAvailableSpaceDetail> getAvailableSpaceDetails() {
        return this.availableSpaceDetails;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final NestIcon getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.f66740id;
    }

    public final WireCoordinate getLocation() {
        return this.location;
    }

    public final NestProminence getProminence() {
        return this.prominence;
    }

    public final ClientIcon getSecondaryIcon() {
        return this.secondaryIcon;
    }

    public final WireThemedColors getSecondaryIconBackgroundColor() {
        return this.secondaryIconBackgroundColor;
    }

    public final WireThemedColors getSecondaryIconColor() {
        return this.secondaryIconColor;
    }

    public final NestViewState getState() {
        return this.state;
    }

    public int hashCode() {
        int hashCode = ((((this.f66740id.hashCode() * 31) + this.location.hashCode()) * 31) + Integer.hashCode(this.capacity)) * 31;
        NestViewState nestViewState = this.state;
        int hashCode2 = (hashCode + (nestViewState == null ? 0 : nestViewState.hashCode())) * 31;
        NestIcon nestIcon = this.icon;
        int hashCode3 = (hashCode2 + (nestIcon == null ? 0 : nestIcon.hashCode())) * 31;
        ClientIcon clientIcon = this.secondaryIcon;
        int hashCode4 = (hashCode3 + (clientIcon == null ? 0 : clientIcon.hashCode())) * 31;
        WireThemedColors wireThemedColors = this.secondaryIconColor;
        int hashCode5 = (hashCode4 + (wireThemedColors == null ? 0 : wireThemedColors.hashCode())) * 31;
        WireThemedColors wireThemedColors2 = this.secondaryIconBackgroundColor;
        int hashCode6 = (hashCode5 + (wireThemedColors2 == null ? 0 : wireThemedColors2.hashCode())) * 31;
        NestProminence nestProminence = this.prominence;
        return ((hashCode6 + (nestProminence != null ? nestProminence.hashCode() : 0)) * 31) + this.availableSpaceDetails.hashCode();
    }

    public String toString() {
        String str = this.f66740id;
        WireCoordinate wireCoordinate = this.location;
        int i = this.capacity;
        NestViewState nestViewState = this.state;
        NestIcon nestIcon = this.icon;
        ClientIcon clientIcon = this.secondaryIcon;
        WireThemedColors wireThemedColors = this.secondaryIconColor;
        WireThemedColors wireThemedColors2 = this.secondaryIconBackgroundColor;
        NestProminence nestProminence = this.prominence;
        List<WireNestAvailableSpaceDetail> list = this.availableSpaceDetails;
        return "WireNestMarker(id=" + str + ", location=" + wireCoordinate + ", capacity=" + i + ", state=" + nestViewState + ", icon=" + nestIcon + ", secondaryIcon=" + clientIcon + ", secondaryIconColor=" + wireThemedColors + ", secondaryIconBackgroundColor=" + wireThemedColors2 + ", prominence=" + nestProminence + ", availableSpaceDetails=" + list + ")";
    }

    public WireNestMarker(String id, WireCoordinate location, int i, NestViewState nestViewState, NestIcon nestIcon, ClientIcon clientIcon, WireThemedColors wireThemedColors, WireThemedColors wireThemedColors2, NestProminence nestProminence, List<WireNestAvailableSpaceDetail> availableSpaceDetails) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(availableSpaceDetails, "availableSpaceDetails");
        this.f66740id = id;
        this.location = location;
        this.capacity = i;
        this.state = nestViewState;
        this.icon = nestIcon;
        this.secondaryIcon = clientIcon;
        this.secondaryIconColor = wireThemedColors;
        this.secondaryIconBackgroundColor = wireThemedColors2;
        this.prominence = nestProminence;
        this.availableSpaceDetails = availableSpaceDetails;
    }

    public /* synthetic */ WireNestMarker(String str, WireCoordinate wireCoordinate, int i, NestViewState nestViewState, NestIcon nestIcon, ClientIcon clientIcon, WireThemedColors wireThemedColors, WireThemedColors wireThemedColors2, NestProminence nestProminence, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? new WireCoordinate(0.0d, 0.0d, 3, null) : wireCoordinate, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : nestViewState, (i2 & 16) != 0 ? null : nestIcon, (i2 & 32) != 0 ? null : clientIcon, (i2 & 64) != 0 ? null : wireThemedColors, (i2 & 128) != 0 ? null : wireThemedColors2, (i2 & 256) == 0 ? nestProminence : null, (i2 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
