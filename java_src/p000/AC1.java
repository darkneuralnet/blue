package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* renamed from: AC1 */
/* loaded from: classes5.dex */
public class AC1 {

    /* renamed from: a */
    public final InterfaceC49099tC1 f249a;

    /* renamed from: b */
    public final Handler f250b;

    /* renamed from: c */
    public final List<InterfaceC0049b> f251c;

    /* renamed from: d */
    public final UI4 f252d;

    /* renamed from: e */
    public final InterfaceC20044eU f253e;

    /* renamed from: f */
    public boolean f254f;

    /* renamed from: g */
    public boolean f255g;

    /* renamed from: h */
    public boolean f256h;

    /* renamed from: i */
    public C47971rI4<Bitmap> f257i;

    /* renamed from: j */
    public C0048a f258j;

    /* renamed from: k */
    public boolean f259k;

    /* renamed from: l */
    public C0048a f260l;

    /* renamed from: m */
    public Bitmap f261m;

    /* renamed from: n */
    public InterfaceC47891r96<Bitmap> f262n;

    /* renamed from: o */
    public C0048a f263o;

    /* renamed from: p */
    public int f264p;

    /* renamed from: q */
    public int f265q;

    /* renamed from: r */
    public int f266r;

    /* renamed from: AC1$a */
    /* loaded from: classes5.dex */
    public static class C0048a extends BF0<Bitmap> {

        /* renamed from: e */
        public final Handler f267e;

        /* renamed from: f */
        public final int f268f;

        /* renamed from: g */
        public final long f269g;

        /* renamed from: h */
        public Bitmap f270h;

        public C0048a(Handler handler, int i, long j) {
            this.f267e = handler;
            this.f268f = i;
            this.f269g = j;
        }

        /* renamed from: a */
        public Bitmap m116013a() {
            return this.f270h;
        }

        @Override // p000.LY5
        /* renamed from: b */
        public void onResourceReady(Bitmap bitmap, G96<? super Bitmap> g96) {
            this.f270h = bitmap;
            this.f267e.sendMessageAtTime(this.f267e.obtainMessage(1, this), this.f269g);
        }

        @Override // p000.LY5
        public void onLoadCleared(Drawable drawable) {
            this.f270h = null;
        }
    }

