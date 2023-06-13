package p000;

import p000.C35621Rd3.AbstractC7219a;
/* renamed from: Rd3  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C35621Rd3<T extends AbstractC7219a> {

    /* renamed from: g */
    public static int f32354g;

    /* renamed from: a */
    public int f32355a;

    /* renamed from: b */
    public int f32356b;

    /* renamed from: c */
    public Object[] f32357c;

    /* renamed from: d */
    public int f32358d;

    /* renamed from: e */
    public T f32359e;

    /* renamed from: f */
    public float f32360f;

    /* renamed from: Rd3$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC7219a {

        /* renamed from: b */
        public static int f32361b = -1;

        /* renamed from: a */
        public int f32362a = f32361b;

        /* renamed from: a */
        public abstract AbstractC7219a mo72662a();
    }

    public C35621Rd3(int i, T t) {
        if (i > 0) {
            this.f32356b = i;
            this.f32357c = new Object[i];
            this.f32358d = 0;
            this.f32359e = t;
            this.f32360f = 1.0f;
            m86533d();
            return;
        }
        throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
    }

    /* renamed from: a */
    public static synchronized C35621Rd3 m86536a(int i, AbstractC7219a abstractC7219a) {
        C35621Rd3 c35621Rd3;
        synchronized (C35621Rd3.class) {
            c35621Rd3 = new C35621Rd3(i, abstractC7219a);
            int i2 = f32354g;
            c35621Rd3.f32355a = i2;
            f32354g = i2 + 1;
        }
        return c35621Rd3;
    }

    /* renamed from: b */
    public synchronized T m86535b() {
        T t;
        if (this.f32358d == -1 && this.f32360f > 0.0f) {
            m86533d();
        }
        Object[] objArr = this.f32357c;
        int i = this.f32358d;
        t = (T) objArr[i];
        t.f32362a = AbstractC7219a.f32361b;
        this.f32358d = i - 1;
        return t;
    }

    /* renamed from: c */
    public synchronized void m86534c(T t) {
        int i = t.f32362a;
        if (i != AbstractC7219a.f32361b) {
            if (i == this.f32355a) {
                throw new IllegalArgumentException("The object passed is already stored in this pool!");
            }
            throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t.f32362a + ".  Object cannot belong to two different pool instances simultaneously!");
        }
        int i2 = this.f32358d + 1;
        this.f32358d = i2;
        if (i2 >= this.f32357c.length) {
            m86531f();
        }
        t.f32362a = this.f32355a;
        this.f32357c[this.f32358d] = t;
    }

    /* renamed from: d */
    public final void m86533d() {
        m86532e(this.f32360f);
    }

    /* renamed from: e */
    public final void m86532e(float f) {
        int i = this.f32356b;
        int i2 = (int) (i * f);
        if (i2 < 1) {
            i = 1;
        } else if (i2 <= i) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.f32357c[i3] = this.f32359e.mo72662a();
        }
        this.f32358d = i - 1;
    }

    /* renamed from: f */
    public final void m86531f() {
        int i = this.f32356b;
        int i2 = i * 2;
        this.f32356b = i2;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = this.f32357c[i3];
        }
        this.f32357c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
        if (r3 < 0.0f) goto L3;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m86530g(float f) {
        float f2 = f <= 1.0f ? 0.0f : 1.0f;
        f = f2;
        this.f32360f = f;
    }
}
