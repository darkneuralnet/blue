package p000;
/* renamed from: VX3 */
/* loaded from: classes8.dex */
public class VX3 {

    /* renamed from: a */
    public PA1 f39189a;

    /* renamed from: b */
    public TX3 f39190b;

    /* renamed from: c */
    public TX3[] f39191c;

    /* renamed from: d */
    public TX3[] f39192d;

    public VX3(PA1 pa1, TX3 tx3) {
        this.f39189a = pa1;
        this.f39190b = tx3;
        m79822b();
        m79823a();
    }

    /* renamed from: d */
    public static void m79820d(TX3[] tx3Arr, int i, int i2) {
        TX3 tx3 = tx3Arr[i];
        tx3Arr[i] = tx3Arr[i2];
        tx3Arr[i2] = tx3;
    }

    /* renamed from: a */
    public final void m79823a() {
        int m83438f;
        int m83437g = this.f39190b.m83437g();
        TX3[] tx3Arr = new TX3[m83437g];
        int i = m83437g - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            tx3Arr[i2] = new TX3(this.f39191c[i2]);
        }
        this.f39192d = new TX3[m83437g];
        while (i >= 0) {
            this.f39192d[i] = new TX3(this.f39189a, i);
            i--;
        }
        for (int i3 = 0; i3 < m83437g; i3++) {
            if (tx3Arr[i3].m83438f(i3) == 0) {
                int i4 = i3 + 1;
                boolean z = false;
                while (i4 < m83437g) {
                    if (tx3Arr[i4].m83438f(i3) != 0) {
                        m79820d(tx3Arr, i3, i4);
                        m79820d(this.f39192d, i3, i4);
                        i4 = m83437g;
                        z = true;
                    }
                    i4++;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int m90612f = this.f39189a.m90612f(tx3Arr[i3].m83438f(i3));
            tx3Arr[i3].m83431m(m90612f);
            this.f39192d[i3].m83431m(m90612f);
            for (int i5 = 0; i5 < m83437g; i5++) {
                if (i5 != i3 && (m83438f = tx3Arr[i5].m83438f(i3)) != 0) {
                    TX3 m83430n = tx3Arr[i3].m83430n(m83438f);
                    TX3 m83430n2 = this.f39192d[i3].m83430n(m83438f);
                    tx3Arr[i5].m83442b(m83430n);
                    this.f39192d[i5].m83442b(m83430n2);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m79822b() {
        int i;
        int m83437g = this.f39190b.m83437g();
        this.f39191c = new TX3[m83437g];
        int i2 = 0;
        while (true) {
            i = m83437g >> 1;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 << 1;
            int[] iArr = new int[i3 + 1];
            iArr[i3] = 1;
            this.f39191c[i2] = new TX3(this.f39189a, iArr);
            i2++;
        }
        while (i < m83437g) {
            int i4 = i << 1;
            int[] iArr2 = new int[i4 + 1];
            iArr2[i4] = 1;
            this.f39191c[i] = new TX3(this.f39189a, iArr2).m83433k(this.f39190b);
            i++;
        }
    }

    /* renamed from: c */
    public TX3[] m79821c() {
        return this.f39192d;
    }
}
