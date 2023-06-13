package p000;
/* renamed from: X96 */
/* loaded from: classes5.dex */
public final class X96<T> implements R96<T> {

    /* renamed from: a */
    public final T96 f42735a;

    /* renamed from: b */
    public final String f42736b;

    /* renamed from: c */
    public final C35142Pc1 f42737c;

    /* renamed from: d */
    public final C96<T, byte[]> f42738d;

    /* renamed from: e */
    public final Z96 f42739e;

    public X96(T96 t96, String str, C35142Pc1 c35142Pc1, C96<T, byte[]> c96, Z96 z96) {
        this.f42735a = t96;
        this.f42736b = str;
        this.f42737c = c35142Pc1;
        this.f42738d = c96;
        this.f42739e = z96;
    }

    /* renamed from: e */
    public static /* synthetic */ void m77272e(Exception exc) {
    }

    @Override // p000.R96
    /* renamed from: a */
    public void mo77276a(AbstractC52339yg1<T> abstractC52339yg1) {
        mo77275b(abstractC52339yg1, new InterfaceC44577la6() { // from class: W96
            @Override // p000.InterfaceC44577la6
            /* renamed from: a */
            public final void mo27131a(Exception exc) {
                X96.m77272e(exc);
            }
        });
    }

    @Override // p000.R96
    /* renamed from: b */
    public void mo77275b(AbstractC52339yg1<T> abstractC52339yg1, InterfaceC44577la6 interfaceC44577la6) {
        this.f42739e.mo33791a(AbstractC32014Bs5.m113424a().mo42419e(this.f42735a).mo42421c(abstractC52339yg1).mo42418f(this.f42736b).mo42420d(this.f42738d).mo42422b(this.f42737c).mo42423a(), interfaceC44577la6);
    }

    /* renamed from: d */
    public T96 m77273d() {
        return this.f42735a;
    }
}
