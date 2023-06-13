package p000;

import java.lang.ref.WeakReference;
/* renamed from: F21 */
/* loaded from: classes6.dex */
public class F21 extends WeakReference<C21> {

    /* renamed from: F21$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC2057a {
        /* renamed from: a */
        F21 mo108088a(C21 c21);
    }

    public F21(C21 c21) {
        super(c21);
    }

    /* renamed from: a */
    public boolean m108090a(Object obj) {
        C21 c21 = get();
        if ((obj instanceof C21) && c21 != null && c21.mo102637a() == ((C21) obj).mo102637a()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m108089b() {
        return get() == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WeakReference)) {
            return false;
        }
        C21 c21 = get();
        Object obj2 = ((WeakReference) obj).get();
        if (c21 == null || !(obj2 instanceof C21) || !c21.mo102637a().equals(((C21) obj2).mo102637a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (get() != null) {
            return get().hashCode();
        }
        return 0;
    }
}
