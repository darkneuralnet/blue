package p000;
/* renamed from: Xq5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C37144Xq5 implements Comparable {

    /* renamed from: b */
    public final S83 f44064b;

    /* renamed from: c */
    public final C52053yB0 f44065c;

    /* renamed from: d */
    public final int f44066d;

    /* renamed from: e */
    public final int f44067e;

    /* renamed from: f */
    public final boolean f44068f;

    public C37144Xq5(S83 s83, C52053yB0 c52053yB0, int i, int i2) {
        this.f44064b = s83;
        this.f44065c = new C52053yB0(c52053yB0);
        this.f44066d = i;
        this.f44067e = i2;
        this.f44068f = !c52053yB0.m3886g(s83.mo44966u(i));
    }

    /* renamed from: a */
    public boolean m76213a() {
        return this.f44068f;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        C37144Xq5 c37144Xq5 = (C37144Xq5) obj;
        int i = this.f44066d;
        int i2 = c37144Xq5.f44066d;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        if (this.f44065c.m3886g(c37144Xq5.f44065c)) {
            return 0;
        }
        if (!this.f44068f) {
            return -1;
        }
        if (!c37144Xq5.f44068f) {
            return 1;
        }
        return C38206ar5.m65380a(this.f44067e, this.f44065c, c37144Xq5.f44065c);
    }

    public String toString() {
        return this.f44066d + ":" + this.f44065c.toString();
    }
}
