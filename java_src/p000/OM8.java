package p000;

import java.io.IOException;
import java.nio.charset.Charset;
/* renamed from: OM8 */
/* loaded from: classes5.dex */
public class OM8 extends DM8 {

    /* renamed from: f */
    public final byte[] f26443f;

    public OM8(byte[] bArr) {
        bArr.getClass();
        this.f26443f = bArr;
    }

    @Override // p000.AbstractC40913fO8
    /* renamed from: a */
    public byte mo41439a(int i) {
        return this.f26443f[i];
    }

    @Override // p000.AbstractC40913fO8
    /* renamed from: b */
    public byte mo41438b(int i) {
        return this.f26443f[i];
    }

    @Override // p000.AbstractC40913fO8
    /* renamed from: c */
    public int mo41437c() {
        return this.f26443f.length;
    }

    @Override // p000.AbstractC40913fO8
    /* renamed from: e */
    public final int mo41436e(int i, int i2, int i3) {
        return XV8.m76918b(i, this.f26443f, 0, i3);
    }

    @Override // p000.AbstractC40913fO8
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC40913fO8) || mo41437c() != ((AbstractC40913fO8) obj).mo41437c()) {
            return false;
        }
        if (mo41437c() == 0) {
            return true;
        }
        if (obj instanceof OM8) {
            OM8 om8 = (OM8) obj;
            int m41430u = m41430u();
            int m41430u2 = om8.m41430u();
            if (m41430u != 0 && m41430u2 != 0 && m41430u != m41430u2) {
                return false;
            }
            int mo41437c = mo41437c();
            if (mo41437c <= om8.mo41437c()) {
                if (mo41437c <= om8.mo41437c()) {
                    byte[] bArr = this.f26443f;
                    byte[] bArr2 = om8.f26443f;
                    om8.mo41492x();
                    int i = 0;
                    int i2 = 0;
                    while (i < mo41437c) {
                        if (bArr[i] != bArr2[i2]) {
                            return false;
                        }
                        i++;
                        i2++;
                    }
                    return true;
                }
                throw new IllegalArgumentException("Ran off end of other: 0, " + mo41437c + ", " + om8.mo41437c());
            }
            throw new IllegalArgumentException("Length too large: " + mo41437c + mo41437c());
        }
        return obj.equals(this);
    }

    @Override // p000.AbstractC40913fO8
    /* renamed from: f */
    public final AbstractC40913fO8 mo41435f(int i, int i2) {
        int m41431s = AbstractC40913fO8.m41431s(0, i2, mo41437c());
        if (m41431s == 0) {
            return AbstractC40913fO8.f80055c;
        }
        return new C40895fM8(this.f26443f, 0, m41431s);
    }

    @Override // p000.AbstractC40913fO8
    /* renamed from: h */
    public final String mo41434h(Charset charset) {
        return new String(this.f26443f, 0, mo41437c(), charset);
    }

    @Override // p000.AbstractC40913fO8
    /* renamed from: j */
    public final void mo41433j(C43258jL8 c43258jL8) throws IOException {
        ((C43887kP8) c43258jL8).m29012B(this.f26443f, 0, mo41437c());
    }

    @Override // p000.AbstractC40913fO8
    /* renamed from: o */
    public final boolean mo41432o() {
        return Z89.m73651e(this.f26443f, 0, mo41437c());
    }

    /* renamed from: x */
    public int mo41492x() {
        return 0;
    }
}
