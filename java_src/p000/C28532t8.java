package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p000.C29783w8;
/* renamed from: t8 */
/* loaded from: classes6.dex */
public final class C28532t8 extends XE2 {

    /* renamed from: a */
    public final C29783w8 f109899a;

    /* renamed from: b */
    public final C34336Lq5 f109900b;

    /* renamed from: c */
    public final Integer f109901c;

    public C28532t8(C29783w8 c29783w8, C34336Lq5 c34336Lq5, Integer num) {
        this.f109899a = c29783w8;
        this.f109900b = c34336Lq5;
        this.f109901c = num;
    }

    /* renamed from: d */
    public static C28532t8 m13028d(C29783w8 c29783w8, C34336Lq5 c34336Lq5, Integer num) throws GeneralSecurityException {
        if (c34336Lq5.m96301b() == 32) {
            if (c29783w8.m7368e() && num == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
            }
            if (!c29783w8.m7368e() && num != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
            }
            return new C28532t8(c29783w8, c34336Lq5, num);
        }
        throw new GeneralSecurityException("Invalid key size");
    }

    @Override // p000.XE2
    /* renamed from: b */
    public Q70 mo13030b() {
        if (this.f109899a.m7369d() == C29783w8.C29784a.f115400e) {
            return Q70.m88906a(new byte[0]);
        }
        if (this.f109899a.m7369d() != C29783w8.C29784a.f115399d && this.f109899a.m7369d() != C29783w8.C29784a.f115398c) {
            if (this.f109899a.m7369d() == C29783w8.C29784a.f115397b) {
                return Q70.m88906a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f109901c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesCmacParameters.Variant: " + this.f109899a.m7369d());
        }
        return Q70.m88906a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f109901c.intValue()).array());
    }

    @Override // p000.XE2
    /* renamed from: e */
    public C29783w8 mo13029c() {
        return this.f109899a;
    }
}
