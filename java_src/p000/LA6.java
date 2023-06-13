package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
/* renamed from: LA6 */
/* loaded from: classes5.dex */
public class LA6 {

    /* renamed from: s */
    public static final C43035iy3<JA6> f20844s = C43035iy3.m31548f("com.bumptech.glide.integration.webp.decoder.WebpFrameLoader.CacheStrategy", JA6.f16967d);

    /* renamed from: a */
    public final EA6 f20845a;

    /* renamed from: b */
    public final Handler f20846b;

    /* renamed from: c */
    public final List<InterfaceC4754b> f20847c;

    /* renamed from: d */
    public final UI4 f20848d;

    /* renamed from: e */
    public final InterfaceC20044eU f20849e;

    /* renamed from: f */
    public boolean f20850f;

    /* renamed from: g */
    public boolean f20851g;

    /* renamed from: h */
    public boolean f20852h;

    /* renamed from: i */
    public C47971rI4<Bitmap> f20853i;

    /* renamed from: j */
    public C4753a f20854j;

    /* renamed from: k */
    public boolean f20855k;

    /* renamed from: l */
    public C4753a f20856l;

    /* renamed from: m */
    public Bitmap f20857m;

    /* renamed from: n */
    public InterfaceC47891r96<Bitmap> f20858n;

    /* renamed from: o */
    public C4753a f20859o;

    /* renamed from: p */
    public int f20860p;

    /* renamed from: q */
    public int f20861q;

    /* renamed from: r */
    public int f20862r;

    /* renamed from: LA6$a */
    /* loaded from: classes5.dex */
    public static class C4753a extends BF0<Bitmap> {

        /* renamed from: e */
        public final Handler f20863e;

        /* renamed from: f */
        public final int f20864f;

        /* renamed from: g */
        public final long f20865g;

        /* renamed from: h */
        public Bitmap f20866h;

        public C4753a(Handler handler, int i, long j) {
            this.f20863e = handler;
            this.f20864f = i;
            this.f20865g = j;
        }

        /* renamed from: a */
        public Bitmap m97614a() {
            return this.f20866h;
        }

        @Override // p000.LY5
        /* renamed from: b */
        public void onResourceReady(Bitmap bitmap, G96<? super Bitmap> g96) {
            this.f20866h = bitmap;
            this.f20863e.sendMessageAtTime(this.f20863e.obtainMessage(1, this), this.f20865g);
        }

        @Override // p000.LY5
        public void onLoadCleared(Drawable drawable) {
            this.f20866h = null;
        }
    }

