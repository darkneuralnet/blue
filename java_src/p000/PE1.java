package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
/* renamed from: PE1 */
/* loaded from: classes.dex */
public final class PE1 {

    /* renamed from: PE1$a */
    /* loaded from: classes.dex */
    public static class C6299a {
        private C6299a() {
        }

        /* renamed from: a */
        public static Handler m90561a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }

        /* renamed from: b */
        public static boolean m90560b(Handler handler, Runnable runnable, Object obj, long j) {
            boolean postDelayed;
            postDelayed = handler.postDelayed(runnable, obj, j);
            return postDelayed;
        }
    }

    private PE1() {
    }

    /* renamed from: a */
    public static Handler m90563a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C6299a.m90561a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* renamed from: b */
    public static boolean m90562b(Handler handler, Runnable runnable, Object obj, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C6299a.m90560b(handler, runnable, obj, j);
        }
        Message obtain = Message.obtain(handler, runnable);
        obtain.obj = obj;
        return handler.sendMessageDelayed(obtain, j);
    }
}
