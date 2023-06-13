package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lco/bird/api/request/LockBirdBody;", "", "birdId", "", "lock", "", "(Ljava/lang/String;Z)V", "getBirdId", "()Ljava/lang/String;", "getLock", "()Z", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LockBirdBody {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("lock")
    @InterfaceC41208ft5("lock")
    private final boolean lock;

    public LockBirdBody(String birdId, boolean z) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.birdId = birdId;
        this.lock = z;
    }

    public static /* synthetic */ LockBirdBody copy$default(LockBirdBody lockBirdBody, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lockBirdBody.birdId;
        }
        if ((i & 2) != 0) {
            z = lockBirdBody.lock;
        }
        return lockBirdBody.copy(str, z);
    }

    public final String component1() {
        return this.birdId;
    }

    public final boolean component2() {
        return this.lock;
    }

    public final LockBirdBody copy(String birdId, boolean z) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return new LockBirdBody(birdId, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LockBirdBody) {
            LockBirdBody lockBirdBody = (LockBirdBody) obj;
            return Intrinsics.areEqual(this.birdId, lockBirdBody.birdId) && this.lock == lockBirdBody.lock;
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final boolean getLock() {
        return this.lock;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.birdId.hashCode() * 31;
        boolean z = this.lock;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.birdId;
        boolean z = this.lock;
        return "LockBirdBody(birdId=" + str + ", lock=" + z + ")";
    }
}
