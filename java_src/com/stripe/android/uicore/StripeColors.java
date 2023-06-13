package com.stripe.android.uicore;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BR\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0014ø\u0001\u0002¢\u0006\u0004\b5\u00106J\u0019\u0010\u0005\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0019\u0010\r\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0019\u0010\u000f\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0019\u0010\u0011\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u0019\u0010\u0013\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003Jp\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0014HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J\t\u0010#\u001a\u00020\"HÖ\u0001J\t\u0010%\u001a\u00020$HÖ\u0001J\u0013\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010\u0004R \u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b+\u0010\u0004R \u0010\u0018\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b,\u0010\u0004R \u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u0010)\u001a\u0004\b-\u0010\u0004R \u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001a\u0010)\u001a\u0004\b.\u0010\u0004R \u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001b\u0010)\u001a\u0004\b/\u0010\u0004R \u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001c\u0010)\u001a\u0004\b0\u0010\u0004R \u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b1\u0010\u0004R\u0017\u0010\u001e\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001e\u00102\u001a\u0004\b3\u00104\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, m28432d2 = {"Lcom/stripe/android/uicore/StripeColors;", "", "Lpm0;", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-0d7_KjU", "component5", "component6-0d7_KjU", "component6", "component7-0d7_KjU", "component7", "component8-0d7_KjU", "component8", "LMm0;", "component9", "component", "componentBorder", "componentDivider", "onComponent", "subtitle", "textCursor", "placeholderText", "appBarIcon", "materialColors", "copy-KvvhxLA", "(JJJJJJJJLMm0;)Lcom/stripe/android/uicore/StripeColors;", "copy", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "J", "getComponent-0d7_KjU", "getComponentBorder-0d7_KjU", "getComponentDivider-0d7_KjU", "getOnComponent-0d7_KjU", "getSubtitle-0d7_KjU", "getTextCursor-0d7_KjU", "getPlaceholderText-0d7_KjU", "getAppBarIcon-0d7_KjU", "LMm0;", "getMaterialColors", "()LMm0;", "<init>", "(JJJJJJJJLMm0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class StripeColors {
    public static final int $stable = 0;
    private final long appBarIcon;
    private final long component;
    private final long componentBorder;
    private final long componentDivider;
    private final C34529Mm0 materialColors;
    private final long onComponent;
    private final long placeholderText;
    private final long subtitle;
    private final long textCursor;

    public /* synthetic */ StripeColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, C34529Mm0 c34529Mm0, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, c34529Mm0);
    }

    /* renamed from: component1-0d7_KjU  reason: not valid java name */
    public final long m116685component10d7_KjU() {
        return this.component;
    }

    /* renamed from: component2-0d7_KjU  reason: not valid java name */
    public final long m116686component20d7_KjU() {
        return this.componentBorder;
    }

    /* renamed from: component3-0d7_KjU  reason: not valid java name */
    public final long m116687component30d7_KjU() {
        return this.componentDivider;
    }

    /* renamed from: component4-0d7_KjU  reason: not valid java name */
    public final long m116688component40d7_KjU() {
        return this.onComponent;
    }

    /* renamed from: component5-0d7_KjU  reason: not valid java name */
    public final long m116689component50d7_KjU() {
        return this.subtitle;
    }

    /* renamed from: component6-0d7_KjU  reason: not valid java name */
    public final long m116690component60d7_KjU() {
        return this.textCursor;
    }

    /* renamed from: component7-0d7_KjU  reason: not valid java name */
    public final long m116691component70d7_KjU() {
        return this.placeholderText;
    }

    /* renamed from: component8-0d7_KjU  reason: not valid java name */
    public final long m116692component80d7_KjU() {
        return this.appBarIcon;
    }

    public final C34529Mm0 component9() {
        return this.materialColors;
    }

    /* renamed from: copy-KvvhxLA  reason: not valid java name */
    public final StripeColors m116693copyKvvhxLA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, C34529Mm0 materialColors) {
        Intrinsics.checkNotNullParameter(materialColors, "materialColors");
        return new StripeColors(j, j2, j3, j4, j5, j6, j7, j8, materialColors, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StripeColors) {
            StripeColors stripeColors = (StripeColors) obj;
            return C47063pm0.m18741o(this.component, stripeColors.component) && C47063pm0.m18741o(this.componentBorder, stripeColors.componentBorder) && C47063pm0.m18741o(this.componentDivider, stripeColors.componentDivider) && C47063pm0.m18741o(this.onComponent, stripeColors.onComponent) && C47063pm0.m18741o(this.subtitle, stripeColors.subtitle) && C47063pm0.m18741o(this.textCursor, stripeColors.textCursor) && C47063pm0.m18741o(this.placeholderText, stripeColors.placeholderText) && C47063pm0.m18741o(this.appBarIcon, stripeColors.appBarIcon) && Intrinsics.areEqual(this.materialColors, stripeColors.materialColors);
        }
        return false;
    }

    /* renamed from: getAppBarIcon-0d7_KjU  reason: not valid java name */
    public final long m116694getAppBarIcon0d7_KjU() {
        return this.appBarIcon;
    }

    /* renamed from: getComponent-0d7_KjU  reason: not valid java name */
    public final long m116695getComponent0d7_KjU() {
        return this.component;
    }

    /* renamed from: getComponentBorder-0d7_KjU  reason: not valid java name */
    public final long m116696getComponentBorder0d7_KjU() {
        return this.componentBorder;
    }

    /* renamed from: getComponentDivider-0d7_KjU  reason: not valid java name */
    public final long m116697getComponentDivider0d7_KjU() {
        return this.componentDivider;
    }

    public final C34529Mm0 getMaterialColors() {
        return this.materialColors;
    }

    /* renamed from: getOnComponent-0d7_KjU  reason: not valid java name */
    public final long m116698getOnComponent0d7_KjU() {
        return this.onComponent;
    }

    /* renamed from: getPlaceholderText-0d7_KjU  reason: not valid java name */
    public final long m116699getPlaceholderText0d7_KjU() {
        return this.placeholderText;
    }

    /* renamed from: getSubtitle-0d7_KjU  reason: not valid java name */
    public final long m116700getSubtitle0d7_KjU() {
        return this.subtitle;
    }

    /* renamed from: getTextCursor-0d7_KjU  reason: not valid java name */
    public final long m116701getTextCursor0d7_KjU() {
        return this.textCursor;
    }

    public int hashCode() {
        return (((((((((((((((C47063pm0.m18735u(this.component) * 31) + C47063pm0.m18735u(this.componentBorder)) * 31) + C47063pm0.m18735u(this.componentDivider)) * 31) + C47063pm0.m18735u(this.onComponent)) * 31) + C47063pm0.m18735u(this.subtitle)) * 31) + C47063pm0.m18735u(this.textCursor)) * 31) + C47063pm0.m18735u(this.placeholderText)) * 31) + C47063pm0.m18735u(this.appBarIcon)) * 31) + this.materialColors.hashCode();
    }

    public String toString() {
        String m18734v = C47063pm0.m18734v(this.component);
        String m18734v2 = C47063pm0.m18734v(this.componentBorder);
        String m18734v3 = C47063pm0.m18734v(this.componentDivider);
        String m18734v4 = C47063pm0.m18734v(this.onComponent);
        String m18734v5 = C47063pm0.m18734v(this.subtitle);
        String m18734v6 = C47063pm0.m18734v(this.textCursor);
        String m18734v7 = C47063pm0.m18734v(this.placeholderText);
        String m18734v8 = C47063pm0.m18734v(this.appBarIcon);
        C34529Mm0 c34529Mm0 = this.materialColors;
        return "StripeColors(component=" + m18734v + ", componentBorder=" + m18734v2 + ", componentDivider=" + m18734v3 + ", onComponent=" + m18734v4 + ", subtitle=" + m18734v5 + ", textCursor=" + m18734v6 + ", placeholderText=" + m18734v7 + ", appBarIcon=" + m18734v8 + ", materialColors=" + c34529Mm0 + ")";
    }

    private StripeColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, C34529Mm0 c34529Mm0) {
        this.component = j;
        this.componentBorder = j2;
        this.componentDivider = j3;
        this.onComponent = j4;
        this.subtitle = j5;
        this.textCursor = j6;
        this.placeholderText = j7;
        this.appBarIcon = j8;
        this.materialColors = c34529Mm0;
    }
}
