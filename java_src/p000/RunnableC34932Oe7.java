package p000;

import com.google.android.gms.internal.vision.C17600o;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.gms.vision.clearcut.VisionClearcutLogger;
/* renamed from: Oe7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC34932Oe7 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f26991b;

    /* renamed from: c */
    public final /* synthetic */ C17600o f26992c;

    /* renamed from: d */
    public final /* synthetic */ DynamiteClearcutLogger f26993d;

    public RunnableC34932Oe7(DynamiteClearcutLogger dynamiteClearcutLogger, int i, C17600o c17600o) {
        this.f26993d = dynamiteClearcutLogger;
        this.f26991b = i;
        this.f26992c = c17600o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VisionClearcutLogger visionClearcutLogger;
        visionClearcutLogger = this.f26993d.zzc;
        visionClearcutLogger.zza(this.f26991b, this.f26992c);
    }
}
