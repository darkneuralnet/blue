package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* renamed from: AQ6 */
/* loaded from: classes5.dex */
public abstract class AQ6 extends BinderC46931pY6 implements InterfaceC39753dR6 {
    public AQ6() {
        super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback");
    }

    @Override // p000.BinderC46931pY6
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo44258u1((Status) C49311tZ6.m12045a(parcel, Status.CREATOR), (PendingIntent) C49311tZ6.m12045a(parcel, PendingIntent.CREATOR));
            return true;
        }
        return false;
    }
}
