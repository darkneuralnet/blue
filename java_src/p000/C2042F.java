package p000;
/* renamed from: F */
/* loaded from: classes8.dex */
public class C2042F {

    /* renamed from: d */
    public static final InterfaceC1693E[] f8407d = new InterfaceC1693E[0];

    /* renamed from: a */
    public InterfaceC1693E[] f8408a;

    /* renamed from: b */
    public int f8409b;

    /* renamed from: c */
    public boolean f8410c;

    public C2042F() {
        this(10);
    }

    /* renamed from: b */
    public static InterfaceC1693E[] m108150b(InterfaceC1693E[] interfaceC1693EArr) {
        return interfaceC1693EArr.length < 1 ? f8407d : (InterfaceC1693E[]) interfaceC1693EArr.clone();
    }

    /* renamed from: a */
    public void m108151a(InterfaceC1693E interfaceC1693E) {
        if (interfaceC1693E == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        int length = this.f8408a.length;
        int i = this.f8409b + 1;
        if (this.f8410c | (i > length)) {
            m108147e(i);
        }
        this.f8408a[this.f8409b] = interfaceC1693E;
        this.f8409b = i;
    }

    /* renamed from: c */
    public InterfaceC1693E[] m108149c() {
        int i = this.f8409b;
        if (i == 0) {
            return f8407d;
        }
        InterfaceC1693E[] interfaceC1693EArr = new InterfaceC1693E[i];
        System.arraycopy(this.f8408a, 0, interfaceC1693EArr, 0, i);
        return interfaceC1693EArr;
    }

    /* renamed from: d */
    public InterfaceC1693E m108148d(int i) {
        if (i < this.f8409b) {
            return this.f8408a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + this.f8409b);
    }

    /* renamed from: e */
    public final void m108147e(int i) {
        InterfaceC1693E[] interfaceC1693EArr = new InterfaceC1693E[Math.max(this.f8408a.length, i + (i >> 1))];
        System.arraycopy(this.f8408a, 0, interfaceC1693EArr, 0, this.f8409b);
        this.f8408a = interfaceC1693EArr;
        this.f8410c = false;
    }

    /* renamed from: f */
    public int m108146f() {
        return this.f8409b;
    }

    /* renamed from: g */
    public InterfaceC1693E[] m108145g() {
        int i = this.f8409b;
        if (i == 0) {
            return f8407d;
        }
        InterfaceC1693E[] interfaceC1693EArr = this.f8408a;
        if (interfaceC1693EArr.length == i) {
            this.f8410c = true;
            return interfaceC1693EArr;
        }
        InterfaceC1693E[] interfaceC1693EArr2 = new InterfaceC1693E[i];
        System.arraycopy(interfaceC1693EArr, 0, interfaceC1693EArr2, 0, i);
        return interfaceC1693EArr2;
    }

    public C2042F(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.f8408a = i == 0 ? f8407d : new InterfaceC1693E[i];
        this.f8409b = 0;
        this.f8410c = false;
    }
}
