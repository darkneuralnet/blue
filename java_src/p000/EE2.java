package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* renamed from: EE2 */
/* loaded from: classes8.dex */
public class EE2 extends AbstractC44351lB5 {

    /* renamed from: b */
    public List f7128b;

    /* renamed from: c */
    public NN5 f7129c;

    /* renamed from: d */
    public int f7130d;

    /* renamed from: e */
    public Collection f7131e;

    /* renamed from: f */
    public int f7132f;

    /* renamed from: g */
    public double f7133g;

    /* renamed from: EE2$a */
    /* loaded from: classes8.dex */
    public static class C1764a extends GV2 {

        /* renamed from: c */
        public InterfaceC36676Vq5 f7134c;

        public C1764a(InterfaceC36676Vq5 interfaceC36676Vq5) {
            this.f7134c = interfaceC36676Vq5;
        }

        @Override // p000.GV2
        /* renamed from: b */
        public void mo105048b(BV2 bv2, int i, BV2 bv22, int i2) {
            this.f7134c.mo19421a((InterfaceC39410cr5) bv2.m113970c(), i, (InterfaceC39410cr5) bv22.m113970c(), i2);
        }
    }

    public EE2() {
        this.f7128b = new ArrayList();
        this.f7129c = new C39292ch5();
        this.f7130d = 0;
        this.f7132f = 0;
        this.f7133g = 0.0d;
    }

    @Override // p000.T83
    /* renamed from: a */
    public void mo11840a(Collection collection) {
        this.f7131e = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m109283d((InterfaceC39410cr5) it.next());
        }
        m109282e();
    }

    @Override // p000.T83
    /* renamed from: b */
    public Collection mo11839b() {
        return S83.m85911g(this.f7131e);
    }

    /* renamed from: d */
    public final void m109283d(InterfaceC39410cr5 interfaceC39410cr5) {
        for (BV2 bv2 : DV2.m110352b(interfaceC39410cr5.mo44967h(), interfaceC39410cr5)) {
            int i = this.f7130d;
            this.f7130d = i + 1;
            bv2.m113964i(i);
            this.f7129c.mo61052a(bv2.m113969d(this.f7133g), bv2);
            this.f7128b.add(bv2);
        }
    }

    /* renamed from: e */
    public final void m109282e() {
        C1764a c1764a = new C1764a(this.f95695a);
        for (BV2 bv2 : this.f7128b) {
            for (BV2 bv22 : this.f7129c.mo61051b(bv2.m113969d(this.f7133g))) {
                if (bv22.m113968e() > bv2.m113968e()) {
                    bv2.m113971b(bv22, this.f7133g, c1764a);
                    this.f7132f++;
                }
                if (this.f95695a.isDone()) {
                    return;
                }
            }
        }
    }

    public EE2(InterfaceC36676Vq5 interfaceC36676Vq5, double d) {
        super(interfaceC36676Vq5);
        this.f7128b = new ArrayList();
        this.f7129c = new C39292ch5();
        this.f7130d = 0;
        this.f7132f = 0;
        this.f7133g = d;
    }
}
