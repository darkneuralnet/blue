package p000;
/* renamed from: yb6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C52294yb6 extends C20674g {
    private static final long serialVersionUID = 1;

    public C52294yb6() {
        this(2, 10, new byte[]{0});
    }

    /* renamed from: d */
    public int m3196d() {
        byte[] m40379a = m40379a();
        if (m40379a == null || m40379a.length == 0) {
            return 0;
        }
        return m40379a[0];
    }

    @Override // p000.C20674g
    public String toString() {
        String str;
        int m3196d = m3196d();
        Object[] objArr = new Object[2];
        if (m3196d >= 0) {
            str = "+";
        } else {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = Integer.valueOf(m3196d);
        return String.format("TxPowerLevel(%s%ddBm)", objArr);
    }

    public C52294yb6(int i, int i2, byte[] bArr) {
        super(i, i2, bArr);
    }
}
