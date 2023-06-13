package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: vS7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50434vS7 extends C46815pL7 implements InterfaceC38568bT7 {
    public C50434vS7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // p000.InterfaceC38568bT7
    /* renamed from: u */
    public final void mo8625u(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        m19441c5.writeString(str);
        m19441c5.writeString(str2);
        UL7.m81613d(m19441c5, bundle);
        m19441c5.writeLong(j);
        m19439e5(1, m19441c5);
    }

    @Override // p000.InterfaceC38568bT7
    public final int zzd() throws RemoteException {
        Parcel m19440d5 = m19440d5(2, m19441c5());
        int readInt = m19440d5.readInt();
        m19440d5.recycle();
        return readInt;
    }
}
