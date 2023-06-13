package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003*4\u0010\f\u001a\u0004\b\u0000\u0010\t\"\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\n2\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\n*L\u0010\u000f\u001a\u0004\b\u0000\u0010\t\" \u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\r0\n2 \u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\r0\n¨\u0006\u0010"}, m28432d2 = {"LFM4;", "", "c", "(LFM4;)Z", "isStatusRedirection", C17296a.f69688o, "isClientError", "b", "isServerError", "T", "Lkotlin/Triple;", "LpI4;", "ResponseOf", "LaN4;", "Lcom/github/kittinunf/fuel/core/FuelError;", "ResponseResultOf", "fuel"}, m28431k = 2, m28430mv = {1, 4, 0})
/* renamed from: JM4 */
/* loaded from: classes5.dex */
public final class JM4 {
    /* renamed from: a */
    public static final boolean m100649a(FM4 isClientError) {
        Intrinsics.checkNotNullParameter(isClientError, "$this$isClientError");
        if (isClientError.m107280d() / 100 == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m100648b(FM4 isServerError) {
        Intrinsics.checkNotNullParameter(isServerError, "$this$isServerError");
        if (isServerError.m107280d() / 100 == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m100647c(FM4 isStatusRedirection) {
        Intrinsics.checkNotNullParameter(isStatusRedirection, "$this$isStatusRedirection");
        if (isStatusRedirection.m107280d() / 100 == 3) {
            return true;
        }
        return false;
    }
}
