package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, m28432d2 = {"", "start", "end", "Ls26;", "b", "(II)J", "index", C17296a.f69688o, "(I)J", "minimumValue", "maximumValue", "c", "(JII)J", "", DateTokenConverter.CONVERTER_KEY, "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,128:1\n48#2:129\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n*L\n127#1:129\n*E\n"})
/* renamed from: t26  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49006t26 {
    /* renamed from: a */
    public static final long m13201a(int i) {
        return m13200b(i, i);
    }

    /* renamed from: b */
    public static final long m13200b(int i, int i2) {
        return C48413s26.m14843c(m13198d(i, i2));
    }

    /* renamed from: c */
    public static final long m13199c(long j, int i, int i2) {
        int coerceIn;
        int coerceIn2;
        coerceIn = RangesKt___RangesKt.coerceIn(C48413s26.m14832n(j), i, i2);
        coerceIn2 = RangesKt___RangesKt.coerceIn(C48413s26.m14837i(j), i, i2);
        if (coerceIn == C48413s26.m14832n(j) && coerceIn2 == C48413s26.m14837i(j)) {
            return j;
        }
        return m13200b(coerceIn, coerceIn2);
    }

    /* renamed from: d */
    public static final long m13198d(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 < 0) {
                z2 = false;
            }
            if (z2) {
                return (i2 & 4294967295L) | (i << 32);
            }
            throw new IllegalArgumentException(("end cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
        }
        throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
    }
}
