package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.FleetListMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/persistence/FleetList;", "", "title", "", "message", "Lco/bird/android/model/persistence/nestedstructures/FleetListMessage;", "list", "fleetId", "(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/FleetListMessage;Ljava/lang/String;Ljava/lang/String;)V", "getFleetId", "()Ljava/lang/String;", "getList", "getMessage", "()Lco/bird/android/model/persistence/nestedstructures/FleetListMessage;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetList {
    private final String fleetId;
    private final String list;
    private final FleetListMessage message;
    private final String title;

    public FleetList(String title, FleetListMessage fleetListMessage, String list, String fleetId) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        this.title = title;
        this.message = fleetListMessage;
        this.list = list;
        this.fleetId = fleetId;
    }

    public static /* synthetic */ FleetList copy$default(FleetList fleetList, String str, FleetListMessage fleetListMessage, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fleetList.title;
        }
        if ((i & 2) != 0) {
            fleetListMessage = fleetList.message;
        }
        if ((i & 4) != 0) {
            str2 = fleetList.list;
        }
        if ((i & 8) != 0) {
            str3 = fleetList.fleetId;
        }
        return fleetList.copy(str, fleetListMessage, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final FleetListMessage component2() {
        return this.message;
    }

    public final String component3() {
        return this.list;
    }

    public final String component4() {
        return this.fleetId;
    }

    public final FleetList copy(String title, FleetListMessage fleetListMessage, String list, String fleetId) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        return new FleetList(title, fleetListMessage, list, fleetId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetList) {
            FleetList fleetList = (FleetList) obj;
            return Intrinsics.areEqual(this.title, fleetList.title) && Intrinsics.areEqual(this.message, fleetList.message) && Intrinsics.areEqual(this.list, fleetList.list) && Intrinsics.areEqual(this.fleetId, fleetList.fleetId);
        }
        return false;
    }

    public final String getFleetId() {
        return this.fleetId;
    }

    public final String getList() {
        return this.list;
    }

    public final FleetListMessage getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        FleetListMessage fleetListMessage = this.message;
        return ((((hashCode + (fleetListMessage == null ? 0 : fleetListMessage.hashCode())) * 31) + this.list.hashCode()) * 31) + this.fleetId.hashCode();
    }

    public String toString() {
        String str = this.title;
        FleetListMessage fleetListMessage = this.message;
        String str2 = this.list;
        String str3 = this.fleetId;
        return "FleetList(title=" + str + ", message=" + fleetListMessage + ", list=" + str2 + ", fleetId=" + str3 + ")";
    }

    public /* synthetic */ FleetList(String str, FleetListMessage fleetListMessage, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : fleetListMessage, str2, str3);
    }
}
