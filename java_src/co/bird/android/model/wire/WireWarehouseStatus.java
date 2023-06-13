package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/wire/WireWarehouseStatus;", "Lco/bird/android/model/wire/WireWarehouseFlightSheetSection;", "idx", "", "title", "", "details", "icon", "Lco/bird/android/model/constant/ClientIcon;", "iconBackgroundColor", "Lco/bird/android/model/wire/WireThemedColors;", "(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;)V", "getDetails", "()Ljava/lang/String;", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconBackgroundColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getIdx", "()I", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireWarehouseStatus implements WireWarehouseFlightSheetSection {
    @JsonProperty("details")
    @InterfaceC41208ft5("details")
    private final String details;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;
    @JsonProperty("icon_background_color")
    @InterfaceC41208ft5("icon_background_color")
    private final WireThemedColors iconBackgroundColor;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireWarehouseStatus() {
        this(0, null, null, null, null, 31, null);
    }

    public static /* synthetic */ WireWarehouseStatus copy$default(WireWarehouseStatus wireWarehouseStatus, int i, String str, String str2, ClientIcon clientIcon, WireThemedColors wireThemedColors, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wireWarehouseStatus.idx;
        }
        if ((i2 & 2) != 0) {
            str = wireWarehouseStatus.title;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = wireWarehouseStatus.details;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            clientIcon = wireWarehouseStatus.icon;
        }
        ClientIcon clientIcon2 = clientIcon;
        if ((i2 & 16) != 0) {
            wireThemedColors = wireWarehouseStatus.iconBackgroundColor;
        }
        return wireWarehouseStatus.copy(i, str3, str4, clientIcon2, wireThemedColors);
    }

    public final int component1() {
        return this.idx;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.details;
    }

    public final ClientIcon component4() {
        return this.icon;
    }

    public final WireThemedColors component5() {
        return this.iconBackgroundColor;
    }

    public final WireWarehouseStatus copy(int i, String title, String details, ClientIcon clientIcon, WireThemedColors wireThemedColors) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        return new WireWarehouseStatus(i, title, details, clientIcon, wireThemedColors);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireWarehouseStatus) {
            WireWarehouseStatus wireWarehouseStatus = (WireWarehouseStatus) obj;
            return this.idx == wireWarehouseStatus.idx && Intrinsics.areEqual(this.title, wireWarehouseStatus.title) && Intrinsics.areEqual(this.details, wireWarehouseStatus.details) && this.icon == wireWarehouseStatus.icon && Intrinsics.areEqual(this.iconBackgroundColor, wireWarehouseStatus.iconBackgroundColor);
        }
        return false;
    }

    public final String getDetails() {
        return this.details;
    }

    public final ClientIcon getIcon() {
        return this.icon;
    }

    public final WireThemedColors getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    @Override // co.bird.android.model.wire.WireWarehouseFlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.idx) * 31) + this.title.hashCode()) * 31) + this.details.hashCode()) * 31;
        ClientIcon clientIcon = this.icon;
        int hashCode2 = (hashCode + (clientIcon == null ? 0 : clientIcon.hashCode())) * 31;
        WireThemedColors wireThemedColors = this.iconBackgroundColor;
        return hashCode2 + (wireThemedColors != null ? wireThemedColors.hashCode() : 0);
    }

    public String toString() {
        int i = this.idx;
        String str = this.title;
        String str2 = this.details;
        ClientIcon clientIcon = this.icon;
        WireThemedColors wireThemedColors = this.iconBackgroundColor;
        return "WireWarehouseStatus(idx=" + i + ", title=" + str + ", details=" + str2 + ", icon=" + clientIcon + ", iconBackgroundColor=" + wireThemedColors + ")";
    }

    public WireWarehouseStatus(int i, String title, String details, ClientIcon clientIcon, WireThemedColors wireThemedColors) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        this.idx = i;
        this.title = title;
        this.details = details;
        this.icon = clientIcon;
        this.iconBackgroundColor = wireThemedColors;
    }

    public /* synthetic */ WireWarehouseStatus(int i, String str, String str2, ClientIcon clientIcon, WireThemedColors wireThemedColors, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) == 0 ? str2 : "", (i2 & 8) != 0 ? null : clientIcon, (i2 & 16) != 0 ? null : wireThemedColors);
    }
}