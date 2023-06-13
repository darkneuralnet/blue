package p000;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import p000.DV5;
/* renamed from: KL4 */
/* loaded from: classes.dex */
public class KL4 {

    /* renamed from: a */
    public final C35664Ri1 f19454a;

    public KL4() {
        this((C35664Ri1) S21.m86079a(C35664Ri1.class));
    }

    /* renamed from: a */
    public List<Size> m99002a(DV5.EnumC1500b enumC1500b, List<Size> list) {
        C35664Ri1 c35664Ri1 = this.f19454a;
        if (c35664Ri1 == null) {
            return list;
        }
        Size m86431d = c35664Ri1.m86431d(enumC1500b);
        if (m86431d == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(m86431d);
        for (Size size : list) {
            if (!size.equals(m86431d)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public KL4(C35664Ri1 c35664Ri1) {
        this.f19454a = c35664Ri1;
    }
}
