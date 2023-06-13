package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: OY7 */
/* loaded from: classes5.dex */
public final class OY7 extends AbstractC44551lX7 {

    /* renamed from: c */
    public static final Class<?> f26770c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private OY7() {
        super();
    }

    /* renamed from: e */
    public static <E> List<E> m92017e(Object obj, long j) {
        return (List) C35410Qf8.m88254M(obj, j);
    }

    @Override // p000.AbstractC44551lX7
    /* renamed from: a */
    public final void mo27170a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) C35410Qf8.m88254M(obj, j);
        if (list instanceof WW7) {
            unmodifiableList = ((WW7) list).mo43922s3();
        } else if (f26770c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C35410Qf8.m88237i(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC44551lX7
    /* renamed from: b */
    public final <E> void mo27169b(Object obj, Object obj2, long j) {
        IW7 iw7;
        List m92017e = m92017e(obj2, j);
        int size = m92017e.size();
        List m92017e2 = m92017e(obj, j);
        if (m92017e2.isEmpty()) {
            m92017e2 = m92017e2 instanceof WW7 ? new IW7(size) : new ArrayList(size);
            C35410Qf8.m88237i(obj, j, m92017e2);
        } else {
            if (f26770c.isAssignableFrom(m92017e2.getClass())) {
                ArrayList arrayList = new ArrayList(m92017e2.size() + size);
                arrayList.addAll(m92017e2);
                iw7 = arrayList;
            } else if (m92017e2 instanceof C39886df8) {
                IW7 iw72 = new IW7(m92017e2.size() + size);
                iw72.addAll((C39886df8) m92017e2);
                iw7 = iw72;
            }
            C35410Qf8.m88237i(obj, j, iw7);
            m92017e2 = iw7;
        }
        int size2 = m92017e2.size();
        int size3 = m92017e.size();
        if (size2 > 0 && size3 > 0) {
            m92017e2.addAll(m92017e);
        }
        if (size2 > 0) {
            m92017e = m92017e2;
        }
        C35410Qf8.m88237i(obj, j, m92017e);
    }
}
