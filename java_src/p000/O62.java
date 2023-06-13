package p000;
/* renamed from: O62 */
/* loaded from: classes8.dex */
public class O62 implements InterfaceC36676Vq5 {

    /* renamed from: f */
    public AbstractC48893sr2 f25887f;

    /* renamed from: a */
    public boolean f25882a = false;

    /* renamed from: b */
    public boolean f25883b = false;

    /* renamed from: c */
    public boolean f25884c = false;

    /* renamed from: d */
    public boolean f25885d = false;

    /* renamed from: e */
    public C52053yB0 f25886e = null;

    /* renamed from: g */
    public int f25888g = 0;

    /* renamed from: h */
    public int f25889h = 0;

    /* renamed from: i */
    public int f25890i = 0;

    /* renamed from: j */
    public int f25891j = 0;

    public O62(AbstractC48893sr2 abstractC48893sr2) {
        this.f25887f = abstractC48893sr2;
    }

    /* renamed from: b */
    public static boolean m92915b(int i, int i2) {
        return Math.abs(i - i2) == 1;
    }

    @Override // p000.InterfaceC36676Vq5
    /* renamed from: a */
    public void mo19421a(InterfaceC39410cr5 interfaceC39410cr5, int i, InterfaceC39410cr5 interfaceC39410cr52, int i2) {
        if (interfaceC39410cr5 == interfaceC39410cr52 && i == i2) {
            return;
        }
        this.f25891j++;
        this.f25887f.m13587d(interfaceC39410cr5.mo44966u(i), interfaceC39410cr5.mo44966u(i + 1), interfaceC39410cr52.mo44966u(i2), interfaceC39410cr52.mo44966u(i2 + 1));
        if (this.f25887f.m13582i()) {
            this.f25888g++;
            if (this.f25887f.m13579l()) {
                this.f25889h++;
                this.f25885d = true;
            }
            if (!m92914c(interfaceC39410cr5, i, interfaceC39410cr52, i2)) {
                this.f25882a = true;
                ((S83) interfaceC39410cr5).m85914d(this.f25887f, i, 0);
                ((S83) interfaceC39410cr52).m85914d(this.f25887f, i2, 1);
                if (this.f25887f.m13576o()) {
                    this.f25890i++;
                    this.f25883b = true;
                    this.f25884c = true;
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean m92914c(InterfaceC39410cr5 interfaceC39410cr5, int i, InterfaceC39410cr5 interfaceC39410cr52, int i2) {
        if (interfaceC39410cr5 == interfaceC39410cr52 && this.f25887f.m13584g() == 1) {
            if (m92915b(i, i2)) {
                return true;
            }
            if (interfaceC39410cr5.isClosed()) {
                int size = interfaceC39410cr5.size() - 1;
                if ((i == 0 && i2 == size) || (i2 == 0 && i == size)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // p000.InterfaceC36676Vq5
    public boolean isDone() {
        return false;
    }
}
