package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
/* renamed from: Ac7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC31638Ac7 extends BinderC46931pY6 implements InterfaceC39865dd7 {
    public AbstractBinderC31638Ac7() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // p000.BinderC46931pY6
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo44000q2((Status) C49311tZ6.m12045a(parcel, Status.CREATOR), (BeginSignInResult) C49311tZ6.m12045a(parcel, BeginSignInResult.CREATOR));
            return true;
        }
        return false;
    }
}
