package p000;
/* renamed from: yh5  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C52353yh5<T> extends AbstractC44415lI6<T> {

    /* renamed from: a */
    public boolean f120019a = false;

    /* renamed from: b */
    public final AbstractC44415lI6<T> f120020b;

    public C52353yh5(AbstractC44415lI6<T> abstractC44415lI6) {
        this.f120020b = abstractC44415lI6;
    }

    /* renamed from: a */
    public static <T> C52353yh5<T> m2896a(AbstractC44415lI6<T> abstractC44415lI6) {
        return new C52353yh5<>(abstractC44415lI6);
    }

    public void cancel() {
        this.f120019a = true;
    }

    @Override // p000.AbstractC44415lI6
    public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
        AbstractC44415lI6<T> abstractC44415lI6;
        if (!this.f120019a && (abstractC44415lI6 = this.f120020b) != null) {
            abstractC44415lI6.onError(interfaceC48782sg1);
        } else {
            C33694Ix2.m101456c("SafeZendeskCallback", interfaceC48782sg1);
        }
    }

    @Override // p000.AbstractC44415lI6
    public void onSuccess(T t) {
        AbstractC44415lI6<T> abstractC44415lI6;
        if (!this.f120019a && (abstractC44415lI6 = this.f120020b) != null) {
            abstractC44415lI6.onSuccess(t);
        } else {
            C33694Ix2.m101447l("SafeZendeskCallback", "Operation was a success but callback is null or was cancelled", new Object[0]);
        }
    }
}
