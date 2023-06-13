package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J`\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006'"}, m28432d2 = {"Lco/bird/api/response/WireLeaseItemAvailability;", "", "id", "", "leaseType", "itemId", "associatedItemId", "confidence", "", "createdAt", "Lorg/joda/time/DateTime;", "updatedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getAssociatedItemId", "()Ljava/lang/String;", "getConfidence", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "getItemId", "getLeaseType", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lco/bird/api/response/WireLeaseItemAvailability;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireLeaseItemAvailability {
    @JsonProperty("associated_item_id")
    @InterfaceC41208ft5("associated_item_id")
    private final String associatedItemId;
    @JsonProperty("confidence")
    @InterfaceC41208ft5("confidence")
    private final Double confidence;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68236id;
    @JsonProperty("item_id")
    @InterfaceC41208ft5("item_id")
    private final String itemId;
    @JsonProperty("lease_type")
    @InterfaceC41208ft5("lease_type")
    private final String leaseType;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final DateTime updatedAt;

    public WireLeaseItemAvailability(String id, String str, String str2, String str3, Double d, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f68236id = id;
        this.leaseType = str;
        this.itemId = str2;
        this.associatedItemId = str3;
        this.confidence = d;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }

    public static /* synthetic */ WireLeaseItemAvailability copy$default(WireLeaseItemAvailability wireLeaseItemAvailability, String str, String str2, String str3, String str4, Double d, DateTime dateTime, DateTime dateTime2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireLeaseItemAvailability.f68236id;
        }
        if ((i & 2) != 0) {
            str2 = wireLeaseItemAvailability.leaseType;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = wireLeaseItemAvailability.itemId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = wireLeaseItemAvailability.associatedItemId;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            d = wireLeaseItemAvailability.confidence;
        }
        Double d2 = d;
        if ((i & 32) != 0) {
            dateTime = wireLeaseItemAvailability.createdAt;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 64) != 0) {
            dateTime2 = wireLeaseItemAvailability.updatedAt;
        }
        return wireLeaseItemAvailability.copy(str, str5, str6, str7, d2, dateTime3, dateTime2);
    }

    public final String component1() {
        return this.f68236id;
    }

    public final String component2() {
        return this.leaseType;
    }

    public final String component3() {
        return this.itemId;
    }

    public final String component4() {
        return this.associatedItemId;
    }

    public final Double component5() {
        return this.confidence;
    }

    public final DateTime component6() {
        return this.createdAt;
    }

    public final DateTime component7() {
        return this.updatedAt;
    }

    public final WireLeaseItemAvailability copy(String id, String str, String str2, String str3, Double d, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new WireLeaseItemAvailability(id, str, str2, str3, d, dateTime, dateTime2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireLeaseItemAvailability) {
            WireLeaseItemAvailability wireLeaseItemAvailability = (WireLeaseItemAvailability) obj;
            return Intrinsics.areEqual(this.f68236id, wireLeaseItemAvailability.f68236id) && Intrinsics.areEqual(this.leaseType, wireLeaseItemAvailability.leaseType) && Intrinsics.areEqual(this.itemId, wireLeaseItemAvailability.itemId) && Intrinsics.areEqual(this.associatedItemId, wireLeaseItemAvailability.associatedItemId) && Intrinsics.areEqual((Object) this.confidence, (Object) wireLeaseItemAvailability.confidence) && Intrinsics.areEqual(this.createdAt, wireLeaseItemAvailability.createdAt) && Intrinsics.areEqual(this.updatedAt, wireLeaseItemAvailability.updatedAt);
        }
        return false;
    }

    public final String getAssociatedItemId() {
        return this.associatedItemId;
    }

    public final Double getConfidence() {
        return this.confidence;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f68236id;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getLeaseType() {
        return this.leaseType;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode = this.f68236id.hashCode() * 31;
        String str = this.leaseType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.itemId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.associatedItemId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.confidence;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        DateTime dateTime = this.createdAt;
        int hashCode6 = (hashCode5 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.updatedAt;
        return hashCode6 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f68236id;
        String str2 = this.leaseType;
        String str3 = this.itemId;
        String str4 = this.associatedItemId;
        Double d = this.confidence;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.updatedAt;
        return "WireLeaseItemAvailability(id=" + str + ", leaseType=" + str2 + ", itemId=" + str3 + ", associatedItemId=" + str4 + ", confidence=" + d + ", createdAt=" + dateTime + ", updatedAt=" + dateTime2 + ")";
    }

    public /* synthetic */ WireLeaseItemAvailability(String str, String str2, String str3, String str4, Double d, DateTime dateTime, DateTime dateTime2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : d, (i & 32) != 0 ? null : dateTime, (i & 64) == 0 ? dateTime2 : null);
    }
}
