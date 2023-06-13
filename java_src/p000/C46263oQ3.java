package p000;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: oQ3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C46263oQ3 {

    /* renamed from: a */
    public boolean f101965a = false;

    /* renamed from: b */
    public final Set<InterfaceC26979b> f101966b = new C30704yo();

    /* renamed from: c */
    public final Map<String, C49801uO2> f101967c = new HashMap();

    /* renamed from: d */
    public final Comparator<C48526sE3<String, Float>> f101968d = new C26978a();

    /* renamed from: oQ3$a */
    /* loaded from: classes2.dex */
    public class C26978a implements Comparator<C48526sE3<String, Float>> {
        public C26978a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C48526sE3<String, Float> c48526sE3, C48526sE3<String, Float> c48526sE32) {
            float floatValue = c48526sE3.f108492b.floatValue();
            float floatValue2 = c48526sE32.f108492b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    }

    /* renamed from: oQ3$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC26979b {
        /* renamed from: a */
        void m21088a(float f);
    }

    /* renamed from: a */
    public void m21091a(String str, float f) {
        if (!this.f101965a) {
            return;
        }
        C49801uO2 c49801uO2 = this.f101967c.get(str);
        if (c49801uO2 == null) {
            c49801uO2 = new C49801uO2();
            this.f101967c.put(str, c49801uO2);
        }
        c49801uO2.m10360a(f);
        if (str.equals("__container")) {
            for (InterfaceC26979b interfaceC26979b : this.f101966b) {
                interfaceC26979b.m21088a(f);
            }
        }
    }

    /* renamed from: b */
    public void m21090b(boolean z) {
        this.f101965a = z;
    }
}
