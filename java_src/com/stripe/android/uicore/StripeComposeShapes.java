package com.stripe.android.uicore;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\bø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u0005\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\t\u0010\t\u001a\u00020\bHÆ\u0003J4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0004R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0019\u0010\u0004R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/uicore/StripeComposeShapes;", "", "Lk61;", "component1-D9Ej5fM", "()F", "component1", "component2-D9Ej5fM", "component2", "LDy5;", "component3", "borderStrokeWidth", "borderStrokeWidthSelected", "material", "copy-Md-fbLM", "(FFLDy5;)Lcom/stripe/android/uicore/StripeComposeShapes;", "copy", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "F", "getBorderStrokeWidth-D9Ej5fM", "getBorderStrokeWidthSelected-D9Ej5fM", "LDy5;", "getMaterial", "()LDy5;", "<init>", "(FFLDy5;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class StripeComposeShapes {
    public static final int $stable = 0;
    private final float borderStrokeWidth;
    private final float borderStrokeWidthSelected;
    private final C32536Dy5 material;

    public /* synthetic */ StripeComposeShapes(float f, float f2, C32536Dy5 c32536Dy5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, c32536Dy5);
    }

    /* renamed from: copy-Md-fbLM$default  reason: not valid java name */
    public static /* synthetic */ StripeComposeShapes m116702copyMdfbLM$default(StripeComposeShapes stripeComposeShapes, float f, float f2, C32536Dy5 c32536Dy5, int i, Object obj) {
        if ((i & 1) != 0) {
            f = stripeComposeShapes.borderStrokeWidth;
        }
        if ((i & 2) != 0) {
            f2 = stripeComposeShapes.borderStrokeWidthSelected;
        }
        if ((i & 4) != 0) {
            c32536Dy5 = stripeComposeShapes.material;
        }
        return stripeComposeShapes.m116705copyMdfbLM(f, f2, c32536Dy5);
    }

    /* renamed from: component1-D9Ej5fM  reason: not valid java name */
    public final float m116703component1D9Ej5fM() {
        return this.borderStrokeWidth;
    }

    /* renamed from: component2-D9Ej5fM  reason: not valid java name */
    public final float m116704component2D9Ej5fM() {
        return this.borderStrokeWidthSelected;
    }

    public final C32536Dy5 component3() {
        return this.material;
    }

    /* renamed from: copy-Md-fbLM  reason: not valid java name */
    public final StripeComposeShapes m116705copyMdfbLM(float f, float f2, C32536Dy5 material) {
        Intrinsics.checkNotNullParameter(material, "material");
        return new StripeComposeShapes(f, f2, material, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StripeComposeShapes) {
            StripeComposeShapes stripeComposeShapes = (StripeComposeShapes) obj;
            return C43705k61.m29301i(this.borderStrokeWidth, stripeComposeShapes.borderStrokeWidth) && C43705k61.m29301i(this.borderStrokeWidthSelected, stripeComposeShapes.borderStrokeWidthSelected) && Intrinsics.areEqual(this.material, stripeComposeShapes.material);
        }
        return false;
    }

    /* renamed from: getBorderStrokeWidth-D9Ej5fM  reason: not valid java name */
    public final float m116706getBorderStrokeWidthD9Ej5fM() {
        return this.borderStrokeWidth;
    }

    /* renamed from: getBorderStrokeWidthSelected-D9Ej5fM  reason: not valid java name */
    public final float m116707getBorderStrokeWidthSelectedD9Ej5fM() {
        return this.borderStrokeWidthSelected;
    }

    public final C32536Dy5 getMaterial() {
        return this.material;
    }

    public int hashCode() {
        return (((C43705k61.m29300j(this.borderStrokeWidth) * 31) + C43705k61.m29300j(this.borderStrokeWidthSelected)) * 31) + this.material.hashCode();
    }

    public String toString() {
        String m29299k = C43705k61.m29299k(this.borderStrokeWidth);
        String m29299k2 = C43705k61.m29299k(this.borderStrokeWidthSelected);
        C32536Dy5 c32536Dy5 = this.material;
        return "StripeComposeShapes(borderStrokeWidth=" + m29299k + ", borderStrokeWidthSelected=" + m29299k2 + ", material=" + c32536Dy5 + ")";
    }

    private StripeComposeShapes(float f, float f2, C32536Dy5 c32536Dy5) {
        this.borderStrokeWidth = f;
        this.borderStrokeWidthSelected = f2;
        this.material = c32536Dy5;
    }
}
