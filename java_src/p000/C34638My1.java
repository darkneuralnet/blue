package p000;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: My1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C34638My1 {

    /* renamed from: a */
    public final C5443b f23887a;

    /* renamed from: My1$a */
    /* loaded from: classes.dex */
    public static class C5441a extends C5443b {

        /* renamed from: e */
        public static HandlerThread f23888e;

        /* renamed from: f */
        public static Handler f23889f;

        /* renamed from: a */
        public int f23890a;

        /* renamed from: b */
        public SparseIntArray[] f23891b = new SparseIntArray[9];

        /* renamed from: c */
        public final ArrayList<WeakReference<Activity>> f23892c = new ArrayList<>();

        /* renamed from: d */
        public Window.OnFrameMetricsAvailableListener f23893d = new Window$OnFrameMetricsAvailableListenerC5442a();

        /* renamed from: My1$a$a */
        /* loaded from: classes.dex */
        public class Window$OnFrameMetricsAvailableListenerC5442a implements Window.OnFrameMetricsAvailableListener {
            public Window$OnFrameMetricsAvailableListenerC5442a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                C5441a c5441a = C5441a.this;
                if ((c5441a.f23890a & 1) != 0) {
                    c5441a.m94534e(c5441a.f23891b[0], frameMetrics.getMetric(8));
                }
                C5441a c5441a2 = C5441a.this;
                if ((c5441a2.f23890a & 2) != 0) {
                    c5441a2.m94534e(c5441a2.f23891b[1], frameMetrics.getMetric(1));
                }
                C5441a c5441a3 = C5441a.this;
                if ((c5441a3.f23890a & 4) != 0) {
                    c5441a3.m94534e(c5441a3.f23891b[2], frameMetrics.getMetric(3));
                }
                C5441a c5441a4 = C5441a.this;
                if ((c5441a4.f23890a & 8) != 0) {
                    c5441a4.m94534e(c5441a4.f23891b[3], frameMetrics.getMetric(4));
                }
                C5441a c5441a5 = C5441a.this;
                if ((c5441a5.f23890a & 16) != 0) {
                    c5441a5.m94534e(c5441a5.f23891b[4], frameMetrics.getMetric(5));
                }
                C5441a c5441a6 = C5441a.this;
                if ((c5441a6.f23890a & 64) != 0) {
                    c5441a6.m94534e(c5441a6.f23891b[6], frameMetrics.getMetric(7));
                }
                C5441a c5441a7 = C5441a.this;
                if ((c5441a7.f23890a & 32) != 0) {
                    c5441a7.m94534e(c5441a7.f23891b[5], frameMetrics.getMetric(6));
                }
                C5441a c5441a8 = C5441a.this;
                if ((c5441a8.f23890a & 128) != 0) {
                    c5441a8.m94534e(c5441a8.f23891b[7], frameMetrics.getMetric(0));
                }
                C5441a c5441a9 = C5441a.this;
                if ((c5441a9.f23890a & 256) != 0) {
                    c5441a9.m94534e(c5441a9.f23891b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public C5441a(int i) {
            this.f23890a = i;
        }

        @Override // p000.C34638My1.C5443b
        /* renamed from: a */
        public void mo94533a(Activity activity) {
            if (f23888e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f23888e = handlerThread;
                handlerThread.start();
                f23889f = new Handler(f23888e.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.f23891b;
                if (sparseIntArrayArr[i] == null && (this.f23890a & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f23893d, f23889f);
            this.f23892c.add(new WeakReference<>(activity));
        }

        @Override // p000.C34638My1.C5443b
        /* renamed from: b */
        public SparseIntArray[] mo94532b() {
            return this.f23891b;
        }

        @Override // p000.C34638My1.C5443b
        /* renamed from: c */
        public SparseIntArray[] mo94531c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f23892c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f23892c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f23893d);
            return this.f23891b;
        }

        @Override // p000.C34638My1.C5443b
        /* renamed from: d */
        public SparseIntArray[] mo94530d() {
            SparseIntArray[] sparseIntArrayArr = this.f23891b;
            this.f23891b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        /* renamed from: e */
        public void m94534e(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }
    }

    /* renamed from: My1$b */
    /* loaded from: classes.dex */
    public static class C5443b {
        /* renamed from: a */
        public void mo94533a(Activity activity) {
        }

        /* renamed from: b */
        public SparseIntArray[] mo94532b() {
            return null;
        }

        /* renamed from: c */
        public SparseIntArray[] mo94531c(Activity activity) {
            return null;
        }

        /* renamed from: d */
        public SparseIntArray[] mo94530d() {
            return null;
        }
    }

    public C34638My1() {
        this(1);
    }

    /* renamed from: a */
    public void m94538a(Activity activity) {
        this.f23887a.mo94533a(activity);
    }

    /* renamed from: b */
    public SparseIntArray[] m94537b() {
        return this.f23887a.mo94532b();
    }

    /* renamed from: c */
    public SparseIntArray[] m94536c(Activity activity) {
        return this.f23887a.mo94531c(activity);
    }

    /* renamed from: d */
    public SparseIntArray[] m94535d() {
        return this.f23887a.mo94530d();
    }

    public C34638My1(int i) {
        this.f23887a = new C5441a(i);
    }
}
