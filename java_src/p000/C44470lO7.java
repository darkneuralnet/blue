package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: lO7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44470lO7 extends HN7 {

    /* renamed from: c */
    public static final Class<?> f95989c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C44470lO7() {
        super();
    }

    /* renamed from: e */
    public static <E> List<E> m27335e(Object obj, long j) {
        return (List) C49038t58.m13129G(obj, j);
    }

    @Override // p000.HN7
    /* renamed from: a */
    public final void mo27337a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) C49038t58.m13129G(obj, j);
        if (list instanceof KM7) {
            unmodifiableList = ((KM7) list).mo64609m();
        } else if (f95989c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof FW7) && (list instanceof BI7)) {
                BI7 bi7 = (BI7) list;
                if (bi7.mo64608v1()) {
                    bi7.mo113666q();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C49038t58.m13114g(obj, j, unmodifiableList);
    }

    @Override // p000.HN7
    /* renamed from: b */
    public final <E> void mo27336b(Object obj, Object obj2, long j) {
        ArrayList arrayList;
        List m27335e = m27335e(obj2, j);
        int size = m27335e.size();
        List m27335e2 = m27335e(obj, j);
        if (m27335e2.isEmpty()) {
            if (m27335e2 instanceof KM7) {
                m27335e2 = new C38514bN7(size);
            } else if ((m27335e2 instanceof FW7) && (m27335e2 instanceof BI7)) {
                m27335e2 = ((BI7) m27335e2).zzh(size);
            } else {
                m27335e2 = new ArrayList(size);
            }
            C49038t58.m13114g(obj, j, m27335e2);
        } else {
            if (f95989c.isAssignableFrom(m27335e2.getClass())) {
                ArrayList arrayList2 = new ArrayList(m27335e2.size() + size);
                arrayList2.addAll(m27335e2);
                C49038t58.m13114g(obj, j, arrayList2);
                arrayList = arrayList2;
            } else if (m27335e2 instanceof X38) {
                List c38514bN7 = new C38514bN7(m27335e2.size() + size);
                c38514bN7.addAll((X38) m27335e2);
                C49038t58.m13114g(obj, j, c38514bN7);
                arrayList = c38514bN7;
            } else if ((m27335e2 instanceof FW7) && (m27335e2 instanceof BI7)) {
                BI7 bi7 = (BI7) m27335e2;
                if (!bi7.mo64608v1()) {
                    m27335e2 = bi7.zzh(m27335e2.size() + size);
                    C49038t58.m13114g(obj, j, m27335e2);
                }
            }
            m27335e2 = arrayList;
        }
        int size2 = m27335e2.size();
        int size3 = m27335e.size();
        if (size2 > 0 && size3 > 0) {
            m27335e2.addAll(m27335e);
        }
        if (size2 > 0) {
            m27335e = m27335e2;
        }
        C49038t58.m13114g(obj, j, m27335e);
    }
}
