package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/api/request/BatchAddBirdsRequestBody;", "", "batchId", "", "birdIds", "", "(Ljava/lang/String;Ljava/util/List;)V", "getBatchId", "()Ljava/lang/String;", "getBirdIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BatchAddBirdsRequestBody {
    @JsonProperty("batch_id")
    @InterfaceC41208ft5("batch_id")
    private final String batchId;
    @JsonProperty("bird_ids")
    @InterfaceC41208ft5("bird_ids")
    private final List<String> birdIds;

    public BatchAddBirdsRequestBody(String batchId, List<String> birdIds) {
        Intrinsics.checkNotNullParameter(batchId, "batchId");
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        this.batchId = batchId;
        this.birdIds = birdIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchAddBirdsRequestBody copy$default(BatchAddBirdsRequestBody batchAddBirdsRequestBody, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = batchAddBirdsRequestBody.batchId;
        }
        if ((i & 2) != 0) {
            list = batchAddBirdsRequestBody.birdIds;
        }
        return batchAddBirdsRequestBody.copy(str, list);
    }

    public final String component1() {
        return this.batchId;
    }

    public final List<String> component2() {
        return this.birdIds;
    }

    public final BatchAddBirdsRequestBody copy(String batchId, List<String> birdIds) {
        Intrinsics.checkNotNullParameter(batchId, "batchId");
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        return new BatchAddBirdsRequestBody(batchId, birdIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BatchAddBirdsRequestBody) {
            BatchAddBirdsRequestBody batchAddBirdsRequestBody = (BatchAddBirdsRequestBody) obj;
            return Intrinsics.areEqual(this.batchId, batchAddBirdsRequestBody.batchId) && Intrinsics.areEqual(this.birdIds, batchAddBirdsRequestBody.birdIds);
        }
        return false;
    }

    public final String getBatchId() {
        return this.batchId;
    }

    public final List<String> getBirdIds() {
        return this.birdIds;
    }

    public int hashCode() {
        return (this.batchId.hashCode() * 31) + this.birdIds.hashCode();
    }

    public String toString() {
        String str = this.batchId;
        List<String> list = this.birdIds;
        return "BatchAddBirdsRequestBody(batchId=" + str + ", birdIds=" + list + ")";
    }
}