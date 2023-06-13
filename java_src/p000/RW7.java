package p000;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;
/* renamed from: RW7 */
/* loaded from: classes5.dex */
public final class RW7 extends JX7 {

    /* renamed from: l */
    public final /* synthetic */ C35797Rw8 f32136l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RW7(C40993fX7 c40993fX7, String str, Object obj, boolean z, C35797Rw8 c35797Rw8, byte[] bArr) {
        super(c40993fX7, "getTokenRefactor__blocked_packages", obj, true, null);
        this.f32136l = c35797Rw8;
    }

    @Override // p000.JX7
    /* renamed from: a */
    public final Object mo15827a(Object obj) {
        try {
            return C40648ew8.m42373j(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            String m100269c = super.m100269c();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(m100269c).length() + 27 + str.length());
            sb.append("Invalid byte[] value for ");
            sb.append(m100269c);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
