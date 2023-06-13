package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsResult;
/* renamed from: pr7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC47120pr7 extends JB7 implements InterfaceC41793gs7 {
    public AbstractBinderC47120pr7() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // p000.JB7
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo37369J((LocationSettingsResult) C51000wP7.m6864b(parcel, LocationSettingsResult.CREATOR));
            return true;
        }
        return false;
    }
}
