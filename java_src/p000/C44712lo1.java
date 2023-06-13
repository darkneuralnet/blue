package p000;
/* renamed from: lo1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C44712lo1 extends C20674g {
    private static final long serialVersionUID = 2;

    /* renamed from: e */
    public boolean f96748e;

    /* renamed from: f */
    public boolean f96749f;

    /* renamed from: g */
    public boolean f96750g;

    /* renamed from: h */
    public boolean f96751h;

    /* renamed from: i */
    public boolean f96752i;

    public C44712lo1() {
        this(2, 1, new byte[]{0});
    }

    /* renamed from: d */
    public final void m26790d(byte[] bArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (bArr != null) {
            boolean z5 = true;
            if (bArr.length >= 1) {
                byte b = bArr[0];
                if ((b & 1) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f96748e = z;
                if ((b & 2) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f96749f = z2;
                if ((b & 4) == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f96750g = z3;
                if ((b & 8) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f96751h = z4;
                if ((b & 16) == 0) {
                    z5 = false;
                }
                this.f96752i = z5;
            }
        }
    }

    @Override // p000.C20674g
    public String toString() {
        return String.format("Flags(LimitedDiscoverable=%s,GeneralDiscoverable=%s,LegacySupported=%s,ControllerSimultaneitySupported=%s,HostSimultaneitySupported=%s)", Boolean.valueOf(this.f96748e), Boolean.valueOf(this.f96749f), Boolean.valueOf(this.f96750g), Boolean.valueOf(this.f96751h), Boolean.valueOf(this.f96752i));
    }

    public C44712lo1(int i, int i2, byte[] bArr) {
        super(i, i2, bArr);
        m26790d(bArr);
    }
}
