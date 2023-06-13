package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import java.io.UnsupportedEncodingException;
/* renamed from: gv2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C41818gv2 extends C20674g {
    private static final long serialVersionUID = 1;

    /* renamed from: e */
    public String f84453e;

    public C41818gv2() {
        this(1, 9, null);
    }

    /* renamed from: d */
    public boolean m37328d() {
        return m40377c() == 8;
    }

    /* renamed from: e */
    public final void m37327e(byte[] bArr) {
        if (bArr != null && bArr.length >= 1) {
            try {
                this.f84453e = new String(bArr, Constants.DEFAULT_ENCODING);
            } catch (UnsupportedEncodingException unused) {
            }
        }
    }

    @Override // p000.C20674g
    public String toString() {
        String str;
        Object[] objArr = new Object[2];
        if (m37328d()) {
            str = "SHORTENED";
        } else {
            str = "COMPLETE";
        }
        objArr[0] = str;
        objArr[1] = this.f84453e;
        return String.format("LocalName(%s,%s)", objArr);
    }

    public C41818gv2(int i, int i2, byte[] bArr) {
        super(i, i2, bArr);
        m37327e(bArr);
    }
}
