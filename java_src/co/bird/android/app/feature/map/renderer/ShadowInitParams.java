package co.bird.android.app.feature.map.renderer;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\""}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/ShadowInitParams;", "", "widthDp", "", "heightDp", "radiusDp", "offsetXDp", "offsetYDp", "translationXDp", "translationYDp", "(FFFFFFF)V", "getHeightDp", "()F", "getOffsetXDp", "getOffsetYDp", "getRadiusDp", "getTranslationXDp", "getTranslationYDp", "getWidthDp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class ShadowInitParams {
    private final float heightDp;
    private final float offsetXDp;
    private final float offsetYDp;
    private final float radiusDp;
    private final float translationXDp;
    private final float translationYDp;
    private final float widthDp;

    public ShadowInitParams() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 127, null);
    }

    public static /* synthetic */ ShadowInitParams copy$default(ShadowInitParams shadowInitParams, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            f = shadowInitParams.widthDp;
        }
        if ((i & 2) != 0) {
            f2 = shadowInitParams.heightDp;
        }
        float f8 = f2;
        if ((i & 4) != 0) {
            f3 = shadowInitParams.radiusDp;
        }
        float f9 = f3;
        if ((i & 8) != 0) {
            f4 = shadowInitParams.offsetXDp;
        }
        float f10 = f4;
        if ((i & 16) != 0) {
            f5 = shadowInitParams.offsetYDp;
        }
        float f11 = f5;
        if ((i & 32) != 0) {
            f6 = shadowInitParams.translationXDp;
        }
        float f12 = f6;
        if ((i & 64) != 0) {
            f7 = shadowInitParams.translationYDp;
        }
        return shadowInitParams.copy(f, f8, f9, f10, f11, f12, f7);
    }

    public final float component1() {
        return this.widthDp;
    }

    public final float component2() {
        return this.heightDp;
    }

    public final float component3() {
        return this.radiusDp;
    }

    public final float component4() {
        return this.offsetXDp;
    }

    public final float component5() {
        return this.offsetYDp;
    }

    public final float component6() {
        return this.translationXDp;
    }

    public final float component7() {
        return this.translationYDp;
    }

    public final ShadowInitParams copy(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        return new ShadowInitParams(f, f2, f3, f4, f5, f6, f7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShadowInitParams) {
            ShadowInitParams shadowInitParams = (ShadowInitParams) obj;
            return Float.compare(this.widthDp, shadowInitParams.widthDp) == 0 && Float.compare(this.heightDp, shadowInitParams.heightDp) == 0 && Float.compare(this.radiusDp, shadowInitParams.radiusDp) == 0 && Float.compare(this.offsetXDp, shadowInitParams.offsetXDp) == 0 && Float.compare(this.offsetYDp, shadowInitParams.offsetYDp) == 0 && Float.compare(this.translationXDp, shadowInitParams.translationXDp) == 0 && Float.compare(this.translationYDp, shadowInitParams.translationYDp) == 0;
        }
        return false;
    }

    public final float getHeightDp() {
        return this.heightDp;
    }

    public final float getOffsetXDp() {
        return this.offsetXDp;
    }

    public final float getOffsetYDp() {
        return this.offsetYDp;
    }

    public final float getRadiusDp() {
        return this.radiusDp;
    }

    public final float getTranslationXDp() {
        return this.translationXDp;
    }

    public final float getTranslationYDp() {
        return this.translationYDp;
    }

    public final float getWidthDp() {
        return this.widthDp;
    }

    public int hashCode() {
        return (((((((((((Float.hashCode(this.widthDp) * 31) + Float.hashCode(this.heightDp)) * 31) + Float.hashCode(this.radiusDp)) * 31) + Float.hashCode(this.offsetXDp)) * 31) + Float.hashCode(this.offsetYDp)) * 31) + Float.hashCode(this.translationXDp)) * 31) + Float.hashCode(this.translationYDp);
    }

    public String toString() {
        float f = this.widthDp;
        float f2 = this.heightDp;
        float f3 = this.radiusDp;
        float f4 = this.offsetXDp;
        float f5 = this.offsetYDp;
        float f6 = this.translationXDp;
        float f7 = this.translationYDp;
        return "ShadowInitParams(widthDp=" + f + ", heightDp=" + f2 + ", radiusDp=" + f3 + ", offsetXDp=" + f4 + ", offsetYDp=" + f5 + ", translationXDp=" + f6 + ", translationYDp=" + f7 + ")";
    }

    public ShadowInitParams(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.widthDp = f;
        this.heightDp = f2;
        this.radiusDp = f3;
        this.offsetXDp = f4;
        this.offsetYDp = f5;
        this.translationXDp = f6;
        this.translationYDp = f7;
    }

    public /* synthetic */ ShadowInitParams(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4, (i & 16) != 0 ? 0.0f : f5, (i & 32) != 0 ? 0.0f : f6, (i & 64) != 0 ? 0.0f : f7);
    }
}
