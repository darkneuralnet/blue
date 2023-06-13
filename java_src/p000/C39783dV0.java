package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, m28432d2 = {"Lkotlin/coroutines/Continuation;", "", "c", "", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", C17296a.f69688o, "classSimpleName", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: dV0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39783dV0 {
    /* renamed from: a */
    public static final String m44216a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m44215b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m44214c(Continuation<?> continuation) {
        String m116783constructorimpl;
        if (continuation instanceof L41) {
            return continuation.toString();
        }
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(continuation + '@' + m44215b(continuation));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m116786exceptionOrNullimpl(m116783constructorimpl) != null) {
            m116783constructorimpl = continuation.getClass().getName() + '@' + m44215b(continuation);
        }
        return (String) m116783constructorimpl;
    }
}
