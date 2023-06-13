package p000;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
/* renamed from: Pp0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35258Pp0<E> extends C34790Np0<E> {

    /* renamed from: g */
    public transient int[] f29114g;

    /* renamed from: h */
    public transient int[] f29115h;

    /* renamed from: i */
    public transient int f29116i;

    /* renamed from: j */
    public transient int f29117j;

    public C35258Pp0() {
    }

    /* renamed from: O */
    public static <E> C35258Pp0<E> m89739O(int i) {
        return new C35258Pp0<>(i);
    }

    @Override // p000.C34790Np0
    /* renamed from: A */
    public void mo89742A(int i, E e, int i2, int i3) {
        super.mo89742A(i, e, i2, i3);
        m89734U(this.f29117j, i);
        m89734U(i, -2);
    }

    @Override // p000.C34790Np0
    /* renamed from: C */
    public void mo89741C(int i, int i2) {
        int size = size() - 1;
        super.mo89741C(i, i2);
        m89734U(m89738Q(i), mo89728w(i));
        if (i < size) {
            m89734U(m89738Q(size), i);
            m89734U(i, mo89728w(size));
        }
        m89737R()[size] = 0;
        m89736S()[size] = 0;
    }

    @Override // p000.C34790Np0
    /* renamed from: I */
    public void mo89740I(int i) {
        super.mo89740I(i);
        this.f29114g = Arrays.copyOf(m89737R(), i);
        this.f29115h = Arrays.copyOf(m89736S(), i);
    }

    /* renamed from: Q */
    public final int m89738Q(int i) {
        return m89737R()[i] - 1;
    }

    /* renamed from: R */
    public final int[] m89737R() {
        int[] iArr = this.f29114g;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* renamed from: S */
    public final int[] m89736S() {
        int[] iArr = this.f29115h;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* renamed from: T */
    public final void m89735T(int i, int i2) {
        m89737R()[i] = i2 + 1;
    }

    /* renamed from: U */
    public final void m89734U(int i, int i2) {
        if (i == -2) {
            this.f29116i = i2;
        } else {
            m89733V(i, i2);
        }
        if (i2 == -2) {
            this.f29117j = i;
        } else {
            m89735T(i2, i);
        }
    }

    /* renamed from: V */
    public final void m89733V(int i, int i2) {
        m89736S()[i] = i2 + 1;
    }

    @Override // p000.C34790Np0
    /* renamed from: c */
    public int mo89732c(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // p000.C34790Np0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (m93365D()) {
            return;
        }
        this.f29116i = -2;
        this.f29117j = -2;
        int[] iArr = this.f29114g;
        if (iArr != null && this.f29115h != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.f29115h, 0, size(), 0);
        }
        super.clear();
    }

    @Override // p000.C34790Np0
    /* renamed from: e */
    public int mo89731e() {
        int mo89731e = super.mo89731e();
        this.f29114g = new int[mo89731e];
        this.f29115h = new int[mo89731e];
        return mo89731e;
    }

    @Override // p000.C34790Np0
    /* renamed from: f */
    public Set<E> mo89730f() {
        Set<E> mo89730f = super.mo89730f();
        this.f29114g = null;
        this.f29115h = null;
        return mo89730f;
    }

    @Override // p000.C34790Np0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return C33281Hd3.m103634h(this);
    }

    @Override // p000.C34790Np0
    /* renamed from: v */
    public int mo89729v() {
        return this.f29116i;
    }

    @Override // p000.C34790Np0
    /* renamed from: w */
    public int mo89728w(int i) {
        return m89736S()[i] - 1;
    }

    @Override // p000.C34790Np0
    /* renamed from: z */
    public void mo89727z(int i) {
        super.mo89727z(i);
        this.f29116i = -2;
        this.f29117j = -2;
    }

    public C35258Pp0(int i) {
        super(i);
    }

    @Override // p000.C34790Np0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C33281Hd3.m103633i(this, tArr);
    }
}
