package com.google.android.gms.vision.clearcut;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.clearcut.C17477a;
import com.google.android.gms.internal.vision.C17551E;
import com.google.android.gms.internal.vision.C17600o;
@Keep
/* loaded from: classes6.dex */
public class VisionClearcutLogger {
    private final C17477a zza;
    private boolean zzb = true;

    public VisionClearcutLogger(@RecentlyNonNull Context context) {
        this.zza = new C17477a(context, "VISION", null);
    }

    public final void zza(int i, C17600o c17600o) {
        byte[] m51016g = c17600o.m51016g();
        if (i >= 0 && i <= 3) {
            try {
                if (this.zzb) {
                    this.zza.m51642a(m51016g).m51625b(i).m51626a();
                    return;
                }
                C17600o.C17601a m50853u = C17600o.m50853u();
                try {
                    m50853u.mo50979l(m51016g, 0, m51016g.length, C17551E.m50996c());
                    C32650El2.m108403a("Would have logged:\n%s", m50853u.toString());
                    return;
                } catch (Exception e) {
                    C32650El2.m108402b(e, "Parsing error", new Object[0]);
                    return;
                }
            } catch (Exception e2) {
                C42860ig8.m33599b(e2);
                C32650El2.m108402b(e2, "Failed to log", new Object[0]);
                return;
            }
        }
        C32650El2.m108401c("Illegal event code: %d", Integer.valueOf(i));
    }
}
