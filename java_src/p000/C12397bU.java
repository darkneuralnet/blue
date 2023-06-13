package p000;

import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
@KeepForSdk
/* renamed from: bU */
/* loaded from: classes6.dex */
public class C12397bU {

    /* renamed from: c */
    public static final GmsLogger f57521c = new GmsLogger("StreamingFormatChecker", "");

    /* renamed from: a */
    public final LinkedList f57522a = new LinkedList();

    /* renamed from: b */
    public long f57523b = -1;

    @KeepForSdk
    /* renamed from: a */
    public void m64510a(C41304g32 c41304g32) {
        if (c41304g32.m40242g() != -1) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f57522a.add(Long.valueOf(elapsedRealtime));
        if (this.f57522a.size() > 5) {
            this.f57522a.removeFirst();
        }
        if (this.f57522a.size() == 5 && elapsedRealtime - ((Long) Preconditions.checkNotNull((Long) this.f57522a.peekFirst())).longValue() < 5000) {
            long j = this.f57523b;
            if (j == -1 || elapsedRealtime - j >= TimeUnit.SECONDS.toMillis(5L)) {
                this.f57523b = elapsedRealtime;
                f57521c.m51608w("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
            }
        }
    }
}
