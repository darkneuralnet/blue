package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/CanReleaseBody;", "", "canRelease", "", "distance", "", "accuracy", "(ZFF)V", "getAccuracy", "()F", "getCanRelease", "()Z", "getDistance", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CanReleaseBody {
    private final float accuracy;
    private final boolean canRelease;
    private final float distance;

    public CanReleaseBody(boolean z, float f, float f2) {
        this.canRelease = z;
        this.distance = f;
        this.accuracy = f2;
    }

    public static /* synthetic */ CanReleaseBody copy$default(CanReleaseBody canReleaseBody, boolean z, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = canReleaseBody.canRelease;
        }
        if ((i & 2) != 0) {
            f = canReleaseBody.distance;
        }
        if ((i & 4) != 0) {
            f2 = canReleaseBody.accuracy;
        }
        return canReleaseBody.copy(z, f, f2);
    }

    public final boolean component1() {
        return this.canRelease;
    }

    public final float component2() {
        return this.distance;
    }

    public final float component3() {
        return this.accuracy;
    }

    public final CanReleaseBody copy(boolean z, float f, float f2) {
        return new CanReleaseBody(z, f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CanReleaseBody) {
            CanReleaseBody canReleaseBody = (CanReleaseBody) obj;
            return this.canRelease == canReleaseBody.canRelease && Float.compare(this.distance, canReleaseBody.distance) == 0 && Float.compare(this.accuracy, canReleaseBody.accuracy) == 0;
        }
        return false;
    }

    public final float getAccuracy() {
        return this.accuracy;
    }

    public final boolean getCanRelease() {
        return this.canRelease;
    }

    public final float getDistance() {
        return this.distance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.canRelease;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + Float.hashCode(this.distance)) * 31) + Float.hashCode(this.accuracy);
    }

    public String toString() {
        boolean z = this.canRelease;
        float f = this.distance;
        float f2 = this.accuracy;
        return "CanReleaseBody(canRelease=" + z + ", distance=" + f + ", accuracy=" + f2 + ")";
    }

    public /* synthetic */ CanReleaseBody(boolean z, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, f, f2);
    }
}
