package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* renamed from: Dr2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C32470Dr2 implements ZB1 {

    /* renamed from: a */
    public Collection f6430a;

    /* renamed from: b */
    public boolean f6431b;

    public C32470Dr2(Collection collection, boolean z) {
        this.f6430a = collection;
        this.f6431b = z;
    }

    /* renamed from: b */
    public static List m109852b(WB1 wb1) {
        return m109851c(wb1, false);
    }

    /* renamed from: c */
    public static List m109851c(WB1 wb1, boolean z) {
        ArrayList arrayList = new ArrayList();
        wb1.mo77233f(new C32470Dr2(arrayList, z));
        return arrayList;
    }

    @Override // p000.ZB1
    /* renamed from: a */
    public void mo73636a(WB1 wb1) {
        if (this.f6431b && (wb1 instanceof C34108Kr2)) {
            this.f6430a.add(wb1.m78758c0().m64849f(((C34108Kr2) wb1).m113440M0()));
        } else if (wb1 instanceof C32002Br2) {
            this.f6430a.add(wb1);
        }
    }
}
