package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, m28432d2 = {"", C17296a.f69688o, "I", "MAX_CHARS_IN_POOL", "kotlinx-serialization-json"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: uo */
/* loaded from: classes8.dex */
public final class C29307uo {

    /* renamed from: a */
    public static final int f113001a;

    static {
        Object m116783constructorimpl;
        int i;
        Integer intOrNull;
        try {
            Result.Companion companion = Result.Companion;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(property);
            m116783constructorimpl = Result.m116783constructorimpl(intOrNull);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
            m116783constructorimpl = null;
        }
        Integer num = (Integer) m116783constructorimpl;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2097152;
        }
        f113001a = i;
    }
}
