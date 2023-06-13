package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PartKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/wire/WireBirdPart;", "", "id", "", "birdId", "kind", "Lco/bird/android/model/constant/PartKind;", "key", "partId", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;Ljava/lang/String;)V", "getBirdId", "()Ljava/lang/String;", "getId", "getKey", "getKind", "()Lco/bird/android/model/constant/PartKind;", "getPartId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toPart", "Lco/bird/android/model/wire/WirePart;", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBirdPart {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66719id;
    @JsonProperty("key")
    @InterfaceC41208ft5("key")
    private final String key;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final PartKind kind;
    @JsonProperty("part_id")
    @InterfaceC41208ft5("part_id")
    private final String partId;

    public WireBirdPart() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ WireBirdPart copy$default(WireBirdPart wireBirdPart, String str, String str2, PartKind partKind, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireBirdPart.f66719id;
        }
        if ((i & 2) != 0) {
            str2 = wireBirdPart.birdId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            partKind = wireBirdPart.kind;
        }
        PartKind partKind2 = partKind;
        if ((i & 8) != 0) {
            str3 = wireBirdPart.key;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = wireBirdPart.partId;
        }
        return wireBirdPart.copy(str, str5, partKind2, str6, str4);
    }

    public final String component1() {
        return this.f66719id;
    }

    public final String component2() {
        return this.birdId;
    }

    public final PartKind component3() {
        return this.kind;
    }

    public final String component4() {
        return this.key;
    }

    public final String component5() {
        return this.partId;
    }

    public final WireBirdPart copy(String id, String birdId, PartKind kind, String key, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(key, "key");
        return new WireBirdPart(id, birdId, kind, key, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBirdPart) {
            WireBirdPart wireBirdPart = (WireBirdPart) obj;
            return Intrinsics.areEqual(this.f66719id, wireBirdPart.f66719id) && Intrinsics.areEqual(this.birdId, wireBirdPart.birdId) && this.kind == wireBirdPart.kind && Intrinsics.areEqual(this.key, wireBirdPart.key) && Intrinsics.areEqual(this.partId, wireBirdPart.partId);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getId() {
        return this.f66719id;
    }

    public final String getKey() {
        return this.key;
    }

    public final PartKind getKind() {
        return this.kind;
    }

    public final String getPartId() {
        return this.partId;
    }

    public int hashCode() {
        int hashCode = ((((((this.f66719id.hashCode() * 31) + this.birdId.hashCode()) * 31) + this.kind.hashCode()) * 31) + this.key.hashCode()) * 31;
        String str = this.partId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final WirePart toPart() {
        String str = this.key;
        PartKind partKind = this.kind;
        String str2 = this.partId;
        if (str2 == null) {
            str2 = "";
        }
        return new WirePart(str2, partKind, str);
    }

    public String toString() {
        String str = this.f66719id;
        String str2 = this.birdId;
        PartKind partKind = this.kind;
        String str3 = this.key;
        String str4 = this.partId;
        return "WireBirdPart(id=" + str + ", birdId=" + str2 + ", kind=" + partKind + ", key=" + str3 + ", partId=" + str4 + ")";
    }

    public WireBirdPart(String id, String birdId, PartKind kind, String key, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f66719id = id;
        this.birdId = birdId;
        this.kind = kind;
        this.key = key;
        this.partId = str;
    }

    public /* synthetic */ WireBirdPart(String str, String str2, PartKind partKind, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? PartKind.UNKNOWN : partKind, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? null : str4);
    }
}
