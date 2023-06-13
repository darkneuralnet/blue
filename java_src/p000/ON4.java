package p000;
/* renamed from: ON4 */
/* loaded from: classes7.dex */
public class ON4<E, F> implements H80<E> {

    /* renamed from: d */
    public static final InterfaceC5984b f26451d = new C5983a();

    /* renamed from: b */
    public final AbstractC44415lI6<F> f26452b;

    /* renamed from: c */
    public final InterfaceC5984b<E, F> f26453c;

    /* renamed from: ON4$a */
    /* loaded from: classes7.dex */
    public static final class C5983a<E> implements InterfaceC5984b<E, E> {
        @Override // p000.ON4.InterfaceC5984b
        public E extract(E e) {
            return e;
        }
    }

    /* renamed from: ON4$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC5984b<E, F> {
        F extract(E e);
    }

    public ON4(AbstractC44415lI6<F> abstractC44415lI6, InterfaceC5984b<E, F> interfaceC5984b) {
        this.f26452b = abstractC44415lI6;
        this.f26453c = interfaceC5984b;
    }

    @Override // p000.H80
    /* renamed from: a */
    public void mo1283a(InterfaceC51431x80<E> interfaceC51431x80, Throwable th) {
        AbstractC44415lI6<F> abstractC44415lI6 = this.f26452b;
        if (abstractC44415lI6 != null) {
            abstractC44415lI6.onError(NN4.m93984h(th));
        }
    }

    @Override // p000.H80
    /* renamed from: b */
    public void mo1282b(InterfaceC51431x80<E> interfaceC51431x80, HM4<E> hm4) {
        if (this.f26452b != null) {
            if (hm4.m103939f()) {
                this.f26452b.onSuccess(this.f26453c.extract(hm4.m103944a()));
            } else {
                this.f26452b.onError(NN4.m93985g(hm4));
            }
        }
    }

    public ON4(AbstractC44415lI6<F> abstractC44415lI6) {
        this(abstractC44415lI6, f26451d);
    }
}
