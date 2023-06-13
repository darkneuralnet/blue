package p000;

import java.util.HashMap;
import java.util.Map;
/* renamed from: Nl2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C34756Nl2 {

    /* renamed from: e */
    public static final C34756Nl2 f25100e;

    /* renamed from: f */
    public static final C34756Nl2 f25101f;

    /* renamed from: g */
    public static final C34756Nl2 f25102g;

    /* renamed from: h */
    public static final C34756Nl2 f25103h;

    /* renamed from: i */
    public static final C34756Nl2 f25104i;

    /* renamed from: j */
    public static Map<Object, C34756Nl2> f25105j;

    /* renamed from: a */
    public final int f25106a;

    /* renamed from: b */
    public final int f25107b;

    /* renamed from: c */
    public final int f25108c;

    /* renamed from: d */
    public final C5448N f25109d;

    /* renamed from: Nl2$a */
    /* loaded from: classes8.dex */
    public static class C5673a extends HashMap<Object, C34756Nl2> {
        public C5673a() {
            C34756Nl2 c34756Nl2 = C34756Nl2.f25100e;
            put(Integer.valueOf(c34756Nl2.f25106a), c34756Nl2);
            C34756Nl2 c34756Nl22 = C34756Nl2.f25101f;
            put(Integer.valueOf(c34756Nl22.f25106a), c34756Nl22);
            C34756Nl2 c34756Nl23 = C34756Nl2.f25102g;
            put(Integer.valueOf(c34756Nl23.f25106a), c34756Nl23);
            C34756Nl2 c34756Nl24 = C34756Nl2.f25103h;
            put(Integer.valueOf(c34756Nl24.f25106a), c34756Nl24);
            C34756Nl2 c34756Nl25 = C34756Nl2.f25104i;
            put(Integer.valueOf(c34756Nl25.f25106a), c34756Nl25);
        }
    }

    static {
        C5448N c5448n = InterfaceC42183hY2.f85404c;
        f25100e = new C34756Nl2(5, 32, 5, c5448n);
        f25101f = new C34756Nl2(6, 32, 10, c5448n);
        f25102g = new C34756Nl2(7, 32, 15, c5448n);
        f25103h = new C34756Nl2(8, 32, 20, c5448n);
        f25104i = new C34756Nl2(9, 32, 25, c5448n);
        f25105j = new C5673a();
    }

    public C34756Nl2(int i, int i2, int i3, C5448N c5448n) {
        this.f25106a = i;
        this.f25107b = i2;
        this.f25108c = i3;
        this.f25109d = c5448n;
    }

    /* renamed from: e */
    public static C34756Nl2 m93477e(int i) {
        return f25105j.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public C5448N m93480b() {
        return this.f25109d;
    }

    /* renamed from: c */
    public int m93479c() {
        return this.f25108c;
    }

    /* renamed from: d */
    public int m93478d() {
        return this.f25107b;
    }

    /* renamed from: f */
    public int m93476f() {
        return this.f25106a;
    }
}
