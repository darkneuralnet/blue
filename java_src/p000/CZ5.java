package p000;

import android.support.annotation.NonNull;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* renamed from: CZ5 */
/* loaded from: classes6.dex */
public final class CZ5 {
    private CZ5() {
    }

    /* renamed from: a */
    public static <ResultT> XY5<ResultT> m112114a(ResultT resultt) {
        C52769zO6 c52769zO6 = new C52769zO6();
        c52769zO6.m1420h(resultt);
        return c52769zO6;
    }

    /* renamed from: b */
    public static <ResultT> ResultT m112113b(@NonNull XY5<ResultT> xy5) throws ExecutionException, InterruptedException {
        MK6.m95438d(xy5, "Task must not be null");
        if (xy5.mo1422f()) {
            return (ResultT) m112111d(xy5);
        }
        EO6 eo6 = new EO6(null);
        m112110e(xy5, eo6);
        eo6.m109050a();
        return (ResultT) m112111d(xy5);
    }

    /* renamed from: c */
    public static <ResultT> XY5<ResultT> m112112c(Exception exc) {
        C52769zO6 c52769zO6 = new C52769zO6();
        c52769zO6.m1418j(exc);
        return c52769zO6;
    }

    /* renamed from: d */
    public static <ResultT> ResultT m112111d(XY5<ResultT> xy5) throws ExecutionException {
        if (xy5.mo1421g()) {
            return xy5.mo1423e();
        }
        throw new ExecutionException(xy5.mo1424d());
    }

    /* renamed from: e */
    public static void m112110e(XY5<?> xy5, EO6 eo6) {
        Executor executor = C46346oZ5.f102145b;
        xy5.mo1425c(executor, eo6);
        xy5.mo1426b(executor, eo6);
    }
}
