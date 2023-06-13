package com.stripe.android.uicore.elements;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0005\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0004J*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0016\u0010\u0004\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/OTPElementColors;", "", "Lpm0;", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "selectedBorder", "placeholder", "copy--OWjLjI", "(JJ)Lcom/stripe/android/uicore/elements/OTPElementColors;", "copy", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "J", "getSelectedBorder-0d7_KjU", "getPlaceholder-0d7_KjU", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class OTPElementColors {
    public static final int $stable = 0;
    private final long placeholder;
    private final long selectedBorder;

    public /* synthetic */ OTPElementColors(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: copy--OWjLjI$default  reason: not valid java name */
    public static /* synthetic */ OTPElementColors m116736copyOWjLjI$default(OTPElementColors oTPElementColors, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = oTPElementColors.selectedBorder;
        }
        if ((i & 2) != 0) {
            j2 = oTPElementColors.placeholder;
        }
        return oTPElementColors.m116739copyOWjLjI(j, j2);
    }

    /* renamed from: component1-0d7_KjU  reason: not valid java name */
    public final long m116737component10d7_KjU() {
        return this.selectedBorder;
    }

    /* renamed from: component2-0d7_KjU  reason: not valid java name */
    public final long m116738component20d7_KjU() {
        return this.placeholder;
    }

    /* renamed from: copy--OWjLjI  reason: not valid java name */
    public final OTPElementColors m116739copyOWjLjI(long j, long j2) {
        return new OTPElementColors(j, j2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OTPElementColors) {
            OTPElementColors oTPElementColors = (OTPElementColors) obj;
            return C47063pm0.m18741o(this.selectedBorder, oTPElementColors.selectedBorder) && C47063pm0.m18741o(this.placeholder, oTPElementColors.placeholder);
        }
        return false;
    }

    /* renamed from: getPlaceholder-0d7_KjU  reason: not valid java name */
    public final long m116740getPlaceholder0d7_KjU() {
        return this.placeholder;
    }

    /* renamed from: getSelectedBorder-0d7_KjU  reason: not valid java name */
    public final long m116741getSelectedBorder0d7_KjU() {
        return this.selectedBorder;
    }

    public int hashCode() {
        return (C47063pm0.m18735u(this.selectedBorder) * 31) + C47063pm0.m18735u(this.placeholder);
    }

    public String toString() {
        String m18734v = C47063pm0.m18734v(this.selectedBorder);
        String m18734v2 = C47063pm0.m18734v(this.placeholder);
        return "OTPElementColors(selectedBorder=" + m18734v + ", placeholder=" + m18734v2 + ")";
    }

    private OTPElementColors(long j, long j2) {
        this.selectedBorder = j;
        this.placeholder = j2;
    }
}
