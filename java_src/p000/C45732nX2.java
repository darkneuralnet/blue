package p000;

import java.util.Iterator;
import java.util.Set;
import p000.C46325oX2;
import p000.InterfaceC45139mX2;
/* renamed from: nX2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C45732nX2 extends C46325oX2.AbstractC27004g<Object> {

    /* renamed from: d */
    public final /* synthetic */ InterfaceC45139mX2 f100096d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC45139mX2 f100097e;

    /* renamed from: nX2$a */
    /* loaded from: classes6.dex */
    public class C26539a extends AbstractC0367B0<InterfaceC45139mX2.InterfaceC26111a<Object>> {

        /* renamed from: d */
        public final /* synthetic */ Iterator f100098d;

        /* renamed from: e */
        public final /* synthetic */ Iterator f100099e;

        public C26539a(Iterator it, Iterator it2) {
            this.f100098d = it;
            this.f100099e = it2;
        }

        @Override // p000.AbstractC0367B0
        /* renamed from: d */
        public InterfaceC45139mX2.InterfaceC26111a<Object> mo575a() {
            if (this.f100098d.hasNext()) {
                InterfaceC45139mX2.InterfaceC26111a interfaceC26111a = (InterfaceC45139mX2.InterfaceC26111a) this.f100098d.next();
                Object element = interfaceC26111a.getElement();
                return C46325oX2.m20931g(element, Math.max(interfaceC26111a.getCount(), C45732nX2.this.f100097e.mo20918d3(element)));
            }
            while (this.f100099e.hasNext()) {
                InterfaceC45139mX2.InterfaceC26111a interfaceC26111a2 = (InterfaceC45139mX2.InterfaceC26111a) this.f100099e.next();
                Object element2 = interfaceC26111a2.getElement();
                if (!C45732nX2.this.f100096d.contains(element2)) {
                    return C46325oX2.m20931g(element2, interfaceC26111a2.getCount());
                }
            }
            return m114802b();
        }
    }

    @Override // p000.AbstractC9586Y0
    /* renamed from: a */
    public Set<Object> mo20920a() {
        return C40052dw5.m43482m(this.f100096d.mo25465F2(), this.f100097e.mo25465F2());
    }

    @Override // p000.AbstractC9586Y0, java.util.AbstractCollection, java.util.Collection, p000.InterfaceC45139mX2
    public boolean contains(Object obj) {
        return this.f100096d.contains(obj) || this.f100097e.contains(obj);
    }

    @Override // p000.InterfaceC45139mX2
    /* renamed from: d3 */
    public int mo20918d3(Object obj) {
        return Math.max(this.f100096d.mo20918d3(obj), this.f100097e.mo20918d3(obj));
    }

    @Override // p000.AbstractC9586Y0
    /* renamed from: e */
    public Iterator<Object> mo20917e() {
        throw new AssertionError("should never be called");
    }

    @Override // p000.AbstractC9586Y0
    /* renamed from: f */
    public Iterator<InterfaceC45139mX2.InterfaceC26111a<Object>> mo20916f() {
        return new C26539a(this.f100096d.entrySet().iterator(), this.f100097e.entrySet().iterator());
    }

    @Override // p000.AbstractC9586Y0, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f100096d.isEmpty() && this.f100097e.isEmpty();
    }
}
