package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, m28432d2 = {"Lco/bird/api/response/BatchBird;", "", "birdId", "", "batchId", "createdAt", "Lorg/joda/time/DateTime;", "deletedAt", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getBatchId", "()Ljava/lang/String;", "getBirdId", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getDeletedAt", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BatchBird {
    @JsonProperty("batch_id")
    @InterfaceC41208ft5("batch_id")
    private final String batchId;
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("deleted_at")
    @InterfaceC41208ft5("deleted_at")
    private final DateTime deletedAt;

    public BatchBird() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ BatchBird copy$default(BatchBird batchBird, String str, String str2, DateTime dateTime, DateTime dateTime2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = batchBird.birdId;
        }
        if ((i & 2) != 0) {
            str2 = batchBird.batchId;
        }
        if ((i & 4) != 0) {
            dateTime = batchBird.createdAt;
        }
        if ((i & 8) != 0) {
            dateTime2 = batchBird.deletedAt;
        }
        return batchBird.copy(str, str2, dateTime, dateTime2);
    }

    public final String component1() {
        return this.birdId;
    }

    public final String component2() {
        return this.batchId;
    }

    public final DateTime component3() {
        return this.createdAt;
    }

    public final DateTime component4() {
        return this.deletedAt;
    }

    public final BatchBird copy(String birdId, String batchId, DateTime createdAt, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(batchId, "batchId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new BatchBird(birdId, batchId, createdAt, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BatchBird) {
            BatchBird batchBird = (BatchBird) obj;
            return Intrinsics.areEqual(this.birdId, batchBird.birdId) && Intrinsics.areEqual(this.batchId, batchBird.batchId) && Intrinsics.areEqual(this.createdAt, batchBird.createdAt) && Intrinsics.areEqual(this.deletedAt, batchBird.deletedAt);
        }
        return false;
    }

    public final String getBatchId() {
        return this.batchId;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final DateTime getDeletedAt() {
        return this.deletedAt;
    }

    public int hashCode() {
        int hashCode = ((((this.birdId.hashCode() * 31) + this.batchId.hashCode()) * 31) + this.createdAt.hashCode()) * 31;
        DateTime dateTime = this.deletedAt;
        return hashCode + (dateTime == null ? 0 : dateTime.hashCode());
    }

    public String toString() {
        String str = this.birdId;
        String str2 = this.batchId;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.deletedAt;
        return "BatchBird(birdId=" + str + ", batchId=" + str2 + ", createdAt=" + dateTime + ", deletedAt=" + dateTime2 + ")";
    }

    public BatchBird(String birdId, String batchId, DateTime createdAt, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(batchId, "batchId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.birdId = birdId;
        this.batchId = batchId;
        this.createdAt = createdAt;
        this.deletedAt = dateTime;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BatchBird(String str, String str2, DateTime dateTime, DateTime dateTime2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, dateTime, (i & 8) != 0 ? null : dateTime2);
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
