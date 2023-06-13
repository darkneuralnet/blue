package p000;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
/* renamed from: gf */
/* loaded from: classes.dex */
public class C22398gf {

    /* renamed from: g */
    public static final ThreadLocal<C22398gf> f83976g = new ThreadLocal<>();

    /* renamed from: d */
    public AbstractC22401c f83980d;

    /* renamed from: a */
    public final NA5<InterfaceC22400b, Long> f83977a = new NA5<>();

    /* renamed from: b */
    public final ArrayList<InterfaceC22400b> f83978b = new ArrayList<>();

    /* renamed from: c */
    public final C22399a f83979c = new C22399a();

    /* renamed from: e */
    public long f83981e = 0;

    /* renamed from: f */
    public boolean f83982f = false;

    /* renamed from: gf$a */
    /* loaded from: classes.dex */
    public class C22399a {
        public C22399a() {
        }

        /* renamed from: a */
        public void m37928a() {
            C22398gf.this.f83981e = SystemClock.uptimeMillis();
            C22398gf c22398gf = C22398gf.this;
            c22398gf.m37933c(c22398gf.f83981e);
            if (C22398gf.this.f83978b.size() > 0) {
                C22398gf.this.m37931e().mo37927a();
            }
        }
    }

    /* renamed from: gf$b */
    /* loaded from: classes.dex */
    public interface InterfaceC22400b {
        /* renamed from: a */
        boolean mo19929a(long j);
    }

    /* renamed from: gf$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC22401c {

        /* renamed from: a */
        public final C22399a f83984a;

        public AbstractC22401c(C22399a c22399a) {
            this.f83984a = c22399a;
        }

        /* renamed from: a */
        public abstract void mo37927a();
    }

    /* renamed from: gf$d */
    /* loaded from: classes.dex */
    public static class C22402d extends AbstractC22401c {

        /* renamed from: b */
        public final Choreographer f83985b;

        /* renamed from: c */
        public final Choreographer.FrameCallback f83986c;

        /* renamed from: gf$d$a */
        /* loaded from: classes.dex */
        public class Choreographer$FrameCallbackC22403a implements Choreographer.FrameCallback {
            public Choreographer$FrameCallbackC22403a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                C22402d.this.f83984a.m37928a();
            }
        }

        public C22402d(C22399a c22399a) {
            super(c22399a);
            this.f83985b = Choreographer.getInstance();
            this.f83986c = new Choreographer$FrameCallbackC22403a();
        }

        @Override // p000.C22398gf.AbstractC22401c
        /* renamed from: a */
        public void mo37927a() {
            this.f83985b.postFrameCallback(this.f83986c);
        }
    }

    /* renamed from: d */
    public static C22398gf m37932d() {
        ThreadLocal<C22398gf> threadLocal = f83976g;
        if (threadLocal.get() == null) {
            threadLocal.set(new C22398gf());
        }
        return threadLocal.get();
    }

    /* renamed from: a */
    public void m37935a(InterfaceC22400b interfaceC22400b, long j) {
        if (this.f83978b.size() == 0) {
            m37931e().mo37927a();
        }
        if (!this.f83978b.contains(interfaceC22400b)) {
            this.f83978b.add(interfaceC22400b);
        }
        if (j > 0) {
            this.f83977a.put(interfaceC22400b, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* renamed from: b */
    public final void m37934b() {
        if (this.f83982f) {
            for (int size = this.f83978b.size() - 1; size >= 0; size--) {
                if (this.f83978b.get(size) == null) {
                    this.f83978b.remove(size);
                }
            }
            this.f83982f = false;
        }
    }

    /* renamed from: c */
    public void m37933c(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f83978b.size(); i++) {
            InterfaceC22400b interfaceC22400b = this.f83978b.get(i);
            if (interfaceC22400b != null && m37930f(interfaceC22400b, uptimeMillis)) {
                interfaceC22400b.mo19929a(j);
            }
        }
        m37934b();
    }

    /* renamed from: e */
    public AbstractC22401c m37931e() {
        if (this.f83980d == null) {
            this.f83980d = new C22402d(this.f83979c);
        }
        return this.f83980d;
    }

    /* renamed from: f */
    public final boolean m37930f(InterfaceC22400b interfaceC22400b, long j) {
        Long l = this.f83977a.get(interfaceC22400b);
        if (l == null) {
            return true;
        }
        if (l.longValue() < j) {
            this.f83977a.remove(interfaceC22400b);
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public void m37929g(InterfaceC22400b interfaceC22400b) {
        this.f83977a.remove(interfaceC22400b);
        int indexOf = this.f83978b.indexOf(interfaceC22400b);
        if (indexOf >= 0) {
            this.f83978b.set(indexOf, null);
            this.f83982f = true;
        }
    }
}
