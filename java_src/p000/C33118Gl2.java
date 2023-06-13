package p000;

import java.util.HashMap;
import java.util.Map;
/* renamed from: Gl2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C33118Gl2 {

    /* renamed from: h */
    public static final C33118Gl2 f12377h;

    /* renamed from: i */
    public static final C33118Gl2 f12378i;

    /* renamed from: j */
    public static final C33118Gl2 f12379j;

    /* renamed from: k */
    public static final C33118Gl2 f12380k;

    /* renamed from: l */
    public static final Map<Object, C33118Gl2> f12381l;

    /* renamed from: a */
    public final int f12382a;

    /* renamed from: b */
    public final int f12383b;

    /* renamed from: c */
    public final int f12384c;

    /* renamed from: d */
    public final int f12385d;

    /* renamed from: e */
    public final int f12386e;

    /* renamed from: f */
    public final int f12387f;

    /* renamed from: g */
    public final C5448N f12388g;

    /* renamed from: Gl2$a */
    /* loaded from: classes8.dex */
    public static class C2938a extends HashMap<Object, C33118Gl2> {
        public C2938a() {
            C33118Gl2 c33118Gl2 = C33118Gl2.f12377h;
            put(Integer.valueOf(c33118Gl2.f12382a), c33118Gl2);
            C33118Gl2 c33118Gl22 = C33118Gl2.f12378i;
            put(Integer.valueOf(c33118Gl22.f12382a), c33118Gl22);
            C33118Gl2 c33118Gl23 = C33118Gl2.f12379j;
            put(Integer.valueOf(c33118Gl23.f12382a), c33118Gl23);
            C33118Gl2 c33118Gl24 = C33118Gl2.f12380k;
            put(Integer.valueOf(c33118Gl24.f12382a), c33118Gl24);
        }
    }

    static {
        C5448N c5448n = InterfaceC42183hY2.f85404c;
        f12377h = new C33118Gl2(1, 32, 1, 265, 7, 8516, c5448n);
        f12378i = new C33118Gl2(2, 32, 2, 133, 6, 4292, c5448n);
        f12379j = new C33118Gl2(3, 32, 4, 67, 4, 2180, c5448n);
        f12380k = new C33118Gl2(4, 32, 8, 34, 0, 1124, c5448n);
        f12381l = new C2938a();
    }

    public C33118Gl2(int i, int i2, int i3, int i4, int i5, int i6, C5448N c5448n) {
        this.f12382a = i;
        this.f12383b = i2;
        this.f12384c = i3;
        this.f12385d = i4;
        this.f12386e = i5;
        this.f12387f = i6;
        this.f12388g = c5448n;
    }

    /* renamed from: e */
    public static C33118Gl2 m104784e(int i) {
        return f12381l.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public C5448N m104787b() {
        return this.f12388g;
    }

    /* renamed from: c */
    public int m104786c() {
        return this.f12383b;
    }

    /* renamed from: d */
    public int m104785d() {
        return this.f12385d;
    }

    /* renamed from: f */
    public int m104783f() {
        return this.f12382a;
    }

    /* renamed from: g */
    public int m104782g() {
        return this.f12384c;
    }
}
