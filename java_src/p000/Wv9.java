package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzwf;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzwi;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzwl;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzyl;
import java.io.IOException;
import java.io.StringReader;
/* renamed from: Wv9 */
/* loaded from: classes5.dex */
public final class Wv9 {
    /* renamed from: a */
    public static Pv9 m77617a(Vx9 vx9) throws zzwf, zzwl {
        boolean m79054n = vx9.m79054n();
        vx9.m79056l(true);
        try {
            try {
                return C44800lw9.m26609a(vx9);
            } catch (OutOfMemoryError e) {
                String obj = vx9.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 36);
                sb.append("Failed parsing JSON source: ");
                sb.append(obj);
                sb.append(" to Json");
                throw new zzwi(sb.toString(), e);
            } catch (StackOverflowError e2) {
                String obj2 = vx9.toString();
                StringBuilder sb2 = new StringBuilder(obj2.length() + 36);
                sb2.append("Failed parsing JSON source: ");
                sb2.append(obj2);
                sb2.append(" to Json");
                throw new zzwi(sb2.toString(), e2);
            }
        } finally {
            vx9.m79056l(m79054n);
        }
    }

    /* renamed from: b */
    public static Pv9 m77616b(String str) throws zzwl {
        try {
            Vx9 vx9 = new Vx9(new StringReader(str));
            Pv9 m77617a = m77617a(vx9);
            if (!(m77617a instanceof Sv9) && vx9.m79052q() != 10) {
                throw new zzwl("Did not consume the entire document.");
            }
            return m77617a;
        } catch (zzyl e) {
            throw new zzwl(e);
        } catch (IOException e2) {
            throw new zzwf(e2);
        } catch (NumberFormatException e3) {
            throw new zzwl(e3);
        }
    }
}
