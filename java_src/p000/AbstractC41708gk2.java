package p000;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/* renamed from: gk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC41708gk2 {

    /* renamed from: a */
    public AbstractC42603iF0 f84137a;

    /* renamed from: b */
    public C22447b f84138b;

    /* renamed from: c */
    public String f84139c;

    /* renamed from: d */
    public int f84140d = 0;

    /* renamed from: e */
    public String f84141e = null;

    /* renamed from: f */
    public int f84142f = 0;

    /* renamed from: g */
    public ArrayList<C22448c> f84143g = new ArrayList<>();

    /* renamed from: gk2$a */
    /* loaded from: classes.dex */
    public class C22446a implements Comparator<C22448c> {
        public C22446a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C22448c c22448c, C22448c c22448c2) {
            return Integer.compare(c22448c.f84161a, c22448c2.f84161a);
        }
    }

    /* renamed from: gk2$b */
    /* loaded from: classes.dex */
    public static class C22447b {

        /* renamed from: a */
        public final int f84145a;

        /* renamed from: b */
        public C34172Ky3 f84146b;

        /* renamed from: c */
        public final int f84147c;

        /* renamed from: d */
        public final int f84148d;

        /* renamed from: e */
        public final int f84149e;

        /* renamed from: f */
        public float[] f84150f;

        /* renamed from: g */
        public double[] f84151g;

        /* renamed from: h */
        public float[] f84152h;

        /* renamed from: i */
        public float[] f84153i;

        /* renamed from: j */
        public float[] f84154j;

        /* renamed from: k */
        public float[] f84155k;

        /* renamed from: l */
        public int f84156l;

        /* renamed from: m */
        public AbstractC42603iF0 f84157m;

        /* renamed from: n */
        public double[] f84158n;

        /* renamed from: o */
        public double[] f84159o;

        /* renamed from: p */
        public float f84160p;

        public C22447b(int i, String str, int i2, int i3) {
            C34172Ky3 c34172Ky3 = new C34172Ky3();
            this.f84146b = c34172Ky3;
            this.f84147c = 0;
            this.f84148d = 1;
            this.f84149e = 2;
            this.f84156l = i;
            this.f84145a = i2;
            c34172Ky3.m98027g(i, str);
            this.f84150f = new float[i3];
            this.f84151g = new double[i3];
            this.f84152h = new float[i3];
            this.f84153i = new float[i3];
            this.f84154j = new float[i3];
            this.f84155k = new float[i3];
        }

        /* renamed from: a */
        public double m37763a(float f) {
            AbstractC42603iF0 abstractC42603iF0 = this.f84157m;
            if (abstractC42603iF0 != null) {
                double d = f;
                abstractC42603iF0.mo34279g(d, this.f84159o);
                this.f84157m.mo34282d(d, this.f84158n);
            } else {
                double[] dArr = this.f84159o;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d2 = f;
            double m98029e = this.f84146b.m98029e(d2, this.f84158n[1]);
            double m98030d = this.f84146b.m98030d(d2, this.f84158n[1], this.f84159o[1]);
            double[] dArr2 = this.f84159o;
            return dArr2[0] + (m98029e * dArr2[2]) + (m98030d * this.f84158n[2]);
        }

        /* renamed from: b */
        public double m37762b(float f) {
            AbstractC42603iF0 abstractC42603iF0 = this.f84157m;
            if (abstractC42603iF0 != null) {
                abstractC42603iF0.mo34282d(f, this.f84158n);
            } else {
                double[] dArr = this.f84158n;
                dArr[0] = this.f84153i[0];
                dArr[1] = this.f84154j[0];
                dArr[2] = this.f84150f[0];
            }
            double[] dArr2 = this.f84158n;
            return dArr2[0] + (this.f84146b.m98029e(f, dArr2[1]) * this.f84158n[2]);
        }

        /* renamed from: c */
        public void m37761c(int i, int i2, float f, float f2, float f3, float f4) {
            this.f84151g[i] = i2 / 100.0d;
            this.f84152h[i] = f;
            this.f84153i[i] = f2;
            this.f84154j[i] = f3;
            this.f84150f[i] = f4;
        }

        /* renamed from: d */
        public void m37760d(float f) {
            this.f84160p = f;
            double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, this.f84151g.length, 3);
            float[] fArr = this.f84150f;
            this.f84158n = new double[fArr.length + 2];
            this.f84159o = new double[fArr.length + 2];
            if (this.f84151g[0] > 0.0d) {
                this.f84146b.m98033a(0.0d, this.f84152h[0]);
            }
            double[] dArr2 = this.f84151g;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f84146b.m98033a(1.0d, this.f84152h[length]);
            }
            for (int i = 0; i < dArr.length; i++) {
                double[] dArr3 = dArr[i];
                dArr3[0] = this.f84153i[i];
                dArr3[1] = this.f84154j[i];
                dArr3[2] = this.f84150f[i];
                this.f84146b.m98033a(this.f84151g[i], this.f84152h[i]);
            }
            this.f84146b.m98028f();
            double[] dArr4 = this.f84151g;
            if (dArr4.length > 1) {
                this.f84157m = AbstractC42603iF0.m34285a(0, dArr4, dArr);
            } else {
                this.f84157m = null;
            }
        }
    }

    /* renamed from: gk2$c */
    /* loaded from: classes.dex */
    public static class C22448c {

        /* renamed from: a */
        public int f84161a;

        /* renamed from: b */
        public float f84162b;

        /* renamed from: c */
        public float f84163c;

        /* renamed from: d */
        public float f84164d;

        /* renamed from: e */
        public float f84165e;

        public C22448c(int i, float f, float f2, float f3, float f4) {
            this.f84161a = i;
            this.f84162b = f4;
            this.f84163c = f2;
            this.f84164d = f;
            this.f84165e = f3;
        }
    }

    /* renamed from: a */
    public float m37771a(float f) {
        return (float) this.f84138b.m37762b(f);
    }

    /* renamed from: b */
    public float m37770b(float f) {
        return (float) this.f84138b.m37763a(f);
    }

    /* renamed from: c */
    public void mo7877c(Object obj) {
    }

    /* renamed from: d */
    public void m37769d(int i, int i2, String str, int i3, float f, float f2, float f3, float f4) {
        this.f84143g.add(new C22448c(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.f84142f = i3;
        }
        this.f84140d = i2;
        this.f84141e = str;
    }

    /* renamed from: e */
    public void m37768e(int i, int i2, String str, int i3, float f, float f2, float f3, float f4, Object obj) {
        this.f84143g.add(new C22448c(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.f84142f = i3;
        }
        this.f84140d = i2;
        mo7877c(obj);
        this.f84141e = str;
    }

    /* renamed from: f */
    public void m37767f(String str) {
        this.f84139c = str;
    }

    /* renamed from: g */
    public void m37766g(float f) {
        int size = this.f84143g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f84143g, new C22446a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, 3);
        this.f84138b = new C22447b(this.f84140d, this.f84141e, this.f84142f, size);
        Iterator<C22448c> it = this.f84143g.iterator();
        int i = 0;
        while (it.hasNext()) {
            C22448c next = it.next();
            float f2 = next.f84164d;
            dArr[i] = f2 * 0.01d;
            double[] dArr3 = dArr2[i];
            float f3 = next.f84162b;
            dArr3[0] = f3;
            float f4 = next.f84163c;
            dArr3[1] = f4;
            float f5 = next.f84165e;
            dArr3[2] = f5;
            this.f84138b.m37761c(i, next.f84161a, f2, f4, f5, f3);
            i++;
            dArr2 = dArr2;
        }
        this.f84138b.m37760d(f);
        this.f84137a = AbstractC42603iF0.m34285a(0, dArr, dArr2);
    }

    /* renamed from: h */
    public boolean m37765h() {
        return this.f84142f == 1;
    }

    public String toString() {
        String str = this.f84139c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<C22448c> it = this.f84143g.iterator();
        while (it.hasNext()) {
            C22448c next = it.next();
            str = str + "[" + next.f84161a + " , " + decimalFormat.format(next.f84162b) + "] ";
        }
        return str;
    }
}
