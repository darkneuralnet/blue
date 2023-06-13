package p000;

import java.util.Arrays;
import java.util.List;
/* renamed from: re */
/* loaded from: classes2.dex */
public class C27959re extends AbstractC7026Qy<HD1, HD1> {
    public C27959re(List<C41125fl2<HD1>> list) {
        super(m15658d(list));
    }

    /* renamed from: c */
    public static C41125fl2<HD1> m15659c(C41125fl2<HD1> c41125fl2) {
        HD1 hd1 = c41125fl2.f80564b;
        HD1 hd12 = c41125fl2.f80565c;
        if (hd1 != null && hd12 != null && hd1.m104170d().length != hd12.m104170d().length) {
            float[] m15657e = m15657e(hd1.m104170d(), hd12.m104170d());
            return c41125fl2.m40906b(hd1.m104173a(m15657e), hd12.m104173a(m15657e));
        }
        return c41125fl2;
    }

    /* renamed from: d */
    public static List<C41125fl2<HD1>> m15658d(List<C41125fl2<HD1>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, m15659c(list.get(i)));
        }
        return list;
    }

    /* renamed from: e */
    public static float[] m15657e(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr3[i2];
            if (f2 != f) {
                fArr3[i] = f2;
                i++;
                f = fArr3[i2];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    @Override // p000.InterfaceC2901Ge
    /* renamed from: a */
    public AbstractC26856oB<HD1, HD1> mo951a() {
        return new JD1(this.f31316a);
    }

    @Override // p000.AbstractC7026Qy, p000.InterfaceC2901Ge
    /* renamed from: b */
    public /* bridge */ /* synthetic */ List mo950b() {
        return super.mo950b();
    }

    @Override // p000.AbstractC7026Qy, p000.InterfaceC2901Ge
    public /* bridge */ /* synthetic */ boolean isStatic() {
        return super.isStatic();
    }

    @Override // p000.AbstractC7026Qy
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
