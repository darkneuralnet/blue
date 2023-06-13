package p000;

import android.util.Log;
import java.util.List;
/* renamed from: CK6 */
/* loaded from: classes6.dex */
public final class CK6 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ List f3953b;

    /* renamed from: c */
    public final /* synthetic */ UM6 f3954c;

    /* renamed from: d */
    public final /* synthetic */ EK6 f3955d;

    public CK6(EK6 ek6, List list, UM6 um6) {
        this.f3955d = ek6;
        this.f3953b = list;
        this.f3954c = um6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IK6 ik6;
        try {
            ik6 = this.f3955d.f7291c;
            if (ik6.m102475c(this.f3953b)) {
                EK6.m109174c(this.f3955d, this.f3954c);
            } else {
                EK6.m109173d(this.f3955d, this.f3953b, this.f3954c);
            }
        } catch (Exception e) {
            Log.e("SplitCompat", "Error checking verified files.", e);
            this.f3954c.mo78493a(-11);
        }
    }
}
