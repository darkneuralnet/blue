package p000;
/* renamed from: A79 */
/* loaded from: classes6.dex */
public final class A79 implements InterfaceC38952c69 {

    /* renamed from: a */
    public final /* synthetic */ W79 f186a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC38952c69 f187b;

    public A79(C44326l89 c44326l89, W79 w79, InterfaceC38952c69 interfaceC38952c69) {
        this.f186a = w79;
        this.f187b = interfaceC38952c69;
    }

    public final String toString() {
        return this.f187b.toString();
    }

    @Override // p000.InterfaceC38952c69
    public final Mb9 zza() throws Exception {
        if (!this.f186a.compareAndSet(O79.NOT_RUN, O79.STARTED)) {
            return new Qa9();
        }
        return this.f187b.zza();
    }
}
