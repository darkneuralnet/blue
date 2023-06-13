package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
/* loaded from: classes5.dex */
public final class zbs extends C51601xQ6 {
    public zbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void zbc(zbr zbrVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zba = zba();
        C49311tZ6.m12043c(zba, zbrVar);
        C49311tZ6.m12044b(zba, googleSignInOptions);
        zbb(103, zba);
    }

    public final void zbd(zbr zbrVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zba = zba();
        C49311tZ6.m12043c(zba, zbrVar);
        C49311tZ6.m12044b(zba, googleSignInOptions);
        zbb(102, zba);
    }

    public final void zbe(zbr zbrVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zba = zba();
        C49311tZ6.m12043c(zba, zbrVar);
        C49311tZ6.m12044b(zba, googleSignInOptions);
        zbb(101, zba);
    }
}
