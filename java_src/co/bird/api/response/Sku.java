package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, m28432d2 = {"Lco/bird/api/response/Sku;", "", "id", "", "sku", "createdAt", "Lorg/joda/time/DateTime;", "partId", "kitId", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getKitId", "getPartId", "getSku", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Sku {
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68227id;
    @JsonProperty("kit_id")
    @InterfaceC41208ft5("kit_id")
    private final String kitId;
    @JsonProperty("part_id")
    @InterfaceC41208ft5("part_id")
    private final String partId;
    @JsonProperty("sku")
    @InterfaceC41208ft5("sku")
    private final String sku;

    public Sku() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Sku copy$default(Sku sku, String str, String str2, DateTime dateTime, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sku.f68227id;
        }
        if ((i & 2) != 0) {
            str2 = sku.sku;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            dateTime = sku.createdAt;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 8) != 0) {
            str3 = sku.partId;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = sku.kitId;
        }
        return sku.copy(str, str5, dateTime2, str6, str4);
    }

    public final String component1() {
        return this.f68227id;
    }

    public final String component2() {
        return this.sku;
    }

    public final DateTime component3() {
        return this.createdAt;
    }

    public final String component4() {
        return this.partId;
    }

    public final String component5() {
        return this.kitId;
    }

    public final Sku copy(String id, String sku, DateTime createdAt, String str, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new Sku(id, sku, createdAt, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Sku) {
            Sku sku = (Sku) obj;
            return Intrinsics.areEqual(this.f68227id, sku.f68227id) && Intrinsics.areEqual(this.sku, sku.sku) && Intrinsics.areEqual(this.createdAt, sku.createdAt) && Intrinsics.areEqual(this.partId, sku.partId) && Intrinsics.areEqual(this.kitId, sku.kitId);
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f68227id;
    }

    public final String getKitId() {
        return this.kitId;
    }

    public final String getPartId() {
        return this.partId;
    }

    public final String getSku() {
        return this.sku;
    }

    public int hashCode() {
        int hashCode = ((((this.f68227id.hashCode() * 31) + this.sku.hashCode()) * 31) + this.createdAt.hashCode()) * 31;
        String str = this.partId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.kitId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f68227id;
        String str2 = this.sku;
        DateTime dateTime = this.createdAt;
        String str3 = this.partId;
        String str4 = this.kitId;
        return "Sku(id=" + str + ", sku=" + str2 + ", createdAt=" + dateTime + ", partId=" + str3 + ", kitId=" + str4 + ")";
    }

    public Sku(String id, String sku, DateTime createdAt, String str, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f68227id = id;
        this.sku = sku;
        this.createdAt = createdAt;
        this.partId = str;
        this.kitId = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Sku(String str, String str2, DateTime dateTime, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r10, r0, dateTime, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        String str5 = (i & 1) != 0 ? "" : str;
        String str6 = (i & 2) == 0 ? str2 : "";
        if ((i & 4) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
