package p000;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
/* renamed from: xW2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51651xW2 extends AbstractC52944zh3 {

    /* renamed from: a */
    public final AbstractC40456ed6[] f117743a;

    public C51651xW2(Map<EnumC47491qV0, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(EnumC47491qV0.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(EnumC7009Qx.EAN_13)) {
                arrayList.add(new E81());
            } else if (collection.contains(EnumC7009Qx.UPC_A)) {
                arrayList.add(new C37487Zc6());
            }
            if (collection.contains(EnumC7009Qx.EAN_8)) {
                arrayList.add(new G81());
            }
            if (collection.contains(EnumC7009Qx.UPC_E)) {
                arrayList.add(new C41642gd6());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new E81());
            arrayList.add(new G81());
            arrayList.add(new C41642gd6());
        }
        this.f117743a = (AbstractC40456ed6[]) arrayList.toArray(new AbstractC40456ed6[arrayList.size()]);
    }

    @Override // p000.AbstractC52944zh3
    /* renamed from: b */
    public C38511bN4 mo543b(int i, C1027CT c1027ct, Map<EnumC47491qV0, ?> map) throws NotFoundException {
        boolean z;
        Collection collection;
        boolean z2;
        int[] m42685o = AbstractC40456ed6.m42685o(c1027ct);
        for (AbstractC40456ed6 abstractC40456ed6 : this.f117743a) {
            try {
                C38511bN4 mo42688l = abstractC40456ed6.mo42688l(i, c1027ct, m42685o, map);
                if (mo42688l.m64621b() == EnumC7009Qx.EAN_13 && mo42688l.m64617f().charAt(0) == '0') {
                    z = true;
                } else {
                    z = false;
                }
                if (map == null) {
                    collection = null;
                } else {
                    collection = (Collection) map.get(EnumC47491qV0.POSSIBLE_FORMATS);
                }
                if (collection != null && !collection.contains(EnumC7009Qx.UPC_A)) {
                    z2 = false;
                    if (!z && z2) {
                        C38511bN4 c38511bN4 = new C38511bN4(mo42688l.m64617f().substring(1), mo42688l.m64620c(), mo42688l.m64618e(), EnumC7009Qx.UPC_A);
                        c38511bN4.m64616g(mo42688l.m64619d());
                        return c38511bN4;
                    }
                    return mo42688l;
                }
                z2 = true;
                if (!z) {
                }
                return mo42688l;
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.m45943a();
    }

    @Override // p000.AbstractC52944zh3, p000.InterfaceC36918Wr4
    public void reset() {
        for (AbstractC40456ed6 abstractC40456ed6 : this.f117743a) {
            abstractC40456ed6.reset();
        }
    }
}
