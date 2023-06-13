package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* renamed from: M56 */
/* loaded from: classes6.dex */
public final class M56 {

    /* renamed from: d */
    public static WeakReference<M56> f22620d;

    /* renamed from: a */
    public final SharedPreferences f22621a;

    /* renamed from: b */
    public C39490cz5 f22622b;

    /* renamed from: c */
    public final Executor f22623c;

    public M56(SharedPreferences sharedPreferences, Executor executor) {
        this.f22623c = executor;
        this.f22621a = sharedPreferences;
    }

    /* renamed from: b */
    public static synchronized M56 m95830b(Context context, Executor executor) {
        M56 m56;
        synchronized (M56.class) {
            WeakReference<M56> weakReference = f22620d;
            if (weakReference != null) {
                m56 = weakReference.get();
            } else {
                m56 = null;
            }
            if (m56 == null) {
                m56 = new M56(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                m56.m95828d();
                f22620d = new WeakReference<>(m56);
            }
        }
        return m56;
    }

    /* renamed from: a */
    public synchronized boolean m95831a(L56 l56) {
        return this.f22622b.m44768b(l56.m97780e());
    }

    /* renamed from: c */
    public synchronized L56 m95829c() {
        return L56.m97784a(this.f22622b.m44764f());
    }

    /* renamed from: d */
    public final synchronized void m95828d() {
        this.f22622b = C39490cz5.m44766d(this.f22621a, "topic_operation_queue", ",", this.f22623c);
    }

    /* renamed from: e */
    public synchronized boolean m95827e(L56 l56) {
        return this.f22622b.m44763g(l56.m97780e());
    }
}
