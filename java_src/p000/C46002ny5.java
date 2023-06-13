package p000;

import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.AbstractC39920dj2;
/* renamed from: ny5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C46002ny5 implements InterfaceC34274Lj6<C45409my5> {

    /* renamed from: a */
    public static final C46002ny5 f101165a = new C46002ny5();

    /* renamed from: b */
    public static final AbstractC39920dj2.C19847a f101166b = AbstractC39920dj2.C19847a.m43839a("c", "v", "i", "o");

    private C46002ny5() {
    }

    @Override // p000.InterfaceC34274Lj6
    /* renamed from: b */
    public C45409my5 mo2631a(AbstractC39920dj2 abstractC39920dj2, float f) throws IOException {
        if (abstractC39920dj2.mo2761q() == AbstractC39920dj2.EnumC19848b.BEGIN_ARRAY) {
            abstractC39920dj2.mo2771b();
        }
        abstractC39920dj2.mo2770c();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (abstractC39920dj2.mo2767g()) {
            int mo2760s = abstractC39920dj2.mo2760s(f101166b);
            if (mo2760s != 0) {
                if (mo2760s != 1) {
                    if (mo2760s != 2) {
                        if (mo2760s != 3) {
                            abstractC39920dj2.mo2759t();
                            abstractC39920dj2.mo2758u();
                        } else {
                            list3 = C52963zj2.m471f(abstractC39920dj2, f);
                        }
                    } else {
                        list2 = C52963zj2.m471f(abstractC39920dj2, f);
                    }
                } else {
                    list = C52963zj2.m471f(abstractC39920dj2, f);
                }
            } else {
                z = abstractC39920dj2.mo2766i();
            }
        }
        abstractC39920dj2.mo2768f();
        if (abstractC39920dj2.mo2761q() == AbstractC39920dj2.EnumC19848b.END_ARRAY) {
            abstractC39920dj2.mo2769d();
        }
        if (list != null && list2 != null && list3 != null) {
            if (list.isEmpty()) {
                return new C45409my5(new PointF(), false, Collections.emptyList());
            }
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new VE0(C48077rU2.m15919a(list.get(i2), list3.get(i2)), C48077rU2.m15919a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new VE0(C48077rU2.m15919a(list.get(i3), list3.get(i3)), C48077rU2.m15919a(pointF3, list2.get(0)), pointF3));
            }
            return new C45409my5(pointF, z, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
