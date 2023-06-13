package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleet;", "", "id", "", "name", "description", "partnerId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getId", "getName", "getPartnerId", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleet {
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66726id;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty("partner_id")
    @InterfaceC41208ft5("partner_id")
    private final String partnerId;

    public WireFleet() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ WireFleet copy$default(WireFleet wireFleet, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireFleet.f66726id;
        }
        if ((i & 2) != 0) {
            str2 = wireFleet.name;
        }
        if ((i & 4) != 0) {
            str3 = wireFleet.description;
        }
        if ((i & 8) != 0) {
            str4 = wireFleet.partnerId;
        }
        return wireFleet.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.f66726id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.partnerId;
    }

    public final WireFleet copy(String id, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new WireFleet(id, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleet) {
            WireFleet wireFleet = (WireFleet) obj;
            return Intrinsics.areEqual(this.f66726id, wireFleet.f66726id) && Intrinsics.areEqual(this.name, wireFleet.name) && Intrinsics.areEqual(this.description, wireFleet.description) && Intrinsics.areEqual(this.partnerId, wireFleet.partnerId);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.f66726id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public int hashCode() {
        int hashCode = this.f66726id.hashCode() * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.partnerId;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66726id;
        String str2 = this.name;
        String str3 = this.description;
        String str4 = this.partnerId;
        return "WireFleet(id=" + str + ", name=" + str2 + ", description=" + str3 + ", partnerId=" + str4 + ")";
    }

    public WireFleet(String id, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f66726id = id;
        this.name = str;
        this.description = str2;
        this.partnerId = str3;
    }

    public /* synthetic */ WireFleet(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
