package p000;
/* renamed from: dC1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C39613dC1 {

    /* renamed from: a */
    public final AbstractC48893sr2 f76257a;

    /* renamed from: b */
    public C40414eZ3 f76258b;

    /* renamed from: c */
    public C39002cC1[] f76259c;

    public C39613dC1(WB1 wb1, WB1 wb12) {
        this(wb1, wb12, InterfaceC49573u00.f111462e);
    }

    /* renamed from: a */
    public void m44541a(C40414eZ3 c40414eZ3) {
        this.f76258b = c40414eZ3;
        this.f76257a.m13575p(c40414eZ3);
    }

    public C39613dC1(WB1 wb1, WB1 wb12, InterfaceC49573u00 interfaceC49573u00) {
        this.f76257a = new C31861Bb5();
        if (wb1.m78755h0().compareTo(wb12.m78755h0()) >= 0) {
            m44541a(wb1.m78755h0());
        } else {
            m44541a(wb12.m78755h0());
        }
        C39002cC1[] c39002cC1Arr = new C39002cC1[2];
        this.f76259c = c39002cC1Arr;
        c39002cC1Arr[0] = new C39002cC1(0, wb1, interfaceC49573u00);
        this.f76259c[1] = new C39002cC1(1, wb12, interfaceC49573u00);
    }
}
