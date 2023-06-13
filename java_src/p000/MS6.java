package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;
/* renamed from: MS6 */
/* loaded from: classes5.dex */
public abstract class MS6 extends BinderC46931pY6 implements InterfaceC46886pT6 {
    public MS6() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    @Override // p000.BinderC46931pY6
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo19223S1((Status) C49311tZ6.m12045a(parcel, Status.CREATOR), (SavePasswordResult) C49311tZ6.m12045a(parcel, SavePasswordResult.CREATOR));
            return true;
        }
        return false;
    }
}
