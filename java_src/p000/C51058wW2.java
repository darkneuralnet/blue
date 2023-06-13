package p000;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
/* renamed from: wW2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51058wW2 implements InterfaceC36918Wr4 {

    /* renamed from: a */
    public Map<EnumC47491qV0, ?> f116115a;

    /* renamed from: b */
    public InterfaceC36918Wr4[] f116116b;

    @Override // p000.InterfaceC36918Wr4
    /* renamed from: a */
    public C38511bN4 mo544a(C7707TG c7707tg, Map<EnumC47491qV0, ?> map) throws NotFoundException {
        m6716d(map);
        return m6718b(c7707tg);
    }

    /* renamed from: b */
    public final C38511bN4 m6718b(C7707TG c7707tg) throws NotFoundException {
        InterfaceC36918Wr4[] interfaceC36918Wr4Arr = this.f116116b;
        if (interfaceC36918Wr4Arr != null) {
            for (InterfaceC36918Wr4 interfaceC36918Wr4 : interfaceC36918Wr4Arr) {
                try {
                    return interfaceC36918Wr4.mo544a(c7707tg, this.f116115a);
                } catch (ReaderException unused) {
                }
            }
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: c */
    public C38511bN4 m6717c(C7707TG c7707tg) throws NotFoundException {
        if (this.f116116b == null) {
            m6716d(null);
        }
        return m6718b(c7707tg);
    }

    /* renamed from: d */
    public void m6716d(Map<EnumC47491qV0, ?> map) {
        boolean z;
        Collection collection;
        this.f116115a = map;
        boolean z2 = true;
        if (map != null && map.containsKey(EnumC47491qV0.TRY_HARDER)) {
            z = true;
        } else {
            z = false;
        }
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(EnumC47491qV0.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(EnumC7009Qx.UPC_A) && !collection.contains(EnumC7009Qx.UPC_E) && !collection.contains(EnumC7009Qx.EAN_13) && !collection.contains(EnumC7009Qx.EAN_8) && !collection.contains(EnumC7009Qx.CODABAR) && !collection.contains(EnumC7009Qx.CODE_39) && !collection.contains(EnumC7009Qx.CODE_93) && !collection.contains(EnumC7009Qx.CODE_128) && !collection.contains(EnumC7009Qx.ITF) && !collection.contains(EnumC7009Qx.RSS_14) && !collection.contains(EnumC7009Qx.RSS_EXPANDED)) {
                z2 = false;
            }
            if (z2 && !z) {
                arrayList.add(new C50465vW2(map));
            }
            if (collection.contains(EnumC7009Qx.QR_CODE)) {
                arrayList.add(new C46957pb4());
            }
            if (collection.contains(EnumC7009Qx.DATA_MATRIX)) {
                arrayList.add(new MS0());
            }
            if (collection.contains(EnumC7009Qx.AZTEC)) {
                arrayList.add(new C13325bv());
            }
            if (collection.contains(EnumC7009Qx.PDF_417)) {
                arrayList.add(new C49703uD3());
            }
            if (collection.contains(EnumC7009Qx.MAXICODE)) {
                arrayList.add(new C40314eO2());
            }
            if (z2 && z) {
                arrayList.add(new C50465vW2(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z) {
                arrayList.add(new C50465vW2(map));
            }
            arrayList.add(new C46957pb4());
            arrayList.add(new MS0());
            arrayList.add(new C13325bv());
            arrayList.add(new C49703uD3());
            arrayList.add(new C40314eO2());
            if (z) {
                arrayList.add(new C50465vW2(map));
            }
        }
        this.f116116b = (InterfaceC36918Wr4[]) arrayList.toArray(new InterfaceC36918Wr4[arrayList.size()]);
    }

    @Override // p000.InterfaceC36918Wr4
    public void reset() {
        InterfaceC36918Wr4[] interfaceC36918Wr4Arr = this.f116116b;
        if (interfaceC36918Wr4Arr != null) {
            for (InterfaceC36918Wr4 interfaceC36918Wr4 : interfaceC36918Wr4Arr) {
                interfaceC36918Wr4.reset();
            }
        }
    }
}
