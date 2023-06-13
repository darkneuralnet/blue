package com.stripe.android.uicore;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/uicore/PrimaryButtonShape;", "", "cornerRadius", "", "borderStrokeWidth", "(FF)V", "getBorderStrokeWidth", "()F", "getCornerRadius", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PrimaryButtonShape {
    public static final int $stable = 0;
    private final float borderStrokeWidth;
    private final float cornerRadius;

    public PrimaryButtonShape(float f, float f2) {
        this.cornerRadius = f;
        this.borderStrokeWidth = f2;
    }

    public static /* synthetic */ PrimaryButtonShape copy$default(PrimaryButtonShape primaryButtonShape, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = primaryButtonShape.cornerRadius;
        }
        if ((i & 2) != 0) {
            f2 = primaryButtonShape.borderStrokeWidth;
        }
        return primaryButtonShape.copy(f, f2);
    }

    public final float component1() {
        return this.cornerRadius;
    }

    public final float component2() {
        return this.borderStrokeWidth;
    }

    public final PrimaryButtonShape copy(float f, float f2) {
        return new PrimaryButtonShape(f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrimaryButtonShape) {
            PrimaryButtonShape primaryButtonShape = (PrimaryButtonShape) obj;
            return Float.compare(this.cornerRadius, primaryButtonShape.cornerRadius) == 0 && Float.compare(this.borderStrokeWidth, primaryButtonShape.borderStrokeWidth) == 0;
        }
        return false;
    }

    public final float getBorderStrokeWidth() {
        return this.borderStrokeWidth;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public int hashCode() {
        return (Float.hashCode(this.cornerRadius) * 31) + Float.hashCode(this.borderStrokeWidth);
    }

    public String toString() {
        float f = this.cornerRadius;
        float f2 = this.borderStrokeWidth;
        return "PrimaryButtonShape(cornerRadius=" + f + ", borderStrokeWidth=" + f2 + ")";
    }
}
