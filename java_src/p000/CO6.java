package p000;

import android.util.Log;
/* renamed from: CO6 */
/* loaded from: classes6.dex */
public final class CO6 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C37928aO5 f4026b;

    public CO6(C37928aO5 c37928aO5) {
        this.f4026b = c37928aO5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C42672iM6 c42672iM6;
        try {
            c42672iM6 = this.f4026b.f50396a;
            c42672iM6.m34121a();
        } catch (Exception e) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e);
        }
    }
}