    /* renamed from: AC1$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC0049b {
        /* renamed from: a */
        void mo10661a();
    }

    /* renamed from: AC1$c */
    /* loaded from: classes5.dex */
    public class C0050c implements Handler.Callback {
        public C0050c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                AC1.this.m116020m((C0048a) message.obj);
                return true;
            } else if (i == 2) {
                AC1.this.f252d.m81660d((C0048a) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    public AC1(ComponentCallbacks2C17096a componentCallbacks2C17096a, InterfaceC49099tC1 interfaceC49099tC1, int i, int i2, InterfaceC47891r96<Bitmap> interfaceC47891r96, Bitmap bitmap) {
        this(componentCallbacks2C17096a.m53152f(), ComponentCallbacks2C17096a.m53138t(componentCallbacks2C17096a.m53150h()), interfaceC49099tC1, null, m116024i(ComponentCallbacks2C17096a.m53138t(componentCallbacks2C17096a.m53150h()), i, i2), interfaceC47891r96, bitmap);
    }

    /* renamed from: g */
    public static InterfaceC38133ak2 m116026g() {
        return new C35387Qd3(Double.valueOf(Math.random()));
    }

    /* renamed from: i */
    public static C47971rI4<Bitmap> m116024i(UI4 ui4, int i, int i2) {
        return ui4.m81662b().mo16086d(YI4.m75263H0(B41.f1616b).m97585C0(true).m97533x0(true).m97553k0(i, i2));
    }

    /* renamed from: a */
    public void m116032a() {
        this.f251c.clear();
        m116019n();
        m116016q();
        C0048a c0048a = this.f258j;
        if (c0048a != null) {
            this.f252d.m81660d(c0048a);
            this.f258j = null;
        }
        C0048a c0048a2 = this.f260l;
        if (c0048a2 != null) {
            this.f252d.m81660d(c0048a2);
            this.f260l = null;
        }
        C0048a c0048a3 = this.f263o;
        if (c0048a3 != null) {
            this.f252d.m81660d(c0048a3);
            this.f263o = null;
        }
        this.f249a.clear();
        this.f259k = true;
    }

    /* renamed from: b */
    public ByteBuffer m116031b() {
        return this.f249a.getData().asReadOnlyBuffer();
    }

    /* renamed from: c */
    public Bitmap m116030c() {
        C0048a c0048a = this.f258j;
        return c0048a != null ? c0048a.m116013a() : this.f261m;
    }

    /* renamed from: d */
    public int m116029d() {
        C0048a c0048a = this.f258j;
        if (c0048a != null) {
            return c0048a.f268f;
        }
        return -1;
    }

    /* renamed from: e */
    public Bitmap m116028e() {
        return this.f261m;
    }

    /* renamed from: f */
    public int m116027f() {
        return this.f249a.mo12428g();
    }

    /* renamed from: h */
    public int m116025h() {
        return this.f266r;
    }

    /* renamed from: j */
    public int m116023j() {
        return this.f249a.mo12431d() + this.f264p;
    }

    /* renamed from: k */
    public int m116022k() {
        return this.f265q;
    }

    /* renamed from: l */
    public final void m116021l() {
        boolean z;
        if (this.f254f && !this.f255g) {
            if (this.f256h) {
                if (this.f263o == null) {
                    z = true;
                } else {
                    z = false;
                }
                C52865zZ3.m1114a(z, "Pending target must be null when starting from the first frame");
                this.f249a.mo12433b();
                this.f256h = false;
            }
            C0048a c0048a = this.f263o;
            if (c0048a != null) {
                this.f263o = null;
                m116020m(c0048a);
                return;
            }
            this.f255g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + this.f249a.mo12427h();
            this.f249a.mo12429f();
            this.f260l = new C0048a(this.f250b, this.f249a.mo12432c(), uptimeMillis);
            this.f257i.mo16086d(YI4.m75261J0(m116026g())).m16090Z0(this.f249a).m16099O0(this.f260l);
        }
    }

    /* renamed from: m */
    public void m116020m(C0048a c0048a) {
        this.f255g = false;
        if (this.f259k) {
            this.f250b.obtainMessage(2, c0048a).sendToTarget();
        } else if (!this.f254f) {
            if (this.f256h) {
                this.f250b.obtainMessage(2, c0048a).sendToTarget();
            } else {
                this.f263o = c0048a;
            }
        } else {
            if (c0048a.m116013a() != null) {
                m116019n();
                C0048a c0048a2 = this.f258j;
                this.f258j = c0048a;
                for (int size = this.f251c.size() - 1; size >= 0; size--) {
                    this.f251c.get(size).mo10661a();
                }
                if (c0048a2 != null) {
                    this.f250b.obtainMessage(2, c0048a2).sendToTarget();
                }
            }
            m116021l();
        }
    }

    /* renamed from: n */
    public final void m116019n() {
        Bitmap bitmap = this.f261m;
        if (bitmap != null) {
            this.f253e.mo16193c(bitmap);
            this.f261m = null;
        }
    }

    /* renamed from: o */
    public void m116018o(InterfaceC47891r96<Bitmap> interfaceC47891r96, Bitmap bitmap) {
        this.f262n = (InterfaceC47891r96) C52865zZ3.m1111d(interfaceC47891r96);
        this.f261m = (Bitmap) C52865zZ3.m1111d(bitmap);
        this.f257i = this.f257i.mo16086d(new YI4().m97529z0(interfaceC47891r96));
        this.f264p = C47029pi6.m18918h(bitmap);
        this.f265q = bitmap.getWidth();
        this.f266r = bitmap.getHeight();
    }

    /* renamed from: p */
    public final void m116017p() {
        if (this.f254f) {
            return;
        }
        this.f254f = true;
        this.f259k = false;
        m116021l();
    }

    /* renamed from: q */
    public final void m116016q() {
        this.f254f = false;
    }

    /* renamed from: r */
    public void m116015r(InterfaceC0049b interfaceC0049b) {
        if (!this.f259k) {
            if (!this.f251c.contains(interfaceC0049b)) {
                boolean isEmpty = this.f251c.isEmpty();
                this.f251c.add(interfaceC0049b);
                if (isEmpty) {
                    m116017p();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
    }

    /* renamed from: s */
    public void m116014s(InterfaceC0049b interfaceC0049b) {
        this.f251c.remove(interfaceC0049b);
        if (this.f251c.isEmpty()) {
            m116016q();
        }
    }

    public AC1(InterfaceC20044eU interfaceC20044eU, UI4 ui4, InterfaceC49099tC1 interfaceC49099tC1, Handler handler, C47971rI4<Bitmap> c47971rI4, InterfaceC47891r96<Bitmap> interfaceC47891r96, Bitmap bitmap) {
        this.f251c = new ArrayList();
        this.f252d = ui4;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C0050c()) : handler;
        this.f253e = interfaceC20044eU;
        this.f250b = handler;
        this.f257i = c47971rI4;
        this.f249a = interfaceC49099tC1;
        m116018o(interfaceC47891r96, bitmap);
    }
}
