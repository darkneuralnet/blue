package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PartKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR$\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/request/WireBirdActionPairRequest;", "", "birdId", "", "parts", "", "Lco/bird/android/model/constant/PartKind;", "(Ljava/lang/String;Ljava/util/Map;)V", "getBirdId", "()Ljava/lang/String;", "getParts", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBirdActionPairRequest {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("parts")
    @InterfaceC41208ft5("parts")
    private final Map<PartKind, String> parts;

    public WireBirdActionPairRequest() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireBirdActionPairRequest copy$default(WireBirdActionPairRequest wireBirdActionPairRequest, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireBirdActionPairRequest.birdId;
        }
        if ((i & 2) != 0) {
            map = wireBirdActionPairRequest.parts;
        }
        return wireBirdActionPairRequest.copy(str, map);
    }

    public final String component1() {
        return this.birdId;
    }

    public final Map<PartKind, String> component2() {
        return this.parts;
    }

    public final WireBirdActionPairRequest copy(String str, Map<PartKind, String> map) {
        return new WireBirdActionPairRequest(str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBirdActionPairRequest) {
            WireBirdActionPairRequest wireBirdActionPairRequest = (WireBirdActionPairRequest) obj;
            return Intrinsics.areEqual(this.birdId, wireBirdActionPairRequest.birdId) && Intrinsics.areEqual(this.parts, wireBirdActionPairRequest.parts);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final Map<PartKind, String> getParts() {
        return this.parts;
    }

    public int hashCode() {
        String str = this.birdId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<PartKind, String> map = this.parts;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.birdId;
        Map<PartKind, String> map = this.parts;
        return "WireBirdActionPairRequest(birdId=" + str + ", parts=" + map + ")";
    }

    public WireBirdActionPairRequest(String str, Map<PartKind, String> map) {
        this.birdId = str;
        this.parts = map;
    }

    public /* synthetic */ WireBirdActionPairRequest(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : map);
    }
}
