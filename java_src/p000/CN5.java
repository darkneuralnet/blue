package p000;

import android.util.Log;
import com.bumptech.glide.load.data.InterfaceC17126a;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p000.IS0;
import p000.JS0;
import p000.WU2;
/* renamed from: CN5 */
/* loaded from: classes5.dex */
public class CN5 implements JS0, JS0.InterfaceC4085a {

    /* renamed from: b */
    public final C46305oV0<?> f4013b;

    /* renamed from: c */
    public final JS0.InterfaceC4085a f4014c;

    /* renamed from: d */
    public volatile int f4015d;

    /* renamed from: e */
    public volatile BS0 f4016e;

    /* renamed from: f */
    public volatile Object f4017f;

    /* renamed from: g */
    public volatile WU2.C9060a<?> f4018g;

    /* renamed from: h */
    public volatile CS0 f4019h;

    /* renamed from: CN5$a */
    /* loaded from: classes5.dex */
    public class C1020a implements IS0.InterfaceC3534a<Object> {

        /* renamed from: b */
        public final /* synthetic */ WU2.C9060a f4020b;

        public C1020a(WU2.C9060a c9060a) {
            this.f4020b = c9060a;
        }

        @Override // p000.IS0.InterfaceC3534a
        /* renamed from: c */
        public void mo77098c(Object obj) {
            if (CN5.this.m112281g(this.f4020b)) {
                CN5.this.m112280h(this.f4020b, obj);
            }
        }

        @Override // p000.IS0.InterfaceC3534a
        /* renamed from: d */
        public void mo77097d(Exception exc) {
            if (CN5.this.m112281g(this.f4020b)) {
                CN5.this.m112279i(this.f4020b, exc);
            }
        }
    }

    public CN5(C46305oV0<?> c46305oV0, JS0.InterfaceC4085a interfaceC4085a) {
        this.f4013b = c46305oV0;
        this.f4014c = interfaceC4085a;
    }

    @Override // p000.JS0.InterfaceC4085a
    /* renamed from: a */
    public void mo15881a(InterfaceC38133ak2 interfaceC38133ak2, Exception exc, IS0<?> is0, ZS0 zs0) {
        this.f4014c.mo15881a(interfaceC38133ak2, exc, is0, this.f4018g.f41160c.mo19947b());
    }

    @Override // p000.JS0
    /* renamed from: b */
    public boolean mo77099b() {
        if (this.f4017f != null) {
            Object obj = this.f4017f;
            this.f4017f = null;
            try {
                if (!m112283e(obj)) {
                    return true;
                }
            } catch (IOException e) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
                }
            }
        }
        if (this.f4016e != null && this.f4016e.mo77099b()) {
            return true;
        }
        this.f4016e = null;
        this.f4018g = null;
        boolean z = false;
        while (!z && m112282f()) {
            List<WU2.C9060a<?>> m20978g = this.f4013b.m20978g();
            int i = this.f4015d;
            this.f4015d = i + 1;
            this.f4018g = m20978g.get(i);
            if (this.f4018g != null && (this.f4013b.m20980e().mo114754c(this.f4018g.f41160c.mo19947b()) || this.f4013b.m20964u(this.f4018g.f41160c.mo6834a()))) {
                m112278j(this.f4018g);
                z = true;
            }
        }
        return z;
    }

    @Override // p000.JS0.InterfaceC4085a
    /* renamed from: c */
    public void mo15879c(InterfaceC38133ak2 interfaceC38133ak2, Object obj, IS0<?> is0, ZS0 zs0, InterfaceC38133ak2 interfaceC38133ak22) {
        this.f4014c.mo15879c(interfaceC38133ak2, obj, is0, this.f4018g.f41160c.mo19947b(), interfaceC38133ak2);
    }

    @Override // p000.JS0
    public void cancel() {
        WU2.C9060a<?> c9060a = this.f4018g;
        if (c9060a != null) {
            c9060a.f41160c.cancel();
        }
    }

    @Override // p000.JS0.InterfaceC4085a
    /* renamed from: d */
    public void mo15878d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final boolean m112283e(Object obj) throws IOException {
        long m11168b = C49546tx2.m11168b();
        boolean z = false;
        try {
            InterfaceC17126a<T> m20970o = this.f4013b.m20970o(obj);
            Object mo53092a = m20970o.mo53092a();
            InterfaceC45175mb1<X> m20968q = this.f4013b.m20968q(mo53092a);
            DS0 ds0 = new DS0(m20968q, mo53092a, this.f4013b.m20974k());
            CS0 cs0 = new CS0(this.f4018g.f41158a, this.f4013b.m20969p());
            InterfaceC52578z41 m20981d = this.f4013b.m20981d();
            m20981d.mo1852b(cs0, ds0);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + cs0 + ", data: " + obj + ", encoder: " + m20968q + ", duration: " + C49546tx2.m11169a(m11168b));
            }
            if (m20981d.mo1853a(cs0) != null) {
                this.f4019h = cs0;
                this.f4016e = new BS0(Collections.singletonList(this.f4018g.f41158a), this.f4013b, this);
                this.f4018g.f41160c.cleanup();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f4019h + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f4014c.mo15879c(this.f4018g.f41158a, m20970o.mo53092a(), this.f4018g.f41160c, this.f4018g.f41160c.mo19947b(), this.f4018g.f41158a);
                return false;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.f4018g.f41160c.cleanup();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: f */
    public final boolean m112282f() {
        return this.f4015d < this.f4013b.m20978g().size();
    }

    /* renamed from: g */
    public boolean m112281g(WU2.C9060a<?> c9060a) {
        WU2.C9060a<?> c9060a2 = this.f4018g;
        return c9060a2 != null && c9060a2 == c9060a;
    }

    /* renamed from: h */
    public void m112280h(WU2.C9060a<?> c9060a, Object obj) {
        B41 m20980e = this.f4013b.m20980e();
        if (obj != null && m20980e.mo114754c(c9060a.f41160c.mo19947b())) {
            this.f4017f = obj;
            this.f4014c.mo15878d();
            return;
        }
        JS0.InterfaceC4085a interfaceC4085a = this.f4014c;
        InterfaceC38133ak2 interfaceC38133ak2 = c9060a.f41158a;
        IS0<?> is0 = c9060a.f41160c;
        interfaceC4085a.mo15879c(interfaceC38133ak2, obj, is0, is0.mo19947b(), this.f4019h);
    }

    /* renamed from: i */
    public void m112279i(WU2.C9060a<?> c9060a, Exception exc) {
        JS0.InterfaceC4085a interfaceC4085a = this.f4014c;
        CS0 cs0 = this.f4019h;
        IS0<?> is0 = c9060a.f41160c;
        interfaceC4085a.mo15881a(cs0, exc, is0, is0.mo19947b());
    }

    /* renamed from: j */
    public final void m112278j(WU2.C9060a<?> c9060a) {
        this.f4018g.f41160c.mo19946e(this.f4013b.m20973l(), new C1020a(c9060a));
    }
}
