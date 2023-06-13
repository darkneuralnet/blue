package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* loaded from: classes5.dex */
public interface IStatusCallback extends IInterface {

    /* loaded from: classes5.dex */
    public static abstract class Stub extends IP6 implements IStatusCallback {
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        public static IStatusCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            if (queryLocalInterface instanceof IStatusCallback) {
                return (IStatusCallback) queryLocalInterface;
            }
            return new zaby(iBinder);
        }

        @Override // p000.IP6
        public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                JP6.m100501b(parcel);
                onResult((Status) JP6.m100502a(parcel, Status.CREATOR));
                return true;
            }
            return false;
        }
    }

    void onResult(Status status) throws RemoteException;
}
