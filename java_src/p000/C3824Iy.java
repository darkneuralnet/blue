package p000;
/* renamed from: Iy */
/* loaded from: classes6.dex */
public class C3824Iy extends C2990Gy {
    public C3824Iy(String str) {
        super(str);
    }

    /* renamed from: d */
    public static C3824Iy m101443d(String str) {
        return m101442e(str.getBytes(C48618sO5.f108725a));
    }

    /* renamed from: e */
    public static C3824Iy m101442e(byte[] bArr) {
        return new C3824Iy(C3291Hy.m103156g(bArr, true));
    }

    /* renamed from: f */
    public static C3824Iy m101441f(String str) {
        if (str == null) {
            return null;
        }
        return new C3824Iy(str);
    }

    @Override // p000.C2990Gy
    public boolean equals(Object obj) {
        if ((obj instanceof C3824Iy) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }
}
