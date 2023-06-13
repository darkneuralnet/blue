package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.clearcut.zze;
/* renamed from: z99  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52636z99 extends C42839ie7 implements InterfaceC38942c59 {
    public C52636z99(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    @Override // p000.InterfaceC38942c59
    /* renamed from: D */
    public final void mo1737D(OT8 ot8, zze zzeVar) throws RemoteException {
        Parcel m33625c5 = m33625c5();
        C52788zQ7.m1384b(m33625c5, ot8);
        C52788zQ7.m1383c(m33625c5, zzeVar);
        m33624d5(1, m33625c5);
    }
}
