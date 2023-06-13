package co.bird.android.model.itemlease;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.itemlease.p022enum.ItemLeaseType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J`\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014¨\u0006)"}, m28432d2 = {"Lco/bird/android/model/itemlease/LeaseItemAvailability;", "", "id", "", "leaseType", "Lco/bird/android/model/itemlease/enum/ItemLeaseType;", "itemId", "associatedItemId", "confidence", "", "createdAt", "Lorg/joda/time/DateTime;", "updatedAt", "(Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getAssociatedItemId", "()Ljava/lang/String;", "getConfidence", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "getItemId", "getLeaseType", "()Lco/bird/android/model/itemlease/enum/ItemLeaseType;", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lco/bird/android/model/itemlease/LeaseItemAvailability;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LeaseItemAvailability {
    private final String associatedItemId;
    private final Double confidence;
    private final DateTime createdAt;

    /* renamed from: id */
    private final String f66662id;
    private final String itemId;
    private final ItemLeaseType leaseType;
    private final DateTime updatedAt;

    public LeaseItemAvailability(String id, ItemLeaseType itemLeaseType, String str, String str2, Double d, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f66662id = id;
        this.leaseType = itemLeaseType;
        this.itemId = str;
        this.associatedItemId = str2;
        this.confidence = d;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }

    public static /* synthetic */ LeaseItemAvailability copy$default(LeaseItemAvailability leaseItemAvailability, String str, ItemLeaseType itemLeaseType, String str2, String str3, Double d, DateTime dateTime, DateTime dateTime2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = leaseItemAvailability.f66662id;
        }
        if ((i & 2) != 0) {
            itemLeaseType = leaseItemAvailability.leaseType;
        }
        ItemLeaseType itemLeaseType2 = itemLeaseType;
        if ((i & 4) != 0) {
            str2 = leaseItemAvailability.itemId;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = leaseItemAvailability.associatedItemId;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            d = leaseItemAvailability.confidence;
        }
        Double d2 = d;
        if ((i & 32) != 0) {
            dateTime = leaseItemAvailability.createdAt;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 64) != 0) {
            dateTime2 = leaseItemAvailability.updatedAt;
        }
        return leaseItemAvailability.copy(str, itemLeaseType2, str4, str5, d2, dateTime3, dateTime2);
    }

    public final String component1() {
        return this.f66662id;
    }

    public final ItemLeaseType component2() {
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

    public final LeaseItemAvailability copy(String id, ItemLeaseType itemLeaseType, String str, String str2, Double d, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new LeaseItemAvailability(id, itemLeaseType, str, str2, d, dateTime, dateTime2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LeaseItemAvailability) {
            LeaseItemAvailability leaseItemAvailability = (LeaseItemAvailability) obj;
            return Intrinsics.areEqual(this.f66662id, leaseItemAvailability.f66662id) && this.leaseType == leaseItemAvailability.leaseType && Intrinsics.areEqual(this.itemId, leaseItemAvailability.itemId) && Intrinsics.areEqual(this.associatedItemId, leaseItemAvailability.associatedItemId) && Intrinsics.areEqual((Object) this.confidence, (Object) leaseItemAvailability.confidence) && Intrinsics.areEqual(this.createdAt, leaseItemAvailability.createdAt) && Intrinsics.areEqual(this.updatedAt, leaseItemAvailability.updatedAt);
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
        return this.f66662id;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final ItemLeaseType getLeaseType() {
        return this.leaseType;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode = this.f66662id.hashCode() * 31;
        ItemLeaseType itemLeaseType = this.leaseType;
        int hashCode2 = (hashCode + (itemLeaseType == null ? 0 : itemLeaseType.hashCode())) * 31;
        String str = this.itemId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.associatedItemId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.confidence;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        DateTime dateTime = this.createdAt;
        int hashCode6 = (hashCode5 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.updatedAt;
        return hashCode6 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66662id;
        ItemLeaseType itemLeaseType = this.leaseType;
        String str2 = this.itemId;
        String str3 = this.associatedItemId;
        Double d = this.confidence;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.updatedAt;
        return "LeaseItemAvailability(id=" + str + ", leaseType=" + itemLeaseType + ", itemId=" + str2 + ", associatedItemId=" + str3 + ", confidence=" + d + ", createdAt=" + dateTime + ", updatedAt=" + dateTime2 + ")";
    }

    public /* synthetic */ LeaseItemAvailability(String str, ItemLeaseType itemLeaseType, String str2, String str3, Double d, DateTime dateTime, DateTime dateTime2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : itemLeaseType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : d, (i & 32) != 0 ? null : dateTime, (i & 64) == 0 ? dateTime2 : null);
    }
}
