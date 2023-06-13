package p000;
/* renamed from: T62 */
/* loaded from: classes8.dex */
public class T62 extends V62 {

    /* renamed from: c */
    public V62 f34788c;

    /* renamed from: d */
    public V62 f34789d;

    public T62(V62 v62, V62 v622) {
        this.f34788c = v62;
        this.f34789d = v622;
        m84310c(v62, v622);
    }

    @Override // p000.V62
    /* renamed from: b */
    public void mo80392b(double d, double d2, InterfaceC42261hg2 interfaceC42261hg2) {
        if (!m80393a(d, d2)) {
            return;
        }
        V62 v62 = this.f34788c;
        if (v62 != null) {
            v62.mo80392b(d, d2, interfaceC42261hg2);
        }
        V62 v622 = this.f34789d;
        if (v622 != null) {
            v622.mo80392b(d, d2, interfaceC42261hg2);
        }
    }

    /* renamed from: c */
    public final void m84310c(V62 v62, V62 v622) {
        this.f38641a = Math.min(v62.f38641a, v622.f38641a);
        this.f38642b = Math.max(v62.f38642b, v622.f38642b);
    }
}
