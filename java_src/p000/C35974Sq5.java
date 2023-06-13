package p000;
/* renamed from: Sq5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C35974Sq5 {

    /* renamed from: a */
    public final byte[] f34317a;

    /* renamed from: b */
    public final byte[] f34318b;

    /* renamed from: c */
    public final P31 f34319c;

    /* renamed from: d */
    public int f34320d;

    /* renamed from: e */
    public int f34321e;

    public C35974Sq5(byte[] bArr, byte[] bArr2, P31 p31) {
        this.f34317a = bArr;
        this.f34318b = bArr2;
        this.f34319c = p31;
    }

    /* renamed from: a */
    public void m84795a(byte[] bArr, boolean z, int i) {
        m84794b(bArr, i);
        if (z) {
            this.f34321e++;
        }
    }

    /* renamed from: b */
    public byte[] m84794b(byte[] bArr, int i) {
        if (bArr.length >= this.f34319c.mo15578e()) {
            P31 p31 = this.f34319c;
            byte[] bArr2 = this.f34317a;
            p31.mo31322f(bArr2, 0, bArr2.length);
            this.f34319c.mo31323c((byte) (this.f34320d >>> 24));
            this.f34319c.mo31323c((byte) (this.f34320d >>> 16));
            this.f34319c.mo31323c((byte) (this.f34320d >>> 8));
            this.f34319c.mo31323c((byte) this.f34320d);
            this.f34319c.mo31323c((byte) (this.f34321e >>> 8));
            this.f34319c.mo31323c((byte) this.f34321e);
            this.f34319c.mo31323c((byte) -1);
            P31 p312 = this.f34319c;
            byte[] bArr3 = this.f34318b;
            p312.mo31322f(bArr3, 0, bArr3.length);
            this.f34319c.mo15581a(bArr, i);
            return bArr;
        }
        throw new IllegalArgumentException("target length is less than digest size.");
    }

    /* renamed from: c */
    public void m84793c(int i) {
        this.f34321e = i;
    }

    /* renamed from: d */
    public void m84792d(int i) {
        this.f34320d = i;
    }
}
