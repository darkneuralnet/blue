package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
/* renamed from: o97  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC46113o97 extends BinderC46931pY6 implements R97 {
    public AbstractBinderC46113o97() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // p000.BinderC46931pY6
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                mo5991m3((Status) C49311tZ6.m12045a(parcel, Status.CREATOR), parcel.readString());
            } else {
                zbc((Status) C49311tZ6.m12045a(parcel, Status.CREATOR));
            }
        } else {
            mo5990p3((Status) C49311tZ6.m12045a(parcel, Status.CREATOR), (Credential) C49311tZ6.m12045a(parcel, Credential.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
