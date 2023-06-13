package p000;

import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: uL6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49778uL6 {

    /* renamed from: j */
    public static final C42061hK6 f112225j = new C42061hK6("ExtractorLooper");

    /* renamed from: a */
    public final C46823pM6 f112226a;

    /* renamed from: b */
    public final C48592sL6 f112227b;

    /* renamed from: c */
    public final C39717dN6 f112228c;

    /* renamed from: d */
    public final FM6 f112229d;

    /* renamed from: e */
    public final KM6 f112230e;

    /* renamed from: f */
    public final OM6 f112231f;

    /* renamed from: g */
    public final InterfaceC46230oM6<InterfaceC40920fP6> f112232g;

    /* renamed from: h */
    public final C50379vM6 f112233h;

    /* renamed from: i */
    public final AtomicBoolean f112234i = new AtomicBoolean(false);

    public C49778uL6(C46823pM6 c46823pM6, InterfaceC46230oM6<InterfaceC40920fP6> interfaceC46230oM6, C48592sL6 c48592sL6, C39717dN6 c39717dN6, FM6 fm6, KM6 km6, OM6 om6, C50379vM6 c50379vM6) {
        this.f112226a = c46823pM6;
        this.f112232g = interfaceC46230oM6;
        this.f112227b = c48592sL6;
        this.f112228c = c39717dN6;
        this.f112229d = fm6;
        this.f112230e = km6;
        this.f112231f = om6;
        this.f112233h = c50379vM6;
    }

    /* renamed from: a */
    public final void m10413a() {
        C49194tM6 c49194tM6;
        C42061hK6 c42061hK6 = f112225j;
        c42061hK6.m36538a("Run extractor loop", new Object[0]);
        if (!this.f112234i.compareAndSet(false, true)) {
            c42061hK6.m36534e("runLoop already looping; return", new Object[0]);
            return;
        }
        while (true) {
            try {
                c49194tM6 = this.f112233h.m8774a();
            } catch (C49185tL6 e) {
                f112225j.m36537b("Error while getting next extraction task: %s", e.getMessage());
                if (e.f110323b >= 0) {
                    this.f112232g.m21257a().mo10450a(e.f110323b);
                    m10412b(e.f110323b, e);
                }
                c49194tM6 = null;
            }
            if (c49194tM6 == null) {
                this.f112234i.set(false);
                return;
            }
            try {
                if (c49194tM6 instanceof C48000rL6) {
                    this.f112227b.m14315a((C48000rL6) c49194tM6);
                } else if (c49194tM6 instanceof C39106cN6) {
                    this.f112228c.m44339a((C39106cN6) c49194tM6);
                } else if (c49194tM6 instanceof EM6) {
                    this.f112229d.m107276a((EM6) c49194tM6);
                } else if (c49194tM6 instanceof HM6) {
                    this.f112230e.m98961a((HM6) c49194tM6);
                } else if (c49194tM6 instanceof NM6) {
                    this.f112231f.m92370a((NM6) c49194tM6);
                } else {
                    f112225j.m36537b("Unknown task type: %s", c49194tM6.getClass().getName());
                }
            } catch (Exception e2) {
                f112225j.m36537b("Error during extraction task: %s", e2.getMessage());
                this.f112232g.m21257a().mo10450a(c49194tM6.f110335a);
                m10412b(c49194tM6.f110335a, e2);
            }
        }
    }

    /* renamed from: b */
    public final void m10412b(int i, Exception exc) {
        try {
            this.f112226a.m19404o(i);
            this.f112226a.m19412g(i);
        } catch (C49185tL6 unused) {
            f112225j.m36537b("Error during error handling: %s", exc.getMessage());
        }
    }
}
