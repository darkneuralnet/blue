package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Point;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0083\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00103\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001a¨\u00068"}, m28432d2 = {"Lco/bird/android/model/wire/WireReleaseAssignment;", "", "id", "", "zoneId", "zoneCenterPoint", "Lco/bird/android/model/Point;", "title", "description", "dueAt", "canCancel", "", "birdCodes", "", "icon", "Lco/bird/android/model/constant/ClientIcon;", "iconColor", "Lco/bird/android/model/wire/WireThemedColors;", "info", "Lco/bird/android/model/wire/WireReleaseInfo;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/Point;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireReleaseInfo;)V", "getBirdCodes", "()Ljava/util/List;", "getCanCancel", "()Z", "getDescription", "()Ljava/lang/String;", "getDueAt", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getId", "getInfo", "()Lco/bird/android/model/wire/WireReleaseInfo;", "getTitle", "getZoneCenterPoint", "()Lco/bird/android/model/Point;", "getZoneId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireReleaseAssignment {
    @JsonProperty("bird_codes")
    @InterfaceC41208ft5("bird_codes")
    private final List<String> birdCodes;
    @JsonProperty("can_cancel")
    @InterfaceC41208ft5("can_cancel")
    private final boolean canCancel;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("due_at")
    @InterfaceC41208ft5("due_at")
    private final String dueAt;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;
    @JsonProperty("icon_color")
    @InterfaceC41208ft5("icon_color")
    private final WireThemedColors iconColor;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66753id;
    @JsonProperty("info")
    @InterfaceC41208ft5("info")
    private final WireReleaseInfo info;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("zone_center_point")
    @InterfaceC41208ft5("zone_center_point")
    private final Point zoneCenterPoint;
    @JsonProperty("zone_id")
    @InterfaceC41208ft5("zone_id")
    private final String zoneId;

    public WireReleaseAssignment() {
        this(null, null, null, null, null, null, false, null, null, null, null, 2047, null);
    }

    public final String component1() {
        return this.f66753id;
    }

    public final WireThemedColors component10() {
        return this.iconColor;
    }

    public final WireReleaseInfo component11() {
        return this.info;
    }

    public final String component2() {
        return this.zoneId;
    }

    public final Point component3() {
        return this.zoneCenterPoint;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.dueAt;
    }

    public final boolean component7() {
        return this.canCancel;
    }

    public final List<String> component8() {
        return this.birdCodes;
    }

    public final ClientIcon component9() {
        return this.icon;
    }

    public final WireReleaseAssignment copy(String id, String zoneId, Point zoneCenterPoint, String title, String description, String dueAt, boolean z, List<String> birdCodes, ClientIcon clientIcon, WireThemedColors wireThemedColors, WireReleaseInfo wireReleaseInfo) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(zoneCenterPoint, "zoneCenterPoint");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(dueAt, "dueAt");
        Intrinsics.checkNotNullParameter(birdCodes, "birdCodes");
        return new WireReleaseAssignment(id, zoneId, zoneCenterPoint, title, description, dueAt, z, birdCodes, clientIcon, wireThemedColors, wireReleaseInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireReleaseAssignment) {
            WireReleaseAssignment wireReleaseAssignment = (WireReleaseAssignment) obj;
            return Intrinsics.areEqual(this.f66753id, wireReleaseAssignment.f66753id) && Intrinsics.areEqual(this.zoneId, wireReleaseAssignment.zoneId) && Intrinsics.areEqual(this.zoneCenterPoint, wireReleaseAssignment.zoneCenterPoint) && Intrinsics.areEqual(this.title, wireReleaseAssignment.title) && Intrinsics.areEqual(this.description, wireReleaseAssignment.description) && Intrinsics.areEqual(this.dueAt, wireReleaseAssignment.dueAt) && this.canCancel == wireReleaseAssignment.canCancel && Intrinsics.areEqual(this.birdCodes, wireReleaseAssignment.birdCodes) && this.icon == wireReleaseAssignment.icon && Intrinsics.areEqual(this.iconColor, wireReleaseAssignment.iconColor) && Intrinsics.areEqual(this.info, wireReleaseAssignment.info);
        }
        return false;
    }

    public final List<String> getBirdCodes() {
        return this.birdCodes;
    }

    public final boolean getCanCancel() {
        return this.canCancel;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDueAt() {
        return this.dueAt;
    }

    public final ClientIcon getIcon() {
        return this.icon;
    }

    public final WireThemedColors getIconColor() {
        return this.iconColor;
    }

    public final String getId() {
        return this.f66753id;
    }

    public final WireReleaseInfo getInfo() {
        return this.info;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Point getZoneCenterPoint() {
        return this.zoneCenterPoint;
    }

    public final String getZoneId() {
        return this.zoneId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((this.f66753id.hashCode() * 31) + this.zoneId.hashCode()) * 31) + this.zoneCenterPoint.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.dueAt.hashCode()) * 31;
        boolean z = this.canCancel;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.birdCodes.hashCode()) * 31;
        ClientIcon clientIcon = this.icon;
        int hashCode3 = (hashCode2 + (clientIcon == null ? 0 : clientIcon.hashCode())) * 31;
        WireThemedColors wireThemedColors = this.iconColor;
        int hashCode4 = (hashCode3 + (wireThemedColors == null ? 0 : wireThemedColors.hashCode())) * 31;
        WireReleaseInfo wireReleaseInfo = this.info;
        return hashCode4 + (wireReleaseInfo != null ? wireReleaseInfo.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66753id;
        String str2 = this.zoneId;
        Point point = this.zoneCenterPoint;
        String str3 = this.title;
        String str4 = this.description;
        String str5 = this.dueAt;
        boolean z = this.canCancel;
        List<String> list = this.birdCodes;
        ClientIcon clientIcon = this.icon;
        WireThemedColors wireThemedColors = this.iconColor;
        WireReleaseInfo wireReleaseInfo = this.info;
        return "WireReleaseAssignment(id=" + str + ", zoneId=" + str2 + ", zoneCenterPoint=" + point + ", title=" + str3 + ", description=" + str4 + ", dueAt=" + str5 + ", canCancel=" + z + ", birdCodes=" + list + ", icon=" + clientIcon + ", iconColor=" + wireThemedColors + ", info=" + wireReleaseInfo + ")";
    }

    public WireReleaseAssignment(String id, String zoneId, Point zoneCenterPoint, String title, String description, String dueAt, boolean z, List<String> birdCodes, ClientIcon clientIcon, WireThemedColors wireThemedColors, WireReleaseInfo wireReleaseInfo) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(zoneCenterPoint, "zoneCenterPoint");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(dueAt, "dueAt");
        Intrinsics.checkNotNullParameter(birdCodes, "birdCodes");
        this.f66753id = id;
        this.zoneId = zoneId;
        this.zoneCenterPoint = zoneCenterPoint;
        this.title = title;
        this.description = description;
        this.dueAt = dueAt;
        this.canCancel = z;
        this.birdCodes = birdCodes;
        this.icon = clientIcon;
        this.iconColor = wireThemedColors;
        this.info = wireReleaseInfo;
    }

    public /* synthetic */ WireReleaseAssignment(String str, String str2, Point point, String str3, String str4, String str5, boolean z, List list, ClientIcon clientIcon, WireThemedColors wireThemedColors, WireReleaseInfo wireReleaseInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new Point() : point, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? str5 : "", (i & 64) != 0 ? false : z, (i & 128) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 256) != 0 ? null : clientIcon, (i & 512) != 0 ? null : wireThemedColors, (i & 1024) == 0 ? wireReleaseInfo : null);
    }
}
