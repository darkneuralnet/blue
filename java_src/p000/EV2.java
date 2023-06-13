package p000;
/* renamed from: EV2 */
/* loaded from: classes8.dex */
public class EV2 {

    /* renamed from: a */
    public C47293q91 f7546a;

    /* renamed from: b */
    public C52053yB0[] f7547b;

    /* renamed from: c */
    public int[] f7548c;

    public EV2(C47293q91 c47293q91) {
        this.f7546a = c47293q91;
        this.f7547b = c47293q91.m18068n();
        this.f7548c = new FV2().m107074b(this.f7547b);
    }

    /* renamed from: a */
    public final void m108924a(int i, int i2, EV2 ev2, int i3, int i4, C36910Wq5 c36910Wq5) {
        if (i2 - i == 1 && i4 - i3 == 1) {
            c36910Wq5.m77812a(this.f7546a, i, ev2.f7546a, i3);
        } else if (!m108919f(i, i2, ev2, i3, i4)) {
        } else {
            int i5 = (i + i2) / 2;
            int i6 = (i3 + i4) / 2;
            if (i < i5) {
                if (i3 < i6) {
                    m108924a(i, i5, ev2, i3, i6, c36910Wq5);
                }
                if (i6 < i4) {
                    m108924a(i, i5, ev2, i6, i4, c36910Wq5);
                }
            }
            if (i5 < i2) {
                if (i3 < i6) {
                    m108924a(i5, i2, ev2, i3, i6, c36910Wq5);
                }
                if (i6 < i4) {
                    m108924a(i5, i2, ev2, i6, i4, c36910Wq5);
                }
            }
        }
    }

    /* renamed from: b */
    public void m108923b(int i, EV2 ev2, int i2, C36910Wq5 c36910Wq5) {
        int[] iArr = this.f7548c;
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int[] iArr2 = ev2.f7548c;
        m108924a(i3, i4, ev2, iArr2[i2], iArr2[i2 + 1], c36910Wq5);
    }

    /* renamed from: c */
    public double m108922c(int i) {
        C52053yB0[] c52053yB0Arr = this.f7547b;
        int[] iArr = this.f7548c;
        double d = c52053yB0Arr[iArr[i]].f118922b;
        double d2 = c52053yB0Arr[iArr[i + 1]].f118922b;
        if (d <= d2) {
            return d2;
        }
        return d;
    }

    /* renamed from: d */
    public double m108921d(int i) {
        C52053yB0[] c52053yB0Arr = this.f7547b;
        int[] iArr = this.f7548c;
        double d = c52053yB0Arr[iArr[i]].f118922b;
        double d2 = c52053yB0Arr[iArr[i + 1]].f118922b;
        if (d >= d2) {
            return d2;
        }
        return d;
    }

    /* renamed from: e */
    public int[] m108920e() {
        return this.f7548c;
    }

    /* renamed from: f */
    public final boolean m108919f(int i, int i2, EV2 ev2, int i3, int i4) {
        C52053yB0[] c52053yB0Arr = this.f7547b;
        C52053yB0 c52053yB0 = c52053yB0Arr[i];
        C52053yB0 c52053yB02 = c52053yB0Arr[i2];
        C52053yB0[] c52053yB0Arr2 = ev2.f7547b;
        return C48772sf1.m13888J(c52053yB0, c52053yB02, c52053yB0Arr2[i3], c52053yB0Arr2[i4]);
    }
}
