package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireBirdTrack;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JS\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R$\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m28432d2 = {"Lco/bird/api/request/ReleaseDropBody;", "", "dropId", "", "taskIds", "", "photoUrl", "bluetoothTracks", "", "Lco/bird/android/model/wire/WireBirdTrack;", "operatorTripStopId", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getBluetoothTracks", "()Ljava/util/Map;", "getDropId", "()Ljava/lang/String;", "getOperatorTripStopId", "getPhotoUrl", "getTaskIds", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ReleaseDropBody {
    @JsonProperty("bluetooth_tracks")
    @InterfaceC41208ft5("bluetooth_tracks")
    private final Map<String, WireBirdTrack> bluetoothTracks;
    @JsonProperty("drop_id")
    @InterfaceC41208ft5("drop_id")
    private final String dropId;
    @JsonProperty("operator_trip_stop_id")
    @InterfaceC41208ft5("operator_trip_stop_id")
    private final String operatorTripStopId;
    @JsonProperty("photo_url")
    @InterfaceC41208ft5("photo_url")
    private final String photoUrl;
    @JsonProperty("task_ids")
    @InterfaceC41208ft5("task_ids")
    private final List<String> taskIds;

    public ReleaseDropBody(String dropId, List<String> taskIds, String str, Map<String, WireBirdTrack> map, String str2) {
        Intrinsics.checkNotNullParameter(dropId, "dropId");
        Intrinsics.checkNotNullParameter(taskIds, "taskIds");
        this.dropId = dropId;
        this.taskIds = taskIds;
        this.photoUrl = str;
        this.bluetoothTracks = map;
        this.operatorTripStopId = str2;
    }

    public static /* synthetic */ ReleaseDropBody copy$default(ReleaseDropBody releaseDropBody, String str, List list, String str2, Map map, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = releaseDropBody.dropId;
        }
        List<String> list2 = list;
        if ((i & 2) != 0) {
            list2 = releaseDropBody.taskIds;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            str2 = releaseDropBody.photoUrl;
        }
        String str4 = str2;
        Map<String, WireBirdTrack> map2 = map;
        if ((i & 8) != 0) {
            map2 = releaseDropBody.bluetoothTracks;
        }
        Map map3 = map2;
        if ((i & 16) != 0) {
            str3 = releaseDropBody.operatorTripStopId;
        }
        return releaseDropBody.copy(str, list3, str4, map3, str3);
    }

    public final String component1() {
        return this.dropId;
    }

    public final List<String> component2() {
        return this.taskIds;
    }

    public final String component3() {
        return this.photoUrl;
    }

    public final Map<String, WireBirdTrack> component4() {
        return this.bluetoothTracks;
    }

    public final String component5() {
        return this.operatorTripStopId;
    }

    public final ReleaseDropBody copy(String dropId, List<String> taskIds, String str, Map<String, WireBirdTrack> map, String str2) {
        Intrinsics.checkNotNullParameter(dropId, "dropId");
        Intrinsics.checkNotNullParameter(taskIds, "taskIds");
        return new ReleaseDropBody(dropId, taskIds, str, map, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReleaseDropBody) {
            ReleaseDropBody releaseDropBody = (ReleaseDropBody) obj;
            return Intrinsics.areEqual(this.dropId, releaseDropBody.dropId) && Intrinsics.areEqual(this.taskIds, releaseDropBody.taskIds) && Intrinsics.areEqual(this.photoUrl, releaseDropBody.photoUrl) && Intrinsics.areEqual(this.bluetoothTracks, releaseDropBody.bluetoothTracks) && Intrinsics.areEqual(this.operatorTripStopId, releaseDropBody.operatorTripStopId);
        }
        return false;
    }

    public final Map<String, WireBirdTrack> getBluetoothTracks() {
        return this.bluetoothTracks;
    }

    public final String getDropId() {
        return this.dropId;
    }

    public final String getOperatorTripStopId() {
        return this.operatorTripStopId;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final List<String> getTaskIds() {
        return this.taskIds;
    }

    public int hashCode() {
        int hashCode = ((this.dropId.hashCode() * 31) + this.taskIds.hashCode()) * 31;
        String str = this.photoUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, WireBirdTrack> map = this.bluetoothTracks;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.operatorTripStopId;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.dropId;
        List<String> list = this.taskIds;
        String str2 = this.photoUrl;
        Map<String, WireBirdTrack> map = this.bluetoothTracks;
        String str3 = this.operatorTripStopId;
        return "ReleaseDropBody(dropId=" + str + ", taskIds=" + list + ", photoUrl=" + str2 + ", bluetoothTracks=" + map + ", operatorTripStopId=" + str3 + ")";
    }

    public /* synthetic */ ReleaseDropBody(String str, List list, String str2, Map map, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : map, (i & 16) != 0 ? null : str3);
    }
}
