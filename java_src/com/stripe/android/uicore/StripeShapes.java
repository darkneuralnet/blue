package com.stripe.android.uicore;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/uicore/StripeShapes;", "", "cornerRadius", "", "borderStrokeWidth", "borderStrokeWidthSelected", "(FFF)V", "getBorderStrokeWidth", "()F", "getBorderStrokeWidthSelected", "getCornerRadius", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeShapes {
    public static final int $stable = 0;
    private final float borderStrokeWidth;
    private final float borderStrokeWidthSelected;
    private final float cornerRadius;

    public StripeShapes(float f, float f2, float f3) {
        this.cornerRadius = f;
        this.borderStrokeWidth = f2;
        this.borderStrokeWidthSelected = f3;
    }

    public static /* synthetic */ StripeShapes copy$default(StripeShapes stripeShapes, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = stripeShapes.cornerRadius;
        }
        if ((i & 2) != 0) {
            f2 = stripeShapes.borderStrokeWidth;
        }
        if ((i & 4) != 0) {
            f3 = stripeShapes.borderStrokeWidthSelected;
        }
        return stripeShapes.copy(f, f2, f3);
    }

    public final float component1() {
        return this.cornerRadius;
    }

    public final float component2() {
        return this.borderStrokeWidth;
    }

    public final float component3() {
        return this.borderStrokeWidthSelected;
    }

    public final StripeShapes copy(float f, float f2, float f3) {
        return new StripeShapes(f, f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StripeShapes) {
            StripeShapes stripeShapes = (StripeShapes) obj;
            return Float.compare(this.cornerRadius, stripeShapes.cornerRadius) == 0 && Float.compare(this.borderStrokeWidth, stripeShapes.borderStrokeWidth) == 0 && Float.compare(this.borderStrokeWidthSelected, stripeShapes.borderStrokeWidthSelected) == 0;
        }
        return false;
    }

    public final float getBorderStrokeWidth() {
        return this.borderStrokeWidth;
    }

    public final float getBorderStrokeWidthSelected() {
        return this.borderStrokeWidthSelected;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public int hashCode() {
        return (((Float.hashCode(this.cornerRadius) * 31) + Float.hashCode(this.borderStrokeWidth)) * 31) + Float.hashCode(this.borderStrokeWidthSelected);
    }

    public String toString() {
        float f = this.cornerRadius;
        float f2 = this.borderStrokeWidth;
        float f3 = this.borderStrokeWidthSelected;
        return "StripeShapes(cornerRadius=" + f + ", borderStrokeWidth=" + f2 + ", borderStrokeWidthSelected=" + f3 + ")";
    }
}
