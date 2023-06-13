package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
/* renamed from: gH7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC41442gH7 extends DB7 implements XH7 {
    public AbstractBinderC41442gH7() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // p000.DB7
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            mo3739A0(parcel.readString());
        } else {
            mo3738d2((ProxyResponse) C51602xQ7.m5273a(parcel, ProxyResponse.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
