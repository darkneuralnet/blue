package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: Qu7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35544Qu7 extends AbstractC36012Su7 {

    /* renamed from: c */
    public static final Class f31221c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ C35544Qu7(C35310Pu7 c35310Pu7) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static List m87583f(Object obj, long j, int i) {
        C34842Nu7 c34842Nu7;
        List arrayList;
        List list = (List) C32286Cw7.m111242k(obj, j);
        if (list.isEmpty()) {
            if (list instanceof InterfaceC35076Ou7) {
                arrayList = new C34842Nu7(i);
            } else if ((list instanceof InterfaceC32745Ev7) && (list instanceof InterfaceC45964nu7)) {
                arrayList = ((InterfaceC45964nu7) list).mo6153d(i);
            } else {
                arrayList = new ArrayList(i);
            }
            C32286Cw7.m111229x(obj, j, arrayList);
            return arrayList;
        }
        if (f31221c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            C32286Cw7.m111229x(obj, j, arrayList2);
            c34842Nu7 = arrayList2;
        } else if (list instanceof C51912xw7) {
            C34842Nu7 c34842Nu72 = new C34842Nu7(list.size() + i);
            c34842Nu72.addAll(c34842Nu72.size(), (C51912xw7) list);
            C32286Cw7.m111229x(obj, j, c34842Nu72);
            c34842Nu7 = c34842Nu72;
        } else if ((list instanceof InterfaceC32745Ev7) && (list instanceof InterfaceC45964nu7)) {
            InterfaceC45964nu7 interfaceC45964nu7 = (InterfaceC45964nu7) list;
            if (!interfaceC45964nu7.zzc()) {
                InterfaceC45964nu7 mo6153d = interfaceC45964nu7.mo6153d(list.size() + i);
                C32286Cw7.m111229x(obj, j, mo6153d);
                return mo6153d;
            }
            return list;
        } else {
            return list;
        }
        return c34842Nu7;
    }

    @Override // p000.AbstractC36012Su7
    /* renamed from: a */
    public final List mo84657a(Object obj, long j) {
        return m87583f(obj, j, 10);
    }

    @Override // p000.AbstractC36012Su7
    /* renamed from: b */
    public final void mo84656b(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) C32286Cw7.m111242k(obj, j);
        if (list instanceof InterfaceC35076Ou7) {
            unmodifiableList = ((InterfaceC35076Ou7) list).zze();
        } else if (f31221c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof InterfaceC32745Ev7) && (list instanceof InterfaceC45964nu7)) {
                InterfaceC45964nu7 interfaceC45964nu7 = (InterfaceC45964nu7) list;
                if (interfaceC45964nu7.zzc()) {
                    interfaceC45964nu7.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C32286Cw7.m111229x(obj, j, unmodifiableList);
    }

    @Override // p000.AbstractC36012Su7
    /* renamed from: c */
    public final void mo84655c(Object obj, Object obj2, long j) {
        List list = (List) C32286Cw7.m111242k(obj2, j);
        List m87583f = m87583f(obj, j, list.size());
        int size = m87583f.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            m87583f.addAll(list);
        }
        if (size > 0) {
            list = m87583f;
        }
        C32286Cw7.m111229x(obj, j, list);
    }

    private C35544Qu7() {
        super(null);
    }
}
