package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: Yd9 */
/* loaded from: classes5.dex */
public final class Yd9 extends Ce9 {

    /* renamed from: c */
    public static final Class f46158c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ Yd9(Qd9 qd9) {
        super(null);
    }

    @Override // p000.Ce9
    /* renamed from: a */
    public final void mo20701a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) C51221wm9.m6356k(obj, j);
        if (list instanceof Id9) {
            unmodifiableList = ((Id9) list).zze();
        } else if (f46158c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof Zh9) && (list instanceof InterfaceC39857dc9)) {
                InterfaceC39857dc9 interfaceC39857dc9 = (InterfaceC39857dc9) list;
                if (interfaceC39857dc9.zzc()) {
                    interfaceC39857dc9.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C51221wm9.m6343x(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.Ce9
    /* renamed from: b */
    public final void mo20700b(Object obj, Object obj2, long j) {
        Yc9 yc9;
        List list = (List) C51221wm9.m6356k(obj2, j);
        int size = list.size();
        List list2 = (List) C51221wm9.m6356k(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof Id9) {
                list2 = new Yc9(size);
            } else if ((list2 instanceof Zh9) && (list2 instanceof InterfaceC39857dc9)) {
                list2 = ((InterfaceC39857dc9) list2).mo1843d(size);
            } else {
                list2 = new ArrayList(size);
            }
            C51221wm9.m6343x(obj, j, list2);
        } else {
            if (f46158c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                C51221wm9.m6343x(obj, j, arrayList);
                yc9 = arrayList;
            } else if (list2 instanceof Sl9) {
                Yc9 yc92 = new Yc9(list2.size() + size);
                yc92.addAll(yc92.size(), (Sl9) list2);
                C51221wm9.m6343x(obj, j, yc92);
                yc9 = yc92;
            } else if ((list2 instanceof Zh9) && (list2 instanceof InterfaceC39857dc9)) {
                InterfaceC39857dc9 interfaceC39857dc9 = (InterfaceC39857dc9) list2;
                if (!interfaceC39857dc9.zzc()) {
                    list2 = interfaceC39857dc9.mo1843d(list2.size() + size);
                    C51221wm9.m6343x(obj, j, list2);
                }
            }
            list2 = yc9;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        C51221wm9.m6343x(obj, j, list);
    }

    private Yd9() {
        super(null);
    }
}
