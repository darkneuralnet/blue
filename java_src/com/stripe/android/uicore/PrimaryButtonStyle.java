package com.stripe.android.uicore;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/uicore/PrimaryButtonStyle;", "", PaymentSheetEvent.FIELD_COLORS_LIGHT, "Lcom/stripe/android/uicore/PrimaryButtonColors;", PaymentSheetEvent.FIELD_COLORS_DARK, "shape", "Lcom/stripe/android/uicore/PrimaryButtonShape;", "typography", "Lcom/stripe/android/uicore/PrimaryButtonTypography;", "(Lcom/stripe/android/uicore/PrimaryButtonColors;Lcom/stripe/android/uicore/PrimaryButtonColors;Lcom/stripe/android/uicore/PrimaryButtonShape;Lcom/stripe/android/uicore/PrimaryButtonTypography;)V", "getColorsDark", "()Lcom/stripe/android/uicore/PrimaryButtonColors;", "getColorsLight", "getShape", "()Lcom/stripe/android/uicore/PrimaryButtonShape;", "getTypography", "()Lcom/stripe/android/uicore/PrimaryButtonTypography;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PrimaryButtonStyle {
    public static final int $stable = 0;
    private final PrimaryButtonColors colorsDark;
    private final PrimaryButtonColors colorsLight;
    private final PrimaryButtonShape shape;
    private final PrimaryButtonTypography typography;

    public PrimaryButtonStyle(PrimaryButtonColors colorsLight, PrimaryButtonColors colorsDark, PrimaryButtonShape shape, PrimaryButtonTypography typography) {
        Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
        Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(typography, "typography");
        this.colorsLight = colorsLight;
        this.colorsDark = colorsDark;
        this.shape = shape;
        this.typography = typography;
    }

    public static /* synthetic */ PrimaryButtonStyle copy$default(PrimaryButtonStyle primaryButtonStyle, PrimaryButtonColors primaryButtonColors, PrimaryButtonColors primaryButtonColors2, PrimaryButtonShape primaryButtonShape, PrimaryButtonTypography primaryButtonTypography, int i, Object obj) {
        if ((i & 1) != 0) {
            primaryButtonColors = primaryButtonStyle.colorsLight;
        }
        if ((i & 2) != 0) {
            primaryButtonColors2 = primaryButtonStyle.colorsDark;
        }
        if ((i & 4) != 0) {
            primaryButtonShape = primaryButtonStyle.shape;
        }
        if ((i & 8) != 0) {
            primaryButtonTypography = primaryButtonStyle.typography;
        }
        return primaryButtonStyle.copy(primaryButtonColors, primaryButtonColors2, primaryButtonShape, primaryButtonTypography);
    }

    public final PrimaryButtonColors component1() {
        return this.colorsLight;
    }

    public final PrimaryButtonColors component2() {
        return this.colorsDark;
    }

    public final PrimaryButtonShape component3() {
        return this.shape;
    }

    public final PrimaryButtonTypography component4() {
        return this.typography;
    }

    public final PrimaryButtonStyle copy(PrimaryButtonColors colorsLight, PrimaryButtonColors colorsDark, PrimaryButtonShape shape, PrimaryButtonTypography typography) {
        Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
        Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(typography, "typography");
        return new PrimaryButtonStyle(colorsLight, colorsDark, shape, typography);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrimaryButtonStyle) {
            PrimaryButtonStyle primaryButtonStyle = (PrimaryButtonStyle) obj;
            return Intrinsics.areEqual(this.colorsLight, primaryButtonStyle.colorsLight) && Intrinsics.areEqual(this.colorsDark, primaryButtonStyle.colorsDark) && Intrinsics.areEqual(this.shape, primaryButtonStyle.shape) && Intrinsics.areEqual(this.typography, primaryButtonStyle.typography);
        }
        return false;
    }

    public final PrimaryButtonColors getColorsDark() {
        return this.colorsDark;
    }

    public final PrimaryButtonColors getColorsLight() {
        return this.colorsLight;
    }

    public final PrimaryButtonShape getShape() {
        return this.shape;
    }

    public final PrimaryButtonTypography getTypography() {
        return this.typography;
    }

    public int hashCode() {
        return (((((this.colorsLight.hashCode() * 31) + this.colorsDark.hashCode()) * 31) + this.shape.hashCode()) * 31) + this.typography.hashCode();
    }

    public String toString() {
        PrimaryButtonColors primaryButtonColors = this.colorsLight;
        PrimaryButtonColors primaryButtonColors2 = this.colorsDark;
        PrimaryButtonShape primaryButtonShape = this.shape;
        PrimaryButtonTypography primaryButtonTypography = this.typography;
        return "PrimaryButtonStyle(colorsLight=" + primaryButtonColors + ", colorsDark=" + primaryButtonColors2 + ", shape=" + primaryButtonShape + ", typography=" + primaryButtonTypography + ")";
    }
}
