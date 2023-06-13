package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: Un7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC36417Un7 extends JB7 implements InterfaceC35490Qo7 {
    public AbstractBinderC36417Un7() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // p000.JB7
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                mo18347s0(parcel.readInt(), (PendingIntent) C51000wP7.m6864b(parcel, PendingIntent.CREATOR));
            } else {
                mo18348i2(parcel.readInt(), parcel.createStringArray());
            }
        } else {
            mo18350b5(parcel.readInt(), parcel.createStringArray());
        }
        return true;
    }
}
