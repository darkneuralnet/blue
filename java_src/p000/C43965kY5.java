package p000;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt__StringNumberConversionsKt;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a,\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000\u001a,\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\tH\u0000¨\u0006\u000b"}, m28432d2 = {"", "propertyName", "", "defaultValue", "c", "", "minValue", "maxValue", C17296a.f69688o, "", "b", "kotlinx-coroutines-core"}, m28431k = 5, m28430mv = {1, 6, 0}, m28427xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* renamed from: kY5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C43965kY5 {
    /* renamed from: a */
    public static final int m28849a(String str, int i, int i2, int i3) {
        return (int) C42779iY5.m33824c(str, i, i2, i3);
    }

    /* renamed from: b */
    public static final long m28848b(String str, long j, long j2, long j3) {
        Long longOrNull;
        String m33823d = C42779iY5.m33823d(str);
        if (m33823d == null) {
            return j;
        }
        longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(m33823d);
        if (longOrNull != null) {
            long longValue = longOrNull.longValue();
            boolean z = false;
            if (j2 <= longValue && longValue <= j3) {
                z = true;
            }
            if (z) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + CallerDataConverter.DEFAULT_RANGE_DELIMITER + j3 + ", but is '" + longValue + CoreConstants.SINGLE_QUOTE_CHAR).toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + m33823d + CoreConstants.SINGLE_QUOTE_CHAR).toString());
    }

    /* renamed from: c */
    public static final boolean m28847c(String str, boolean z) {
        String m33823d = C42779iY5.m33823d(str);
        return m33823d != null ? Boolean.parseBoolean(m33823d) : z;
    }

    /* renamed from: d */
    public static /* synthetic */ int m28846d(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return C42779iY5.m33825b(str, i, i2, i3);
    }

    /* renamed from: e */
    public static /* synthetic */ long m28845e(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = LongCompanionObject.MAX_VALUE;
        }
        return C42779iY5.m33824c(str, j, j4, j3);
    }
}