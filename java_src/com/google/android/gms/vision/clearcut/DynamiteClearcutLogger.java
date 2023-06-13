package com.google.android.gms.vision.clearcut;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.C17600o;
import java.util.concurrent.ExecutorService;
@Keep
/* loaded from: classes6.dex */
public class DynamiteClearcutLogger {
    private static final ExecutorService zza = C44898m68.m26338a().mo15624f(2, C44938mA8.f97495a);
    private C44362lC7 zzb = new C44362lC7(0.03333333333333333d);
    private VisionClearcutLogger zzc;

    public DynamiteClearcutLogger(@RecentlyNonNull Context context) {
        this.zzc = new VisionClearcutLogger(context);
    }

    public final void zza(int i, C17600o c17600o) {
        if (i == 3 && !this.zzb.m27670a()) {
            C32650El2.m108400d("Skipping image analysis log due to rate limiting", new Object[0]);
        } else {
            zza.execute(new RunnableC34932Oe7(this, i, c17600o));
        }
    }
}
