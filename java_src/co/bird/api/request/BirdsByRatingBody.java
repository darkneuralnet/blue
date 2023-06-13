package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m28432d2 = {"Lco/bird/api/request/BirdsByRatingBody;", "", "birdIds", "", "", "(Ljava/util/List;)V", "getBirdIds", "()Ljava/util/List;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdsByRatingBody {
    private final List<String> birdIds;

    public BirdsByRatingBody(List<String> birdIds) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        this.birdIds = birdIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BirdsByRatingBody copy$default(BirdsByRatingBody birdsByRatingBody, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = birdsByRatingBody.birdIds;
        }
        return birdsByRatingBody.copy(list);
    }

    public final List<String> component1() {
        return this.birdIds;
    }

    public final BirdsByRatingBody copy(List<String> birdIds) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        return new BirdsByRatingBody(birdIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BirdsByRatingBody) && Intrinsics.areEqual(this.birdIds, ((BirdsByRatingBody) obj).birdIds);
    }

    public final List<String> getBirdIds() {
        return this.birdIds;
    }

    public int hashCode() {
        return this.birdIds.hashCode();
    }

    public String toString() {
        List<String> list = this.birdIds;
        return "BirdsByRatingBody(birdIds=" + list + ")";
    }
}