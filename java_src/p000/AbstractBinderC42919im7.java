package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zzaa;
/* renamed from: im7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC42919im7 extends JB7 implements InterfaceC39354cn7 {
    public AbstractBinderC42919im7() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // p000.JB7
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            zzc();
        } else {
            zzb((zzaa) C51000wP7.m6864b(parcel, zzaa.CREATOR));
        }
        return true;
    }
}
