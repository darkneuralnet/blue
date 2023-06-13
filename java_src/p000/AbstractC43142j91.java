package p000;
/* renamed from: j91  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC43142j91 extends C35533Qt5 {
    private static final long serialVersionUID = 1;

    /* renamed from: f */
    public final EnumC24725a f92216f;

    /* renamed from: j91$a */
    /* loaded from: classes6.dex */
    public enum EnumC24725a {
        UID,
        URL,
        TLM,
        EID
    }

    public AbstractC43142j91() {
        this(3, 22, new byte[]{-86, -2}, null);
    }

    @Override // p000.C35533Qt5, p000.C20674g
    public String toString() {
        return String.format("EddyStone(FrameType=%s)", this.f92216f);
    }

    public AbstractC43142j91(int i, int i2, byte[] bArr, EnumC24725a enumC24725a) {
        super(i, i2, bArr);
        this.f92216f = enumC24725a;
    }
}