    /* renamed from: LA6$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC4754b {
        /* renamed from: a */
        void mo97612a();
    }

    /* renamed from: LA6$c */
    /* loaded from: classes5.dex */
    public class C4755c implements Handler.Callback {
        public C4755c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                LA6.this.m97621n((C4753a) message.obj);
                return true;
            } else if (i == 2) {
                LA6.this.f20848d.m81660d((C4753a) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    /* renamed from: LA6$d */
    /* loaded from: classes5.dex */
    public static class C4756d implements InterfaceC38133ak2 {

        /* renamed from: b */
        public final InterfaceC38133ak2 f20868b;

        /* renamed from: c */
        public final int f20869c;

        public C4756d(InterfaceC38133ak2 interfaceC38133ak2, int i) {
            this.f20868b = interfaceC38133ak2;
            this.f20869c = i;
        }

        @Override // p000.InterfaceC38133ak2
        /* renamed from: a */
        public void mo3854a(MessageDigest messageDigest) {
            messageDigest.update(ByteBuffer.allocate(12).putInt(this.f20869c).array());
            this.f20868b.mo3854a(messageDigest);
        }

        @Override // p000.InterfaceC38133ak2
        public boolean equals(Object obj) {
            if (!(obj instanceof C4756d)) {
                return false;
            }
            C4756d c4756d = (C4756d) obj;
            if (!this.f20868b.equals(c4756d.f20868b) || this.f20869c != c4756d.f20869c) {
                return false;
            }
            return true;
        }

        @Override // p000.InterfaceC38133ak2
        public int hashCode() {
            return (this.f20868b.hashCode() * 31) + this.f20869c;
        }
    }

    public LA6(ComponentCallbacks2C17096a componentCallbacks2C17096a, EA6 ea6, int i, int i2, InterfaceC47891r96<Bitmap> interfaceC47891r96, Bitmap bitmap) {
        this(componentCallbacks2C17096a.m53152f(), ComponentCallbacks2C17096a.m53138t(componentCallbacks2C17096a.m53150h()), ea6, null, m97625j(ComponentCallbacks2C17096a.m53138t(componentCallbacks2C17096a.m53150h()), i, i2), interfaceC47891r96, bitmap);
    }

    /* renamed from: j */
    public static C47971rI4<Bitmap> m97625j(UI4 ui4, int i, int i2) {
        return ui4.m81662b().mo16086d(YI4.m75263H0(B41.f1616b).m97585C0(true).m97533x0(true).m97553k0(i, i2));
    }

    /* renamed from: a */
    public void m97634a() {
        this.f20847c.clear();
        m97620o();
        m97617r();
        C4753a c4753a = this.f20854j;
        if (c4753a != null) {
            this.f20848d.m81660d(c4753a);
            this.f20854j = null;
        }
        C4753a c4753a2 = this.f20856l;
        if (c4753a2 != null) {
            this.f20848d.m81660d(c4753a2);
            this.f20856l = null;
        }
        C4753a c4753a3 = this.f20859o;
        if (c4753a3 != null) {
            this.f20848d.m81660d(c4753a3);
            this.f20859o = null;
        }
        this.f20845a.clear();
        this.f20855k = true;
    }

    /* renamed from: b */
    public ByteBuffer m97633b() {
        return this.f20845a.getData().asReadOnlyBuffer();
    }

    /* renamed from: c */
    public Bitmap m97632c() {
        C4753a c4753a = this.f20854j;
        return c4753a != null ? c4753a.m97614a() : this.f20857m;
    }

    /* renamed from: d */
    public int m97631d() {
        C4753a c4753a = this.f20854j;
        if (c4753a != null) {
            return c4753a.f20864f;
        }
        return -1;
    }

    /* renamed from: e */
    public Bitmap m97630e() {
        return this.f20857m;
    }

    /* renamed from: f */
    public int m97629f() {
        return this.f20845a.mo12428g();
    }

    /* renamed from: g */
    public final InterfaceC38133ak2 m97628g(int i) {
        return new C4756d(new C35387Qd3(this.f20845a), i);
    }

    /* renamed from: h */
    public int m97627h() {
        return this.f20862r;
    }

    /* renamed from: i */
    public int m97626i() {
        return this.f20845a.m109319n();
    }

    /* renamed from: k */
    public int m97624k() {
        return this.f20845a.mo12431d() + this.f20860p;
    }

    /* renamed from: l */
    public int m97623l() {
        return this.f20861q;
    }

    /* renamed from: m */
    public final void m97622m() {
        boolean z;
        if (this.f20850f && !this.f20851g) {
            if (this.f20852h) {
                if (this.f20859o == null) {
                    z = true;
                } else {
                    z = false;
                }
                C52865zZ3.m1114a(z, "Pending target must be null when starting from the first frame");
                this.f20845a.mo12433b();
                this.f20852h = false;
            }
            C4753a c4753a = this.f20859o;
            if (c4753a != null) {
                this.f20859o = null;
                m97621n(c4753a);
                return;
            }
            this.f20851g = true;
            int mo12427h = this.f20845a.mo12427h();
            this.f20845a.mo12429f();
            int mo12432c = this.f20845a.mo12432c();
            this.f20856l = new C4753a(this.f20846b, mo12432c, SystemClock.uptimeMillis() + mo12427h);
            this.f20853i.mo16086d(YI4.m75261J0(m97628g(mo12432c)).m97533x0(this.f20845a.m109321l().m101048c())).m16090Z0(this.f20845a).m16099O0(this.f20856l);
        }
    }

    /* renamed from: n */
    public void m97621n(C4753a c4753a) {
        this.f20851g = false;
        if (this.f20855k) {
            this.f20846b.obtainMessage(2, c4753a).sendToTarget();
        } else if (!this.f20850f) {
            if (this.f20852h) {
                this.f20846b.obtainMessage(2, c4753a).sendToTarget();
            } else {
                this.f20859o = c4753a;
            }
        } else {
            if (c4753a.m97614a() != null) {
                m97620o();
                C4753a c4753a2 = this.f20854j;
                this.f20854j = c4753a;
                for (int size = this.f20847c.size() - 1; size >= 0; size--) {
                    try {
                        InterfaceC4754b interfaceC4754b = this.f20847c.get(size);
                        if (interfaceC4754b != null) {
                            interfaceC4754b.mo97612a();
                        }
                    } catch (IndexOutOfBoundsException e) {
                        e.printStackTrace();
                    }
                }
                if (c4753a2 != null) {
                    this.f20846b.obtainMessage(2, c4753a2).sendToTarget();
                }
            }
            m97622m();
        }
    }

    /* renamed from: o */
    public final void m97620o() {
        Bitmap bitmap = this.f20857m;
        if (bitmap != null) {
            this.f20849e.mo16193c(bitmap);
            this.f20857m = null;
        }
    }

    /* renamed from: p */
    public void m97619p(InterfaceC47891r96<Bitmap> interfaceC47891r96, Bitmap bitmap) {
        this.f20858n = (InterfaceC47891r96) C52865zZ3.m1111d(interfaceC47891r96);
        this.f20857m = (Bitmap) C52865zZ3.m1111d(bitmap);
        this.f20853i = this.f20853i.mo16086d(new YI4().m97529z0(interfaceC47891r96));
        this.f20860p = C47029pi6.m18918h(bitmap);
        this.f20861q = bitmap.getWidth();
        this.f20862r = bitmap.getHeight();
    }

    /* renamed from: q */
    public final void m97618q() {
        if (this.f20850f) {
            return;
        }
        this.f20850f = true;
        this.f20855k = false;
        m97622m();
    }

    /* renamed from: r */
    public final void m97617r() {
        this.f20850f = false;
    }

    /* renamed from: s */
    public void m97616s(InterfaceC4754b interfaceC4754b) {
        if (!this.f20855k) {
            if (!this.f20847c.contains(interfaceC4754b)) {
                boolean isEmpty = this.f20847c.isEmpty();
                this.f20847c.add(interfaceC4754b);
                if (isEmpty) {
                    m97618q();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
    }

    /* renamed from: t */
    public void m97615t(InterfaceC4754b interfaceC4754b) {
        this.f20847c.remove(interfaceC4754b);
        if (this.f20847c.isEmpty()) {
            m97617r();
        }
    }

    public LA6(InterfaceC20044eU interfaceC20044eU, UI4 ui4, EA6 ea6, Handler handler, C47971rI4<Bitmap> c47971rI4, InterfaceC47891r96<Bitmap> interfaceC47891r96, Bitmap bitmap) {
        this.f20847c = new ArrayList();
        this.f20850f = false;
        this.f20851g = false;
        this.f20852h = false;
        this.f20848d = ui4;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C4755c()) : handler;
        this.f20849e = interfaceC20044eU;
        this.f20846b = handler;
        this.f20853i = c47971rI4;
        this.f20845a = ea6;
        m97619p(interfaceC47891r96, bitmap);
    }
}
