package p000;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
/* renamed from: vW2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50465vW2 extends AbstractC52944zh3 {

    /* renamed from: a */
    public final AbstractC52944zh3[] f114183a;

    public C50465vW2(Map<EnumC47491qV0, ?> map) {
        Collection collection;
        boolean z;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(EnumC47491qV0.POSSIBLE_FORMATS);
        }
        if (map != null && map.get(EnumC47491qV0.ASSUME_CODE_39_CHECK_DIGIT) != null) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(EnumC7009Qx.EAN_13) || collection.contains(EnumC7009Qx.UPC_A) || collection.contains(EnumC7009Qx.EAN_8) || collection.contains(EnumC7009Qx.UPC_E)) {
                arrayList.add(new C51651xW2(map));
            }
            if (collection.contains(EnumC7009Qx.CODE_39)) {
                arrayList.add(new C34520Ml0(z));
            }
            if (collection.contains(EnumC7009Qx.CODE_93)) {
                arrayList.add(new C34988Ol0());
            }
            if (collection.contains(EnumC7009Qx.CODE_128)) {
                arrayList.add(new C34052Kl0());
            }
            if (collection.contains(EnumC7009Qx.ITF)) {
                arrayList.add(new C42694iP1());
            }
            if (collection.contains(EnumC7009Qx.CODABAR)) {
                arrayList.add(new C33584Il0());
            }
            if (collection.contains(EnumC7009Qx.RSS_14)) {
                arrayList.add(new C50031um4());
            }
            if (collection.contains(EnumC7009Qx.RSS_EXPANDED)) {
                arrayList.add(new C50623vm4());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C51651xW2(map));
            arrayList.add(new C34520Ml0());
            arrayList.add(new C33584Il0());
            arrayList.add(new C34988Ol0());
            arrayList.add(new C34052Kl0());
            arrayList.add(new C42694iP1());
            arrayList.add(new C50031um4());
            arrayList.add(new C50623vm4());
        }
        this.f114183a = (AbstractC52944zh3[]) arrayList.toArray(new AbstractC52944zh3[arrayList.size()]);
    }

    @Override // p000.AbstractC52944zh3
    /* renamed from: b */
    public C38511bN4 mo543b(int i, C1027CT c1027ct, Map<EnumC47491qV0, ?> map) throws NotFoundException {
        for (AbstractC52944zh3 abstractC52944zh3 : this.f114183a) {
            try {
                return abstractC52944zh3.mo543b(i, c1027ct, map);
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.m45943a();
    }

    @Override // p000.AbstractC52944zh3, p000.InterfaceC36918Wr4
    public void reset() {
        for (AbstractC52944zh3 abstractC52944zh3 : this.f114183a) {
            abstractC52944zh3.reset();
        }
    }
}
