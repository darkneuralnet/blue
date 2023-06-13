package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: BM7 */
/* loaded from: classes5.dex */
public abstract class BM7 extends DL7 implements QM7 {
    /* renamed from: d5 */
    public static QM7 m114064d5(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof QM7) {
            return (QM7) queryLocalInterface;
        }
        return new C43859kM7(iBinder);
    }
}
