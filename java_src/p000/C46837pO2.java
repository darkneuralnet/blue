package p000;
/* renamed from: pO2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C46837pO2 implements InterfaceC51182wj0 {

    /* renamed from: b */
    public int f103610b;

    /* renamed from: c */
    public int f103611c;

    /* renamed from: d */
    public int f103612d;

    /* renamed from: e */
    public int f103613e;

    /* renamed from: f */
    public P31 f103614f;

    public C46837pO2() {
        this(11, 50);
    }

    public C46837pO2(int i, int i2) {
        this(i, i2, null);
    }

    public C46837pO2(int i, int i2, P31 p31) {
        if (i < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i > 32) {
            throw new IllegalArgumentException("m is too large");
        }
        this.f103610b = i;
        int i3 = 1 << i;
        this.f103612d = i3;
        if (i2 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i2 > i3) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        this.f103611c = i2;
        this.f103613e = UX3.m81372c(i);
        this.f103614f = p31;
    }
}
