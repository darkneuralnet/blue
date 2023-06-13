package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.MechanicalLockKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/api/request/UnlockMechanicalBody;", "", "birdId", "", "lockKind", "Lco/bird/android/model/constant/MechanicalLockKind;", "(Ljava/lang/String;Lco/bird/android/model/constant/MechanicalLockKind;)V", "getBirdId", "()Ljava/lang/String;", "getLockKind", "()Lco/bird/android/model/constant/MechanicalLockKind;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class UnlockMechanicalBody {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("lock_kind")
    @InterfaceC41208ft5("lock_kind")
    private final MechanicalLockKind lockKind;

    public UnlockMechanicalBody(String birdId, MechanicalLockKind lockKind) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(lockKind, "lockKind");
        this.birdId = birdId;
        this.lockKind = lockKind;
    }

    public static /* synthetic */ UnlockMechanicalBody copy$default(UnlockMechanicalBody unlockMechanicalBody, String str, MechanicalLockKind mechanicalLockKind, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unlockMechanicalBody.birdId;
        }
        if ((i & 2) != 0) {
            mechanicalLockKind = unlockMechanicalBody.lockKind;
        }
        return unlockMechanicalBody.copy(str, mechanicalLockKind);
    }

    public final String component1() {
        return this.birdId;
    }

    public final MechanicalLockKind component2() {
        return this.lockKind;
    }

    public final UnlockMechanicalBody copy(String birdId, MechanicalLockKind lockKind) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(lockKind, "lockKind");
        return new UnlockMechanicalBody(birdId, lockKind);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnlockMechanicalBody) {
            UnlockMechanicalBody unlockMechanicalBody = (UnlockMechanicalBody) obj;
            return Intrinsics.areEqual(this.birdId, unlockMechanicalBody.birdId) && this.lockKind == unlockMechanicalBody.lockKind;
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final MechanicalLockKind getLockKind() {
        return this.lockKind;
    }

    public int hashCode() {
        return (this.birdId.hashCode() * 31) + this.lockKind.hashCode();
    }

    public String toString() {
        String str = this.birdId;
        MechanicalLockKind mechanicalLockKind = this.lockKind;
        return "UnlockMechanicalBody(birdId=" + str + ", lockKind=" + mechanicalLockKind + ")";
    }
}
