package com.google.p034ar.core.dependencies;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: com.google.ar.core.dependencies.d */
/* loaded from: classes6.dex */
public class BinderC17990d extends Binder implements IInterface {
    public BinderC17990d(String str) {
        attachInterface(this, str);
    }

    /* renamed from: a */
    public boolean mo48415a(int i, Parcel parcel) throws RemoteException {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return mo48415a(i, parcel);
    }
}
