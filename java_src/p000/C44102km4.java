package p000;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.C17216a;
import java.lang.ref.WeakReference;
/* renamed from: km4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C44102km4 {

    /* renamed from: km4$a */
    /* loaded from: classes5.dex */
    public static class View$OnTouchListenerC25231a implements View.OnTouchListener {

        /* renamed from: b */
        public C52932zg1 f94901b;

        /* renamed from: c */
        public WeakReference<View> f94902c;

        /* renamed from: d */
        public WeakReference<View> f94903d;

        /* renamed from: e */
        public View.OnTouchListener f94904e;

        /* renamed from: f */
        public boolean f94905f;

        /* renamed from: km4$a$a */
        /* loaded from: classes5.dex */
        public class RunnableC25232a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ String f94906b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f94907c;

            public RunnableC25232a(String str, Bundle bundle) {
                this.f94906b = str;
                this.f94907c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (TD0.m84203d(this)) {
                    return;
                }
                try {
                    C9459Xi.m76550h(C17216a.m52741e()).m76551g(this.f94906b, this.f94907c);
                } catch (Throwable th) {
                    TD0.m84205b(th, this);
                }
            }
        }

        public View$OnTouchListenerC25231a(C52932zg1 c52932zg1, View view, View view2) {
            this.f94905f = false;
            if (c52932zg1 != null && view != null && view2 != null) {
                this.f94904e = C45933nr6.m22284h(view2);
                this.f94901b = c52932zg1;
                this.f94902c = new WeakReference<>(view2);
                this.f94903d = new WeakReference<>(view);
                this.f94905f = true;
            }
        }

        /* renamed from: a */
        public boolean m28462a() {
            return this.f94905f;
        }

        /* renamed from: b */
        public final void m28461b() {
            C52932zg1 c52932zg1 = this.f94901b;
            if (c52932zg1 == null) {
                return;
            }
            String m602b = c52932zg1.m602b();
            Bundle m84902f = C35924Sl0.m84902f(this.f94901b, this.f94903d.get(), this.f94902c.get());
            if (m84902f.containsKey("_valueToSum")) {
                m84902f.putDouble("_valueToSum", C9155Wi.m77973g(m84902f.getString("_valueToSum")));
            }
            m84902f.putString("_is_fb_codeless", "1");
            C17216a.m52731o().execute(new RunnableC25232a(m602b, m84902f));
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                m28461b();
            }
            View.OnTouchListener onTouchListener = this.f94904e;
            if (onTouchListener != null && onTouchListener.onTouch(view, motionEvent)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static View$OnTouchListenerC25231a m28463a(C52932zg1 c52932zg1, View view, View view2) {
        if (TD0.m84203d(C44102km4.class)) {
            return null;
        }
        try {
            return new View$OnTouchListenerC25231a(c52932zg1, view, view2);
        } catch (Throwable th) {
            TD0.m84205b(th, C44102km4.class);
            return null;
        }
    }
}
