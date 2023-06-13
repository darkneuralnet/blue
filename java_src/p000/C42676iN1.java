package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
/* renamed from: iN1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42676iN1 {

    /* renamed from: a */
    public C40414eZ3 f87211a;

    /* renamed from: b */
    public double f87212b;

    /* renamed from: c */
    public C36376Uj2 f87213c = new C36376Uj2();

    /* renamed from: iN1$a */
    /* loaded from: classes8.dex */
    public static final class C23226a implements Iterator<C52053yB0> {

        /* renamed from: b */
        public final Random f87214b = new Random(13);

        /* renamed from: c */
        public final C52053yB0[] f87215c;

        /* renamed from: d */
        public final int[] f87216d;

        /* renamed from: e */
        public int f87217e;

        public C23226a(C52053yB0[] c52053yB0Arr) {
            this.f87215c = c52053yB0Arr;
            this.f87216d = new int[c52053yB0Arr.length];
            for (int i = 0; i < c52053yB0Arr.length; i++) {
                this.f87216d[i] = i;
            }
            this.f87217e = c52053yB0Arr.length - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public C52053yB0 next() {
            int nextInt = this.f87214b.nextInt(this.f87217e + 1);
            C52053yB0[] c52053yB0Arr = this.f87215c;
            int[] iArr = this.f87216d;
            C52053yB0 c52053yB0 = c52053yB0Arr[iArr[nextInt]];
            int i = this.f87217e;
            this.f87217e = i - 1;
            iArr[nextInt] = iArr[i];
            return c52053yB0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f87217e >= 0;
        }
    }

    public C42676iN1(C40414eZ3 c40414eZ3) {
        this.f87211a = c40414eZ3;
        this.f87212b = c40414eZ3.m42764b();
    }

    /* renamed from: a */
    public C42083hN1 m34048a(C52053yB0 c52053yB0) {
        C52053yB0 m34043f = m34043f(c52053yB0);
        C42083hN1 m34045d = m34045d(m34043f);
        if (m34045d != null) {
            m34045d.m36497h();
            return m34045d;
        }
        C42083hN1 c42083hN1 = new C42083hN1(m34043f, this.f87212b);
        this.f87213c.m80968c(c42083hN1.m36504a(), c42083hN1);
        return c42083hN1;
    }

    /* renamed from: b */
    public void m34047b(C52053yB0[] c52053yB0Arr) {
        C23226a c23226a = new C23226a(c52053yB0Arr);
        while (c23226a.hasNext()) {
            m34048a(c23226a.next());
        }
    }

    /* renamed from: c */
    public void m34046c(List<C52053yB0> list) {
        for (C52053yB0 c52053yB0 : list) {
            m34048a(c52053yB0).m36497h();
        }
    }

    /* renamed from: d */
    public final C42083hN1 m34045d(C52053yB0 c52053yB0) {
        C35908Sj2 m80966e = this.f87213c.m80966e(c52053yB0);
        if (m80966e == null) {
            return null;
        }
        return (C42083hN1) m80966e.m84995b();
    }

    /* renamed from: e */
    public void m34044e(C52053yB0 c52053yB0, C52053yB0 c52053yB02, InterfaceC36142Tj2 interfaceC36142Tj2) {
        C48772sf1 c48772sf1 = new C48772sf1(c52053yB0, c52053yB02);
        c48772sf1.m13877h(1.0d / this.f87212b);
        this.f87213c.m80965f(c48772sf1, interfaceC36142Tj2);
    }

    /* renamed from: f */
    public final C52053yB0 m34043f(C52053yB0 c52053yB0) {
        C52053yB0 mo3888e = c52053yB0.mo3888e();
        this.f87211a.m42760f(mo3888e);
        return mo3888e;
    }
}
