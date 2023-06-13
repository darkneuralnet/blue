package p000;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.C17216a;
import java.lang.ref.WeakReference;
/* renamed from: Ql0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C35456Ql0 {

    /* renamed from: Ql0$a */
    /* loaded from: classes5.dex */
    public static class RunnableC6857a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f30831b;

        /* renamed from: c */
        public final /* synthetic */ Bundle f30832c;

        public RunnableC6857a(String str, Bundle bundle) {
            this.f30831b = str;
            this.f30832c = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                C9459Xi.m76550h(C17216a.m52741e()).m76551g(this.f30831b, this.f30832c);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: Ql0$b */
    /* loaded from: classes5.dex */
    public static class View$OnClickListenerC6858b implements View.OnClickListener {

        /* renamed from: b */
        public C52932zg1 f30833b;

        /* renamed from: c */
        public WeakReference<View> f30834c;

        /* renamed from: d */
        public WeakReference<View> f30835d;

        /* renamed from: e */
        public View.OnClickListener f30836e;

        /* renamed from: f */
        public boolean f30837f;

        public /* synthetic */ View$OnClickListenerC6858b(C52932zg1 c52932zg1, View view, View view2, RunnableC6857a runnableC6857a) {
            this(c52932zg1, view, view2);
        }

        /* renamed from: a */
        public boolean m88089a() {
            return this.f30837f;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                View.OnClickListener onClickListener = this.f30836e;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                if (this.f30835d.get() != null && this.f30834c.get() != null) {
                    C35456Ql0.m88094a(this.f30833b, this.f30835d.get(), this.f30834c.get());
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }

        public View$OnClickListenerC6858b(C52932zg1 c52932zg1, View view, View view2) {
            this.f30837f = false;
            if (c52932zg1 == null || view == null || view2 == null) {
                return;
            }
            this.f30836e = C45933nr6.m22285g(view2);
            this.f30833b = c52932zg1;
            this.f30834c = new WeakReference<>(view2);
            this.f30835d = new WeakReference<>(view);
            this.f30837f = true;
        }
    }

    /* renamed from: Ql0$c */
    /* loaded from: classes5.dex */
    public static class C6859c implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public C52932zg1 f30838b;

        /* renamed from: c */
        public WeakReference<AdapterView> f30839c;

        /* renamed from: d */
        public WeakReference<View> f30840d;

        /* renamed from: e */
        public AdapterView.OnItemClickListener f30841e;

        /* renamed from: f */
        public boolean f30842f;

        public /* synthetic */ C6859c(C52932zg1 c52932zg1, View view, AdapterView adapterView, RunnableC6857a runnableC6857a) {
            this(c52932zg1, view, adapterView);
        }

        /* renamed from: a */
        public boolean m88088a() {
            return this.f30842f;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            AdapterView.OnItemClickListener onItemClickListener = this.f30841e;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
            if (this.f30840d.get() != null && this.f30839c.get() != null) {
                C35456Ql0.m88094a(this.f30838b, this.f30840d.get(), this.f30839c.get());
            }
        }

        public C6859c(C52932zg1 c52932zg1, View view, AdapterView adapterView) {
            this.f30842f = false;
            if (c52932zg1 == null || view == null || adapterView == null) {
                return;
            }
            this.f30841e = adapterView.getOnItemClickListener();
            this.f30838b = c52932zg1;
            this.f30839c = new WeakReference<>(adapterView);
            this.f30840d = new WeakReference<>(view);
            this.f30842f = true;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m88094a(C52932zg1 c52932zg1, View view, View view2) {
        if (TD0.m84203d(C35456Ql0.class)) {
            return;
        }
        try {
            m88091d(c52932zg1, view, view2);
        } catch (Throwable th) {
            TD0.m84205b(th, C35456Ql0.class);
        }
    }

    /* renamed from: b */
    public static View$OnClickListenerC6858b m88093b(C52932zg1 c52932zg1, View view, View view2) {
        if (TD0.m84203d(C35456Ql0.class)) {
            return null;
        }
        try {
            return new View$OnClickListenerC6858b(c52932zg1, view, view2, null);
        } catch (Throwable th) {
            TD0.m84205b(th, C35456Ql0.class);
            return null;
        }
    }

    /* renamed from: c */
    public static C6859c m88092c(C52932zg1 c52932zg1, View view, AdapterView adapterView) {
        if (TD0.m84203d(C35456Ql0.class)) {
            return null;
        }
        try {
            return new C6859c(c52932zg1, view, adapterView, null);
        } catch (Throwable th) {
            TD0.m84205b(th, C35456Ql0.class);
            return null;
        }
    }

    /* renamed from: d */
    public static void m88091d(C52932zg1 c52932zg1, View view, View view2) {
        if (TD0.m84203d(C35456Ql0.class)) {
            return;
        }
        try {
            String m602b = c52932zg1.m602b();
            Bundle m84902f = C35924Sl0.m84902f(c52932zg1, view, view2);
            m88090e(m84902f);
            C17216a.m52731o().execute(new RunnableC6857a(m602b, m84902f));
        } catch (Throwable th) {
            TD0.m84205b(th, C35456Ql0.class);
        }
    }

    /* renamed from: e */
    public static void m88090e(Bundle bundle) {
        if (TD0.m84203d(C35456Ql0.class)) {
            return;
        }
        try {
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                bundle.putDouble("_valueToSum", C9155Wi.m77973g(string));
            }
            bundle.putString("_is_fb_codeless", "1");
        } catch (Throwable th) {
            TD0.m84205b(th, C35456Ql0.class);
        }
    }
}
