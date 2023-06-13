package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public interface IAccountAccessor extends IInterface {

    /* loaded from: classes5.dex */
    public static abstract class Stub extends HB7 implements IAccountAccessor {
        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        public static IAccountAccessor asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof IAccountAccessor) {
                return (IAccountAccessor) queryLocalInterface;
            }
            return new zzv(iBinder);
        }

        @Override // p000.HB7
        public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 2) {
                Account zzb = zzb();
                parcel2.writeNoException();
                C49815uP7.m10346e(parcel2, zzb);
                return true;
            }
            return false;
        }
    }

    Account zzb() throws RemoteException;
}
