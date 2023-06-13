package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.signin.internal.zai;
/* renamed from: WP6 */
/* loaded from: classes6.dex */
public final class WP6 extends DP6 {
    public WP6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: c5 */
    public final void m78488c5(int i) throws RemoteException {
        Parcel zaa = zaa();
        zaa.writeInt(i);
        zac(7, zaa);
    }

    /* renamed from: d5 */
    public final void m78487d5(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException {
        Parcel zaa = zaa();
        JP6.m100498e(zaa, iAccountAccessor);
        zaa.writeInt(i);
        JP6.m100500c(zaa, z);
        zac(9, zaa);
    }

    /* renamed from: e5 */
    public final void m78486e5(zai zaiVar, SP6 sp6) throws RemoteException {
        Parcel zaa = zaa();
        JP6.m100499d(zaa, zaiVar);
        JP6.m100498e(zaa, sp6);
        zac(12, zaa);
    }
}
