package p000;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: Zr6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewTreeObserver$OnGlobalLayoutListenerC37622Zr6 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: e */
    public static final Map<Integer, ViewTreeObserver$OnGlobalLayoutListenerC37622Zr6> f49410e = new HashMap();

    /* renamed from: b */
    public WeakReference<Activity> f49411b;

    /* renamed from: c */
    public final Handler f49412c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public AtomicBoolean f49413d = new AtomicBoolean(false);

    /* renamed from: Zr6$a */
    /* loaded from: classes5.dex */
    public class RunnableC10420a implements Runnable {
        public RunnableC10420a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                View m77975e = C9155Wi.m77975e((Activity) ViewTreeObserver$OnGlobalLayoutListenerC37622Zr6.m72392a(ViewTreeObserver$OnGlobalLayoutListenerC37622Zr6.this).get());
                Activity activity = (Activity) ViewTreeObserver$OnGlobalLayoutListenerC37622Zr6.m72392a(ViewTreeObserver$OnGlobalLayoutListenerC37622Zr6.this).get();
                if (m77975e != null && activity != null) {
                    for (View view : PU5.m90188a(m77975e)) {
                        if (!C32482Ds5.m109830g(view)) {
                            String m90185d = PU5.m90185d(view);
                            if (!m90185d.isEmpty() && m90185d.length() <= 300) {
                                View$OnClickListenerC38810bs6.m62248c(view, m77975e, activity.getLocalClassName());
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    public ViewTreeObserver$OnGlobalLayoutListenerC37622Zr6(Activity activity) {
        this.f49411b = new WeakReference<>(activity);
    }

    /* renamed from: a */
    public static /* synthetic */ WeakReference m72392a(ViewTreeObserver$OnGlobalLayoutListenerC37622Zr6 viewTreeObserver$OnGlobalLayoutListenerC37622Zr6) {
        if (TD0.m84203d(ViewTreeObserver$OnGlobalLayoutListenerC37622Zr6.class)) {
            return null;
        }
        try {
            return viewTreeObserver$OnGlobalLayoutListenerC37622Zr6.f49411b;
        } catch (Throwable th) {
            TD0.m84205b(th, ViewTreeObserver$OnGlobalLayoutListenerC37622Zr6.class);
            return null;
        }
    }

    /* renamed from: d */
    public static void m72389d(Activity activity) {
        if (TD0.m84203d(ViewTreeObserver$OnGlobalLayoutListenerC37622Zr6.class)) {
            return;
        }
        try {
            int hashCode = activity.hashCode();
            Map<Integer, ViewTreeObserver$OnGlobalLayoutListenerC37622Zr6> map = f49410e;
            if (!map.containsKey(Integer.valueOf(hashCode))) {
                ViewTreeObserver$OnGlobalLayoutListenerC37622Zr6 viewTreeObserver$OnGlobalLayoutListenerC37622Zr6 = new ViewTreeObserver$OnGlobalLayoutListenerC37622Zr6(activity);
                map.put(Integer.valueOf(hashCode), viewTreeObserver$OnGlobalLayoutListenerC37622Zr6);
                viewTreeObserver$OnGlobalLayoutListenerC37622Zr6.m72390c();
            }
        } catch (Throwable th) {
            TD0.m84205b(th, ViewTreeObserver$OnGlobalLayoutListenerC37622Zr6.class);
        }
    }

    /* renamed from: f */
    public static void m72387f(Activity activity) {
        if (TD0.m84203d(ViewTreeObserver$OnGlobalLayoutListenerC37622Zr6.class)) {
            return;
        }
        try {
            int hashCode = activity.hashCode();
            Map<Integer, ViewTreeObserver$OnGlobalLayoutListenerC37622Zr6> map = f49410e;
            if (map.containsKey(Integer.valueOf(hashCode))) {
                map.remove(Integer.valueOf(hashCode));
                map.get(Integer.valueOf(hashCode)).m72388e();
            }
        } catch (Throwable th) {
            TD0.m84205b(th, ViewTreeObserver$OnGlobalLayoutListenerC37622Zr6.class);
        }
    }

    /* renamed from: b */
    public final void m72391b() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            RunnableC10420a runnableC10420a = new RunnableC10420a();
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnableC10420a.run();
            } else {
                this.f49412c.post(runnableC10420a);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: c */
    public final void m72390c() {
        View m77975e;
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (this.f49413d.getAndSet(true) || (m77975e = C9155Wi.m77975e(this.f49411b.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = m77975e.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                m72391b();
                this.f49411b.get();
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: e */
    public final void m72388e() {
        View m77975e;
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (!this.f49413d.getAndSet(false) || (m77975e = C9155Wi.m77975e(this.f49411b.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = m77975e.getViewTreeObserver();
            if (!viewTreeObserver.isAlive()) {
                return;
            }
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            m72391b();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }
}
