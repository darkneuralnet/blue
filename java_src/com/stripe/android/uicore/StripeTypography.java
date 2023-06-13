package com.stripe.android.uicore;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bº\u0001\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\b\u0012\u0006\u0010%\u001a\u00020\b\u0012\u0006\u0010&\u001a\u00020\b\u0012\u0006\u0010'\u001a\u00020\b\u0012\u0006\u0010(\u001a\u00020\b\u0012\u0006\u0010)\u001a\u00020\b\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0018ø\u0001\u0002¢\u0006\u0004\bU\u0010VJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000f\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u0019\u0010\u0011\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0019\u0010\u0013\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u0019\u0010\u0015\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\nJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0018HÆ\u0003JÚ\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020\b2\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0018HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b2\u00103J\t\u00106\u001a\u000205HÖ\u0001J\t\u00107\u001a\u00020\u0002HÖ\u0001J\u0013\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010;\u001a\u0004\b<\u0010=R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010;\u001a\u0004\b>\u0010=R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010;\u001a\u0004\b?\u0010=R\u0017\u0010#\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010@\u001a\u0004\bA\u0010BR \u0010$\u001a\u00020\b8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b$\u0010C\u001a\u0004\bD\u0010\nR \u0010%\u001a\u00020\b8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b%\u0010C\u001a\u0004\bE\u0010\nR \u0010&\u001a\u00020\b8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b&\u0010C\u001a\u0004\bF\u0010\nR \u0010'\u001a\u00020\b8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b'\u0010C\u001a\u0004\bG\u0010\nR \u0010(\u001a\u00020\b8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b(\u0010C\u001a\u0004\bH\u0010\nR \u0010)\u001a\u00020\b8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b)\u0010C\u001a\u0004\bI\u0010\nR\u0019\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010J\u001a\u0004\bK\u0010\u0017R\u0019\u0010+\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b+\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010,\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b,\u0010L\u001a\u0004\bO\u0010NR\u0019\u0010-\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b-\u0010L\u001a\u0004\bP\u0010NR\u0019\u0010.\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b.\u0010L\u001a\u0004\bQ\u0010NR\u0019\u0010/\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b/\u0010L\u001a\u0004\bR\u0010NR\u0019\u00100\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b0\u0010L\u001a\u0004\bS\u0010NR\u0019\u00101\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b1\u0010L\u001a\u0004\bT\u0010N\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006W"}, m28432d2 = {"Lcom/stripe/android/uicore/StripeTypography;", "", "", "component1", "component2", "component3", "", "component4", "LM26;", "component5-XSAIIZE", "()J", "component5", "component6-XSAIIZE", "component6", "component7-XSAIIZE", "component7", "component8-XSAIIZE", "component8", "component9-XSAIIZE", "component9", "component10-XSAIIZE", "component10", "component11", "()Ljava/lang/Integer;", "Lkw1;", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "fontWeightNormal", "fontWeightMedium", "fontWeightBold", "fontSizeMultiplier", "xxSmallFontSize", "xSmallFontSize", "smallFontSize", "mediumFontSize", "largeFontSize", "xLargeFontSize", "fontFamily", "body1FontFamily", "body2FontFamily", "h4FontFamily", "h5FontFamily", "h6FontFamily", "subtitle1FontFamily", "captionFontFamily", "copy-BZCqYng", "(IIIFJJJJJJLjava/lang/Integer;Lkw1;Lkw1;Lkw1;Lkw1;Lkw1;Lkw1;Lkw1;)Lcom/stripe/android/uicore/StripeTypography;", "copy", "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "I", "getFontWeightNormal", "()I", "getFontWeightMedium", "getFontWeightBold", "F", "getFontSizeMultiplier", "()F", "J", "getXxSmallFontSize-XSAIIZE", "getXSmallFontSize-XSAIIZE", "getSmallFontSize-XSAIIZE", "getMediumFontSize-XSAIIZE", "getLargeFontSize-XSAIIZE", "getXLargeFontSize-XSAIIZE", "Ljava/lang/Integer;", "getFontFamily", "Lkw1;", "getBody1FontFamily", "()Lkw1;", "getBody2FontFamily", "getH4FontFamily", "getH5FontFamily", "getH6FontFamily", "getSubtitle1FontFamily", "getCaptionFontFamily", "<init>", "(IIIFJJJJJJLjava/lang/Integer;Lkw1;Lkw1;Lkw1;Lkw1;Lkw1;Lkw1;Lkw1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class StripeTypography {
    public static final int $stable = 0;
    private final AbstractC44199kw1 body1FontFamily;
    private final AbstractC44199kw1 body2FontFamily;
    private final AbstractC44199kw1 captionFontFamily;
    private final Integer fontFamily;
    private final float fontSizeMultiplier;
    private final int fontWeightBold;
    private final int fontWeightMedium;
    private final int fontWeightNormal;
    private final AbstractC44199kw1 h4FontFamily;
    private final AbstractC44199kw1 h5FontFamily;
    private final AbstractC44199kw1 h6FontFamily;
    private final long largeFontSize;
    private final long mediumFontSize;
    private final long smallFontSize;
    private final AbstractC44199kw1 subtitle1FontFamily;
    private final long xLargeFontSize;
    private final long xSmallFontSize;
    private final long xxSmallFontSize;

    public /* synthetic */ StripeTypography(int i, int i2, int i3, float f, long j, long j2, long j3, long j4, long j5, long j6, Integer num, AbstractC44199kw1 abstractC44199kw1, AbstractC44199kw1 abstractC44199kw12, AbstractC44199kw1 abstractC44199kw13, AbstractC44199kw1 abstractC44199kw14, AbstractC44199kw1 abstractC44199kw15, AbstractC44199kw1 abstractC44199kw16, AbstractC44199kw1 abstractC44199kw17, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, f, j, j2, j3, j4, j5, j6, num, abstractC44199kw1, abstractC44199kw12, abstractC44199kw13, abstractC44199kw14, abstractC44199kw15, abstractC44199kw16, abstractC44199kw17);
    }

    public final int component1() {
        return this.fontWeightNormal;
    }

    /* renamed from: component10-XSAIIZE  reason: not valid java name */
    public final long m116715component10XSAIIZE() {
        return this.xLargeFontSize;
    }

    public final Integer component11() {
        return this.fontFamily;
    }

    public final AbstractC44199kw1 component12() {
        return this.body1FontFamily;
    }

    public final AbstractC44199kw1 component13() {
        return this.body2FontFamily;
    }

    public final AbstractC44199kw1 component14() {
        return this.h4FontFamily;
    }

    public final AbstractC44199kw1 component15() {
        return this.h5FontFamily;
    }

    public final AbstractC44199kw1 component16() {
        return this.h6FontFamily;
    }

    public final AbstractC44199kw1 component17() {
        return this.subtitle1FontFamily;
    }

    public final AbstractC44199kw1 component18() {
        return this.captionFontFamily;
    }

    public final int component2() {
        return this.fontWeightMedium;
    }

    public final int component3() {
        return this.fontWeightBold;
    }

    public final float component4() {
        return this.fontSizeMultiplier;
    }

    /* renamed from: component5-XSAIIZE  reason: not valid java name */
    public final long m116716component5XSAIIZE() {
        return this.xxSmallFontSize;
    }

    /* renamed from: component6-XSAIIZE  reason: not valid java name */
    public final long m116717component6XSAIIZE() {
        return this.xSmallFontSize;
    }

    /* renamed from: component7-XSAIIZE  reason: not valid java name */
    public final long m116718component7XSAIIZE() {
        return this.smallFontSize;
    }

    /* renamed from: component8-XSAIIZE  reason: not valid java name */
    public final long m116719component8XSAIIZE() {
        return this.mediumFontSize;
    }

    /* renamed from: component9-XSAIIZE  reason: not valid java name */
    public final long m116720component9XSAIIZE() {
        return this.largeFontSize;
    }

    /* renamed from: copy-BZCqYng  reason: not valid java name */
    public final StripeTypography m116721copyBZCqYng(int i, int i2, int i3, float f, long j, long j2, long j3, long j4, long j5, long j6, Integer num, AbstractC44199kw1 abstractC44199kw1, AbstractC44199kw1 abstractC44199kw12, AbstractC44199kw1 abstractC44199kw13, AbstractC44199kw1 abstractC44199kw14, AbstractC44199kw1 abstractC44199kw15, AbstractC44199kw1 abstractC44199kw16, AbstractC44199kw1 abstractC44199kw17) {
        return new StripeTypography(i, i2, i3, f, j, j2, j3, j4, j5, j6, num, abstractC44199kw1, abstractC44199kw12, abstractC44199kw13, abstractC44199kw14, abstractC44199kw15, abstractC44199kw16, abstractC44199kw17, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StripeTypography) {
            StripeTypography stripeTypography = (StripeTypography) obj;
            return this.fontWeightNormal == stripeTypography.fontWeightNormal && this.fontWeightMedium == stripeTypography.fontWeightMedium && this.fontWeightBold == stripeTypography.fontWeightBold && Float.compare(this.fontSizeMultiplier, stripeTypography.fontSizeMultiplier) == 0 && M26.m95975e(this.xxSmallFontSize, stripeTypography.xxSmallFontSize) && M26.m95975e(this.xSmallFontSize, stripeTypography.xSmallFontSize) && M26.m95975e(this.smallFontSize, stripeTypography.smallFontSize) && M26.m95975e(this.mediumFontSize, stripeTypography.mediumFontSize) && M26.m95975e(this.largeFontSize, stripeTypography.largeFontSize) && M26.m95975e(this.xLargeFontSize, stripeTypography.xLargeFontSize) && Intrinsics.areEqual(this.fontFamily, stripeTypography.fontFamily) && Intrinsics.areEqual(this.body1FontFamily, stripeTypography.body1FontFamily) && Intrinsics.areEqual(this.body2FontFamily, stripeTypography.body2FontFamily) && Intrinsics.areEqual(this.h4FontFamily, stripeTypography.h4FontFamily) && Intrinsics.areEqual(this.h5FontFamily, stripeTypography.h5FontFamily) && Intrinsics.areEqual(this.h6FontFamily, stripeTypography.h6FontFamily) && Intrinsics.areEqual(this.subtitle1FontFamily, stripeTypography.subtitle1FontFamily) && Intrinsics.areEqual(this.captionFontFamily, stripeTypography.captionFontFamily);
        }
        return false;
    }

    public final AbstractC44199kw1 getBody1FontFamily() {
        return this.body1FontFamily;
    }

    public final AbstractC44199kw1 getBody2FontFamily() {
        return this.body2FontFamily;
    }

    public final AbstractC44199kw1 getCaptionFontFamily() {
        return this.captionFontFamily;
    }

    public final Integer getFontFamily() {
        return this.fontFamily;
    }

    public final float getFontSizeMultiplier() {
        return this.fontSizeMultiplier;
    }

    public final int getFontWeightBold() {
        return this.fontWeightBold;
    }

    public final int getFontWeightMedium() {
        return this.fontWeightMedium;
    }

    public final int getFontWeightNormal() {
        return this.fontWeightNormal;
    }

    public final AbstractC44199kw1 getH4FontFamily() {
        return this.h4FontFamily;
    }

    public final AbstractC44199kw1 getH5FontFamily() {
        return this.h5FontFamily;
    }

    public final AbstractC44199kw1 getH6FontFamily() {
        return this.h6FontFamily;
    }

    /* renamed from: getLargeFontSize-XSAIIZE  reason: not valid java name */
    public final long m116722getLargeFontSizeXSAIIZE() {
        return this.largeFontSize;
    }

    /* renamed from: getMediumFontSize-XSAIIZE  reason: not valid java name */
    public final long m116723getMediumFontSizeXSAIIZE() {
        return this.mediumFontSize;
    }

    /* renamed from: getSmallFontSize-XSAIIZE  reason: not valid java name */
    public final long m116724getSmallFontSizeXSAIIZE() {
        return this.smallFontSize;
    }

    public final AbstractC44199kw1 getSubtitle1FontFamily() {
        return this.subtitle1FontFamily;
    }

    /* renamed from: getXLargeFontSize-XSAIIZE  reason: not valid java name */
    public final long m116725getXLargeFontSizeXSAIIZE() {
        return this.xLargeFontSize;
    }

    /* renamed from: getXSmallFontSize-XSAIIZE  reason: not valid java name */
    public final long m116726getXSmallFontSizeXSAIIZE() {
        return this.xSmallFontSize;
    }

    /* renamed from: getXxSmallFontSize-XSAIIZE  reason: not valid java name */
    public final long m116727getXxSmallFontSizeXSAIIZE() {
        return this.xxSmallFontSize;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((Integer.hashCode(this.fontWeightNormal) * 31) + Integer.hashCode(this.fontWeightMedium)) * 31) + Integer.hashCode(this.fontWeightBold)) * 31) + Float.hashCode(this.fontSizeMultiplier)) * 31) + M26.m95971i(this.xxSmallFontSize)) * 31) + M26.m95971i(this.xSmallFontSize)) * 31) + M26.m95971i(this.smallFontSize)) * 31) + M26.m95971i(this.mediumFontSize)) * 31) + M26.m95971i(this.largeFontSize)) * 31) + M26.m95971i(this.xLargeFontSize)) * 31;
        Integer num = this.fontFamily;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        AbstractC44199kw1 abstractC44199kw1 = this.body1FontFamily;
        int hashCode3 = (hashCode2 + (abstractC44199kw1 == null ? 0 : abstractC44199kw1.hashCode())) * 31;
        AbstractC44199kw1 abstractC44199kw12 = this.body2FontFamily;
        int hashCode4 = (hashCode3 + (abstractC44199kw12 == null ? 0 : abstractC44199kw12.hashCode())) * 31;
        AbstractC44199kw1 abstractC44199kw13 = this.h4FontFamily;
        int hashCode5 = (hashCode4 + (abstractC44199kw13 == null ? 0 : abstractC44199kw13.hashCode())) * 31;
        AbstractC44199kw1 abstractC44199kw14 = this.h5FontFamily;
        int hashCode6 = (hashCode5 + (abstractC44199kw14 == null ? 0 : abstractC44199kw14.hashCode())) * 31;
        AbstractC44199kw1 abstractC44199kw15 = this.h6FontFamily;
        int hashCode7 = (hashCode6 + (abstractC44199kw15 == null ? 0 : abstractC44199kw15.hashCode())) * 31;
        AbstractC44199kw1 abstractC44199kw16 = this.subtitle1FontFamily;
        int hashCode8 = (hashCode7 + (abstractC44199kw16 == null ? 0 : abstractC44199kw16.hashCode())) * 31;
        AbstractC44199kw1 abstractC44199kw17 = this.captionFontFamily;
        return hashCode8 + (abstractC44199kw17 != null ? abstractC44199kw17.hashCode() : 0);
    }

    public String toString() {
        int i = this.fontWeightNormal;
        int i2 = this.fontWeightMedium;
        int i3 = this.fontWeightBold;
        float f = this.fontSizeMultiplier;
        String m95970j = M26.m95970j(this.xxSmallFontSize);
        String m95970j2 = M26.m95970j(this.xSmallFontSize);
        String m95970j3 = M26.m95970j(this.smallFontSize);
        String m95970j4 = M26.m95970j(this.mediumFontSize);
        String m95970j5 = M26.m95970j(this.largeFontSize);
        String m95970j6 = M26.m95970j(this.xLargeFontSize);
        Integer num = this.fontFamily;
        AbstractC44199kw1 abstractC44199kw1 = this.body1FontFamily;
        AbstractC44199kw1 abstractC44199kw12 = this.body2FontFamily;
        AbstractC44199kw1 abstractC44199kw13 = this.h4FontFamily;
        AbstractC44199kw1 abstractC44199kw14 = this.h5FontFamily;
        AbstractC44199kw1 abstractC44199kw15 = this.h6FontFamily;
        AbstractC44199kw1 abstractC44199kw16 = this.subtitle1FontFamily;
        AbstractC44199kw1 abstractC44199kw17 = this.captionFontFamily;
        return "StripeTypography(fontWeightNormal=" + i + ", fontWeightMedium=" + i2 + ", fontWeightBold=" + i3 + ", fontSizeMultiplier=" + f + ", xxSmallFontSize=" + m95970j + ", xSmallFontSize=" + m95970j2 + ", smallFontSize=" + m95970j3 + ", mediumFontSize=" + m95970j4 + ", largeFontSize=" + m95970j5 + ", xLargeFontSize=" + m95970j6 + ", fontFamily=" + num + ", body1FontFamily=" + abstractC44199kw1 + ", body2FontFamily=" + abstractC44199kw12 + ", h4FontFamily=" + abstractC44199kw13 + ", h5FontFamily=" + abstractC44199kw14 + ", h6FontFamily=" + abstractC44199kw15 + ", subtitle1FontFamily=" + abstractC44199kw16 + ", captionFontFamily=" + abstractC44199kw17 + ")";
    }

    private StripeTypography(int i, int i2, int i3, float f, long j, long j2, long j3, long j4, long j5, long j6, Integer num, AbstractC44199kw1 abstractC44199kw1, AbstractC44199kw1 abstractC44199kw12, AbstractC44199kw1 abstractC44199kw13, AbstractC44199kw1 abstractC44199kw14, AbstractC44199kw1 abstractC44199kw15, AbstractC44199kw1 abstractC44199kw16, AbstractC44199kw1 abstractC44199kw17) {
        this.fontWeightNormal = i;
        this.fontWeightMedium = i2;
        this.fontWeightBold = i3;
        this.fontSizeMultiplier = f;
        this.xxSmallFontSize = j;
        this.xSmallFontSize = j2;
        this.smallFontSize = j3;
        this.mediumFontSize = j4;
        this.largeFontSize = j5;
        this.xLargeFontSize = j6;
        this.fontFamily = num;
        this.body1FontFamily = abstractC44199kw1;
        this.body2FontFamily = abstractC44199kw12;
        this.h4FontFamily = abstractC44199kw13;
        this.h5FontFamily = abstractC44199kw14;
        this.h6FontFamily = abstractC44199kw15;
        this.subtitle1FontFamily = abstractC44199kw16;
        this.captionFontFamily = abstractC44199kw17;
    }

    public /* synthetic */ StripeTypography(int i, int i2, int i3, float f, long j, long j2, long j3, long j4, long j5, long j6, Integer num, AbstractC44199kw1 abstractC44199kw1, AbstractC44199kw1 abstractC44199kw12, AbstractC44199kw1 abstractC44199kw13, AbstractC44199kw1 abstractC44199kw14, AbstractC44199kw1 abstractC44199kw15, AbstractC44199kw1 abstractC44199kw16, AbstractC44199kw1 abstractC44199kw17, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, f, j, j2, j3, j4, j5, j6, num, (i4 & 2048) != 0 ? null : abstractC44199kw1, (i4 & 4096) != 0 ? null : abstractC44199kw12, (i4 & 8192) != 0 ? null : abstractC44199kw13, (i4 & 16384) != 0 ? null : abstractC44199kw14, (32768 & i4) != 0 ? null : abstractC44199kw15, (65536 & i4) != 0 ? null : abstractC44199kw16, (i4 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : abstractC44199kw17, null);
    }
}
