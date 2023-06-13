package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: Kd8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33988Kd8 extends AbstractC33772Jf8 {

    /* renamed from: c */
    public static final Class f19953c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ C33988Kd8(C51723xd8 c51723xd8) {
        super(null);
    }

    @Override // p000.AbstractC33772Jf8
    /* renamed from: a */
    public final void mo37920a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) C37192Xv8.m76068k(obj, j);
        if (list instanceof InterfaceC42830id8) {
            unmodifiableList = ((InterfaceC42830id8) list).zze();
        } else if (f19953c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof InterfaceC41131fl8) && (list instanceof InterfaceC47544qa8)) {
                InterfaceC47544qa8 interfaceC47544qa8 = (InterfaceC47544qa8) list;
                if (interfaceC47544qa8.zzc()) {
                    interfaceC47544qa8.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C37192Xv8.m76055x(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC33772Jf8
    /* renamed from: b */
    public final void mo37919b(Object obj, Object obj2, long j) {
        C37489Zc8 c37489Zc8;
        List list = (List) C37192Xv8.m76068k(obj2, j);
        int size = list.size();
        List list2 = (List) C37192Xv8.m76068k(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof InterfaceC42830id8) {
                list2 = new C37489Zc8(size);
            } else if ((list2 instanceof InterfaceC41131fl8) && (list2 instanceof InterfaceC47544qa8)) {
                list2 = ((InterfaceC47544qa8) list2).mo17376d(size);
            } else {
                list2 = new ArrayList(size);
            }
            C37192Xv8.m76055x(obj, j, list2);
        } else {
            if (f19953c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                C37192Xv8.m76055x(obj, j, arrayList);
                c37489Zc8 = arrayList;
            } else if (list2 instanceof C33673Iu8) {
                C37489Zc8 c37489Zc82 = new C37489Zc8(list2.size() + size);
                c37489Zc82.addAll(c37489Zc82.size(), (C33673Iu8) list2);
                C37192Xv8.m76055x(obj, j, c37489Zc82);
                c37489Zc8 = c37489Zc82;
            } else if ((list2 instanceof InterfaceC41131fl8) && (list2 instanceof InterfaceC47544qa8)) {
                InterfaceC47544qa8 interfaceC47544qa8 = (InterfaceC47544qa8) list2;
                if (!interfaceC47544qa8.zzc()) {
                    list2 = interfaceC47544qa8.mo17376d(list2.size() + size);
                    C37192Xv8.m76055x(obj, j, list2);
                }
            }
            list2 = c37489Zc8;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        C37192Xv8.m76055x(obj, j, list);
    }

    private C33988Kd8() {
        super(null);
    }
}
