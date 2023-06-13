package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: hs7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42386hs7 extends AbstractC40557en7 {

    /* renamed from: d */
    public final List f86045d;

    /* renamed from: e */
    public final List f86046e;

    /* renamed from: f */
    public C38159am8 f86047f;

    public C42386hs7(C42386hs7 c42386hs7) {
        super(c42386hs7.f78859b);
        ArrayList arrayList = new ArrayList(c42386hs7.f86045d.size());
        this.f86045d = arrayList;
        arrayList.addAll(c42386hs7.f86045d);
        ArrayList arrayList2 = new ArrayList(c42386hs7.f86046e.size());
        this.f86046e = arrayList2;
        arrayList2.addAll(c42386hs7.f86046e);
        this.f86047f = c42386hs7.f86047f;
    }

    @Override // p000.AbstractC40557en7
    /* renamed from: d */
    public final InterfaceC37164Xs7 mo4521d(C38159am8 c38159am8, List list) {
        C38159am8 m70758a = this.f86047f.m70758a();
        for (int i = 0; i < this.f86045d.size(); i++) {
            if (i < list.size()) {
                m70758a.m70754e((String) this.f86045d.get(i), c38159am8.m70757b((InterfaceC37164Xs7) list.get(i)));
            } else {
                m70758a.m70754e((String) this.f86045d.get(i), InterfaceC37164Xs7.f44125h0);
            }
        }
        for (InterfaceC37164Xs7 interfaceC37164Xs7 : this.f86046e) {
            InterfaceC37164Xs7 m70757b = m70758a.m70757b(interfaceC37164Xs7);
            if (m70757b instanceof C34365Lt7) {
                m70757b = m70758a.m70757b(interfaceC37164Xs7);
            }
            if (m70757b instanceof C45874nl7) {
                return ((C45874nl7) m70757b).m23212a();
            }
        }
        return InterfaceC37164Xs7.f44125h0;
    }

    @Override // p000.AbstractC40557en7, p000.InterfaceC37164Xs7
    public final InterfaceC37164Xs7 zzd() {
        return new C42386hs7(this);
    }

    public C42386hs7(String str, List list, List list2, C38159am8 c38159am8) {
        super(str);
        this.f86045d = new ArrayList();
        this.f86047f = c38159am8;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f86045d.add(((InterfaceC37164Xs7) it.next()).zzi());
            }
        }
        this.f86046e = new ArrayList(list2);
    }
}
