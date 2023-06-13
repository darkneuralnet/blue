package no.nordicsemi.android.support.v18.scanner;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import no.nordicsemi.android.support.v18.scanner.AbstractC26703a;
import no.nordicsemi.android.support.v18.scanner.AbstractC26703a.C26704a;
/* renamed from: no.nordicsemi.android.support.v18.scanner.d */
/* loaded from: classes8.dex */
public class C26713d<W extends AbstractC26703a.C26704a> {

    /* renamed from: a */
    public final Set<W> f100845a = new HashSet();

    /* renamed from: a */
    public void m22363a(W w) {
        this.f100845a.add(w);
    }

    /* renamed from: b */
    public final void m22362b() {
        LinkedList<AbstractC26703a.C26704a> linkedList = new LinkedList();
        for (W w : this.f100845a) {
            AbstractC43480jj5 abstractC43480jj5 = w.f100830h;
            if ((abstractC43480jj5 instanceof C35426Qh6) && ((C35426Qh6) abstractC43480jj5).m88173e()) {
                linkedList.add(w);
            }
        }
        for (AbstractC26703a.C26704a c26704a : linkedList) {
            this.f100845a.remove(c26704a);
        }
    }

    /* renamed from: c */
    public boolean m22361c(AbstractC43480jj5 abstractC43480jj5) {
        for (W w : this.f100845a) {
            AbstractC43480jj5 abstractC43480jj52 = w.f100830h;
            if (abstractC43480jj52 == abstractC43480jj5) {
                return true;
            }
            if ((abstractC43480jj52 instanceof C35426Qh6) && ((C35426Qh6) abstractC43480jj52).m88174d() == abstractC43480jj5) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public W m22360d(AbstractC43480jj5 abstractC43480jj5) {
        for (W w : this.f100845a) {
            AbstractC43480jj5 abstractC43480jj52 = w.f100830h;
            if (abstractC43480jj52 == abstractC43480jj5) {
                return w;
            }
            if ((abstractC43480jj52 instanceof C35426Qh6) && ((C35426Qh6) abstractC43480jj52).m88174d() == abstractC43480jj5) {
                return w;
            }
        }
        return null;
    }

    /* renamed from: e */
    public W m22359e(AbstractC43480jj5 abstractC43480jj5) {
        for (W w : this.f100845a) {
            AbstractC43480jj5 abstractC43480jj52 = w.f100830h;
            if (abstractC43480jj52 == abstractC43480jj5) {
                return w;
            }
            if ((abstractC43480jj52 instanceof C35426Qh6) && ((C35426Qh6) abstractC43480jj52).m88174d() == abstractC43480jj5) {
                this.f100845a.remove(w);
                return w;
            }
        }
        m22362b();
        return null;
    }
}
