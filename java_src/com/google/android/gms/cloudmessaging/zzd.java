package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new C43176jC7();

    /* renamed from: b */
    public Messenger f70337b;

    public zzd(IBinder iBinder) {
        this.f70337b = new Messenger(iBinder);
    }

    /* renamed from: a */
    public final IBinder m51619a() {
        Messenger messenger = this.f70337b;
        messenger.getClass();
        return messenger.getBinder();
    }

    /* renamed from: b */
    public final void m51618b(Message message) throws RemoteException {
        Messenger messenger = this.f70337b;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m51619a().equals(((zzd) obj).m51619a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return m51619a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f70337b;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
