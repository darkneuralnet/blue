package com.stripe.android.uicore;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001e\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u0005HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R \u0010\n\u001a\u00020\u00058\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/uicore/PrimaryButtonTypography;", "", "", "component1", "()Ljava/lang/Integer;", "LM26;", "component2-XSAIIZE", "()J", "component2", "fontFamily", "fontSize", "copy-mpE4wyQ", "(Ljava/lang/Integer;J)Lcom/stripe/android/uicore/PrimaryButtonTypography;", "copy", "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Integer;", "getFontFamily", "J", "getFontSize-XSAIIZE", "<init>", "(Ljava/lang/Integer;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PrimaryButtonTypography {
    public static final int $stable = 0;
    private final Integer fontFamily;
    private final long fontSize;

    public /* synthetic */ PrimaryButtonTypography(Integer num, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, j);
    }

    /* renamed from: copy-mpE4wyQ$default  reason: not valid java name */
    public static /* synthetic */ PrimaryButtonTypography m116680copympE4wyQ$default(PrimaryButtonTypography primaryButtonTypography, Integer num, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            num = primaryButtonTypography.fontFamily;
        }
        if ((i & 2) != 0) {
            j = primaryButtonTypography.fontSize;
        }
        return primaryButtonTypography.m116682copympE4wyQ(num, j);
    }

    public final Integer component1() {
        return this.fontFamily;
    }

    /* renamed from: component2-XSAIIZE  reason: not valid java name */
    public final long m116681component2XSAIIZE() {
        return this.fontSize;
    }

    /* renamed from: copy-mpE4wyQ  reason: not valid java name */
    public final PrimaryButtonTypography m116682copympE4wyQ(Integer num, long j) {
        return new PrimaryButtonTypography(num, j, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrimaryButtonTypography) {
            PrimaryButtonTypography primaryButtonTypography = (PrimaryButtonTypography) obj;
            return Intrinsics.areEqual(this.fontFamily, primaryButtonTypography.fontFamily) && M26.m95975e(this.fontSize, primaryButtonTypography.fontSize);
        }
        return false;
    }

    public final Integer getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: getFontSize-XSAIIZE  reason: not valid java name */
    public final long m116683getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    public int hashCode() {
        Integer num = this.fontFamily;
        return ((num == null ? 0 : num.hashCode()) * 31) + M26.m95971i(this.fontSize);
    }

    public String toString() {
        Integer num = this.fontFamily;
        String m95970j = M26.m95970j(this.fontSize);
        return "PrimaryButtonTypography(fontFamily=" + num + ", fontSize=" + m95970j + ")";
    }

    private PrimaryButtonTypography(Integer num, long j) {
        this.fontFamily = num;
        this.fontSize = j;
    }
}
