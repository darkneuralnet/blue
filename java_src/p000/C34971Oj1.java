package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, m28432d2 = {"", C17296a.f69688o, "Z", "()Z", "ANDROID_DETECTED", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: Oj1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34971Oj1 {

    /* renamed from: a */
    public static final boolean f27136a;

    static {
        Object m116783constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        f27136a = Result.m116790isSuccessimpl(m116783constructorimpl);
    }

    /* renamed from: a */
    public static final boolean m91610a() {
        return f27136a;
    }
}
