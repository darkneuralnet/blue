package p000;
/* renamed from: at2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C38223at2 {
    /* renamed from: a */
    public static void m65328a(byte[] bArr, P31 p31) {
        p31.mo31322f(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static void m65327b(short s, P31 p31) {
        p31.mo31323c((byte) (s >>> 8));
        p31.mo31323c((byte) s);
    }

    /* renamed from: c */
    public static void m65326c(int i, P31 p31) {
        p31.mo31323c((byte) (i >>> 24));
        p31.mo31323c((byte) (i >>> 16));
        p31.mo31323c((byte) (i >>> 8));
        p31.mo31323c((byte) i);
    }
}
