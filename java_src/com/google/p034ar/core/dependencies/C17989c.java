package com.google.p034ar.core.dependencies;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: com.google.ar.core.dependencies.c */
/* loaded from: classes6.dex */
public class C17989c implements IInterface {

    /* renamed from: a */
    private final IBinder f73799a;

    /* renamed from: b */
    private final String f73800b;

    public C17989c(IBinder iBinder, String str) {
        this.f73799a = iBinder;
        this.f73800b = str;
    }

    /* renamed from: a */
    public final Parcel m48425a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f73800b);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f73799a;
    }

    /* renamed from: b */
    public final Parcel m48424b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f73799a.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: c */
    public final void m48423c(int i, Parcel parcel) throws RemoteException {
        try {
            this.f73799a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
