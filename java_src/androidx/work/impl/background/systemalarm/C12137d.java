package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* renamed from: androidx.work.impl.background.systemalarm.d */
/* loaded from: classes.dex */
public class C12137d implements InterfaceC31677Ah1 {

    /* renamed from: l */
    public static final String f56265l = AbstractC32056Bx2.m113270i("SystemAlarmDispatcher");

    /* renamed from: b */
    public final Context f56266b;

    /* renamed from: c */
    public final InterfaceC45160mZ5 f56267c;

    /* renamed from: d */
    public final OG6 f56268d;

    /* renamed from: e */
    public final C42532i74 f56269e;

    /* renamed from: f */
    public final C37830aD6 f56270f;

    /* renamed from: g */
    public final C12134a f56271g;

    /* renamed from: h */
    public final List<Intent> f56272h;

    /* renamed from: i */
    public Intent f56273i;

    /* renamed from: j */
    public InterfaceC12140c f56274j;

    /* renamed from: k */
    public C43291jP5 f56275k;

    /* renamed from: androidx.work.impl.background.systemalarm.d$a */
    /* loaded from: classes.dex */
    public class RunnableC12138a implements Runnable {
        public RunnableC12138a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor mo25426b;
            RunnableC12141d runnableC12141d;
            synchronized (C12137d.this.f56272h) {
                C12137d c12137d = C12137d.this;
                c12137d.f56273i = c12137d.f56272h.get(0);
            }
            Intent intent = C12137d.this.f56273i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C12137d.this.f56273i.getIntExtra("KEY_START_ID", 0);
                AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
                String str = C12137d.f56265l;
                m113272e.mo113269a(str, "Processing command " + C12137d.this.f56273i + ", " + intExtra);
                Context context = C12137d.this.f56266b;
                PowerManager.WakeLock m73957b = C37433Yw6.m73957b(context, action + " (" + intExtra + ")");
                try {
                    AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
                    m113272e2.mo113269a(str, "Acquiring operation wake lock (" + action + ") " + m73957b);
                    m73957b.acquire();
                    C12137d c12137d2 = C12137d.this;
                    c12137d2.f56271g.m65520o(c12137d2.f56273i, intExtra, c12137d2);
                    AbstractC32056Bx2 m113272e3 = AbstractC32056Bx2.m113272e();
                    m113272e3.mo113269a(str, "Releasing operation wake lock (" + action + ") " + m73957b);
                    m73957b.release();
                    mo25426b = C12137d.this.f56267c.mo25426b();
                    runnableC12141d = new RunnableC12141d(C12137d.this);
                } catch (Throwable th) {
                    try {
                        AbstractC32056Bx2 m113272e4 = AbstractC32056Bx2.m113272e();
                        String str2 = C12137d.f56265l;
                        m113272e4.mo113266d(str2, "Unexpected error in onHandleIntent", th);
                        AbstractC32056Bx2 m113272e5 = AbstractC32056Bx2.m113272e();
                        m113272e5.mo113269a(str2, "Releasing operation wake lock (" + action + ") " + m73957b);
                        m73957b.release();
                        mo25426b = C12137d.this.f56267c.mo25426b();
                        runnableC12141d = new RunnableC12141d(C12137d.this);
                    } catch (Throwable th2) {
                        AbstractC32056Bx2 m113272e6 = AbstractC32056Bx2.m113272e();
                        String str3 = C12137d.f56265l;
                        m113272e6.mo113269a(str3, "Releasing operation wake lock (" + action + ") " + m73957b);
                        m73957b.release();
                        C12137d.this.f56267c.mo25426b().execute(new RunnableC12141d(C12137d.this));
                        throw th2;
                    }
                }
                mo25426b.execute(runnableC12141d);
            }
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$b */
    /* loaded from: classes.dex */
    public static class RunnableC12139b implements Runnable {

        /* renamed from: b */
        public final C12137d f56277b;

        /* renamed from: c */
        public final Intent f56278c;

        /* renamed from: d */
        public final int f56279d;

