package co.bird.android.model;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/GravityVector;", "", "x", "", "y", "z", "(FFF)V", "getX", "()F", "getY", "getZ", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class GravityVector {

    /* renamed from: x */
    private final float f66593x;

    /* renamed from: y */
    private final float f66594y;

    /* renamed from: z */
    private final float f66595z;

    public GravityVector(float f, float f2, float f3) {
        this.f66593x = f;
        this.f66594y = f2;
        this.f66595z = f3;
    }

    public static /* synthetic */ GravityVector copy$default(GravityVector gravityVector, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = gravityVector.f66593x;
        }
        if ((i & 2) != 0) {
            f2 = gravityVector.f66594y;
        }
        if ((i & 4) != 0) {
            f3 = gravityVector.f66595z;
        }
        return gravityVector.copy(f, f2, f3);
    }

    public final float component1() {
        return this.f66593x;
    }

    public final float component2() {
        return this.f66594y;
    }

    public final float component3() {
        return this.f66595z;
    }

    public final GravityVector copy(float f, float f2, float f3) {
        return new GravityVector(f, f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GravityVector) {
            GravityVector gravityVector = (GravityVector) obj;
            return Float.compare(this.f66593x, gravityVector.f66593x) == 0 && Float.compare(this.f66594y, gravityVector.f66594y) == 0 && Float.compare(this.f66595z, gravityVector.f66595z) == 0;
        }
        return false;
    }

    public final float getX() {
        return this.f66593x;
    }

    public final float getY() {
        return this.f66594y;
    }

    public final float getZ() {
        return this.f66595z;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f66593x) * 31) + Float.hashCode(this.f66594y)) * 31) + Float.hashCode(this.f66595z);
    }

    public String toString() {
        float f = this.f66593x;
        float f2 = this.f66594y;
        float f3 = this.f66595z;
        return "GravityVector(x=" + f + ", y=" + f2 + ", z=" + f3 + ")";
    }
}
