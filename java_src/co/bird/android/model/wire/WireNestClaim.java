package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/model/wire/WireNestClaim;", "", "id", "", "nestId", "spacesClaimed", "", "totalDurationMinutes", "expiresAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/String;IILorg/joda/time/DateTime;)V", "getExpiresAt", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getNestId", "getSpacesClaimed", "()I", "getTotalDurationMinutes", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNestClaim {
    @JsonProperty("expires_at")
    @InterfaceC41208ft5("expires_at")
    private final DateTime expiresAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66739id;
    @JsonProperty("nest_id")
    @InterfaceC41208ft5("nest_id")
    private final String nestId;
    @JsonProperty("spaces_claimed")
    @InterfaceC41208ft5("spaces_claimed")
    private final int spacesClaimed;
    @JsonProperty("total_duration_minutes")
    @InterfaceC41208ft5("total_duration_minutes")
    private final int totalDurationMinutes;

    public WireNestClaim() {
        this(null, null, 0, 0, null, 31, null);
    }

    public static /* synthetic */ WireNestClaim copy$default(WireNestClaim wireNestClaim, String str, String str2, int i, int i2, DateTime dateTime, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = wireNestClaim.f66739id;
        }
        if ((i3 & 2) != 0) {
            str2 = wireNestClaim.nestId;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            i = wireNestClaim.spacesClaimed;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = wireNestClaim.totalDurationMinutes;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            dateTime = wireNestClaim.expiresAt;
        }
        return wireNestClaim.copy(str, str3, i4, i5, dateTime);
    }

    public final String component1() {
        return this.f66739id;
    }

    public final String component2() {
        return this.nestId;
    }

    public final int component3() {
        return this.spacesClaimed;
    }

    public final int component4() {
        return this.totalDurationMinutes;
    }

    public final DateTime component5() {
        return this.expiresAt;
    }

    public final WireNestClaim copy(String id, String nestId, int i, int i2, DateTime expiresAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        return new WireNestClaim(id, nestId, i, i2, expiresAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireNestClaim) {
            WireNestClaim wireNestClaim = (WireNestClaim) obj;
            return Intrinsics.areEqual(this.f66739id, wireNestClaim.f66739id) && Intrinsics.areEqual(this.nestId, wireNestClaim.nestId) && this.spacesClaimed == wireNestClaim.spacesClaimed && this.totalDurationMinutes == wireNestClaim.totalDurationMinutes && Intrinsics.areEqual(this.expiresAt, wireNestClaim.expiresAt);
        }
        return false;
    }

    public final DateTime getExpiresAt() {
        return this.expiresAt;
    }

    public final String getId() {
        return this.f66739id;
    }

    public final String getNestId() {
        return this.nestId;
    }

    public final int getSpacesClaimed() {
        return this.spacesClaimed;
    }

    public final int getTotalDurationMinutes() {
        return this.totalDurationMinutes;
    }

    public int hashCode() {
        return (((((((this.f66739id.hashCode() * 31) + this.nestId.hashCode()) * 31) + Integer.hashCode(this.spacesClaimed)) * 31) + Integer.hashCode(this.totalDurationMinutes)) * 31) + this.expiresAt.hashCode();
    }

    public String toString() {
        String str = this.f66739id;
        String str2 = this.nestId;
        int i = this.spacesClaimed;
        int i2 = this.totalDurationMinutes;
        DateTime dateTime = this.expiresAt;
        return "WireNestClaim(id=" + str + ", nestId=" + str2 + ", spacesClaimed=" + i + ", totalDurationMinutes=" + i2 + ", expiresAt=" + dateTime + ")";
    }

    public WireNestClaim(String id, String nestId, int i, int i2, DateTime expiresAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        this.f66739id = id;
        this.nestId = nestId;
        this.spacesClaimed = i;
        this.totalDurationMinutes = i2;
        this.expiresAt = expiresAt;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireNestClaim(String str, String str2, int i, int i2, DateTime dateTime, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(r10, r0, r1, r2, dateTime);
        String str3 = (i3 & 1) != 0 ? "" : str;
        String str4 = (i3 & 2) == 0 ? str2 : "";
        int i4 = (i3 & 4) != 0 ? 0 : i;
        int i5 = (i3 & 8) != 0 ? 0 : i2;
        if ((i3 & 16) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
