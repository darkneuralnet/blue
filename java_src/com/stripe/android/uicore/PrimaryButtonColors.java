package com.stripe.android.uicore;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0005\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\u0004J4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0004R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0019\u0010\u0004R \u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u001a\u0010\u0004\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/uicore/PrimaryButtonColors;", "", "Lpm0;", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "background", "onBackground", "border", "copy-ysEtTa8", "(JJJ)Lcom/stripe/android/uicore/PrimaryButtonColors;", "copy", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "J", "getBackground-0d7_KjU", "getOnBackground-0d7_KjU", "getBorder-0d7_KjU", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PrimaryButtonColors {
    public static final int $stable = 0;
    private final long background;
    private final long border;
    private final long onBackground;

    public /* synthetic */ PrimaryButtonColors(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    /* renamed from: copy-ysEtTa8$default  reason: not valid java name */
    public static /* synthetic */ PrimaryButtonColors m116672copyysEtTa8$default(PrimaryButtonColors primaryButtonColors, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = primaryButtonColors.background;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = primaryButtonColors.onBackground;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = primaryButtonColors.border;
        }
        return primaryButtonColors.m116676copyysEtTa8(j4, j5, j3);
    }

    /* renamed from: component1-0d7_KjU  reason: not valid java name */
    public final long m116673component10d7_KjU() {
        return this.background;
    }

    /* renamed from: component2-0d7_KjU  reason: not valid java name */
    public final long m116674component20d7_KjU() {
        return this.onBackground;
    }

    /* renamed from: component3-0d7_KjU  reason: not valid java name */
    public final long m116675component30d7_KjU() {
        return this.border;
    }

    /* renamed from: copy-ysEtTa8  reason: not valid java name */
    public final PrimaryButtonColors m116676copyysEtTa8(long j, long j2, long j3) {
        return new PrimaryButtonColors(j, j2, j3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrimaryButtonColors) {
            PrimaryButtonColors primaryButtonColors = (PrimaryButtonColors) obj;
            return C47063pm0.m18741o(this.background, primaryButtonColors.background) && C47063pm0.m18741o(this.onBackground, primaryButtonColors.onBackground) && C47063pm0.m18741o(this.border, primaryButtonColors.border);
        }
        return false;
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m116677getBackground0d7_KjU() {
        return this.background;
    }

    /* renamed from: getBorder-0d7_KjU  reason: not valid java name */
    public final long m116678getBorder0d7_KjU() {
        return this.border;
    }

    /* renamed from: getOnBackground-0d7_KjU  reason: not valid java name */
    public final long m116679getOnBackground0d7_KjU() {
        return this.onBackground;
    }

    public int hashCode() {
        return (((C47063pm0.m18735u(this.background) * 31) + C47063pm0.m18735u(this.onBackground)) * 31) + C47063pm0.m18735u(this.border);
    }

    public String toString() {
        String m18734v = C47063pm0.m18734v(this.background);
        String m18734v2 = C47063pm0.m18734v(this.onBackground);
        String m18734v3 = C47063pm0.m18734v(this.border);
        return "PrimaryButtonColors(background=" + m18734v + ", onBackground=" + m18734v2 + ", border=" + m18734v3 + ")";
    }

    private PrimaryButtonColors(long j, long j2, long j3) {
        this.background = j;
        this.onBackground = j2;
        this.border = j3;
    }
}
