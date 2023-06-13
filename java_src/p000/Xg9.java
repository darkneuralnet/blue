package p000;

import java.io.IOException;
import java.nio.charset.Charset;
/* renamed from: Xg9 */
/* loaded from: classes6.dex */
public class Xg9 extends Pg9 {

    /* renamed from: f */
    public final byte[] f43580f;

    public Xg9(byte[] bArr) {
        bArr.getClass();
        this.f43580f = bArr;
    }

    /* renamed from: E */
    public int mo11927E() {
        return 0;
    }

    @Override // p000.AbstractC45836nh9
    /* renamed from: a */
    public byte mo11926a(int i) {
        return this.f43580f[i];
    }

    @Override // p000.AbstractC45836nh9
    /* renamed from: b */
    public byte mo11925b(int i) {
        return this.f43580f[i];
    }

    @Override // p000.AbstractC45836nh9
    /* renamed from: c */
    public int mo11924c() {
        return this.f43580f.length;
    }

    @Override // p000.AbstractC45836nh9
    /* renamed from: e */
    public void mo11923e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f43580f, 0, bArr, 0, i3);
    }

    @Override // p000.AbstractC45836nh9
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC45836nh9) || mo11924c() != ((AbstractC45836nh9) obj).mo11924c()) {
            return false;
        }
        if (mo11924c() == 0) {
            return true;
        }
        if (obj instanceof Xg9) {
            Xg9 xg9 = (Xg9) obj;
            int m23294v = m23294v();
            int m23294v2 = xg9.m23294v();
            if (m23294v != 0 && m23294v2 != 0 && m23294v != m23294v2) {
                return false;
            }
            int mo11924c = mo11924c();
            if (mo11924c <= xg9.mo11924c()) {
                if (mo11924c <= xg9.mo11924c()) {
                    byte[] bArr = this.f43580f;
                    byte[] bArr2 = xg9.f43580f;
                    xg9.mo11927E();
                    int i = 0;
                    int i2 = 0;
                    while (i < mo11924c) {
                        if (bArr[i] != bArr2[i2]) {
                            return false;
                        }
                        i++;
                        i2++;
                    }
                    return true;
                }
                int mo11924c2 = xg9.mo11924c();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Ran off end of other: 0, ");
                sb.append(mo11924c);
                sb.append(", ");
                sb.append(mo11924c2);
                throw new IllegalArgumentException(sb.toString());
            }
            int mo11924c3 = mo11924c();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(mo11924c);
            sb2.append(mo11924c3);
            throw new IllegalArgumentException(sb2.toString());
        }
        return obj.equals(this);
    }

    @Override // p000.AbstractC45836nh9
    /* renamed from: f */
    public final int mo23300f(int i, int i2, int i3) {
        return Fn9.m106451d(i, this.f43580f, 0, i3);
    }

    @Override // p000.AbstractC45836nh9
    /* renamed from: h */
    public final AbstractC45836nh9 mo23299h(int i, int i2) {
        int m23295u = AbstractC45836nh9.m23295u(0, i2, mo11924c());
        if (m23295u == 0) {
            return AbstractC45836nh9.f100361c;
        }
        return new C49383tg9(this.f43580f, 0, m23295u);
    }

    @Override // p000.AbstractC45836nh9
    /* renamed from: j */
    public final String mo23298j(Charset charset) {
        return new String(this.f43580f, 0, mo11924c(), charset);
    }

    @Override // p000.AbstractC45836nh9
    /* renamed from: o */
    public final void mo23297o(If9 if9) throws IOException {
        if9.mo15517a(this.f43580f, 0, mo11924c());
    }

    @Override // p000.AbstractC45836nh9
    /* renamed from: s */
    public final boolean mo23296s() {
        return Ps9.m89655f(this.f43580f, 0, mo11924c());
    }
}
