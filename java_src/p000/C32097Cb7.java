package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: Cb7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32097Cb7 extends AbstractC33033Gb7 {

    /* renamed from: c */
    public static final Class f4315c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ C32097Cb7(C31863Bb7 c31863Bb7) {
        super(null);
    }

    @Override // p000.AbstractC33033Gb7
    /* renamed from: a */
    public final void mo104978a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) C34212Lc7.m96567k(obj, j);
        if (list instanceof InterfaceC31629Ab7) {
            unmodifiableList = ((InterfaceC31629Ab7) list).mo1048B();
        } else if (f4315c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof InterfaceC40447ec7) && (list instanceof InterfaceC46367ob7)) {
                InterfaceC46367ob7 interfaceC46367ob7 = (InterfaceC46367ob7) list;
                if (interfaceC46367ob7.zbc()) {
                    interfaceC46367ob7.zbb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C34212Lc7.m96554x(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC33033Gb7
    /* renamed from: b */
    public final void mo104977b(Object obj, Object obj2, long j) {
        C52888zb7 c52888zb7;
        List list = (List) C34212Lc7.m96567k(obj2, j);
        int size = list.size();
        List list2 = (List) C34212Lc7.m96567k(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof InterfaceC31629Ab7) {
                list2 = new C52888zb7(size);
            } else if ((list2 instanceof InterfaceC40447ec7) && (list2 instanceof InterfaceC46367ob7)) {
                list2 = ((InterfaceC46367ob7) list2).mo1043r0(size);
            } else {
                list2 = new ArrayList(size);
            }
            C34212Lc7.m96554x(obj, j, list2);
        } else {
            if (f4315c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                C34212Lc7.m96554x(obj, j, arrayList);
                c52888zb7 = arrayList;
            } else if (list2 instanceof C33042Gc7) {
                C52888zb7 c52888zb72 = new C52888zb7(list2.size() + size);
                c52888zb72.addAll(c52888zb72.size(), (C33042Gc7) list2);
                C34212Lc7.m96554x(obj, j, c52888zb72);
                c52888zb7 = c52888zb72;
            } else if ((list2 instanceof InterfaceC40447ec7) && (list2 instanceof InterfaceC46367ob7)) {
                InterfaceC46367ob7 interfaceC46367ob7 = (InterfaceC46367ob7) list2;
                if (!interfaceC46367ob7.zbc()) {
                    list2 = interfaceC46367ob7.mo1043r0(list2.size() + size);
                    C34212Lc7.m96554x(obj, j, list2);
                }
            }
            list2 = c52888zb7;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        C34212Lc7.m96554x(obj, j, list);
    }

    private C32097Cb7() {
        super(null);
    }
}
