package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* renamed from: S83 */
/* loaded from: classes8.dex */
public class S83 implements InterfaceC39410cr5 {

    /* renamed from: a */
    public C37378Yq5 f33236a = new C37378Yq5(this);

    /* renamed from: b */
    public C52053yB0[] f33237b;

    /* renamed from: c */
    public Object f33238c;

    public S83(C52053yB0[] c52053yB0Arr, Object obj) {
        this.f33237b = c52053yB0Arr;
        this.f33238c = obj;
    }

    /* renamed from: g */
    public static List m85911g(Collection collection) {
        ArrayList arrayList = new ArrayList();
        m85910i(collection, arrayList);
        return arrayList;
    }

    /* renamed from: i */
    public static void m85910i(Collection collection, Collection collection2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((S83) it.next()).m85913e().m74103e(collection2);
        }
    }

    /* renamed from: a */
    public void m85917a(C52053yB0 c52053yB0, int i) {
        m85915c(c52053yB0, i);
    }

    /* renamed from: b */
    public void m85916b(AbstractC48893sr2 abstractC48893sr2, int i, int i2, int i3) {
        m85917a(new C52053yB0(abstractC48893sr2.m13585f(i3)), i);
    }

    /* renamed from: c */
    public C37144Xq5 m85915c(C52053yB0 c52053yB0, int i) {
        int i2 = i + 1;
        C52053yB0[] c52053yB0Arr = this.f33237b;
        if (i2 < c52053yB0Arr.length && c52053yB0.m3886g(c52053yB0Arr[i2])) {
            i = i2;
        }
        return this.f33236a.m74107a(c52053yB0, i);
    }

    /* renamed from: d */
    public void m85914d(AbstractC48893sr2 abstractC48893sr2, int i, int i2) {
        for (int i3 = 0; i3 < abstractC48893sr2.m13584g(); i3++) {
            m85916b(abstractC48893sr2, i, i2, i3);
        }
    }

    /* renamed from: e */
    public C37378Yq5 m85913e() {
        return this.f33236a;
    }

    /* renamed from: f */
    public C52053yB0[] m85912f() {
        return this.f33236a.m74097k();
    }

    @Override // p000.InterfaceC39410cr5
    public Object getData() {
        return this.f33238c;
    }

    @Override // p000.InterfaceC39410cr5
    /* renamed from: h */
    public C52053yB0[] mo44967h() {
        return this.f33237b;
    }

    @Override // p000.InterfaceC39410cr5
    public boolean isClosed() {
        C52053yB0[] c52053yB0Arr = this.f33237b;
        return c52053yB0Arr[0].equals(c52053yB0Arr[c52053yB0Arr.length - 1]);
    }

    /* renamed from: j */
    public int m85909j(int i) {
        if (i == this.f33237b.length - 1) {
            return -1;
        }
        return m85908k(mo44966u(i), mo44966u(i + 1));
    }

    /* renamed from: k */
    public final int m85908k(C52053yB0 c52053yB0, C52053yB0 c52053yB02) {
        if (c52053yB0.m3886g(c52053yB02)) {
            return 0;
        }
        return C44021ke3.m28705b(c52053yB0, c52053yB02);
    }

    @Override // p000.InterfaceC39410cr5
    public int size() {
        return this.f33237b.length;
    }

    public String toString() {
        return C44204kw6.m28148B(new C52646zB0(this.f33237b));
    }

    @Override // p000.InterfaceC39410cr5
    /* renamed from: u */
    public C52053yB0 mo44966u(int i) {
        return this.f33237b[i];
    }
}
