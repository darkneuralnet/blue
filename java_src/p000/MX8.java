package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: MX8 */
/* loaded from: classes5.dex */
public final class MX8 extends AbstractC52268yY8 {

    /* renamed from: c */
    public static final Class f23231c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ MX8(CX8 cx8) {
        super(null);
    }

    @Override // p000.AbstractC52268yY8
    /* renamed from: a */
    public final void mo3270a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) C44919m89.m26268k(obj, j);
        if (list instanceof InterfaceC48702sX8) {
            unmodifiableList = ((InterfaceC48702sX8) list).zze();
        } else if (f23231c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof I29) && (list instanceof NV8)) {
                NV8 nv8 = (NV8) list;
                if (nv8.zzc()) {
                    nv8.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C44919m89.m26255x(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC52268yY8
    /* renamed from: b */
    public final void mo3269b(Object obj, Object obj2, long j) {
        C42773iX8 c42773iX8;
        List list = (List) C44919m89.m26268k(obj2, j);
        int size = list.size();
        List list2 = (List) C44919m89.m26268k(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof InterfaceC48702sX8) {
                list2 = new C42773iX8(size);
            } else if ((list2 instanceof I29) && (list2 instanceof NV8)) {
                list2 = ((NV8) list2).mo21037d(size);
            } else {
                list2 = new ArrayList(size);
            }
            C44919m89.m26255x(obj, j, list2);
        } else {
            if (f23231c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                C44919m89.m26255x(obj, j, arrayList);
                c42773iX8 = arrayList;
            } else if (list2 instanceof B79) {
                C42773iX8 c42773iX82 = new C42773iX8(list2.size() + size);
                c42773iX82.addAll(c42773iX82.size(), (B79) list2);
                C44919m89.m26255x(obj, j, c42773iX82);
                c42773iX8 = c42773iX82;
            } else if ((list2 instanceof I29) && (list2 instanceof NV8)) {
                NV8 nv8 = (NV8) list2;
                if (!nv8.zzc()) {
                    list2 = nv8.mo21037d(list2.size() + size);
                    C44919m89.m26255x(obj, j, list2);
                }
            }
            list2 = c42773iX8;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        C44919m89.m26255x(obj, j, list);
    }

    private MX8() {
        super(null);
    }
}
