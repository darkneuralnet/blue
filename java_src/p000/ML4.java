package p000;
/* renamed from: ML4 */
/* loaded from: classes.dex */
public class ML4 implements InterfaceC43999kc1 {

    /* renamed from: a */
    public final InterfaceC43999kc1 f22986a;

    /* renamed from: b */
    public final C34440Mc1 f22987b;

    public ML4(InterfaceC43999kc1 interfaceC43999kc1, C36099Te4 c36099Te4) {
        this.f22986a = interfaceC43999kc1;
        this.f22987b = new C34440Mc1(c36099Te4.m83237c(B74.class));
    }

    @Override // p000.InterfaceC43999kc1
    /* renamed from: a */
    public InterfaceC44592lc1 mo28797a(int i) {
        if (!this.f22986a.mo28796b(i)) {
            return null;
        }
        InterfaceC44592lc1 mo28797a = this.f22986a.mo28797a(i);
        if (this.f22987b.m95132c()) {
            return this.f22987b.m95134a(mo28797a);
        }
        return mo28797a;
    }

    @Override // p000.InterfaceC43999kc1
    /* renamed from: b */
    public boolean mo28796b(int i) {
        if (!this.f22986a.mo28796b(i)) {
            return false;
        }
        if (this.f22987b.m95132c()) {
            return this.f22987b.m95131d(this.f22986a.mo28797a(i));
        }
        return true;
    }
}
