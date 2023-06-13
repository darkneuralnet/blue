package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: Pf8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35176Pf8 extends AbstractC49975ug8 {

    /* renamed from: c */
    public static final Class<?> f28874c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ C35176Pf8(C31900Bf8 c31900Bf8) {
        super(null);
    }

    @Override // p000.AbstractC49975ug8
    /* renamed from: a */
    public final void mo9882a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) C38229at8.m65316f(obj, j);
        if (list instanceof InterfaceC45222mf8) {
            unmodifiableList = ((InterfaceC45222mf8) list).zze();
        } else if (f28874c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof InterfaceC51803xl8) && (list instanceof InterfaceC35383Qc8)) {
                InterfaceC35383Qc8 interfaceC35383Qc8 = (InterfaceC35383Qc8) list;
                if (interfaceC35383Qc8.zzc()) {
                    interfaceC35383Qc8.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C38229at8.m65306p(obj, j, unmodifiableList);
    }

    @Override // p000.AbstractC49975ug8
    /* renamed from: b */
    public final <E> void mo9881b(Object obj, Object obj2, long j) {
        ArrayList arrayList;
        List list = (List) C38229at8.m65316f(obj2, j);
        int size = list.size();
        List list2 = (List) C38229at8.m65316f(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof InterfaceC45222mf8) {
                list2 = new C41061fe8(size);
            } else if ((list2 instanceof InterfaceC51803xl8) && (list2 instanceof InterfaceC35383Qc8)) {
                list2 = ((InterfaceC35383Qc8) list2).mo41068d(size);
            } else {
                list2 = new ArrayList(size);
            }
            C38229at8.m65306p(obj, j, list2);
        } else {
            if (f28874c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList2 = new ArrayList(list2.size() + size);
                arrayList2.addAll(list2);
                C38229at8.m65306p(obj, j, arrayList2);
                arrayList = arrayList2;
            } else if (list2 instanceof C34816Nr8) {
                C41061fe8 c41061fe8 = new C41061fe8(list2.size() + size);
                c41061fe8.addAll(c41061fe8.size(), (C34816Nr8) list2);
                C38229at8.m65306p(obj, j, c41061fe8);
                arrayList = c41061fe8;
            } else if ((list2 instanceof InterfaceC51803xl8) && (list2 instanceof InterfaceC35383Qc8)) {
                InterfaceC35383Qc8 interfaceC35383Qc8 = (InterfaceC35383Qc8) list2;
                if (!interfaceC35383Qc8.zzc()) {
                    list2 = interfaceC35383Qc8.mo41068d(list2.size() + size);
                    C38229at8.m65306p(obj, j, list2);
                }
            }
            list2 = arrayList;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        C38229at8.m65306p(obj, j, list);
    }

    private C35176Pf8() {
        super(null);
    }
}