        public RunnableC12139b(C12137d c12137d, Intent intent, int i) {
            this.f56277b = c12137d;
            this.f56278c = intent;
            this.f56279d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f56277b.m65508a(this.f56278c, this.f56279d);
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$c */
    /* loaded from: classes.dex */
    public interface InterfaceC12140c {
        /* renamed from: b */
        void mo65497b();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d */
    /* loaded from: classes.dex */
    public static class RunnableC12141d implements Runnable {

        /* renamed from: b */
        public final C12137d f56280b;

        public RunnableC12141d(C12137d c12137d) {
            this.f56280b = c12137d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f56280b.m65506c();
        }
    }

    public C12137d(Context context) {
        this(context, null, null);
    }

    /* renamed from: a */
    public boolean m65508a(Intent intent, int i) {
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        String str = f56265l;
        m113272e.mo113269a(str, "Adding command " + intent + " (" + i + ")");
        m65507b();
        String action = intent.getAction();
        boolean z = false;
        if (TextUtils.isEmpty(action)) {
            AbstractC32056Bx2.m113272e().mo113262k(str, "Unknown command. Ignoring");
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m65501i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i);
            synchronized (this.f56272h) {
                if (!this.f56272h.isEmpty()) {
                    z = true;
                }
                this.f56272h.add(intent);
                if (!z) {
                    m65499k();
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public final void m65507b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }

    /* renamed from: c */
    public void m65506c() {
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        String str = f56265l;
        m113272e.mo113269a(str, "Checking if commands are complete.");
        m65507b();
        synchronized (this.f56272h) {
            if (this.f56273i != null) {
                AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
                m113272e2.mo113269a(str, "Removing command " + this.f56273i);
                if (this.f56272h.remove(0).equals(this.f56273i)) {
                    this.f56273i = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            InterfaceExecutorC35758Rs5 mo25425c = this.f56267c.mo25425c();
            if (!this.f56271g.m65521n() && this.f56272h.isEmpty() && !mo25425c.mo84690v()) {
                AbstractC32056Bx2.m113272e().mo113269a(str, "No more commands & intents.");
                InterfaceC12140c interfaceC12140c = this.f56274j;
                if (interfaceC12140c != null) {
                    interfaceC12140c.mo65497b();
                }
            } else if (!this.f56272h.isEmpty()) {
                m65499k();
            }
        }
    }

    @Override // p000.InterfaceC31677Ah1
    /* renamed from: d */
    public void mo34425d(TC6 tc6, boolean z) {
        this.f56267c.mo25426b().execute(new RunnableC12139b(this, C12134a.m65531c(this.f56266b, tc6, z), 0));
    }

    /* renamed from: e */
    public C42532i74 m65505e() {
        return this.f56269e;
    }

    /* renamed from: f */
    public InterfaceC45160mZ5 m65504f() {
        return this.f56267c;
    }

    /* renamed from: g */
    public C37830aD6 m65503g() {
        return this.f56270f;
    }

    /* renamed from: h */
    public OG6 m65502h() {
        return this.f56268d;
    }

    /* renamed from: i */
    public final boolean m65501i(String str) {
        m65507b();
        synchronized (this.f56272h) {
            for (Intent intent : this.f56272h) {
                if (str.equals(intent.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: j */
    public void m65500j() {
        AbstractC32056Bx2.m113272e().mo113269a(f56265l, "Destroying SystemAlarmDispatcher");
        this.f56269e.m34415n(this);
        this.f56274j = null;
    }

    /* renamed from: k */
    public final void m65499k() {
        m65507b();
        PowerManager.WakeLock m73957b = C37433Yw6.m73957b(this.f56266b, "ProcessCommand");
        try {
            m73957b.acquire();
            this.f56270f.m71755v().m25427a(new RunnableC12138a());
        } finally {
            m73957b.release();
        }
    }

    /* renamed from: l */
    public void m65498l(InterfaceC12140c interfaceC12140c) {
        if (this.f56274j != null) {
            AbstractC32056Bx2.m113272e().mo113267c(f56265l, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f56274j = interfaceC12140c;
        }
    }

    public C12137d(Context context, C42532i74 c42532i74, C37830aD6 c37830aD6) {
        Context applicationContext = context.getApplicationContext();
        this.f56266b = applicationContext;
        this.f56275k = new C43291jP5();
        this.f56271g = new C12134a(applicationContext, this.f56275k);
        c37830aD6 = c37830aD6 == null ? C37830aD6.m71761p(context) : c37830aD6;
        this.f56270f = c37830aD6;
        this.f56268d = new OG6(c37830aD6.m71763n().m65599k());
        c42532i74 = c42532i74 == null ? c37830aD6.m71759r() : c42532i74;
        this.f56269e = c42532i74;
        this.f56267c = c37830aD6.m71755v();
        c42532i74.m34422g(this);
        this.f56272h = new ArrayList();
        this.f56273i = null;
    }
}
