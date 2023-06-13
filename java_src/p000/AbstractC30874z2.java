package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p000.C42732iT3;
/* renamed from: z2 */
/* loaded from: classes6.dex */
public abstract class AbstractC30874z2<T> {

    /* renamed from: a */
    public final C42732iT3 f120628a;

    /* renamed from: b */
    public final C47378qI4 f120629b;

    /* renamed from: c */
    public final WeakReference<T> f120630c;

    /* renamed from: d */
    public final boolean f120631d;

    /* renamed from: e */
    public final int f120632e;

    /* renamed from: f */
    public final int f120633f;

    /* renamed from: g */
    public final int f120634g;

    /* renamed from: h */
    public final Drawable f120635h;

    /* renamed from: i */
    public final String f120636i;

    /* renamed from: j */
    public final Object f120637j;

    /* renamed from: k */
    public boolean f120638k;

    /* renamed from: l */
    public boolean f120639l;

    /* renamed from: z2$a */
    /* loaded from: classes6.dex */
    public static class C30875a<M> extends WeakReference<M> {

        /* renamed from: a */
        public final AbstractC30874z2 f120640a;

        public C30875a(AbstractC30874z2 abstractC30874z2, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f120640a = abstractC30874z2;
        }
    }

    public AbstractC30874z2(C42732iT3 c42732iT3, T t, C47378qI4 c47378qI4, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        C30875a c30875a;
        this.f120628a = c42732iT3;
        this.f120629b = c47378qI4;
        if (t == null) {
            c30875a = null;
        } else {
            c30875a = new C30875a(this, t, c42732iT3.f87367j);
        }
        this.f120630c = c30875a;
        this.f120632e = i;
        this.f120633f = i2;
        this.f120631d = z;
        this.f120634g = i3;
        this.f120635h = drawable;
        this.f120636i = str;
        this.f120637j = obj == null ? this : obj;
    }

    /* renamed from: a */
    public void mo1990a() {
        this.f120639l = true;
    }

    /* renamed from: b */
    public abstract void mo1989b(Bitmap bitmap, C42732iT3.EnumC23266e enumC23266e);

    /* renamed from: c */
    public abstract void mo1988c(Exception exc);

    /* renamed from: d */
    public String m1987d() {
        return this.f120636i;
    }

    /* renamed from: e */
    public int m1986e() {
        return this.f120632e;
    }

    /* renamed from: f */
    public int m1985f() {
        return this.f120633f;
    }

    /* renamed from: g */
    public C42732iT3 m1984g() {
        return this.f120628a;
    }

    /* renamed from: h */
    public C42732iT3.EnumC23267f m1983h() {
        return this.f120629b.f105075t;
    }

    /* renamed from: i */
    public C47378qI4 m1982i() {
        return this.f120629b;
    }

    /* renamed from: j */
    public Object m1981j() {
        return this.f120637j;
    }

    /* renamed from: k */
    public T m1980k() {
        WeakReference<T> weakReference = this.f120630c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: l */
    public boolean m1979l() {
        return this.f120639l;
    }

    /* renamed from: m */
    public boolean m1978m() {
        return this.f120638k;
    }
}
