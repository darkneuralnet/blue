package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
/* renamed from: lQ5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C44486lQ5 {

    /* renamed from: a */
    public final HandlerThread f96166a;

    /* renamed from: b */
    public final InterfaceC37777a80 f96167b;

    /* renamed from: c */
    public final Handler f96168c;

    /* renamed from: d */
    public long f96169d;

    /* renamed from: e */
    public long f96170e;

    /* renamed from: f */
    public long f96171f;

    /* renamed from: g */
    public long f96172g;

    /* renamed from: h */
    public long f96173h;

    /* renamed from: i */
    public long f96174i;

    /* renamed from: j */
    public long f96175j;

    /* renamed from: k */
    public long f96176k;

    /* renamed from: l */
    public int f96177l;

    /* renamed from: m */
    public int f96178m;

    /* renamed from: n */
    public int f96179n;

    /* renamed from: lQ5$a */
    /* loaded from: classes6.dex */
    public static class HandlerC25696a extends Handler {

        /* renamed from: a */
        public final C44486lQ5 f96180a;

        /* renamed from: lQ5$a$a */
        /* loaded from: classes6.dex */
        public class RunnableC25697a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Message f96181b;

            public RunnableC25697a(Message message) {
                this.f96181b = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f96181b.what);
            }
        }

        public HandlerC25696a(Looper looper, C44486lQ5 c44486lQ5) {
            super(looper);
            this.f96180a = c44486lQ5;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                C42732iT3.f87356o.post(new RunnableC25697a(message));
                                return;
                            } else {
                                this.f96180a.m27300l((Long) message.obj);
                                return;
                            }
                        }
                        this.f96180a.m27303i(message.arg1);
                        return;
                    }
                    this.f96180a.m27304h(message.arg1);
                    return;
                }
                this.f96180a.m27301k();
                return;
            }
            this.f96180a.m27302j();
        }
    }

    public C44486lQ5(InterfaceC37777a80 interfaceC37777a80) {
        this.f96167b = interfaceC37777a80;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f96166a = handlerThread;
        handlerThread.start();
        C32861Fi6.m106704h(handlerThread.getLooper());
        this.f96168c = new HandlerC25696a(handlerThread.getLooper(), this);
    }

    /* renamed from: g */
    public static long m27305g(int i, long j) {
        return j / i;
    }

    /* renamed from: a */
    public C45079mQ5 m27311a() {
        return new C45079mQ5(this.f96167b.mo14517a(), this.f96167b.size(), this.f96169d, this.f96170e, this.f96171f, this.f96172g, this.f96173h, this.f96174i, this.f96175j, this.f96176k, this.f96177l, this.f96178m, this.f96179n, System.currentTimeMillis());
    }

    /* renamed from: b */
    public void m27310b(Bitmap bitmap) {
        m27299m(bitmap, 2);
    }

    /* renamed from: c */
    public void m27309c(Bitmap bitmap) {
        m27299m(bitmap, 3);
    }

    /* renamed from: d */
    public void m27308d() {
        this.f96168c.sendEmptyMessage(0);
    }

    /* renamed from: e */
    public void m27307e() {
        this.f96168c.sendEmptyMessage(1);
    }

    /* renamed from: f */
    public void m27306f(long j) {
        Handler handler = this.f96168c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j)));
    }

    /* renamed from: h */
    public void m27304h(long j) {
        int i = this.f96178m + 1;
        this.f96178m = i;
        long j2 = this.f96172g + j;
        this.f96172g = j2;
        this.f96175j = m27305g(i, j2);
    }

    /* renamed from: i */
    public void m27303i(long j) {
        this.f96179n++;
        long j2 = this.f96173h + j;
        this.f96173h = j2;
        this.f96176k = m27305g(this.f96178m, j2);
    }

    /* renamed from: j */
    public void m27302j() {
        this.f96169d++;
    }

    /* renamed from: k */
    public void m27301k() {
        this.f96170e++;
    }

    /* renamed from: l */
    public void m27300l(Long l) {
        this.f96177l++;
        long longValue = this.f96171f + l.longValue();
        this.f96171f = longValue;
        this.f96174i = m27305g(this.f96177l, longValue);
    }

    /* renamed from: m */
    public final void m27299m(Bitmap bitmap, int i) {
        int m106703i = C32861Fi6.m106703i(bitmap);
        Handler handler = this.f96168c;
        handler.sendMessage(handler.obtainMessage(i, m106703i, 0));
    }
}
