package p000;

import android.util.Log;
import p000.AbstractC34139Ku6;
/* renamed from: DA8 */
/* loaded from: classes6.dex */
public final class DA8 {
    /* renamed from: a */
    public static AbstractC38851bw7 m110806a(AbstractC34139Ku6 abstractC34139Ku6) {
        C36003St7 c36003St7 = new C36003St7();
        for (AbstractC34139Ku6.AbstractC4613a abstractC4613a : abstractC34139Ku6.mo4502a()) {
            C47271q69 c47271q69 = new C47271q69();
            c47271q69.m18161b(EnumC52013y69.m4130a(abstractC4613a.mo2315b()));
            c47271q69.m18162a(Integer.valueOf(abstractC4613a.mo2316a()));
            c36003St7.m84668d(c47271q69.m18159d());
        }
        return c36003St7.m84667e();
    }

    /* renamed from: b */
    public static X29 m110805b(C34451Md3 c34451Md3) {
        E29 e29;
        C49602u29 c49602u29 = new C49602u29();
        int m93689a = c34451Md3.m93689a();
        if (m93689a != 1) {
            if (m93689a != 2) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unexpected detector mode: ");
                sb.append(m93689a);
                Log.e("ObjectsLoggingUtils", sb.toString());
                e29 = E29.MODE_UNSPECIFIED;
            } else {
                e29 = E29.SINGLE_IMAGE;
            }
        } else {
            e29 = E29.STREAM;
        }
        c49602u29.m10945b(e29);
        c49602u29.m10944c(Boolean.valueOf(c34451Md3.m93686d()));
        c49602u29.m10946a(Boolean.valueOf(c34451Md3.m93687c()));
        return c49602u29.m10942e();
    }
}
