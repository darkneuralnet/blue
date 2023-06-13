package p000;
/* renamed from: mm0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C45284mm0 {

    /* renamed from: a */
    public InterfaceC46112o96 f98718a;

    /* renamed from: b */
    public C46470om0 f98719b;

    /* renamed from: c */
    public AbstractC45877nm0 f98720c;

    /* renamed from: d */
    public AbstractC45877nm0 f98721d;

    /* renamed from: e */
    public boolean f98722e;

    /* renamed from: f */
    public int f98723f = 0;

    public C45284mm0(InterfaceC46112o96 interfaceC46112o96, AbstractC45877nm0 abstractC45877nm0) {
        DZ3.m110173d(interfaceC46112o96, "Parameter \"transformProvider\" was null.");
        DZ3.m110173d(abstractC45877nm0, "Parameter \"localCollisionShape\" was null.");
        this.f98718a = interfaceC46112o96;
        m25036d(abstractC45877nm0);
    }

    /* renamed from: a */
    public AbstractC45877nm0 m25039a() {
        return this.f98720c;
    }

    /* renamed from: b */
    public void m25038b() {
        this.f98722e = true;
    }

    /* renamed from: c */
    public void m25037c(C46470om0 c46470om0) {
        C46470om0 c46470om02 = this.f98719b;
        if (c46470om02 != null) {
            c46470om02.m20524b(this);
        }
        this.f98719b = c46470om0;
        if (c46470om0 != null) {
            c46470om0.m20525a(this);
        }
    }

    /* renamed from: d */
    public void m25036d(AbstractC45877nm0 abstractC45877nm0) {
        DZ3.m110173d(abstractC45877nm0, "Parameter \"localCollisionShape\" was null.");
        this.f98720c = abstractC45877nm0;
        this.f98721d = null;
    }
}
