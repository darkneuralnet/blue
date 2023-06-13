package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C17098b;
import com.bumptech.glide.C17104c;
import com.bumptech.glide.load.engine.GlideException;
import java.util.List;
import java.util.concurrent.Executor;
import p000.C32343Dd1;
/* renamed from: mB5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44944mB5<R> implements InterfaceC45599nI4, FB5, ZL4 {

    /* renamed from: E */
    public static final boolean f97503E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A */
    public int f97504A;

    /* renamed from: B */
    public int f97505B;

    /* renamed from: C */
    public boolean f97506C;

    /* renamed from: D */
    public RuntimeException f97507D;

    /* renamed from: a */
    public int f97508a;

    /* renamed from: b */
    public final String f97509b;

    /* renamed from: c */
    public final LP5 f97510c;

    /* renamed from: d */
    public final Object f97511d;

    /* renamed from: e */
    public final TI4<R> f97512e;

    /* renamed from: f */
    public final EI4 f97513f;

    /* renamed from: g */
    public final Context f97514g;

    /* renamed from: h */
    public final C17104c f97515h;

    /* renamed from: i */
    public final Object f97516i;

    /* renamed from: j */
    public final Class<R> f97517j;

    /* renamed from: k */
    public final AbstractC4760LD<?> f97518k;

    /* renamed from: l */
    public final int f97519l;

    /* renamed from: m */
    public final int f97520m;

    /* renamed from: n */
    public final P24 f97521n;

    /* renamed from: o */
    public final LY5<R> f97522o;

    /* renamed from: p */
    public final List<TI4<R>> f97523p;

    /* renamed from: q */
    public final I96<? super R> f97524q;

    /* renamed from: r */
    public final Executor f97525r;

    /* renamed from: s */
    public VL4<R> f97526s;

    /* renamed from: t */
    public C32343Dd1.C1574d f97527t;

    /* renamed from: u */
    public long f97528u;

    /* renamed from: v */
    public volatile C32343Dd1 f97529v;

    /* renamed from: w */
    public EnumC25935a f97530w;

    /* renamed from: x */
    public Drawable f97531x;

    /* renamed from: y */
    public Drawable f97532y;

    /* renamed from: z */
    public Drawable f97533z;

    /* renamed from: mB5$a */
    /* loaded from: classes5.dex */
    public enum EnumC25935a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public C44944mB5(Context context, C17104c c17104c, Object obj, Object obj2, Class<R> cls, AbstractC4760LD<?> abstractC4760LD, int i, int i2, P24 p24, LY5<R> ly5, TI4<R> ti4, List<TI4<R>> list, EI4 ei4, C32343Dd1 c32343Dd1, I96<? super R> i96, Executor executor) {
        String str;
        if (f97503E) {
            str = String.valueOf(super.hashCode());
        } else {
            str = null;
        }
        this.f97509b = str;
        this.f97510c = LP5.m96961a();
        this.f97511d = obj;
        this.f97514g = context;
        this.f97515h = c17104c;
        this.f97516i = obj2;
        this.f97517j = cls;
        this.f97518k = abstractC4760LD;
        this.f97519l = i;
        this.f97520m = i2;
        this.f97521n = p24;
        this.f97522o = ly5;
        this.f97512e = ti4;
        this.f97523p = list;
        this.f97513f = ei4;
        this.f97529v = c32343Dd1;
        this.f97524q = i96;
        this.f97525r = executor;
        this.f97530w = EnumC25935a.PENDING;
        if (this.f97507D == null && c17104c.m53127g().m53124a(C17098b.C17101c.class)) {
            this.f97507D = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: u */
    public static int m26171u(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * i);
    }

    /* renamed from: x */
    public static <R> C44944mB5<R> m26168x(Context context, C17104c c17104c, Object obj, Object obj2, Class<R> cls, AbstractC4760LD<?> abstractC4760LD, int i, int i2, P24 p24, LY5<R> ly5, TI4<R> ti4, List<TI4<R>> list, EI4 ei4, C32343Dd1 c32343Dd1, I96<? super R> i96, Executor executor) {
        return new C44944mB5<>(context, c17104c, obj, obj2, cls, abstractC4760LD, i, i2, p24, ly5, ti4, list, ei4, c32343Dd1, i96, executor);
    }

    /* renamed from: A */
    public final void m26188A() {
        Drawable drawable;
        if (!m26181k()) {
            return;
        }
        if (this.f97516i == null) {
            drawable = m26176p();
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = m26177o();
        }
        if (drawable == null) {
            drawable = m26175q();
        }
        this.f97522o.onLoadFailed(drawable);
    }

    @Override // p000.InterfaceC45599nI4
    /* renamed from: a */
    public boolean mo20678a() {
        boolean z;
        synchronized (this.f97511d) {
            if (this.f97530w == EnumC25935a.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.ZL4
    /* renamed from: b */
    public void mo26187b(GlideException glideException) {
        m26167y(glideException, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ZL4
    /* renamed from: c */
    public void mo26186c(VL4<?> vl4, ZS0 zs0, boolean z) {
        Object obj;
        String str;
        this.f97510c.mo96959c();
        VL4<?> vl42 = null;
        try {
            synchronized (this.f97511d) {
                try {
                    this.f97527t = null;
                    if (vl4 == null) {
                        mo26187b(new GlideException("Expected to receive a Resource<R> with an object of " + this.f97517j + " inside, but instead got null."));
                        return;
                    }
                    Object obj2 = vl4.get();
                    try {
                        if (obj2 != null && this.f97517j.isAssignableFrom(obj2.getClass())) {
                            if (!m26180l()) {
                                this.f97526s = null;
                                this.f97530w = EnumC25935a.COMPLETE;
                                NC1.m94201f("GlideRequest", this.f97508a);
                                this.f97529v.m110085k(vl4);
                                return;
                            }
                            m26166z(vl4, obj2, zs0, z);
                            return;
                        }
                        this.f97526s = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.f97517j);
                        sb.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = "";
                        }
                        sb.append(obj);
                        sb.append("{");
                        sb.append(obj2);
                        sb.append("} inside Resource{");
                        sb.append(vl4);
                        sb.append("}.");
                        if (obj2 != null) {
                            str = "";
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb.append(str);
                        mo26187b(new GlideException(sb.toString()));
                        this.f97529v.m110085k(vl4);
                    } catch (Throwable th) {
                        vl42 = vl4;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (vl42 != null) {
                this.f97529v.m110085k(vl42);
            }
            throw th3;
        }
    }

    @Override // p000.InterfaceC45599nI4
    public void clear() {
        synchronized (this.f97511d) {
            m26183h();
            this.f97510c.mo96959c();
            EnumC25935a enumC25935a = this.f97530w;
            EnumC25935a enumC25935a2 = EnumC25935a.CLEARED;
            if (enumC25935a == enumC25935a2) {
                return;
            }
            m26179m();
            VL4<R> vl4 = this.f97526s;
            if (vl4 != null) {
                this.f97526s = null;
            } else {
                vl4 = null;
            }
            if (m26182j()) {
                this.f97522o.onLoadCleared(m26175q());
            }
            NC1.m94201f("GlideRequest", this.f97508a);
            this.f97530w = enumC25935a2;
            if (vl4 != null) {
                this.f97529v.m110085k(vl4);
            }
        }
    }

    @Override // p000.FB5
    /* renamed from: d */
    public void mo26185d(int i, int i2) {
        Object obj;
        this.f97510c.mo96959c();
        Object obj2 = this.f97511d;
        synchronized (obj2) {
            try {
                try {
                    boolean z = f97503E;
                    if (z) {
                        m26172t("Got onSizeReady in " + C49546tx2.m11169a(this.f97528u));
                    }
                    if (this.f97530w == EnumC25935a.WAITING_FOR_SIZE) {
                        EnumC25935a enumC25935a = EnumC25935a.RUNNING;
                        this.f97530w = enumC25935a;
                        float m97579M = this.f97518k.m97579M();
                        this.f97504A = m26171u(i, m97579M);
                        this.f97505B = m26171u(i2, m97579M);
                        if (z) {
                            m26172t("finished setup for calling load in " + C49546tx2.m11169a(this.f97528u));
                        }
                        obj = obj2;
                        try {
                            this.f97527t = this.f97529v.m110090f(this.f97515h, this.f97516i, this.f97518k.m97580J(), this.f97504A, this.f97505B, this.f97518k.m97581I(), this.f97517j, this.f97521n, this.f97518k.m97544q(), this.f97518k.m97577O(), this.f97518k.m97567a0(), this.f97518k.m97571W(), this.f97518k.m97590A(), this.f97518k.m97573U(), this.f97518k.m97575Q(), this.f97518k.m97576P(), this.f97518k.m97530z(), this, this.f97525r);
                            if (this.f97530w != enumC25935a) {
                                this.f97527t = null;
                            }
                            if (z) {
                                m26172t("finished onSizeReady in " + C49546tx2.m11169a(this.f97528u));
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
    }

    @Override // p000.InterfaceC45599nI4
    /* renamed from: e */
    public boolean mo20674e(InterfaceC45599nI4 interfaceC45599nI4) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        AbstractC4760LD<?> abstractC4760LD;
        P24 p24;
        int i3;
        int i4;
        int i5;
        Object obj2;
        Class<R> cls2;
        AbstractC4760LD<?> abstractC4760LD2;
        P24 p242;
        int i6;
        if (!(interfaceC45599nI4 instanceof C44944mB5)) {
            return false;
        }
        synchronized (this.f97511d) {
            i = this.f97519l;
            i2 = this.f97520m;
            obj = this.f97516i;
            cls = this.f97517j;
            abstractC4760LD = this.f97518k;
            p24 = this.f97521n;
            List<TI4<R>> list = this.f97523p;
            if (list != null) {
                i3 = list.size();
            } else {
                i3 = 0;
            }
        }
        C44944mB5 c44944mB5 = (C44944mB5) interfaceC45599nI4;
        synchronized (c44944mB5.f97511d) {
            i4 = c44944mB5.f97519l;
            i5 = c44944mB5.f97520m;
            obj2 = c44944mB5.f97516i;
            cls2 = c44944mB5.f97517j;
            abstractC4760LD2 = c44944mB5.f97518k;
            p242 = c44944mB5.f97521n;
            List<TI4<R>> list2 = c44944mB5.f97523p;
            if (list2 != null) {
                i6 = list2.size();
            } else {
                i6 = 0;
            }
        }
        if (i == i4 && i2 == i5 && C47029pi6.m18923c(obj, obj2) && cls.equals(cls2) && abstractC4760LD.equals(abstractC4760LD2) && p24 == p242 && i3 == i6) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC45599nI4
    /* renamed from: f */
    public boolean mo20673f() {
        boolean z;
        synchronized (this.f97511d) {
            if (this.f97530w == EnumC25935a.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.ZL4
    /* renamed from: g */
    public Object mo26184g() {
        this.f97510c.mo96959c();
        return this.f97511d;
    }

    /* renamed from: h */
    public final void m26183h() {
        if (!this.f97506C) {
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    @Override // p000.InterfaceC45599nI4
    /* renamed from: i */
    public void mo20670i() {
        int i;
        synchronized (this.f97511d) {
            m26183h();
            this.f97510c.mo96959c();
            this.f97528u = C49546tx2.m11168b();
            Object obj = this.f97516i;
            if (obj == null) {
                if (C47029pi6.m18906t(this.f97519l, this.f97520m)) {
                    this.f97504A = this.f97519l;
                    this.f97505B = this.f97520m;
                }
                if (m26176p() == null) {
                    i = 5;
                } else {
                    i = 3;
                }
                m26167y(new GlideException("Received null model"), i);
                return;
            }
            EnumC25935a enumC25935a = this.f97530w;
            EnumC25935a enumC25935a2 = EnumC25935a.RUNNING;
            if (enumC25935a != enumC25935a2) {
                if (enumC25935a == EnumC25935a.COMPLETE) {
                    mo26186c(this.f97526s, ZS0.MEMORY_CACHE, false);
                    return;
                }
                m26178n(obj);
                this.f97508a = NC1.m94205b("GlideRequest");
                EnumC25935a enumC25935a3 = EnumC25935a.WAITING_FOR_SIZE;
                this.f97530w = enumC25935a3;
                if (C47029pi6.m18906t(this.f97519l, this.f97520m)) {
                    mo26185d(this.f97519l, this.f97520m);
                } else {
                    this.f97522o.getSize(this);
                }
                EnumC25935a enumC25935a4 = this.f97530w;
                if ((enumC25935a4 == enumC25935a2 || enumC25935a4 == enumC25935a3) && m26181k()) {
                    this.f97522o.onLoadStarted(m26175q());
                }
                if (f97503E) {
                    m26172t("finished run method in " + C49546tx2.m11169a(this.f97528u));
                }
                return;
            }
            throw new IllegalArgumentException("Cannot restart a running request");
        }
    }

    @Override // p000.InterfaceC45599nI4
    public boolean isComplete() {
        boolean z;
        synchronized (this.f97511d) {
            if (this.f97530w == EnumC25935a.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC45599nI4
    public boolean isRunning() {
        boolean z;
        synchronized (this.f97511d) {
            EnumC25935a enumC25935a = this.f97530w;
            if (enumC25935a != EnumC25935a.RUNNING && enumC25935a != EnumC25935a.WAITING_FOR_SIZE) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public final boolean m26182j() {
        EI4 ei4 = this.f97513f;
        return ei4 == null || ei4.mo20677b(this);
    }

    /* renamed from: k */
    public final boolean m26181k() {
        EI4 ei4 = this.f97513f;
        return ei4 == null || ei4.mo20676c(this);
    }

    /* renamed from: l */
    public final boolean m26180l() {
        EI4 ei4 = this.f97513f;
        return ei4 == null || ei4.mo20672g(this);
    }

    /* renamed from: m */
    public final void m26179m() {
        m26183h();
        this.f97510c.mo96959c();
        this.f97522o.removeCallback(this);
        C32343Dd1.C1574d c1574d = this.f97527t;
        if (c1574d != null) {
            c1574d.m110079a();
            this.f97527t = null;
        }
    }

    /* renamed from: n */
    public final void m26178n(Object obj) {
        List<TI4<R>> list = this.f97523p;
        if (list == null) {
            return;
        }
        for (TI4<R> ti4 : list) {
            if (ti4 instanceof AbstractC49395ti1) {
                ((AbstractC49395ti1) ti4).m11882b(obj);
            }
        }
    }

    /* renamed from: o */
    public final Drawable m26177o() {
        if (this.f97531x == null) {
            Drawable m97539t = this.f97518k.m97539t();
            this.f97531x = m97539t;
            if (m97539t == null && this.f97518k.m97542r() > 0) {
                this.f97531x = m26173s(this.f97518k.m97542r());
            }
        }
        return this.f97531x;
    }

    /* renamed from: p */
    public final Drawable m26176p() {
        if (this.f97533z == null) {
            Drawable m97535w = this.f97518k.m97535w();
            this.f97533z = m97535w;
            if (m97535w == null && this.f97518k.m97532y() > 0) {
                this.f97533z = m26173s(this.f97518k.m97532y());
            }
        }
        return this.f97533z;
    }

    @Override // p000.InterfaceC45599nI4
    public void pause() {
        synchronized (this.f97511d) {
            if (isRunning()) {
                clear();
            }
        }
    }

    /* renamed from: q */
    public final Drawable m26175q() {
        if (this.f97532y == null) {
            Drawable m97584D = this.f97518k.m97584D();
            this.f97532y = m97584D;
            if (m97584D == null && this.f97518k.m97583G() > 0) {
                this.f97532y = m26173s(this.f97518k.m97583G());
            }
        }
        return this.f97532y;
    }

    /* renamed from: r */
    public final boolean m26174r() {
        EI4 ei4 = this.f97513f;
        return ei4 == null || !ei4.getRoot().mo20678a();
    }

    /* renamed from: s */
    public final Drawable m26173s(int i) {
        Resources.Theme theme;
        if (this.f97518k.m97578N() != null) {
            theme = this.f97518k.m97578N();
        } else {
            theme = this.f97514g.getTheme();
        }
        return S61.m86016a(this.f97515h, i, theme);
    }

    /* renamed from: t */
    public final void m26172t(String str) {
        Log.v("GlideRequest", str + " this: " + this.f97509b);
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f97511d) {
            obj = this.f97516i;
            cls = this.f97517j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    /* renamed from: v */
    public final void m26170v() {
        EI4 ei4 = this.f97513f;
        if (ei4 != null) {
            ei4.mo20671h(this);
        }
    }

    /* renamed from: w */
    public final void m26169w() {
        EI4 ei4 = this.f97513f;
        if (ei4 != null) {
            ei4.mo20675d(this);
        }
    }

    /* renamed from: y */
    public final void m26167y(GlideException glideException, int i) {
        boolean z;
        this.f97510c.mo96959c();
        synchronized (this.f97511d) {
            glideException.m53076k(this.f97507D);
            int m53126h = this.f97515h.m53126h();
            if (m53126h <= i) {
                Log.w("Glide", "Load failed for [" + this.f97516i + "] with dimensions [" + this.f97504A + "x" + this.f97505B + "]", glideException);
                if (m53126h <= 4) {
                    glideException.m53080g("Glide");
                }
            }
            this.f97527t = null;
            this.f97530w = EnumC25935a.FAILED;
            m26170v();
            boolean z2 = true;
            this.f97506C = true;
            List<TI4<R>> list = this.f97523p;
            if (list != null) {
                z = false;
                for (TI4<R> ti4 : list) {
                    z |= ti4.mo6879a(glideException, this.f97516i, this.f97522o, m26174r());
                }
            } else {
                z = false;
            }
            TI4<R> ti42 = this.f97512e;
            if (ti42 == null || !ti42.mo6879a(glideException, this.f97516i, this.f97522o, m26174r())) {
                z2 = false;
            }
            if (!(z | z2)) {
                m26188A();
            }
            this.f97506C = false;
            NC1.m94201f("GlideRequest", this.f97508a);
        }
    }

    /* renamed from: z */
    public final void m26166z(VL4<R> vl4, R r, ZS0 zs0, boolean z) {
        boolean z2;
        boolean m26174r = m26174r();
        this.f97530w = EnumC25935a.COMPLETE;
        this.f97526s = vl4;
        if (this.f97515h.m53126h() <= 3) {
            Log.d("Glide", "Finished loading " + r.getClass().getSimpleName() + " from " + zs0 + " for " + this.f97516i + " with size [" + this.f97504A + "x" + this.f97505B + "] in " + C49546tx2.m11169a(this.f97528u) + " ms");
        }
        m26169w();
        boolean z3 = true;
        this.f97506C = true;
        try {
            List<TI4<R>> list = this.f97523p;
            if (list != null) {
                z2 = false;
                for (TI4<R> ti4 : list) {
                    z2 |= ti4.onResourceReady(r, this.f97516i, this.f97522o, zs0, m26174r);
                }
            } else {
                z2 = false;
            }
            TI4<R> ti42 = this.f97512e;
            if (ti42 == null || !ti42.onResourceReady(r, this.f97516i, this.f97522o, zs0, m26174r)) {
                z3 = false;
            }
            if (!(z3 | z2)) {
                this.f97522o.onResourceReady(r, this.f97524q.mo88921a(zs0, m26174r));
            }
            this.f97506C = false;
            NC1.m94201f("GlideRequest", this.f97508a);
        } catch (Throwable th) {
            this.f97506C = false;
            throw th;
        }
    }
}
