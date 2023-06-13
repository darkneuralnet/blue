package p000;
/* renamed from: Lq5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34336Lq5 {

    /* renamed from: a */
    public final Q70 f22111a;

    public C34336Lq5(Q70 q70) {
        this.f22111a = q70;
    }

    /* renamed from: a */
    public static C34336Lq5 m96302a(byte[] bArr, C34570Mq5 c34570Mq5) {
        if (c34570Mq5 != null) {
            return new C34336Lq5(Q70.m88906a(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    /* renamed from: b */
    public int m96301b() {
        return this.f22111a.m88904c();
    }
}
