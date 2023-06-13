package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC39920dj2;
/* renamed from: il2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42904il2 {

    /* renamed from: a */
    public static AbstractC39920dj2.C19847a f87829a = AbstractC39920dj2.C19847a.m43839a("k");

    private C42904il2() {
    }

    /* renamed from: a */
    public static <T> List<C41125fl2<T>> m33514a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2, float f, InterfaceC34274Lj6<T> interfaceC34274Lj6, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (abstractC39920dj2.mo2761q() == AbstractC39920dj2.EnumC19848b.STRING) {
            c47924rD2.m16223a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC39920dj2.mo2770c();
        while (abstractC39920dj2.mo2767g()) {
            if (abstractC39920dj2.mo2760s(f87829a) != 0) {
                abstractC39920dj2.mo2758u();
            } else if (abstractC39920dj2.mo2761q() == AbstractC39920dj2.EnumC19848b.BEGIN_ARRAY) {
                abstractC39920dj2.mo2771b();
                if (abstractC39920dj2.mo2761q() == AbstractC39920dj2.EnumC19848b.NUMBER) {
                    arrayList.add(C42311hl2.m35893c(abstractC39920dj2, c47924rD2, f, interfaceC34274Lj6, false, z));
                } else {
                    while (abstractC39920dj2.mo2767g()) {
                        arrayList.add(C42311hl2.m35893c(abstractC39920dj2, c47924rD2, f, interfaceC34274Lj6, true, z));
                    }
                }
                abstractC39920dj2.mo2769d();
            } else {
                arrayList.add(C42311hl2.m35893c(abstractC39920dj2, c47924rD2, f, interfaceC34274Lj6, false, z));
            }
        }
        abstractC39920dj2.mo2768f();
        m33513b(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static <T> void m33513b(List<? extends C41125fl2<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C41125fl2<T> c41125fl2 = list.get(i2);
            i2++;
            C41125fl2<T> c41125fl22 = list.get(i2);
            c41125fl2.f80570h = Float.valueOf(c41125fl22.f80569g);
            if (c41125fl2.f80565c == null && (t = c41125fl22.f80564b) != null) {
                c41125fl2.f80565c = t;
                if (c41125fl2 instanceof C44421lJ3) {
                    ((C44421lJ3) c41125fl2).m27428j();
                }
            }
        }
        C41125fl2<T> c41125fl23 = list.get(i);
        if ((c41125fl23.f80564b == null || c41125fl23.f80565c == null) && list.size() > 1) {
            list.remove(c41125fl23);
        }
    }
}
