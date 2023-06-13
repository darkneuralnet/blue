package p000;

import android.util.Log;
import java.util.Set;
/* renamed from: OO6 */
/* loaded from: classes6.dex */
public final class OO6 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Set f26464b;

    /* renamed from: c */
    public final /* synthetic */ C37928aO5 f26465c;

    public OO6(C37928aO5 c37928aO5, Set set) {
        this.f26465c = c37928aO5;
        this.f26464b = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C42672iM6 c42672iM6;
        try {
            for (String str : this.f26464b) {
                c42672iM6 = this.f26465c.f50396a;
                c42672iM6.m34108n(str);
            }
        } catch (Exception e) {
            Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e);
        }
    }
}
