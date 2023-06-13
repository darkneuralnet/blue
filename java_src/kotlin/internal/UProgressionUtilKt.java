package kotlin.internal;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;
@Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0006\u001a*\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m28432d2 = {"differenceModulo", "Lkotlin/UInt;", C17296a.f69688o, "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes8.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA  reason: not valid java name */
    private static final int m118014differenceModuloWZ9TVnA(int i, int i2, int i3) {
        int compare;
        int m101887a = C33509Ic6.m101887a(i, i3);
        int m101887a2 = C33509Ic6.m101887a(i2, i3);
        compare = Integer.compare(m101887a ^ Integer.MIN_VALUE, m101887a2 ^ Integer.MIN_VALUE);
        int m116878constructorimpl = UInt.m116878constructorimpl(m101887a - m101887a2);
        if (compare < 0) {
            return UInt.m116878constructorimpl(m116878constructorimpl + i3);
        }
        return m116878constructorimpl;
    }

    /* renamed from: differenceModulo-sambcqE  reason: not valid java name */
    private static final long m118015differenceModulosambcqE(long j, long j2, long j3) {
        int compare;
        long m96583a = C34211Lc6.m96583a(j, j3);
        long m96583a2 = C34211Lc6.m96583a(j2, j3);
        compare = Long.compare(m96583a ^ Long.MIN_VALUE, m96583a2 ^ Long.MIN_VALUE);
        long m116957constructorimpl = ULong.m116957constructorimpl(m96583a - m96583a2);
        if (compare < 0) {
            return ULong.m116957constructorimpl(m116957constructorimpl + j3);
        }
        return m116957constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-7ftBX0g  reason: not valid java name */
    public static final long m118016getProgressionLastElement7ftBX0g(long j, long j2, long j3) {
        int compare;
        int compare2;
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i > 0) {
            compare2 = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return ULong.m116957constructorimpl(j2 - m118015differenceModulosambcqE(j2, j, ULong.m116957constructorimpl(j3)));
            }
            return j2;
        } else if (i < 0) {
            compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            if (compare > 0) {
                return ULong.m116957constructorimpl(j2 + m118015differenceModulosambcqE(j, j2, ULong.m116957constructorimpl(-j3)));
            }
            return j2;
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-Nkh28Cs  reason: not valid java name */
    public static final int m118017getProgressionLastElementNkh28Cs(int i, int i2, int i3) {
        int compare;
        int compare2;
        if (i3 > 0) {
            compare2 = Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return UInt.m116878constructorimpl(i2 - m118014differenceModuloWZ9TVnA(i2, i, UInt.m116878constructorimpl(i3)));
            }
            return i2;
        } else if (i3 < 0) {
            compare = Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                return UInt.m116878constructorimpl(i2 + m118014differenceModuloWZ9TVnA(i, i2, UInt.m116878constructorimpl(-i3)));
            }
            return i2;
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }
}
