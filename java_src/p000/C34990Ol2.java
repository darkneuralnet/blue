package p000;
/* renamed from: Ol2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C34990Ol2 {
    /* renamed from: a */
    public static byte[] m91550a(C33118Gl2 c33118Gl2, byte[] bArr, int i, byte[] bArr2) {
        P31 m84396a = T31.m84396a(c33118Gl2.m104787b());
        byte[] m104624b = C33188Gt0.m104620f().m104622d(bArr).m104617i(i).m104618h(-32640).m104619g(0, 22).m104624b();
        m84396a.mo31322f(m104624b, 0, m104624b.length);
        P31 m84396a2 = T31.m84396a(c33118Gl2.m104787b());
        byte[] m104624b2 = C33188Gt0.m104620f().m104622d(bArr).m104617i(i).m104619g(0, m84396a2.mo15578e() + 23).m104624b();
        C35974Sq5 c35974Sq5 = new C35974Sq5(bArr, bArr2, T31.m84396a(c33118Gl2.m104787b()));
        c35974Sq5.m84792d(i);
        c35974Sq5.m84793c(0);
        int m104785d = c33118Gl2.m104785d();
        int m104786c = c33118Gl2.m104786c();
        int m104782g = (1 << c33118Gl2.m104782g()) - 1;
        int i2 = 0;
        while (i2 < m104785d) {
            c35974Sq5.m84795a(m104624b2, i2 < m104785d + (-1), 23);
            DD3.m110671m((short) i2, m104624b2, 20);
            for (int i3 = 0; i3 < m104782g; i3++) {
                m104624b2[22] = (byte) i3;
                m84396a2.mo31322f(m104624b2, 0, m104624b2.length);
                m84396a2.mo15581a(m104624b2, 23);
            }
            m84396a.mo31322f(m104624b2, 23, m104786c);
            i2++;
        }
        byte[] bArr3 = new byte[m84396a.mo15578e()];
        m84396a.mo15581a(bArr3, 0);
        return bArr3;
    }
}
