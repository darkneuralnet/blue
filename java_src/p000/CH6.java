package p000;
/* renamed from: CH6 */
/* loaded from: classes8.dex */
public abstract class CH6 {

    /* renamed from: a */
    public final int f3882a;

    /* renamed from: b */
    public final long f3883b;

    /* renamed from: c */
    public final int f3884c;

    /* renamed from: d */
    public final int f3885d;

    /* renamed from: CH6$a */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC1008a<T extends AbstractC1008a> {

        /* renamed from: a */
        public final int f3886a;

        /* renamed from: b */
        public int f3887b = 0;

        /* renamed from: c */
        public long f3888c = 0;

        /* renamed from: d */
        public int f3889d = 0;

        public AbstractC1008a(int i) {
            this.f3886a = i;
        }

        /* renamed from: e */
        public abstract T mo12544e();

        /* renamed from: f */
        public T m112394f(int i) {
            this.f3889d = i;
            return mo12544e();
        }

        /* renamed from: g */
        public T m112393g(int i) {
            this.f3887b = i;
            return mo12544e();
        }

        /* renamed from: h */
        public T m112392h(long j) {
            this.f3888c = j;
            return mo12544e();
        }
    }

    public CH6(AbstractC1008a abstractC1008a) {
        this.f3882a = abstractC1008a.f3887b;
        this.f3883b = abstractC1008a.f3888c;
        this.f3884c = abstractC1008a.f3886a;
        this.f3885d = abstractC1008a.f3889d;
    }

    /* renamed from: a */
    public final int m112401a() {
        return this.f3885d;
    }

    /* renamed from: b */
    public final int m112400b() {
        return this.f3882a;
    }

    /* renamed from: c */
    public final long m112399c() {
        return this.f3883b;
    }

    /* renamed from: d */
    public byte[] mo12547d() {
        byte[] bArr = new byte[32];
        DD3.m110680d(this.f3882a, bArr, 0);
        DD3.m110675i(this.f3883b, bArr, 4);
        DD3.m110680d(this.f3884c, bArr, 12);
        DD3.m110680d(this.f3885d, bArr, 28);
        return bArr;
    }
}
