package p000;

import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzck;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzcn;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzcq;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzeq;
import java.io.IOException;
import java.io.StringReader;
/* renamed from: KU7 */
/* loaded from: classes5.dex */
public final class KU7 {
    /* renamed from: a */
    public static C51629xT7 m98834a(C37003Xa8 c37003Xa8) throws zzck, zzcq {
        boolean m76827n = c37003Xa8.m76827n();
        c37003Xa8.m76829l(true);
        try {
            try {
                return C38298b08.m65123a(c37003Xa8);
            } catch (OutOfMemoryError e) {
                String obj = c37003Xa8.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 36);
                sb.append("Failed parsing JSON source: ");
                sb.append(obj);
                sb.append(" to Json");
                throw new zzcn(sb.toString(), e);
            } catch (StackOverflowError e2) {
                String obj2 = c37003Xa8.toString();
                StringBuilder sb2 = new StringBuilder(obj2.length() + 36);
                sb2.append("Failed parsing JSON source: ");
                sb2.append(obj2);
                sb2.append(" to Json");
                throw new zzcn(sb2.toString(), e2);
            }
        } finally {
            c37003Xa8.m76829l(m76827n);
        }
    }

    /* renamed from: b */
    public static C51629xT7 m98833b(String str) throws zzcq {
        try {
            C37003Xa8 c37003Xa8 = new C37003Xa8(new StringReader(str));
            C51629xT7 m98834a = m98834a(c37003Xa8);
            if (!(m98834a instanceof VT7) && c37003Xa8.m76825q() != 10) {
                throw new zzcq("Did not consume the entire document.");
            }
            return m98834a;
        } catch (zzeq e) {
            throw new zzcq(e);
        } catch (IOException e2) {
            throw new zzck(e2);
        } catch (NumberFormatException e3) {
            throw new zzcq(e3);
        }
    }
}
