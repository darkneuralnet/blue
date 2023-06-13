package p000;

import com.google.zxing.WriterException;
import java.util.Map;
/* renamed from: ad6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38067ad6 implements InterfaceC45592nH6 {

    /* renamed from: a */
    public final F81 f50839a = new F81();

    @Override // p000.InterfaceC45592nH6
    /* renamed from: a */
    public C1837ET mo3433a(String str, EnumC7009Qx enumC7009Qx, int i, int i2, Map<EnumC40431eb1, ?> map) throws WriterException {
        if (enumC7009Qx == EnumC7009Qx.UPC_A) {
            return this.f50839a.mo3433a("0".concat(String.valueOf(str)), EnumC7009Qx.EAN_13, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(enumC7009Qx)));
    }
}
