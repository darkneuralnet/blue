package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zak;
/* renamed from: OP6 */
/* loaded from: classes6.dex */
public abstract class OP6 extends IP6 implements SP6 {
    public OP6() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // p000.IP6
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) JP6.m100502a(parcel, ConnectionResult.CREATOR);
                zaa zaaVar = (zaa) JP6.m100502a(parcel, zaa.CREATOR);
                JP6.m100501b(parcel);
                break;
            case 4:
                Status status = (Status) JP6.m100502a(parcel, Status.CREATOR);
                JP6.m100501b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) JP6.m100502a(parcel, Status.CREATOR);
                JP6.m100501b(parcel);
                break;
            case 7:
                Status status3 = (Status) JP6.m100502a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) JP6.m100502a(parcel, GoogleSignInAccount.CREATOR);
                JP6.m100501b(parcel);
                break;
            case 8:
                JP6.m100501b(parcel);
                zab((zak) JP6.m100502a(parcel, zak.CREATOR));
                break;
            case 9:
                zag zagVar = (zag) JP6.m100502a(parcel, zag.CREATOR);
                JP6.m100501b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
