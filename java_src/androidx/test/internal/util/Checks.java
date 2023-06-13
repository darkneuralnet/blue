package androidx.test.internal.util;

import androidx.test.internal.platform.ServiceLoaderWrapper;
import androidx.test.internal.platform.ThreadChecker;
import java.util.List;
/* loaded from: classes.dex */
public final class Checks {

    /* renamed from: a */
    public static final ThreadChecker f55715a;

    static {
        List m66012a = ServiceLoaderWrapper.m66012a(ThreadChecker.class);
        if (m66012a.isEmpty()) {
            f55715a = new ThreadChecker() { // from class: androidx.test.internal.util.Checks.1
            };
        } else if (m66012a.size() == 1) {
            f55715a = (ThreadChecker) m66012a.get(0);
        } else {
            throw new IllegalStateException(String.format("Found more than one %s implementations.", ThreadChecker.class.getName()));
        }
    }

    private Checks() {
    }

    /* renamed from: a */
    public static <T> T m66011a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: b */
    public static <T> T m66010b(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
