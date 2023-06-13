package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/wire/WireWarehouseVehicle;", "", "birdId", "", "title", "statusIcon", "Lco/bird/android/model/constant/ClientIcon;", "statusIconBackgroundColor", "Lco/bird/android/model/wire/WireThemedColors;", "battery", "", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;I)V", "getBattery", "()I", "getBirdId", "()Ljava/lang/String;", "getStatusIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getStatusIconBackgroundColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireWarehouseVehicle {
    @JsonProperty("battery")
    @InterfaceC41208ft5("battery")
    private final int battery;
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("status_icon")
    @InterfaceC41208ft5("status_icon")
    private final ClientIcon statusIcon;
    @JsonProperty("status_icon_background_color")
    @InterfaceC41208ft5("status_icon_background_color")
    private final WireThemedColors statusIconBackgroundColor;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireWarehouseVehicle() {
        this(null, null, null, null, 0, 31, null);
    }

    public static /* synthetic */ WireWarehouseVehicle copy$default(WireWarehouseVehicle wireWarehouseVehicle, String str, String str2, ClientIcon clientIcon, WireThemedColors wireThemedColors, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = wireWarehouseVehicle.birdId;
        }
        if ((i2 & 2) != 0) {
            str2 = wireWarehouseVehicle.title;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            clientIcon = wireWarehouseVehicle.statusIcon;
        }
        ClientIcon clientIcon2 = clientIcon;
        if ((i2 & 8) != 0) {
            wireThemedColors = wireWarehouseVehicle.statusIconBackgroundColor;
        }
        WireThemedColors wireThemedColors2 = wireThemedColors;
        if ((i2 & 16) != 0) {
            i = wireWarehouseVehicle.battery;
        }
        return wireWarehouseVehicle.copy(str, str3, clientIcon2, wireThemedColors2, i);
    }

    public final String component1() {
        return this.birdId;
    }

    public final String component2() {
        return this.title;
    }

    public final ClientIcon component3() {
        return this.statusIcon;
    }

    public final WireThemedColors component4() {
        return this.statusIconBackgroundColor;
    }

    public final int component5() {
        return this.battery;
    }

    public final WireWarehouseVehicle copy(String birdId, String title, ClientIcon clientIcon, WireThemedColors wireThemedColors, int i) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(title, "title");
        return new WireWarehouseVehicle(birdId, title, clientIcon, wireThemedColors, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireWarehouseVehicle) {
            WireWarehouseVehicle wireWarehouseVehicle = (WireWarehouseVehicle) obj;
            return Intrinsics.areEqual(this.birdId, wireWarehouseVehicle.birdId) && Intrinsics.areEqual(this.title, wireWarehouseVehicle.title) && this.statusIcon == wireWarehouseVehicle.statusIcon && Intrinsics.areEqual(this.statusIconBackgroundColor, wireWarehouseVehicle.statusIconBackgroundColor) && this.battery == wireWarehouseVehicle.battery;
        }
        return false;
    }

    public final int getBattery() {
        return this.battery;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final ClientIcon getStatusIcon() {
        return this.statusIcon;
    }

    public final WireThemedColors getStatusIconBackgroundColor() {
        return this.statusIconBackgroundColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((this.birdId.hashCode() * 31) + this.title.hashCode()) * 31;
        ClientIcon clientIcon = this.statusIcon;
        int hashCode2 = (hashCode + (clientIcon == null ? 0 : clientIcon.hashCode())) * 31;
        WireThemedColors wireThemedColors = this.statusIconBackgroundColor;
        return ((hashCode2 + (wireThemedColors != null ? wireThemedColors.hashCode() : 0)) * 31) + Integer.hashCode(this.battery);
    }

    public String toString() {
        String str = this.birdId;
        String str2 = this.title;
        ClientIcon clientIcon = this.statusIcon;
        WireThemedColors wireThemedColors = this.statusIconBackgroundColor;
        int i = this.battery;
        return "WireWarehouseVehicle(birdId=" + str + ", title=" + str2 + ", statusIcon=" + clientIcon + ", statusIconBackgroundColor=" + wireThemedColors + ", battery=" + i + ")";
    }

    public WireWarehouseVehicle(String birdId, String title, ClientIcon clientIcon, WireThemedColors wireThemedColors, int i) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.birdId = birdId;
        this.title = title;
        this.statusIcon = clientIcon;
        this.statusIconBackgroundColor = wireThemedColors;
        this.battery = i;
    }

    public /* synthetic */ WireWarehouseVehicle(String str, String str2, ClientIcon clientIcon, WireThemedColors wireThemedColors, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? null : clientIcon, (i2 & 8) != 0 ? null : wireThemedColors, (i2 & 16) != 0 ? 0 : i);
    }
}
