package p000;

import com.facebook.share.internal.C17296a;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\"\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005*\f\b\u0000\u0010\b\"\u00020\u00072\u00020\u0007¨\u0006\t"}, m28432d2 = {"Ljava/util/concurrent/Executor;", "executor", "", C17296a.f69688o, "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "REMOVE_FUTURE_ON_CANCEL", "Ljava/util/concurrent/locks/ReentrantLock;", "ReentrantLock", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: zu0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C53071zu0 {

    /* renamed from: a */
    public static final Method f122447a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f122447a = method;
    }

    /* renamed from: a */
    public static final boolean m148a(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor == null || (method = f122447a) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}