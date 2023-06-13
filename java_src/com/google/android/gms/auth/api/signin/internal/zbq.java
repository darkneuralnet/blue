package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
/* loaded from: classes5.dex */
public abstract class zbq extends BinderC46931pY6 implements zbr {
    public zbq() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // p000.BinderC46931pY6
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                zbd((GoogleSignInAccount) C49311tZ6.m12045a(parcel, GoogleSignInAccount.CREATOR), (Status) C49311tZ6.m12045a(parcel, Status.CREATOR));
                break;
            case 102:
                zbc((Status) C49311tZ6.m12045a(parcel, Status.CREATOR));
                break;
            case 103:
                zbb((Status) C49311tZ6.m12045a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
