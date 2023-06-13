package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: to9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49463to9 extends AbstractC38783bp9 {

    /* renamed from: c */
    public static final Class<?> f111059c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ C49463to9(C47092po9 c47092po9) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static <L> List<L> m11745f(Object obj, long j, int i) {
        C41162fo9 c41162fo9;
        List<L> arrayList;
        List<L> list = (List) Fs9.m106345k(obj, j);
        if (list.isEmpty()) {
            if (list instanceof InterfaceC44127ko9) {
                arrayList = new C41162fo9(i);
            } else if ((list instanceof InterfaceC44147kq9) && (list instanceof An9)) {
                arrayList = ((An9) list).mo16911d(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            Fs9.m106332x(obj, j, arrayList);
            return arrayList;
        }
        if (f111059c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            Fs9.m106332x(obj, j, arrayList2);
            c41162fo9 = arrayList2;
        } else if (list instanceof Xr9) {
            C41162fo9 c41162fo92 = new C41162fo9(list.size() + i);
            c41162fo92.addAll(c41162fo92.size(), (Xr9) list);
            Fs9.m106332x(obj, j, c41162fo92);
            c41162fo9 = c41162fo92;
        } else if ((list instanceof InterfaceC44147kq9) && (list instanceof An9)) {
            An9 an9 = (An9) list;
            if (!an9.zzc()) {
                An9 mo16911d = an9.mo16911d(list.size() + i);
                Fs9.m106332x(obj, j, mo16911d);
                return mo16911d;
            }
            return list;
        } else {
            return list;
        }
        return c41162fo9;
    }

    @Override // p000.AbstractC38783bp9
    /* renamed from: a */
    public final <L> List<L> mo2558a(Object obj, long j) {
        return m11745f(obj, j, 10);
    }

    @Override // p000.AbstractC38783bp9
    /* renamed from: b */
    public final void mo2557b(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) Fs9.m106345k(obj, j);
        if (list instanceof InterfaceC44127ko9) {
            unmodifiableList = ((InterfaceC44127ko9) list).zze();
        } else if (f111059c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof InterfaceC44147kq9) && (list instanceof An9)) {
                An9 an9 = (An9) list;
                if (an9.zzc()) {
                    an9.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        Fs9.m106332x(obj, j, unmodifiableList);
    }

    @Override // p000.AbstractC38783bp9
    /* renamed from: c */
    public final <E> void mo2556c(Object obj, Object obj2, long j) {
        List list = (List) Fs9.m106345k(obj2, j);
        List m11745f = m11745f(obj, j, list.size());
        int size = m11745f.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            m11745f.addAll(list);
        }
        if (size > 0) {
            list = m11745f;
        }
        Fs9.m106332x(obj, j, list);
    }

    private C49463to9() {
        super(null);
    }
}
